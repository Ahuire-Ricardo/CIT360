package com.warehouseproject.entity;
// Generated Dec 10, 2019 4:44:28 PM by Hibernate Tools 5.1.0.Alpha1

/**
 * Categories generated by hbm2java
 */
public class Categories implements java.io.Serializable {

	private Integer categoryId;
	private String categoryName;

	public Categories() {
	}

	public Categories(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
