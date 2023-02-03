package com.yedam.poly;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire 교체");
				//car.frontLeftTire => Tire frontLeftTire
				//Tire frontLeftTire = new HankookTire("앞왼쪽",15);
				//Tire frontLeftTire = new KunhoTire("앞왼쪽",15);
				//변수는 그대로 사용(필드는 부모타입), 자식 클래스에서 재정의한 타입이 있다면 사용하겠다. 
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("===========================");
		}
	}
}
