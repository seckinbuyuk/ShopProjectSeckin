package com.ecommerce.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.service.CategoryService;

@Component
public class HomeInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	private CategoryService srv;
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
	System.out.println("***************************************************** request.getPathInfo()" +request.getPathInfo());
		modelAndView.addObject("categories",srv.getAllCategories());
		super.postHandle(request, response, handler, modelAndView);
	}
	
	
	
	
	
	
    	
	
}
