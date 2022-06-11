package com.dat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dat.entities.OrderDetail;
import com.dat.repositories.OrderDetailRepository;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{
	
	@Autowired
	private OrderDetailRepository repository;

	@Override
	public List<OrderDetail> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public OrderDetail getById(int id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

	@Override
	public OrderDetail save(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		return repository.save(orderDetail);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

}
