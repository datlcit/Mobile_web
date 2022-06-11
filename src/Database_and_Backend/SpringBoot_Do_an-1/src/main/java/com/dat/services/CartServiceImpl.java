package com.dat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dat.entities.Cart;
import com.dat.repositories.CartRepository;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartRepository repository;

	@Override
	public List<Cart> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cart getById(int id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

	@Override
	public Cart save(Cart c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	

}
