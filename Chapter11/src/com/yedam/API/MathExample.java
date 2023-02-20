package com.yedam.API;

import java.util.Random;

public class MathExample {
	public static void main(String[] args) {
		//abs 절대값
		int v1 = Math.abs(-5);
		System.out.println(v1);
		double v2 = Math.abs(-3.1);
		System.out.println(v2);
		
		//ceil 올림
		double v3 = Math.ceil(5.3);
		System.out.println(v3);
		double v4 = Math.ceil(-5.3);
		System.out.println(v4);
		
		//floor 내림
		double v5 = Math.floor(5.3);
		System.out.println(v5);
		double v6 = Math.floor(-5.3);
		System.out.println(v6);
		
		//최대 최소값
		int v7 = Math.max(5, 9);
		System.out.println(v7);
		
		int v8 = Math.min(5, 9);
		System.out.println(v8);
		
		//랜덤값
		double v9 = Math.random();
		System.out.println(v9);
		
		//rint 가까운 정수에 대한 값
		//5의 경우 앞에 있는 실수에 따라 짝수는 내림 홀수는 올림
		double v10 = Math.rint(8.5);
		System.out.println(v10);
		double v11 = Math.rint(7.5);
		System.out.println(v11);
		double v12 = Math.rint(3.3);
		System.out.println(v12);
		double v13 = Math.rint(9.5);
		System.out.println(v13);
		
		//round 반올림
		double v14 = Math.round(5.3);
		System.out.println(v14);
		
		//Math.random() -> 범위 지정해서 데이터 읽어옴
		//Random() -> seed라고 씨앗을 넣어주면 그것에 맞게끔 랜덤 데이터
		Random random = new Random(System.currentTimeMillis());
		System.out.println(random.nextDouble());
		
	}
}
