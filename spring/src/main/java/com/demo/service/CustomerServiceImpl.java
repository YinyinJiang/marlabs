package com.demo.service;

import java.util.List;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;
import com.demo.repository.InMemoryCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerRepository customerRepository = new InMemoryCustomerRepositoryImpl();
	
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
