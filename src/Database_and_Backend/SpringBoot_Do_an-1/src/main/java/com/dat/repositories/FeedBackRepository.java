package com.dat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dat.entities.FeedBack;
@Repository
public interface FeedBackRepository extends JpaRepository<FeedBack, Integer>{

}
