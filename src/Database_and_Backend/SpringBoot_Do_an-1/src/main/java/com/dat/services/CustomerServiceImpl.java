package com.dat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dat.entities.Customer;
import com.dat.repositories.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository repository;

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public Customer save(Customer c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

//	@Override
//	public String getUsernames() {
//		// TODO Auto-generated method stub
//		return repository.getUsernames();
//	}
}
