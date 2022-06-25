package com.dat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dat.entities.Role;
import com.dat.repositories.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public Role getById(int id) {
		// TODO Auto-generated method stub
		return roleRepository.getById(id);
	}

	@Override
	public Role save(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		roleRepository.deleteById(id);
		
	}

}
