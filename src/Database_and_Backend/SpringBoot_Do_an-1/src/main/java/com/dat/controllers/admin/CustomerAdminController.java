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

import com.dat.entities.Customer;
import com.dat.services.CustomerService;


@RestController
@RequestMapping(value = "/api/customerAdmin")
public class CustomerAdminController {

	@Autowired
	private CustomerService service;
	
	@GetMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public ResponseEntity<List<Customer>> getAll(){
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public ResponseEntity<Customer> getById(@PathVariable("id") int id) {
		return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
	}
	
	@PostMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.POST)
	public ResponseEntity<Customer> add(@RequestBody Customer customer) {
		return new ResponseEntity<Customer>(service.save(customer), HttpStatus.OK);
	}
	
	@PutMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.PUT)
	public ResponseEntity<Customer> edit(@PathVariable("id") int id, @RequestBody Customer customer) {
		return new ResponseEntity<Customer>(service.save(customer), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.DELETE)
	public ResponseEntity<List<Customer>> delete(@PathVariable("id") int id) {
		service.deleteById(id);
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
//	@GetMapping(value = "/getUserNames")
//	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
//	public String getUsernames(){
//		return service.getUsernames();
//	}
}