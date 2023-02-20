package com.yedam.example;

public class LgWashingMachine implements WashingMachine{

	@Override
	public void start() {
		System.out.println("세탁기를 작동합니다.");
		
	}

	@Override
	public void pause() {
		System.out.println("세탁기를 일시정지합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("세탁기를 끕니다.");
		
	}

	

	@Override
	public void dry() {
		System.out.println("건조합니다.");
		
	}

	@Override
	public int changeSpeed(int speed) {
		int nowSpeed = 0;
		switch (speed) {
		case 1:
			nowSpeed = 20;
			break;
		case 2:
			nowSpeed = 50;
			break;
		case 3:
			nowSpeed = 100;
			break;
		}
		return nowSpeed;
	}

	}

	

