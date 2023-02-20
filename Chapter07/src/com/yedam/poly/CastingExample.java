package com.yedam.poly;

public class CastingExample {
	//매개변수의 다형성을 활용
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("casting 성공");
		}else {
			System.out.println("Casting 실패");
		}
	}
	
	public static void method2(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("casting 성공222222");
		}
	}
	
	
	public static void main(String[] args) {
		//child 클래스로 만들어진 객체
		Parent p1 = new Child();
		//Child child = (Child) p1;
		method2(p1);
		//child02로 만들어진 객체
		Parent p2 = new Child02();
		//Child02 child02 = Child) p2;
		method1(p2);
	}
		
}
