package com.sportingcomplex.model;

import java.sql.Timestamp;

public class TimeModel {
	private Long id;
	private Long id_San;
	private Timestamp time_Start;
	private Timestamp time_End;
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
	
}	
