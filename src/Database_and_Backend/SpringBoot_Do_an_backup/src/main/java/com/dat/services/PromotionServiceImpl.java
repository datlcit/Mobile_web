package com.dat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dat.entities.Promotion;
import com.dat.repositories.PromotionRepository;

@Service
public class PromotionServiceImpl implements PromotionService{
	
	@Autowired
	private PromotionRepository promotionRepository;

	@Override
	public List<Promotion> getAll() {
		// TODO Auto-generated method stub
		return promotionRepository.findAll();
	}

	@Override
	public Promotion getById(int id) {
		// TODO Auto-generated method stub
		return promotionRepository.findById(id).get();
	}

	@Override
	public Promotion save(Promotion promotion) {
		// TODO Auto-generated method stub
		return promotionRepository.save(promotion);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		promotionRepository.deleteById(id);
		
	}

}
