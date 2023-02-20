package com.yedam.inter;

public class InterfaceExample {
	public static void main(String[] args) {
		//인터페이스 타입에 대한 변수 
		RemoteControl rc;
		rc = new Televison();
		rc = new Audio();
		
		//마지막 rc에 오디오 값을 넣어서 출력은 오디오로 나옴.
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(12);
		rc.setVolume(-1);
		rc.turnOff();
		
		SmartTelevision tv = new SmartTelevision();
		
		//SmartTelevision -> 2개의 인터페이스를 상속
		//한꺼번에 두 기능 사용 불가, 나누어서 사용해야 함
		
		RemoteControl rc2 = tv;
		Searchable search = tv;
		
		rc2.setVolume(10);
		rc2.turnOff();
//		rc2.search("www.naver.com");
		search.search("www.naver.com");
		
		
	}
}
