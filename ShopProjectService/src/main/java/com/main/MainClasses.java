package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClasses {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("service-conf.xml");
		

	}

}
