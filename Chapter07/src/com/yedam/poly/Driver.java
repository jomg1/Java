package com.yedam.poly;

public class Driver {
	//drive 메소드에 매개변수 -> Vehicle
	public void drive(Vehicle vehicle) {
		//1)Vehicle 자기 자신 2)Vehicle의 자식 클래스도 매개변수로 올 수 있음
		vehicle.run();
	}
}
