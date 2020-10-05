package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.model.Customer;

@Repository("customerRepository")
public class InMemoryCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer c1 = new Customer();
		c1.setFirstName("John");
		c1.setLastName("Smith");
		
		customers.add(c1);
		
		return customers;
	}

}
