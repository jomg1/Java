package com.yedam.oop;

public class Application01 {
	
	public static void main(String[] args) {
		//클래스 변수 = new 생성자();
		//해당클래스 안에 정의한 내용을 사용(=데이터 타입) 주소값 = Heap의 새로운 공간 만듦 생성자()를 실행하면서 만듦
		//새로운 보관 장소 설정
		  Car myCar = new Car("sonaata", 10000); // 100번지에 저장된 객체
		  //dot 연산자 => .
		  //클래스 외부에서 해당 클래스의 필드나 메소드 사용 가능
//		  myCar.name = "sonata";
//		  myCar.price = 10000;
		  //Car 클래스를 활용한 또 다른 객체 생성
		  Car yourCar = new Car("kona", 50000); // 200번지에 저장된 객체
		  //클래스 외부에서 데이터를 입력
//		  yourCar.name = "kona";
//		  yourCar.price = 50000;
		  //클래스 외부에서 필드를 사용할 경우(출력)
		  System.out.println(yourCar.name);
		  System.out.println(yourCar.price);
		  System.out.println(yourCar.company);
		  
		  //다양한 생성자를 통한 객체 생성
		  Car car01 = new Car();
		  
		  Car car02 = new Car("kona", 5000, "현대");

		  
		  
	}
}
