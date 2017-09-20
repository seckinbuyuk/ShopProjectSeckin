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
import com.ecommerce.model.ShoppingCartItem;
import com.repository.CartRepository;
import com.service.CartService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfig.class, loader = AnnotationConfigContextLoader.class)
public class DefaultCartServiceTest {

	@Autowired
	private CartRepository repo;
	
	@Autowired
	private CartService srv;
	
	private Product pro;
    
    private Category categori;
    
    
    @Before
	public void setUp()
	{
		pro = new Product();
		pro.setId(1);
		pro.setName("test");
		
		categori= new Category();
		categori.setId(1);
	}
    
    @Test
    public void testProductService()
    {
	   repo.AddProductToCustomerCart(pro.getId(), 4);
	  assertEquals("Retrieved ShoppingCart name attribute incorrect", 1, pro.getName());
	  
	  List<ShoppingCartItem> getAllShoppingCartItem= srv.getAllShoppingCartItem();
	  assertTrue("No ShoppingCart return", getAllShoppingCartItem.isEmpty());
	  
	  srv.getTotalAmount();
	  assertEquals("Retrieved TotalAmount name attribute incorrect", 1, pro.getName());
    }
	
}
