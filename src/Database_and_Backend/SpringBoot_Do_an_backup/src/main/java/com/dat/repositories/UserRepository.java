package com.dat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dat.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUserName(String userName);

}
