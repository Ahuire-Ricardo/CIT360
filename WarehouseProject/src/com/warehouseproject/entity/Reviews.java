package com.warehouseproject.entity;
// Generated Dec 10, 2019 4:44:28 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;

/**
 * Reviews generated by hbm2java
 */
public class Reviews implements java.io.Serializable {

	private Integer reviewId;
	private Clients clients;
	private Inventory inventory;
	private String reviewText;
	private Date reviewDate;

	public Reviews() {
	}

	public Reviews(Clients clients, Inventory inventory, String reviewText, Date reviewDate) {
		this.clients = clients;
		this.inventory = inventory;
		this.reviewText = reviewText;
		this.reviewDate = reviewDate;
	}

	public Integer getReviewId() {
		return this.reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public Clients getClients() {
		return this.clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	public Inventory getInventory() {
		return this.inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public String getReviewText() {
		return this.reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public Date getReviewDate() {
		return this.reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

}
