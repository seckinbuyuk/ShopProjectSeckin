package com.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Component;

import com.ecommerce.model.Product;
import com.service.ProductServiceImpl;

@Component
public class ProductDAO extends NamedParameterJdbcDaoSupport{

	@Autowired
	public ProductDAO(DataSource dataSource) {
		super.setDataSource(dataSource);
	}
	
	private final String QUERY_PRODUCT_BY_CATEGORY="select p.id as '_id',p.name as 'urunAdi', p.colour as 'renk' , p.description as 'aciklama' ,p.price as 'fiyat' , p.productImage as 'resim',p.size as 'boyut' from product p inner join product_category pc on pc.products_id=p.id inner join category c on c.id=pc.categories_id where c.id=:id";
	private final String QUERY_FOR_TOTAL_AMOUNT="select sum(price*quantity) from shoppingcartitem";
	
   public List<Product> findProductByCategoryId(Long catid){
	   Map<String, Object> param= new HashMap<String, Object>();
	   param.put("id", catid);
	 List<Map<String, Object>> liste= getNamedParameterJdbcTemplate().queryForList(QUERY_PRODUCT_BY_CATEGORY, param);
	 List<Product> prodList= new ArrayList<Product>();
	 for (Map<String, Object> map : liste) {
		Product prod= new Product((Long)map.get("_id"), map.get("urunAdi").toString(), map.get("aciklama").toString(),(Double)map.get("fiyat"), map.get("renk").toString(), map.get("boyut").toString(), map.get("resim").toString());
	    
		prodList.add(prod);
	 
	 }
	   return prodList;
   }
	
   public double findTotalAmount()
   {
	   Map<String, Object> param= new HashMap<String, Object>();
	  return getNamedParameterJdbcTemplate().queryForObject(QUERY_FOR_TOTAL_AMOUNT, param, Double.class);
   }

}
