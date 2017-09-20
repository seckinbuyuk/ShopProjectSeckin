package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.ShoppingCartItem;
import com.repository.CartRepository;
import com.repository.ProductDAO;
import com.repository.ShoppingCartItemRepository;

@Service
public class CartServiceImpl implements CartService {

	
	@Autowired
	private CartRepository repo;
	
	@Autowired
	private ProductDAO dao;
	
	@Autowired
	private ShoppingCartItemRepository shopRepo;
	
	public void addProductToCustomerCart(long productId, int quantity) {
		
		repo.AddProductToCustomerCart(productId, quantity);
	}

	public List<ShoppingCartItem> getAllShoppingCartItem() {
		// TODO Auto-generated method stub
		return shopRepo.findAll();
	}

	public Double getTotalAmount() {
		
		return dao.findTotalAmount();
	}

}
