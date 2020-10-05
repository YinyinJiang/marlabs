package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.AppConfig;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
//		System.out.println(customerService);
		
//		CustomerService customerService2 = appContext.getBean("customerService", CustomerService.class);
//		System.out.println(customerService2);
//		
//		ApplicationContext appContext2 = new AnnotationConfigApplicationContext(AppConfig.class);
//		CustomerService customerService3 = appContext2.getBean("customerService", CustomerService.class);
//		System.out.println(customerService3);
		
		System.out.println(customerService.findAll().get(0).getFirstName());

	}

}
