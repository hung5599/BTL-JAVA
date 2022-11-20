package com.sportingcomplex.model;

import java.sql.Timestamp;

public class SportGroundModel {
	private Long id;
	private Long categoryId;
	private Float price;
	private boolean status;
	private Long[] ids;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Long[] getIds() {
		return ids;
	}
	public void setIds(Long[] ids) {
		this.ids = ids;
	}
	
}
