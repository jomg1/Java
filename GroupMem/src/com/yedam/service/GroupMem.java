package com.yedam.service;

public class GroupMem {
	
//	1. ID
//	2. 이름
//	3. 가입 날짜
//	4. 이메일
//	5. 나이
//	groupmem
//	MEM_ID    NOT NULL VARCHAR2(20) 
//	MEM_NAME           VARCHAR2(15) 
//	JOIN_DATE          VARCHAR2(15) 
//	MEM_EMAIL          VARCHAR2(50) 
//	MEM_AGE            NUMBER(2)    
	
	private String memId;
	private String memName;
	private String joinDate;
	private String memEmail;
	private int memAge;
	
	//메소드
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public int getMemAge() {
		return memAge;
	}
	public void setMemAge(int memAge) {
		this.memAge = memAge;
	}
	
}