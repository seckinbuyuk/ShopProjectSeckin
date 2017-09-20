package com.service;

import java.util.List;

import com.ecommerce.model.ShoppingCartItem;

public interface CartService {

      public void addProductToCustomerCart(long productId,int quantity);	
	public List<ShoppingCartItem> getAllShoppingCartItem();
	
	public Double getTotalAmount();
}
