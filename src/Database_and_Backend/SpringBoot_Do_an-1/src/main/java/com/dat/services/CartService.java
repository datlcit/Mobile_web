package com.dat.services;

import java.util.List;

import com.dat.entities.Cart;

public interface CartService {
	
	List<Cart> getAll();
	
	Cart getById(int id);
	
	Cart save(Cart c);
	
	void deleteById(int id);

}
