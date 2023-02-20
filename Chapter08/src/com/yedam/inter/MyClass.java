package com.yedam.inter;

public class MyClass {
	//인터페이스 사용할 수 있는 공간
	//1.필드
	RemoteControl rc = new Televison();
	//MyClass.rc. 으로 사용해야함 
	//String str = "문자열";
	//MyClass를 객체로 바꾸면서 필드값에 해당 주소가 들어감
	
	//2.생성자
	public MyClass() {
		
	}
	public MyClass(RemoteControl rc) {
		//받아온 매개변수를 우리가 정의한 rc에 넣어준다.
		//rc = tv, rc = audio
		this.rc=rc;
		rc.turnOn();
		rc.turnOff();
	}
	
	//3.메소드
	public void methodA() {
		//로컬 변수 사용
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
	
	public void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(2);
	}
}
