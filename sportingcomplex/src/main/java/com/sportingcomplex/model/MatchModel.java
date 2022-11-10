package com.sportingcomplex.model;

import java.sql.Timestamp;

public class MatchModel {
	private Long id;;
	private Long id_San;;
	private Timestamp time_Start;
	private Timestamp time_End;
	private boolean status;
	private Timestamp dateOpen;
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
	public Timestamp getTime_Start() {
		return time_Start;
	}
	public void setTime_Start(Timestamp time_Start) {
		this.time_Start = time_Start;
	}
	public Timestamp getTime_End() {
		return time_End;
	}
	public void setTime_End(Timestamp time_End) {
		this.time_End = time_End;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Timestamp getDateOpen() {
		return dateOpen;
	}
	public void setDateOpen(Timestamp dateOpen) {
		this.dateOpen = dateOpen;
	}
	
	
}
