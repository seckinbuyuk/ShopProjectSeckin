package com.repository.test;


import static org.junit.Assert.*;

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
import com.repository.ProductRepository;
import com.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfig.class, loader = AnnotationConfigContextLoader.class)
public class DefaultProductRepositoryTest {
	
	
	@Autowired
	private ProductRepository repo;
	
	private Product pro;
	private Category categori;
	
	
	@Before
	public void setUp()
	{
		pro = new Product();
		pro.setId(1);
		
		categori= new Category();
		categori.setId(2);
	}
	
 
	@Test
    public void testProductRepository()
    {
		
     List<Product> productList= repo.findById(pro.getId());
     assertTrue("No Product return", productList.isEmpty());
       
     
     List<Product>  allproduct= repo.findAll();
     assertEquals("Retrieved Product name attribute incorrect", 1, pro.getName());
   
     
     Product product=  repo.findOne(pro.getId());
     assertEquals("Did not find the product we just saved", 1, product.getId());
     
     
     
    }
	
	
}
