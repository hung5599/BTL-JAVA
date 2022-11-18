package com.sportingcomplex.model;

import java.sql.Timestamp;

public class BillModel {
	private Long id;
	private Long id_Match;;
	private Long id_User;
	private Timestamp date;
	private Float total;
	private boolean status;
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
	public Long getId_User() {
		return id_User;
	}
	public void setId_User(Long id_User) {
		this.id_User = id_User;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
