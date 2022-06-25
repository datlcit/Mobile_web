package com.dat.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "roleId")
	private int roleId;
	
	@Column(name = "roleName")
	private String roleName;
	
	@Column(name = "status")
	private boolean status;
	
	@JsonIgnore
	@OneToMany(mappedBy = "role", fetch = FetchType.EAGER)
	private List<UserRole> userRoles;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(int roleId, String roleName, boolean status, List<UserRole> userRoles) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.status = status;
		this.userRoles = userRoles;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
	
	

}
