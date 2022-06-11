package com.dat.controllers.user;

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

import com.dat.entities.Order;
import com.dat.services.OrderService;

@RestController
@RequestMapping(value = "/api/order")
public class OrderController {

	@Autowired
	private OrderService service;
	
	// Lay ra toan bo
	@GetMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public List<Order> listAll(){
		return service.getAll();
	}
	
	@GetMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public Order findById(@PathVariable("id") int id) {
		return service.getById(id);
	}
	
	// Tao 1 doi tuong moi
	@PostMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.POST)
	public Order addOrder(@RequestBody Order order) {
		Order orders = service.save(order);
		return orders;
	}
	
	// Update doi tuong
	@PutMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.PUT)
	public Order editOrder(@PathVariable("id") int id,  @RequestBody Order order) {
		return service.save(order);
	}
	
	@DeleteMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.DELETE)
	public String removeOrder(@PathVariable("id") int id) {
		service.deleteById(id);
		return "Deleted!";
	}
}
