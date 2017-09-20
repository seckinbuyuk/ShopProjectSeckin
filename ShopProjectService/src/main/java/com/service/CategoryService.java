

package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.model.Category;


public interface CategoryService {

	
	public List<Category> getAllCategories();
	
	public Category getCategoriesForId(Long id);
	
}
