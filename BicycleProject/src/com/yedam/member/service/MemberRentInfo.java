package com.yedam.member.service;

import java.sql.Date;

public class MemberRentInfo {
	
	private String memId;
	private Date returnDate;
	private Date rentDate;
	private Date rentTime;
	private Date totalRentTime;
	private int rentAmount;
	private int bicycleId;
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	
	public int getBicycleId() {
		return bicycleId;
	}
	public void setBicycleId(int bicycleId) {
		this.bicycleId = bicycleId;
	}
	public int getRentAmount() {
		return rentAmount;
	}
	public void setRentAmount(int rentAmount) {
		this.rentAmount = rentAmount;
	}
	private int totalRentAmount;
	
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Date getRentDate() {
		return rentDate;
	}
	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}
	public Date getRentTime() {
		return rentTime;
	}
	public void setRentTime(Date rentTime) {
		this.rentTime = rentTime;
	}
	public Date getTotalRentTime() {
		return totalRentTime;
	}
	public void setTotalRentTime(Date totalRentTime) {
		this.totalRentTime = totalRentTime;
	}
	public int getTotalRentAmount() {
		return totalRentAmount;
	}
	public void setTotalRentAmount(int totalRentAmount) {
		this.totalRentAmount = totalRentAmount;
	}
}
