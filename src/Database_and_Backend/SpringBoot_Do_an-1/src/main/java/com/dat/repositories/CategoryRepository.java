package com.dat.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dat.entities.Category;

//Truyen vao ten class va kieu du lieu cua khoa chinh
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	
}
