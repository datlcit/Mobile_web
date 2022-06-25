// LỚP NÀY CUNG CẤP CẤC PHƯƠNG THỨC ĐỂ LÀM VIỆC VỚI TOKEN

package com.dat.utils;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.dat.entities.UserDetail;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class JWTUtil {
	// Key secret
			private static String SECRET = "lydat";
			// thời gian hiệu lực
			private final long EXPIRATION_TIME = 604800000L;
			// prefix token
			private final String TOKEN_PREFIX = "Bearer ";
			// header option
			private final String HEADER_STRING = "Authorization";
			
			// Phương thức bổ sung: lấy Claim từ TOKEN
			public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
				final Claims claims = getAllClaimsFromToken(token);
				return claimsResolver.apply(claims);
			}
			
			// Phương thức bổ sung: lấy tất cả Claim từ TOKEN
			private Claims getAllClaimsFromToken(String token) {
				return Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody();
			}
			
			// tạo jwt
			//Phương thức dựa trên đối tượng UserDetail
			public String generateToken(UserDetail userDetail) {
				
				Map<String, Object> claims = new HashMap<>();
				
				// Biến 
				Date now = new Date();
				
				// Thời gian tồn tại của TOKEN = thời gian hiện tại + thời gian khai báo bên trên với đơn vị là mili giây
				Date expiryDate = new Date(now.getTime()+ EXPIRATION_TIME);
				
				// tạo jwt từ id user
				String jwt = "";
				try {
					//Dựa trên thông tin của userDetail để gọi thư viện JWTs để tạo chuỗi TOKEN
					jwt = Jwts.builder()
							.setSubject(Integer.toString(userDetail.getUser().getUserId())) // Lấy ID của user
							.setIssuedAt(now) // Lấy thời gian tạo ra mã token được khai báo như trên
							.setExpiration(expiryDate) // Set thời gian tồn tại của TOKEN được khai báo như trên
							.signWith(SignatureAlgorithm.HS512, SECRET.getBytes("UTF-8")) // Thuật toán mã hóa, SECRET key dùng để đọc ngược lại thông tin từ mã TOKEN, SECRET key này có thể cấu hình ở 1 file properties
							.compact(); // Trả về chuỗi TOKEN dùng để xác thực người dùng
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				return jwt;
			}
			
			// Lấy thông tin user từ jwt, lấy ngược lại giá trị user trong chuỗi TOKEN
			public Integer getUserByIdfromJWT(String token) {
				Claims claims = null;
				try {
					// Truyền các thông số mà ta set vào để mã hóa TOKEN
					claims = Jwts.parser()
							.setSigningKey(SECRET.getBytes("UTF-8"))
							.parseClaimsJws(token)
							.getBody();
				} catch (ExpiredJwtException | UnsupportedJwtException | MalformedJwtException | SignatureException
						| IllegalArgumentException | UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return Integer.parseInt(claims.getSubject());
			}
			
			// validate jwt
			// Phương thức kiểm tra xem TOKEN có còn hợp lệ hay không
			public boolean validateToken(String authToken) {
				try {
					Jwts.parser().setSigningKey(SECRET.getBytes("UTF-8")).parseClaimsJws(authToken); // Trả ngược lại từ chuỗi TOKEN về kết quả true hoặc false, hợp lệ hay không hợp lệ
					return true;
				} catch (MalformedJwtException ex) {
					System.out.println("Invalid JWT token - Token không hợp lệ");
				}catch (ExpiredJwtException ex) {
					System.out.println("Expired JWT token - Token hết hạn");
		        } catch (UnsupportedJwtException ex) {
		            System.out.println("Unsupported JWT token - Token không hỗ trợ");
		        } catch (IllegalArgumentException ex) {
		        	System.out.println("JWT claims string is empty - Token không tồn tại");
		        } catch (SignatureException e) {
					// TODO Auto-generated catch block
		        	System.out.println("Signature Exception - Key không chính xác");
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					System.out.println("Unsupported Encoding Exception - Không hỗ trợ mã hóa này");
				}
				return false;
			}
}
