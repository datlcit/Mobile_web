// BỘ LỌC ÁP DỤNG CHO TOÀN BỘ REQUEST TỚI API CỦA TOKEN

package com.dat.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import com.dat.services.UserService;
import com.dat.utils.JWTUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JwtAuthenticationFilter extends OncePerRequestFilter{ // Lọc trên mỗi request gửi tới
	
	@Autowired
	private JWTUtil jwtUtil;
	
	@Autowired
	private UserService userService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		try {
			// Lấy jwt từ request
            String jwt = getJwtFromRequest(request); // Xác thực áp dụng bắt buộc mỗi request gọi tới api đều bắt phải đính kèm TOKEN để xác thực xem người dùng đã có TOKEN hay chưa
            
            if (StringUtils.hasText(jwt) && jwtUtil.validateToken(jwt)) { // gọi jwtUtil.validateToken để kiểm tra xem TOKEN có hợp lệ hay không
            	
            	
            	Integer userId = jwtUtil.getUserByIdfromJWT(jwt); // lấy ra user qua userId khi xác nhận đã hợp lệ
            	
            	UserDetails user = userService.loadUserById(userId); // lấy thông tin user dựa vào ID
            	
            	if(user != null) {
            		// Nếu người dùng hợp lệ, set thông tin cho Security Context
            		UsernamePasswordAuthenticationToken authentication = 
            				new UsernamePasswordAuthenticationToken(user, null,user.getAuthorities()); // Lưu thông tin và các quyền của User
            		authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
            		SecurityContextHolder.getContext().setAuthentication(authentication);
            	}
            }
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
 		filterChain.doFilter(request, response);		
	}
	
	private String getJwtFromRequest(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization"); // Đọc trong request tới key có tên là Authorization
        // Kiểm tra xem header Authorization có chứa thông tin jwt không (có texn không và text có bắt đầu bằng Bearer không)
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7); // Nếu có sẽ cắt chuỗi TOKEN ra từ trong key (substring(7) là cắt 6 kí tự đầu tiên gồm "Bearer " chỉ còn lại chuỗi TOKEN)
        }
        return null;
    }

}
