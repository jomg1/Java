package com.yedam.oop;

public class Student {

	//정보 - 학생이름, 학번, 국어, 영어, 수학 점수
	//기본 생성자, 모든 데이터를 초기화 생성자
	//학생의 정보를 출력해주는 getInfo()
	//sum()
	/*
	 * 이름 : 김또치
	 * 학번 : 20230201
	 * 총점 : 200
	 * 평균 : 68.xx
	 */
	
	//필드
	String stdName;
	int stdNo;
	int kor;
	int eng;
	int math;
	
	//생성자
	public Student() {
		
	}
	
	public Student(String stdName, int stdNo, int kor, int eng, int math) {
		this.stdName = stdName;
		this.stdNo = stdNo;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	//메소드
	void getInfo() {
		System.out.println("이름 : " + stdName);
		System.out.println("학번 : " + stdNo);
		System.out.println("총점 : " + sum());
		System.out.println("평균 : " + avg());
	}
	
	double avg() {
		return sum()/3.0;
	}
	
	int sum() {
		return kor+eng+math;
	}
	
}
