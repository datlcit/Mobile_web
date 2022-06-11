package com.dat.services;

import java.util.List;

import com.dat.entities.UserRole;

public interface UserRoleService {

	List<UserRole> getAll();
	
	UserRole getById(int id);
		
	UserRole save(UserRole userRole);
	
	void deleteById(int id);
}
