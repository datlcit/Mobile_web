package com.dat.controllers.user;

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

import com.dat.entities.Cart;
import com.dat.services.CartService;

@RestController
@RequestMapping(value = "/api/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@GetMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public ResponseEntity<List<Cart>> getAll(){
		return new ResponseEntity<>(cartService.getAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public ResponseEntity<Cart> getById(@PathVariable("id") int id) {
		return new ResponseEntity<>(cartService.getById(id), HttpStatus.OK);
	}
	
	@PostMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.POST)
	public ResponseEntity<Cart> add(@RequestBody Cart cart) {
		return new ResponseEntity<>(cartService.save(cart), HttpStatus.OK);
	}
	
	@PutMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.PUT)
	public ResponseEntity<Cart> edit(@PathVariable("id") int id, @RequestBody Cart cart) {
		return new ResponseEntity<>(cartService.save(cart), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.DELETE)
	public ResponseEntity<List<Cart>> delete(@PathVariable("id") int id) {
		cartService.deleteById(id);
		return new ResponseEntity<>(cartService.getAll(), HttpStatus.OK);
	}

}
