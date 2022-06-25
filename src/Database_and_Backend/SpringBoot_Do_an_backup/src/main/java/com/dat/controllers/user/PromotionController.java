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

import com.dat.entities.Promotion;
import com.dat.services.PromotionService;


@RestController
@RequestMapping(value = "/api/promotion")
public class PromotionController {

	@Autowired
	private PromotionService service;
	
	@GetMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public List<Promotion> getAll(){
		return service.getAll();
	}
	
	@GetMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public Promotion getById(@PathVariable("id") int id) {
		return service.getById(id);
	}
	
	@PostMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.POST)
	public Promotion add(@RequestBody Promotion promotion) {
		return service.save(promotion);
	}
	
	@PutMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.PUT)
	public Promotion edit(@PathVariable("id") int id, @RequestBody Promotion promotion) {
		return service.save(promotion);
	}
	
	@DeleteMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.DELETE)
	public String delete(@PathVariable("id") int id) {
		service.deleteById(id);
		return "Xoa ma giam gia co ID = "+id+" thanh cong!";
	}
}