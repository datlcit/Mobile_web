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
@Table(name = "Cart")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cartId")
	private int cartId;
	
	@Column(name = "quantity")
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "productId", referencedColumnName = "productId")
	private Product product;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int cartId, int quantity, Customer customer, Product product) {
		super();
		this.cartId = cartId;
		this.quantity = quantity;
		this.customer = customer;
		this.product = product;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
