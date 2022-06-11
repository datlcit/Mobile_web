package com.dat.services;

import java.util.List;

import com.dat.entities.OrderDetail;

public interface OrderDetailService {
	
	List<OrderDetail> getAll();
	
	OrderDetail getById(int id);
		
	OrderDetail save(OrderDetail orderDetail);
	
	void deleteById(int id);

}
