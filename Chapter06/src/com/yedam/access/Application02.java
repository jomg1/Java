package com.yedam.access;

public class Application02 {
	public static void main(String[] args) {
		//인스턴스 생성
		Student std = new Student();
		
		std.setStdName("김또치");
		std.setStdGrade("2학년");
		std.setMajor("컴퓨터공학과");
		std.setPrograming(-100);
		std.setDatabase(90);
		std.setOs(100);
		
		System.out.println("이름 : " + std.getStdName());
		System.out.println("학과 : " + std.getMajor());
		System.out.println("학년 : " + std.getStdGrade());
		System.out.println("프로그래밍 : " + std.getPrograming());
		System.out.println("데이터베이스 : " + std.getDatabase());
		System.out.println("운영체제 : " + std.getOs());
		
		Member mem = new Member();
		mem.setId("abc");
		mem.setPw("qwe!");
		mem.setName("김또치");
		mem.setAge(15);
		
		System.out.println("ID : "+ mem.getId());
		System.out.println("비밀번호 : "+mem.getPw());
		System.out.println("이름 : " + mem.getName());
		System.out.println("나이 : " +mem.getAge());
	}
}
