package com.dat.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Product")

@JsonIgnoreProperties(ignoreUnknown = true, value = {"hibernateLazyInitializer", "handler"})
public class Product {
	@Id
	@Column(name = "productId")
	private String productId;
	
	@Column(name = "productName")
	private String productName;
	
	@Column(name = "productImage")
	private String productImage;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "ram")
	private String ram;
	
	@Column(name = "storage")
	private String storage;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "createAt")
	private Date createAt;
	
	@Column(name = "updateAt")
	private Date updateAt;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "status")
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
	private Category category;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
	private List<FeedBack> feedBacks;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
	private List<OrderDetail> orderDetails;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
	private List<Cart> carts;

	public Product() {
		this.createAt = new Date(System.currentTimeMillis());
		this.updateAt = new Date(System.currentTimeMillis());
		// TODO Auto-generated constructor stub
	}

	public Product(String productId, String productName, String productImage, double price, String ram, String storage,
			String color, String description, Date createAt, Date updateAt, int quantity, boolean status,
			Category category, List<FeedBack> feedBacks, List<OrderDetail> orderDetails, List<Cart> carts) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productImage = productImage;
		this.price = price;
		this.ram = ram;
		this.storage = storage;
		this.color = color;
		this.description = description;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.quantity = quantity;
		this.status = status;
		this.category = category;
		this.feedBacks = feedBacks;
		this.orderDetails = orderDetails;
		this.carts = carts;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<FeedBack> getFeedBacks() {
		return feedBacks;
	}

	public void setFeedBacks(List<FeedBack> feedBacks) {
		this.feedBacks = feedBacks;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	
}
