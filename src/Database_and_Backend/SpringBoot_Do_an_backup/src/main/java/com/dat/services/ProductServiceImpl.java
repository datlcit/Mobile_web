package com.dat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dat.entities.Product;
import com.dat.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository repository;

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Product getById(String productId) {
		// TODO Auto-generated method stub
		return repository.getById(productId);
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}

	@Override
	public void deleteById(String productId) {
		// TODO Auto-generated method stub
		repository.deleteById(productId);
	}

}
