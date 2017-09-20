package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;
import com.repository.ProductDAO;
import com.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

  @Autowired
  private ProductRepository repo;
  
  @Autowired
  private ProductDAO dao;
	
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Product getProductForId(Long id) {
		// TODO Auto-generated method stub
		return repo.findOne(id);
	}

	public List<Product> getProductByCategoryId(Long catid)
	{
		return dao.findProductByCategoryId(catid);
	}
	
}
