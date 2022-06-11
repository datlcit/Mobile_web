package com.dat.services;

import java.util.List;

import com.dat.entities.FeedBack;


public interface FeedBackService {
	
	List<FeedBack> getAll();
	
	FeedBack getById(int id);
		
	FeedBack save(FeedBack feedBack);
	
	void deleteById(int id);

}
