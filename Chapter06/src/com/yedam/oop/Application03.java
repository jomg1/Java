package com.yedam.oop;

public class Application03 {
	public static void main(String[] args) {
		//일꾼
		Bycle bycle = new Bycle();//바이클 클래스로 바이클 객체 생성
		
		bycle.setGas(5);// Bycle로 생성한 객체 필드값(gas) 데이터 입력
		
		boolean gasState = bycle.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			bycle.run();
		}
		
		if(bycle.isLeftGas()) {
			System.out.println("gas를 주입할 필요 없음.");
		}else {
			System.out.println("gas를 주입 해야 함.");
		}
		
		//Book 클래스 사용해서 book 객체 만들기
		Book book = new Book("혼자 공부하는 자바","학습서",24000,001,"한빛미디어");
		//생성자 함수
		//Book(String bookName, String kind, int price, int isbn, String company)
		//사용하여 타입에 맞추어 내용 입력하여 필드 초기화
		
		book.getInfo();//Book class 내의 메소드 사용하기
		
		Student std = new Student("김또치",20230201,90,80,75);
		std.getInfo();
		
	}
}
