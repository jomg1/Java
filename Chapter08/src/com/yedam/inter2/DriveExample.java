package com.yedam.inter2;

public class DriveExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
		
		//Vehicle이 가지고 있는 메소드만 사용 가능
		//단, Bus에 재정의 된 메소드만 사용 가능
//		Vehicle v1 = new Bus();
		//인터페이스만 가지고 실행
//		v1.run();
		//강제 타입 변환
//		Bus bus = (Bus)v1;
//		bus.run();
//		bus.checkFare();
		
	}
}
