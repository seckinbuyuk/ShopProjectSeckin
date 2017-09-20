package com.ecommerce.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class ShoppingCart implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	
	
	@OneToMany(mappedBy="shoppingCart",fetch=FetchType.EAGER)
	private List<ShoppingCartItem> shoppingCartItems;

	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	
	public List<ShoppingCartItem> getShoppingCartItems() {
		if(shoppingCartItems == null) shoppingCartItems = new ArrayList<ShoppingCartItem>();
		return shoppingCartItems;
	}
	
	public void setShoppingCartItems(List<ShoppingCartItem> shoppingCartItems) {
		this.shoppingCartItems = shoppingCartItems;
	}
	
	@Transient
	public int getSize(){
		return this.getShoppingCartItems().size();
	}
	
}
