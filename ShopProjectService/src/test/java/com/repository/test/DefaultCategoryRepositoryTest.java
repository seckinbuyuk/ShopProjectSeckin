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
import com.repository.CategoryRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfig.class, loader = AnnotationConfigContextLoader.class)
public class DefaultCategoryRepositoryTest {

	@Autowired
	private CategoryRepository catrepo;
	
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
		Category cat =catrepo.findById(categori.getId());
		assertEquals("Did not find the product we just saved", 1, pro.getId());
		
		List<Category> category= catrepo.findAll();
		assertTrue("No Product return", category.isEmpty());
		
    }
	
  
	
	
}
