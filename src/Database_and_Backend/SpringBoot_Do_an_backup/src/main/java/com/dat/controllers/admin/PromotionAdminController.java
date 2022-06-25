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

import com.dat.entities.Promotion;
import com.dat.services.PromotionService;

@RestController
@RequestMapping(value = "/api/promotionAdmin")
public class PromotionAdminController {

	@Autowired
	private PromotionService promotionService;
	
	@GetMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public ResponseEntity<List<Promotion>> getAll(){
		return new ResponseEntity<>(promotionService.getAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public ResponseEntity<Promotion> getById(@PathVariable("id") int id) {
		return new ResponseEntity<>(promotionService.getById(id), HttpStatus.OK);
	}
	
	@PostMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.POST)
	public ResponseEntity<Promotion> add(@RequestBody Promotion promotion) {
		return new ResponseEntity<>(promotionService.save(promotion), HttpStatus.OK);
	}
	
	@PutMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.PUT)
	public ResponseEntity<Promotion> edit(@PathVariable("id") int id, @RequestBody Promotion promotion) {
		return new ResponseEntity<>(promotionService.save(promotion), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.DELETE)
	public ResponseEntity<List<Promotion>> delete(@PathVariable("id") int id) {
		promotionService.deleteById(id);
		return new ResponseEntity<>(promotionService.getAll(), HttpStatus.OK);
	}
}
