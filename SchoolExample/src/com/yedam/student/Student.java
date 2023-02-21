package com.yedam.student;

public class Student {
//	STD_ID    NOT NULL NUMBER       
//	STD_NAME  NOT NULL VARCHAR2(15) 
//	STD_MAJOR          VARCHAR2(30) 
//	STD_POINT          NUMBER(2,1)  
	
	private int stdId;
	private String stdName;
	private String stdMajor;
	private double stdPoint;
	//JOIN 시 새로운 필드 혹은 클래스를 만들어서 사용해도 됨
	private double stdSum;
	private double stdAvg;
	
	public double getStdSum() {
		return stdSum;
	}
	public void setStdSum(double stdSum) {
		this.stdSum = stdSum;
	}
	public double getStdAvg() {
		return stdAvg;
	}
	public void setStdAvg(double stdAvg) {
		this.stdAvg = stdAvg;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdMajor() {
		return stdMajor;
	}
	public void setStdMajor(String stdMajor) {
		this.stdMajor = stdMajor;
	}
	public double getStdPoint() {
		return stdPoint;
	}
	public void setStdPoint(double stdPoint) {
		this.stdPoint = stdPoint;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdMajor=" + stdMajor + ", stdPoint=" + stdPoint
				+ ", stdSum=" + stdSum + ", stdAvg=" + stdAvg + "]";
	}
	
	
}
