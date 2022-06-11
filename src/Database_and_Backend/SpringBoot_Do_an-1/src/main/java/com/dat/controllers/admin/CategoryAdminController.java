package com.dat.controllers.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import com.dat.entities.Category;
import com.dat.services.CategoryService;

@RestController
@RequestMapping(value = "/api/categoryAdmin")
public class CategoryAdminController {
	
	@Autowired
	private CategoryService service;
	
	// Lay ra toan bo
	@GetMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public ResponseEntity<List<Category>> listAll(){
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public ResponseEntity<Category> findById(@PathVariable("id") int id) {
		return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
	}
	
	// Tao 1 doi tuong moi
	@PostMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.POST)
	public ResponseEntity<List<Category>> addCategory(@RequestBody Category category) {
		service.save(category);
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
	// Update doi tuong
	@PutMapping(value = "/{categoryId}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.PUT)
	public ResponseEntity<List<Category>> editCategory(@PathVariable("categoryId") int categoryId,  @RequestBody Category model) {
		service.save(model);
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.DELETE)
	public ResponseEntity<List<Category>> removeCategory(@PathVariable("id") int id) {
		service.deleteById(id);
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
}
