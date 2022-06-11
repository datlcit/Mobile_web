package com.dat.services;

import java.util.List;

import com.dat.entities.Role;
import com.dat.entities.User;

public interface RoleService {
	
	List<Role> getAll();
	
	Role getById(int id);
		
	Role save(Role role);
	
	void deleteById(int id);

}
