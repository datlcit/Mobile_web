package com.dat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dat.entities.User;
import com.dat.entities.UserDetail;
import com.dat.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService, UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return userRepository.getById(id);
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUserName(username);
		if (user == null)
			throw new UsernameNotFoundException(username);
		return new UserDetail(user);
	}

	// Thêm phương thức sử dụng khi muốn load userDetail theo ID, dùng nếu ta lưu trong TOKEN là userId chứ không phải userName
	@Override
	public UserDetails loadUserById(int id) throws UsernameNotFoundException {
		User user = userRepository.getById(id); // Lấy đối tượng User qua Id
		if (user == null)
			throw new UsernameNotFoundException(Integer.toString(id));
		return new UserDetail(user); // Chuyển đổi dạng đối tượng User về dạng đối tượng UserDetail
	}

}
