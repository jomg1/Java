package com.yedam.oop;

public class Application06 {
	
	//필드 선언(stack)
	//해결 방법 같은 위치로 바꿔준다 둘 다 static으로 선언
	//int num = 1;
	static int num = 1;
	//정적 필드 선언(method)
	static int sNum = 1;
	
	//필드 선언
	int field1; // 인스턴스 필드(heap영역)
	
	//메소드
	void info() {
		System.out.println("info 출력");
	}
	//1.static으로 변경해준다
	//static void info(){System.out.println("info 출력");}
	
	
	//메소드 영역에 포함되어 있는 정적 메소드 (객체로 만드는 것 불가) (method영역)
	public static void main(String[] args) {
		//클래스 한 공간에서 정적 멤버, 인스턴스 멤버 사용
		//1) 인스턴스 필드 -> 정적 메소드에서 사용한다.
		//자기 자신을 객체로 만든 다음 인스턴스 필드를 호출해서 사용
		//2) 필드 -> 정적 필드로 변경해서 사용한다.
		
		
		Application06 app = new Application06();
		
		app.field1 = 0;
		app.info();
		
		// stack 영역의 필드를 method 영역에서 사용해서 오류가 남
		
		num = num + 1;
		System.out.println(num); 
		
		//double result1 = 10 * 10 * StaticCal.pi;//정적클래스.정적필드이름;
		
		int result2 = StaticCal.plus(10, 5);
		int result3 = StaticCal.minus(10, 5);
		
		//System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}
