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

import com.dat.entities.OrderDetail;
import com.dat.services.OrderDetailService;

@RestController
@RequestMapping(value = "/api/orderDetail")
public class OrderDetailController {
	
	@Autowired
	private OrderDetailService service;
	
	// Lay ra toan bo
		@GetMapping
		@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
		public ResponseEntity<List<OrderDetail>> listAll(){
			return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
		}
		
		@GetMapping(value = "/{id}")
		@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
		public ResponseEntity<OrderDetail> findById(@PathVariable("id") int id) {
			return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
		}
		
		// Tao 1 doi tuong moi
		@PostMapping
		@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.POST)
		public ResponseEntity<List<OrderDetail>> addCategory(@RequestBody OrderDetail orderDetail) {
			service.save(orderDetail);
			return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
		}
		
		// Update doi tuong
		@PutMapping(value = "/{id}")
		@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.PUT)
		public ResponseEntity<List<OrderDetail>> editCategory(@PathVariable("id") int id,  @RequestBody OrderDetail orderDetail) {
			service.save(orderDetail);
			return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
		}
		
		@DeleteMapping(value = "/{id}")
		@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.DELETE)
		public ResponseEntity<List<OrderDetail>> removeCategory(@PathVariable("id") int id) {
			service.deleteById(id);
			return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
		}

}
