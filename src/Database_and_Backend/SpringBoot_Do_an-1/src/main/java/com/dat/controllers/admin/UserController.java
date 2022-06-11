package com.dat.controllers.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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

import com.dat.entities.LoginRequest;
import com.dat.entities.LoginResponse;
import com.dat.entities.User;
import com.dat.entities.UserDetail;
import com.dat.services.UserService;
import com.dat.utils.JWTUtil;

@RestController
@RequestMapping(value = "/api/userAdmin")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	JWTUtil jwtUntil;
	
	@PostMapping("/token") // ĐƯờng dẫn truy cập phải khớp với đường dẫn truy cập đã khai báo ở WebSecurityConfig
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.POST)
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {

        // Xác thực từ username và password.
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken( // Truyền username và password vào trong đối tượng UsernamePasswordAuthenticationToken
                        loginRequest.getUserName(),
                        loginRequest.getPassword()
                )
        );

        // Nếu không xảy ra exception tức là thông tin hợp lệ
        // Set thông tin authentication vào Security Context
        SecurityContextHolder.getContext().setAuthentication(authentication); // Check sau khi giải mã TOKEN ra xem có giống với context đã lưu hay không
        
        UserDetail detail = (UserDetail) authentication.getPrincipal(); // Lấy đối tượng UserDetail mà ta đã lưu ở trong context

        // Trả về jwt cho người dùng.
        String jwt = jwtUntil.generateToken(detail); // Dựa vào thông tin của dối tượng UserDetail sẽ lấy ra TOKEN
        return ResponseEntity.ok(new LoginResponse(jwt)); // Sau khi kết thúc sẽ trả về mã TOKEN
    }
	
	@GetMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public List<User> getAll(){
		return userService.getAll();
	}
	
	@GetMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public User getById(@PathVariable("id") int id) {
		return userService.getById(id);
	}
	
	@PostMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.POST)
	public User add(@RequestBody User user) {
		return userService.save(user);
	}
	
	@PutMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.PUT)
	public User edit(@PathVariable("id") int id, @RequestBody User user) {
		return userService.save(user);
	}
	
	@DeleteMapping(value = "/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.DELETE)
	public String delete(@PathVariable("id") int id) {
		userService.deleteById(id);
		return "Xoa san pham co ID = "+id+" thanh cong!";
	}

}
