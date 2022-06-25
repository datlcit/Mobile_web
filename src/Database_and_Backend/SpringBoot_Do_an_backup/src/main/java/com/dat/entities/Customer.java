package com.dat.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
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


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerId")
	private int customerId;
	
	@Column(name = "fullName")
	private String fullName;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "createAt")
	private Date createAt;
	
	@Column(name = "updateAt")
	private Date updateAt;
	
	@Column(name = "status")
	private boolean status;
	
	@JsonIgnore
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
	private List<Cart> carts;
	
	@JsonIgnore
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
	private List<Order> orders;
	
	@JsonIgnore
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
	private List<FeedBack> feedBacks;
	
//	@JsonIgnore
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private User user;

	public Customer() {
		this.createAt = new Date(System.currentTimeMillis());
		this.updateAt = new Date(System.currentTimeMillis());
	}

	public Customer(int customerId, String fullName, String phone, String address, String email, Date createAt,
			Date updateAt, boolean status, List<Cart> carts, List<Order> orders, List<FeedBack> feedBacks) {
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.status = status;
		this.carts = carts;
		this.orders = orders;
		this.feedBacks = feedBacks;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public List<FeedBack> getFeedBacks() {
		return feedBacks;
	}

	public void setFeedBacks(List<FeedBack> feedBacks) {
		this.feedBacks = feedBacks;
	}
	
	

	
}