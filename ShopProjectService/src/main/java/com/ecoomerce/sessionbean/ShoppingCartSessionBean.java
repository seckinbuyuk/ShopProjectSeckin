package com.ecoomerce.sessionbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.aspectj.internal.lang.annotation.ajcDeclareSoft;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ecommerce.model.Product;
import com.ecommerce.model.ShoppingCart;
import com.ecommerce.model.ShoppingCartItem;


@Component
@Scope("singleton")
public class ShoppingCartSessionBean {

	
	public ShoppingCartSessionBean() {
		
	List<ShoppingCartItem> shoppingCartList= new ArrayList<ShoppingCartItem>();
	}
	
	private long id;
	
	private Product product;
	private double price;
	private int quantity;
	
	
	private ShoppingCart shoppingCart;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	


}
