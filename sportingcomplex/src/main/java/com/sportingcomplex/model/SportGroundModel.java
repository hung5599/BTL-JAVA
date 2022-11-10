package com.sportingcomplex.model;

import java.sql.Timestamp;

public class SportGroundModel {
	private Long id;
	private Long categoryId;
	private String name;
	private Timestamp dateOpen;
	private Float price;
	private boolean status;
	private Timestamp time;
	private Long[] ids;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public Timestamp getDateOpen() {
		return dateOpen;
	}
	public void setDateOpen(Timestamp dateOpen) {
		this.dateOpen = dateOpen;
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
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public Long[] getIds() {
		return ids;
	}
	public void setIds(Long[] ids) {
		this.ids = ids;
	}
	
}
