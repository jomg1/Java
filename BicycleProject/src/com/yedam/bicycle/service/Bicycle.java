package com.yedam.bicycle.service;

import java.util.Date;

public class Bicycle {
	private int bId; //자전거 번호
	private String bLocation; //위치
	private Date bReturnDate; //반납 날짜
	private Date bRentalDate; //빌린 날짜
	private String bReservation; //예약 여부
	private Date bReservationDate;//예약날짜
	private String bRental; //대여 여부
	private Date expectedDate; //반납 예정 날짜
	private int totalBicycle; //자전거 총 대수
	private String bCondition;//자전거 상태
	private String bRentMem;//빌린 회원
	
	
	public String getbRentMem() {
		return bRentMem;
	}
	public void setbRentMem(String bRentMem) {
		this.bRentMem = bRentMem;
	}
	public String getbCondition() {
		return bCondition;
	}
	public void setbCondition(String bCondition) {
		this.bCondition = bCondition;
	}
	public Date getbReservationDate() {
		return bReservationDate;
	}
	public void setbReservationDate(Date bReservationDate) {
		this.bReservationDate = bReservationDate;
	}
	
	public Date getbReturnDate() {
		return bReturnDate;
	}
	public void setbReturnDate(Date bReturnDate) {
		this.bReturnDate = bReturnDate;
	}
	public Date getbRentalDate() {
		return bRentalDate;
	}
	public void setbRentalDate(Date bRentalDate) {
		this.bRentalDate = bRentalDate;
	}
	public Date getExpectedDate() {
		return expectedDate;
	}
	public void setExpectedDate(Date expectedDate) {
		this.expectedDate = expectedDate;
	}
	public int getTotalBicycle() {
		return totalBicycle;
	}
	public void setTotalBicycle(int totalBicycle) {
		this.totalBicycle = totalBicycle;
	}
	public String getbRental() {
		return bRental;
	}
	public void setbRental(String bRental) {
		this.bRental = bRental;
	}
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

	public String getbReservation() {
		return bReservation;
	}
	public void setbReservation(String bReservation) {
		this.bReservation = bReservation;
	}
	
	
}
