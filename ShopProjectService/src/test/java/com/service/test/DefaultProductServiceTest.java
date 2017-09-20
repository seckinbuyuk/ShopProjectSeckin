package com.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.config.JpaConfig;
import com.ecommerce.model.Category;
import com.ecommerce.model.Product;
import com.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfig.class, loader = AnnotationConfigContextLoader.class)
public class DefaultProductServiceTest {

	@Autowired
	private ProductService srv;
	
     private Product pro;
     
     private Category categori;
	
	@Before
	public void setUp()
	{
		pro = new Product();
		pro.setId(1);
		
		categori= new Category();
		categori.setId(1);
	}
	
	
	@Test
    public void testProductService()
    {
	  List<Product> prod= srv.getAllProduct();
	  assertEquals("Retrieved Product name attribute incorrect", 1, pro.getName());
	  
	  List<Product> getProduckById= srv.getProductByCategoryId(categori.getId());
	  assertTrue("No Product return", getProduckById.isEmpty());
	  
	  Product getProductByProdId= srv.getProductForId(pro.getId());
	  assertEquals("Did not find the product we just saved", 1, getProductByProdId.getId());
    }
}
