package com.dat.services;

import java.util.List;

import com.dat.entities.Product;

public interface ProductService {
	
	List<Product> getAll();
	Product getById(String productId);
	Product save(Product product);
	void deleteById(String productId);
}
