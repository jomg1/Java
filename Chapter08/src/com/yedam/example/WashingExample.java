package com.yedam.example;

public class WashingExample {
	public static void main(String[] args) {
		LgWashingMachine LGws = new LgWashingMachine();
		LGws.start();
		LGws.pause();
		System.out.println("세탁기 속도 : "+LGws.changeSpeed(2));
		LGws.stop();
		LGws.dry();
	}
}
