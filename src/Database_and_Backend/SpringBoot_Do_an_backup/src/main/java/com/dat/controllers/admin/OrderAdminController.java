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

import com.dat.entities.Order;
import com.dat.services.OrderService;

@RestController
@RequestMapping(value = "/api/orderAdmin")
public class OrderAdminController {

	@Autowired
	private OrderService service;
	
	@GetMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public ResponseEntity<List<Order>> getAll(){
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public ResponseEntity<Order> getById(@PathVariable("id") int id) {
		return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
	}
	
	@PostMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.POST)
	public ResponseEntity<Order> add(@RequestBody Order order) {
		return new ResponseEntity<>(service.save(order), HttpStatus.OK);
	}
	
	@PutMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.PUT)
	public ResponseEntity<Order> edit(@PathVariable("id") int id, @RequestBody Order order) {
		return new ResponseEntity<>(service.save(order), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.DELETE)
	public ResponseEntity<List<Order>> delete(@PathVariable("id") int id) {
		service.deleteById(id);
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
}