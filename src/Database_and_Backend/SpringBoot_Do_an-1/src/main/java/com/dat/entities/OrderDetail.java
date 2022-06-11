package com.dat.entities;


import java.util.Date;

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
@Table(name = "OrderDetail")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class OrderDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderDetailId")
	private int orderDetailId;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "createAt")
	private Date createAt;
	
	@Column(name = "updateAt")
	private Date updateAt;

	@ManyToOne
	@JoinColumn(name = "orderId", referencedColumnName = "orderId")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "productId", referencedColumnName = "productId")
	private Product product;

	public OrderDetail() {
		this.createAt = new Date(System.currentTimeMillis());
		this.updateAt = new Date(System.currentTimeMillis());
	}

	

	public OrderDetail(int orderDetailId, int quantity, double price, Date createAt, Date updateAt, Order order,
			Product product) {
		super();
		this.orderDetailId = orderDetailId;
		this.quantity = quantity;
		this.price = price;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.order = order;
		this.product = product;
	}



	public int getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}



	public Date getUpdateAt() {
		return updateAt;
	}



	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	
	
}
