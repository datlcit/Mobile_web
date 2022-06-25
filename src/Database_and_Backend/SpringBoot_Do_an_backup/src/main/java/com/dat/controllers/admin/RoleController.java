package com.dat.controllers.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dat.entities.Role;
import com.dat.services.RoleService;

@RestController
@RequestMapping(value = "/api/roleAdmin")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public List<Role> getAll(){
		return roleService.getAll();
	}
	
	@GetMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public Role getById(@PathVariable("id") int id) {
		return roleService.getById(id);
	}
	
	@PostMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.POST)
	public Role add(@RequestBody Role role) {
		return roleService.save(role);
	}
	
	@PutMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.PUT)
	public Role edit(@PathVariable("id") int id, @RequestBody Role role) {
		return roleService.save(role);
	}
	
	@DeleteMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.DELETE)
	public String delete(@PathVariable("id") int id) {
		roleService.deleteById(id);
		return "Xoa san pham co ID = "+id+" thanh cong!";
	}

}
