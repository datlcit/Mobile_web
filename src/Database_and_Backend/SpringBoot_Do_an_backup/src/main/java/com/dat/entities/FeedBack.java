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
@Table(name = "FeedBack")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class FeedBack {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "feedBackId")
	private int feedBackId;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "feedBackImage")
	private String feedBackImage;
	
	@Column(name = "createAt")
	private Date createAt;
	
	@Column(name = "updateAt")
	private Date updateAt;
	
	@Column(name = "status")
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "productId", referencedColumnName = "productId")
	private Product product;

	public FeedBack() {
		this.createAt = new Date(System.currentTimeMillis());
		this.updateAt = new Date(System.currentTimeMillis());
	}

	

	public FeedBack(int feedBackId, String content, String feedBackImage, Date createAt, Date updateAt, boolean status,
			Customer customer, Product product) {
		super();
		this.feedBackId = feedBackId;
		this.content = content;
		this.feedBackImage = feedBackImage;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.status = status;
		this.customer = customer;
		this.product = product;
	}



	public int getFeedBackId() {
		return feedBackId;
	}

	public void setFeedBackId(int feedBackId) {
		this.feedBackId = feedBackId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFeedBackImage() {
		return feedBackImage;
	}

	public void setFeedBackImage(String feedBackImage) {
		this.feedBackImage = feedBackImage;
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
