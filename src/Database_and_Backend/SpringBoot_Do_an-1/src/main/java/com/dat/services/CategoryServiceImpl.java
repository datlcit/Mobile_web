package com.dat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dat.entities.Category;
import com.dat.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryRepository repository;
	
	@Override
	public List<Category> getAll() {
		return repository.findAll();
	}

	@Override
	public Category getById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Category save(Category model) {
		return repository.save(model);
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);;
	}

	


}
