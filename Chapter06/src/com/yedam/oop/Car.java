package com.yedam.oop;

public class Car {
	//필드 : 객체로 만들었을 때, 정보를 담아주는 역할
	String name; //차 이름
	int price; //차 가격
	//클래스 내부에 필드 선언 ->
	//1. 객체를 만들때 내용을 포함한다
	//2. 생성자, 메소드에서도 사용 가능
	String company = "현대"; //차 브랜드
	
	
	//생성자 : 객체로 만들 때 내가 하고 싶은 행위를 정의
	//생성자 정의 -> 클래스의 이름과 동일
	//기본생성자(Basic) 선언을 하지 않으면 Java는 기본생성자를 자동 추가(기본 생성자 생략 가능)
	public Car() {
		//내용이 없으면 객체를 만들 때 아무것도 하지 않음을 의미
		//모든 값은 0, null이 됨
	} //this()
	//생성자를 통한 필드 초기화(객체를 만들때, 필드에 데이터 대입, 입력)
	//조건 : 생성자에 매개변수를 통해서 필드 초기화.
	public Car(String name, int price) { //this("kona",5000)
		this.name = name;
		this.price = price;
	}
	
	public Car(String name) {
		this.name = name;
	}
	
	public Car(int price) {
		this.price = price;
	}
	
	public Car(String name, int price, String company) {
		this.name = name;
		this.price = price;
		this.company = company;
	}
	
	//메소드 : 객체로 만들었을 때 기능 구현.
	void run() {		
		System.out.println("자동차가 달립니다.");
	}

}
