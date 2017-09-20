package com.service;

import java.util.List;

import com.ecommerce.model.Product;

public interface ProductService {

	
	public List<Product> getAllProduct();
	
	public Product getProductForId(Long id);
	
	public List<Product> getProductByCategoryId(Long catid);
}
