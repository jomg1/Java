package com.yedam.inter;

public class MyClassExample {
	public static void main(String[] args) {
		System.out.println("(1)=============");
		
		//클래스 내부에 인터페이스를 활용하여 필드로 선언
		MyClass myClass1 = new MyClass();
		
		//myClass객체 안에 있는 rc라는 객체
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("(2)=============");
		
		//생성자 부분에 매개변수의 다형성 활용
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("(3)=============");
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("(4)=============");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Televison());
		myClass4.methodB(new Audio());
		
	}
}
