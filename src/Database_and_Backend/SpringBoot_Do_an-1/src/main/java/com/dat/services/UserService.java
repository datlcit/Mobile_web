package com.dat.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import com.dat.entities.User;

public interface UserService {
	
	List<User> getAll();
	
	User getById(int id);
		
	User save(User user);
	
	void deleteById(int id);
	
	// Thêm phương thức sử dụng khi muốn load userDetail theo ID, dùng nếu ta lưu trong TOKEN là userId chứ không phải userName
	UserDetails loadUserById(int id);

}
