package com.yedam.employees.service;

import java.sql.Date;

//만들때 NOT NULL 조건 꼭 생각할 것
//last_name, email, job_id, hire_date

public class Employees {
	

	private String empName;
	private String email;
	private int jobId;
	//java.sql.Date vs java.util.Date 차이
	//연월일				연월일시분초
	//사용하는 방식이 서로 다름
	private Date hiredate;


	public int getEmployeeId() {
		return jobId;
	}
	public void setEmployeeId(int employeeId) {
		this.jobId = jobId;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//toString
	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", empName=" + empName + ", hiredate=" + hiredate + ", salary="
				+ salary + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Employees [사번=" + employeeId + ", 이름=" + empName + ", 이메일=" + email + ", 입사일="
//				+ hiredate + ", 직책=" + jobID + "]";
//	}
	
}
