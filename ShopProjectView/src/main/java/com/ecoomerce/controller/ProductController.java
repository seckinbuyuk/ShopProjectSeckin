package com.ecoomerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.model.Product;
import com.repository.ProductDAO;
import com.service.ProductService;

@Controller
@RequestMapping("products")
public class ProductController {
    
	@Autowired
	private ProductService srv;
	
	@Autowired
	private ProductDAO dao;
	
	@RequestMapping(value="/category/{id}", method=RequestMethod.GET)
    public ModelAndView getProductByCategory(@PathVariable("id") Long id)
	{
		
		ModelAndView view = new ModelAndView("productList");
		List<Product> allProduct=srv.getProductByCategoryId(id);
		
		view.addObject("products", allProduct);
	
  		return view;
	}

	
	@RequestMapping(value="/details/{id}", method=RequestMethod.GET)
    public ModelAndView getProductInformation(@PathVariable("id") Long id)
	{
		
		ModelAndView view = new ModelAndView("productDetails");
		
		Product product=srv.getProductForId(id);
		view.addObject("product", product);
	
  		return view;
	}
	
	
	
}
