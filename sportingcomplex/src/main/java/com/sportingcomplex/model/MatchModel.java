package com.sportingcomplex.model;

import java.sql.Date;

public class MatchModel{
	private Long id;
	private Long categoryId;
	private Long id_San;
	private Float price;
	private String time_Start;
	private String userName;
	private boolean status;
	private Date dateOpen;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_San() {
		return id_San;
	}
	public void setId_San(Long id_San) {
		this.id_San = id_San;
	}

	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getDateOpen() {
		return dateOpen;
	}
	public void setDateOpen(Date dateOpen) {
		this.dateOpen = dateOpen;
	}
	public String getTime_Start() {
		return time_Start;
	}
	public void setTime_Start(String time_Start) {
		this.time_Start = time_Start;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	
}