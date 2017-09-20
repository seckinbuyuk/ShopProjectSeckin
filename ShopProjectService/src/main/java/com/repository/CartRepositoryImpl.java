package com.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.model.Product;
import com.ecommerce.model.ShoppingCartItem;

@Repository
public class CartRepositoryImpl implements CartRepository {

	
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void AddProductToCustomerCart(Long productId, int quantity) {
		
		Product product = em.find(Product.class, new Long(productId));
		ShoppingCartItem items= new ShoppingCartItem();
		items.setPrice(product.getPrice());
		items.setProduct(product);
		items.setQuantity(quantity);
		
		em.persist(items);
	}

	
 
	

}
