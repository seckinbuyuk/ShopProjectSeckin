package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.ShoppingCartItem;

public interface CartRepository  {

	public void AddProductToCustomerCart(Long productId,int quantity);
	
	
	
	
}
