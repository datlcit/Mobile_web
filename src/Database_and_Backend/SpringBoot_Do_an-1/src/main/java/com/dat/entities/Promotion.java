package com.dat.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Promotions")
public class Promotion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "promotionId")
	private int promotionId;
	
	@Column(name = "promotionName")
	private String promotionName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "startTime")
	private Date startTime;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "endTime")
	private Date endTime;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "createAt")
	private Date createAt;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "updateAt")
	private Date updateAt;
	
	@Column(name = "applyDay")
	private String applyDay;
	
	@Column(name = "maxDiscount")
	private int maxDiscount;
	
	@Column(name = "remainApply")
	private int remainApply;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "status")
	private boolean status;
	
	@Column(name = "quantity")
	private int quantity;
	
	@JsonIgnore
	@OneToMany(mappedBy = "promotion", fetch = FetchType.EAGER)
	private List<Order> orders;

	public Promotion() {
		this.createAt = new Date(System.currentTimeMillis());
		this.updateAt = new Date(System.currentTimeMillis());
	}

	public Promotion(int promotionId, String promotionName, Date startTime, Date endTime, Date createAt, Date updateAt,
			String applyDay, int maxDiscount, int remainApply, String code, boolean status, int quantity,
			List<Order> orders) {
		super();
		this.promotionId = promotionId;
		this.promotionName = promotionName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.applyDay = applyDay;
		this.maxDiscount = maxDiscount;
		this.remainApply = remainApply;
		this.code = code;
		this.status = status;
		this.quantity = quantity;
		this.orders = orders;
	}

	public int getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(int promotionId) {
		this.promotionId = promotionId;
	}

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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

	public String getApplyDay() {
		return applyDay;
	}

	public void setApplyDay(String applyDay) {
		this.applyDay = applyDay;
	}

	public int getMaxDiscount() {
		return maxDiscount;
	}

	public void setMaxDiscount(int maxDiscount) {
		this.maxDiscount = maxDiscount;
	}

	public int getRemainApply() {
		return remainApply;
	}

	public void setRemainApply(int remainApply) {
		this.remainApply = remainApply;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	
	
}
