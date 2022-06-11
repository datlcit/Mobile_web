package com.dat.services;

import java.util.List;

import com.dat.entities.Promotion;

public interface PromotionService {
	
	List<Promotion> getAll();
	
	Promotion getById(int id);
		
	Promotion save(Promotion promotion);
	
	void deleteById(int id);

}
