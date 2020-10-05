package com.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.demo.repository.CustomerRepository;
import com.demo.repository.InMemoryCustomerRepositoryImpl;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.demo"})
@PropertySource("application.properties")
public class AppConfig {
	
//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new InMemoryCustomerRepositoryImpl();
//	}
	
//	@Bean(name = "customerService")
//	public CustomerService getCustomerService() {
//		CustomerServiceImpl service = new CustomerServiceImpl();
//		service.setCustomerRepository(getCustomerRepository());
//		
//		return service;
//	}
	
}
