package com.yedam.bicycle.service;

import java.util.Date;

public class Bicycle {
	private int bId;
	private String bLocation;
	private Date bReturn;
	private String bReservation;
	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbLocation() {
		return bLocation;
	}
	public void setbLocation(String bLocation) {
		this.bLocation = bLocation;
	}
	public Date getbReturn() {
		return bReturn;
	}
	public void setbReturn(Date bReturn) {
		this.bReturn = bReturn;
	}
	public String getbReservation() {
		return bReservation;
	}
	public void setbReservation(String bReservation) {
		this.bReservation = bReservation;
	}
	
	
}
