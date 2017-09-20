package com.ecommerce.model;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Product implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;
	private double price;
	private boolean inStock;
	private String colour;
	private String size;
	private String productImage;
	
	@OneToMany(mappedBy="product")
	private List<ShoppingCartItem> shoppingCartItems; 
	
	@ManyToMany
	private List<Category> categories;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(long id, String name, String description, double price,
			boolean inStock) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.inStock = inStock;
	}
	
	
	
	public Product(long id, String name, String description, double price, String colour, String size,
			String productImage) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.colour = colour;
		this.size = size;
		this.productImage = productImage;
	}
	public Product(long id, String name, String description, double price, boolean inStock, String colour, String size,
			String productImage, List<ShoppingCartItem> shoppingCartItems, List<Category> categories) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.inStock = inStock;
		this.colour = colour;
		this.size = size;
		this.productImage = productImage;
		this.shoppingCartItems = shoppingCartItems;
		this.categories = categories;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	public String getSize() {
		return size;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	
	
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public List<Category> getCategories() {
		return categories;
	}
	
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	
	public String getProductImage() {
		return productImage;
	}
	
	public void setShoppingCartItems(List<ShoppingCartItem> shoppingCartItems) {
		this.shoppingCartItems = shoppingCartItems;
	}
	public List<ShoppingCartItem> getShoppingCartItems() {
		return shoppingCartItems;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", inStock=" + inStock + ", colour=" + colour + ", size=" + size + ", productImage=" + productImage
				+ ", shoppingCartItems=" + shoppingCartItems + ", categories=" + categories + "]";
	}
	
}
