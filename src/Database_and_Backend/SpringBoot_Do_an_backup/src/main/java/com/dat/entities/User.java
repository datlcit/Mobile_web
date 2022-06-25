package com.dat.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;


@Entity
@Table(name = "Users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "userName")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "isAdmin")
	private boolean isAdmin;
	
	@Column(name = "createAt")
	private Date createAt;
	
	@Column(name = "updateAt")
	private Date updateAt;
	
	@Column(name = "status")
	private boolean status;
	
//	@JsonIgnore
//	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
//	
//	private Customer customer;
	
	@JsonIgnore
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<UserRole> userRoles;

	public User() {
		this.createAt = new Date(System.currentTimeMillis());
		this.updateAt = new Date(System.currentTimeMillis());
	}

	public User(int userId, String userName, String password, boolean isAdmin, Date createAt, Date updateAt,
			boolean status, List<UserRole> userRoles) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.isAdmin = isAdmin;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.status = status;
		this.userRoles = userRoles;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	
	// Ham tra ve list cac quyen duoc gan cho user
	@Transient
	public List<GrantedAuthority> getAuthorities(){
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (UserRole ur : userRoles) {
			authorities.add(new SimpleGrantedAuthority(ur.getRole().getRoleName()));
		}
		return authorities;
	}

}
