package com.dat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dat.entities.Promotion;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Integer>{

}
