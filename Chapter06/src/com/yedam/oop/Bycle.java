package com.yedam.oop;

public class Bycle {
	//필드
	int gas;
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas; // 메소드 정의
	}
	
	boolean isLeftGas() {//연료값 확인 메소드
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {//실행 구문 : while문 안의 내용 실행됨
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량 : "+gas+" )");
				gas -= 1;
			}else {
				System.out.println("멈춥니다.(gas 잔량 : "+gas+" )");
				return; // void 안에서의 리턴문 : 메소드 종료
			}
		}
	}
}
