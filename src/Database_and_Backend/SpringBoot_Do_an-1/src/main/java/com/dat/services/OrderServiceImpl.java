package com.dat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dat.entities.Order;
import com.dat.repositories.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository repository;

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Order getById(int id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

	@Override
	public Order save(Order order) {
		// TODO Auto-generated method stub
		return repository.save(order);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}
	

}
