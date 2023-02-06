package com.yedam.inter2;

public class Example {
	public static void main(String[] args) {
		ImpelementsC impl = new ImpelementsC();
		
		//interfaceA ~ C까지 impl을 활용해서 메소드 호출
		
		//1)interface A -> A가 가지고 있는 메소드 method01만 실행
		InterfaceA ia = impl;
		ia.method01();		
		//2)interface B
		InterfaceB ib = impl;
		ib.method02();		
		//3)interface C
		InterfaceC ic = impl;
		ic.method01();
		ic.method02();
		ic.method03();
	}
}
