package com.dat.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "UserRoles")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class UserRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userRoleId")
	private int userRoleId;
	
	@ManyToOne
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "roleId", referencedColumnName = "roleId")
	private Role role;

	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRole(int userRoleId, User user, Role role) {
		super();
		this.userRoleId = userRoleId;
		this.user = user;
		this.role = role;
	}

	public int getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
