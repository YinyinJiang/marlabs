package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;
import com.demo.repository.InMemoryCustomerRepositoryImpl;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.println("INSIDE CONSTRUCTOR");
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("INSIDE SETTER");
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
