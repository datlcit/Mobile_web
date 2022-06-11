package com.dat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dat.entities.FeedBack;
import com.dat.repositories.FeedBackRepository;

@Service
public class FeedBackServiceImpl implements FeedBackService{
	
	@Autowired
	private FeedBackRepository repository;

	@Override
	public List<FeedBack> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public FeedBack getById(int id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

	@Override
	public FeedBack save(FeedBack feedBack) {
		// TODO Auto-generated method stub
		return repository.save(feedBack);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

}
