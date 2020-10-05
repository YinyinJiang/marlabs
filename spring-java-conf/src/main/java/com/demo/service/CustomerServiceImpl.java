package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.demo.model.Customer;
import com.demo.repository.CustomerRepository;
import com.demo.repository.InMemoryCustomerRepositoryImpl;

@Service("customerService")
//@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {
	@Value("${some.firstName}")
	private String name;
	
//	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.println(name);
		System.out.println("constructors");
	}
	
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
