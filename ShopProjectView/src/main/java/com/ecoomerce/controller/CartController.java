package com.ecoomerce.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.model.Product;

import com.ecommerce.model.ShoppingCartItem;
import com.ecoomerce.sessionbean.ShoppingCartSessionBean;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.CartService;
import com.service.ProductService;

@Controller
@RequestMapping("/cart")
@SessionAttributes(value="sessionCartList")
public class CartController {

	
	
	@Autowired
	private ShoppingCartSessionBean session;

	@Autowired
	private CartService cartService;
	

	
	@RequestMapping(value="/addToCart/{id}", method=RequestMethod.POST,produces="application/json")
	public @ResponseBody String AddToCart(@PathVariable("id") Long id, @RequestParam int quantity) throws JsonProcessingException 
	{
		
	   cartService.addProductToCustomerCart(id, quantity);
		
  		return "home";
	}
	
	@RequestMapping(value="/basket", method=RequestMethod.GET)
    public ModelAndView getProductByCategory()
	{
		List<ShoppingCartItem> allCartItems=cartService.getAllShoppingCartItem();
		
		
		if(allCartItems==null)
		{ 
			ModelAndView view = new ModelAndView("home");
			return view;
		}else {
			ModelAndView view = new ModelAndView("shoppingCart");
			view.addObject("allCartItems", allCartItems);
			view.addObject("totalAmount", cartService.getTotalAmount().toString());
	  		return view;
		}
		
	}
	
}
