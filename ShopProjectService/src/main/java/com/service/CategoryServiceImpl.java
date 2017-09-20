package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Category;
import com.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository repo;
	
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Category getCategoriesForId(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

}
