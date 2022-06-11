package com.dat.services;

import java.util.List;

import com.dat.entities.Category;

public interface CategoryService {
	
	List<Category> getAll();
	
	Category getById(int id);
	
	Category save(Category c);
	
	void deleteById(int id);
}
