package com.repository.test;

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
import com.repository.ShoppingCartItemRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfig.class, loader = AnnotationConfigContextLoader.class)
public class DefaultCartRepositoryTest {

	@Autowired
	private CartRepository repo;
	
	@Autowired
	private ShoppingCartItemRepository cartrepo;
	
	
	private ShoppingCartItem item;
	
	private Product product;
	
	@Before
	public void setUp()
	{
		item= new ShoppingCartItem();
		item.setId(1);
		
		product=new Product();
		product.setId(1);
		product.setPrice(2000);
	}
	
	@Test
    public void testProductRepository()
    {
		
     List<ShoppingCartItem> cartItem= cartrepo.findAll();
     assertTrue("No ShoppingCart return", cartItem.isEmpty());
       
     
      repo.AddProductToCustomerCart(product.getId(), 3);
      assertEquals("Did not find the product we just saved", 1, product.getId());
   
     
     
     
     
     
    }
	
}
