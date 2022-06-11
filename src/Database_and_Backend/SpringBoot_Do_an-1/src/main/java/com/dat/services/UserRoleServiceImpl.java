package com.dat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dat.entities.UserRole;
import com.dat.repositories.UserRoleRepository;

@Service
public class UserRoleServiceImpl implements UserRoleService{
	@Autowired
	private UserRoleRepository userRoleRepository;

	@Override
	public List<UserRole> getAll() {
		// TODO Auto-generated method stub
		return userRoleRepository.findAll();
	}

	@Override
	public UserRole getById(int id) {
		// TODO Auto-generated method stub
		return userRoleRepository.getById(id);
	}

	@Override
	public UserRole save(UserRole userRole) {
		// TODO Auto-generated method stub
		return userRoleRepository.save(userRole);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		userRoleRepository.deleteById(id);
		
	}

}
