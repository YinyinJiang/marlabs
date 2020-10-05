package com.demo.service;

import java.util.List;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;
import com.demo.repository.InMemoryCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		
	}
	
//	public CustomerServiceImpl(CustomerRepository customerRepository) {
//		this.customerRepository = customerRepository;
//		System.out.println("Inside CONSTRUCTOR!");
//	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Inside SETTER!");
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
