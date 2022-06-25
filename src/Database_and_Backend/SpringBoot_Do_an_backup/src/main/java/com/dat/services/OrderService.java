package com.dat.services;

import java.util.List;

import com.dat.entities.Order;


public interface OrderService {

	List<Order> getAll();
	
	Order getById(int id);
	
	Order save(Order order);
	
	void deleteById(int id);
}
