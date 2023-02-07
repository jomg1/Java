package com.yedam.API;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			//obj에 Student의 기능 쓰기 위해 캐스팅
			if(this.studentNum.equals(std.studentNum)) {
				return true;
			}
		}
			return false;		
			

	}
	
	
}
