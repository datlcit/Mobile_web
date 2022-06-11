package com.dat.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dat.entities.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
//	@Query(value = "Select u.username from Customer join Users u on c.customerId = u.customerId", nativeQuery = true)
//	String getUsernames();

}
