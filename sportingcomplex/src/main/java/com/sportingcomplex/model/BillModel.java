package com.sportingcomplex.model;

import java.sql.Date;

public class BillModel {
	private Long id;
	private Long id_Match;
	private Date date;
	private Float total;
	private String type;
	private String userName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_Match() {
		return id_Match;
	}
	public void setId_Match(Long id_Match) {
		this.id_Match = id_Match;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}