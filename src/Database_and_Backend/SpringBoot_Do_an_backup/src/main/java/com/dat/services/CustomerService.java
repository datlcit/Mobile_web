package com.dat.services;

import java.util.List;

import com.dat.entities.Customer;

public interface CustomerService {
	
	List<Customer> getAll();
	
	Customer getById(int id);
		
	Customer save(Customer c);
	
	void deleteById(int id);
	
//	String getUsernames();

}
