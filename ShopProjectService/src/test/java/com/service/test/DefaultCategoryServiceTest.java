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
import com.service.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfig.class, loader = AnnotationConfigContextLoader.class)
public class DefaultCategoryServiceTest {

	@Autowired
	private CategoryService srv;
	
	
     private Product pro;
     
     private Category categori;
	
	@Before
	public void setUp()
	{
		pro = new Product();
		pro.setId(1);
		
		categori= new Category();
		categori.setId(1);
	}
	
	@Test
    public void testProductService()
    {
	  List<Category> prod= srv.getAllCategories();
	  assertEquals("Retrieved Product name attribute incorrect", 1, categori.getName());
	  
	  Category getProduckById= srv.getCategoriesForId(categori.getId());
	  assertEquals("Did not find the categori we just saved", 1, getProduckById.getId());
	  
	  
	  
    }
	
	
}
