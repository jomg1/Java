package com.yedam.loop;

public class ForExample {

	public static void main(String[] args) {
		//반복문
		//일정한 행동을 계속 반복
		//반복을 할 때 어떠한 규칙에 따라 행동 반복
		//규칙 찾는게 중요.
		
		//1~5까지의 누적의 합
		int sum = 0;
		
//		sum = sum +1;
//		sum = sum +2;
//		sum = sum +3;
//		sum = sum +4;
//		sum = sum +5;
				
		//for문
		for(int i = 1; i<=5; i++) {
			//sum = sum + i;
			sum += i;
		}
		
		System.out.println("누적 합 : " + sum);
		
		//1~100 사이에서 짝수 구하는 반복문
		//1~100 -> 1~100까지 반복
		//1 2 3 4 5 6 7 8....
		//2%2,, 4%2,, 6%2,,,
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i + "\t");
			}
		}
		
		//1~100 사이의 홀수 구하는 반복문
		//1 3 5 7 9 13 15......//차이가 2씩 나니까 2로 나눠보자
		//1%2==1, 3%2==1,,,
		for(int i =1; i<=100; i++) {
			if (i%2==1) {
				System.out.println(i+"\t");
			}
		}
		
		//1~100 사이에서 2의 배수 또는(OR) 3의 배수 찾기
		//2의 배수 => 어떤 값을 2로 나누었을 때 0인 애들.
		//3의 배수 => 어떤 값을 3으로 나누었을 때 0인 애들.
		for(int i=1;i<=100;i++) {
			if(i%2 == 0 || i%3 == 0) {
				System.out.println("2또는 3의 배수 : "+i);
			}
		}
		
		//구구단 출력하기
		//2*1 = 2
		//2*2 = 4
		//2*3 = 6...
		//2*i = X
		
		for(int i=1; i<10; i++) {
			System.out.println("2 x "+i+" = " + (2*i));
		}
		
		//중첩 for문
		//반복문 안에 반복문이 들어가는 형태
		
//		for() {
//			for() {
//				for() {}
//			}
//		}
		
		//2단 -> 2*1, 2*2, 2*3...
		//3단 -> 3*1, 3*2, 3*3...
		//4단 -> 4*1, 4*2, 4*3...
		
		//2단 ~ 9단까지를 출력하는 반복문
		//i = 2~9
		for(int i=2; i<=9; i++) {
			//j = 1~9
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
		
		//구구단 세로 찍기
		//줄수를 의미하는 for문(바깥 for문)
		for(int i=1; i<=9; i++) {
			System.out.print("\n");
			for(int j=2; j<=5; j++) { //j<6도 같음
				//해당 줄수에서 한칸씩 늘어나는 for문
				System.out.print(j+" x "+i+" = "+(j*i)+"\t");
			}
		}
		
		//교수님 답
		for(int i=1; i<=9; i++) {
			for(int j=2; j<6; j++) { 
				//해당 줄수에서 한칸씩 늘어나는 for문
				System.out.print(j+" x "+i+" = "+(j*i)+"\t");
			}
			System.out.println();
		}
		
		//공포의 별찍기
		
		//*****
		//*****
		//*****
		//*****
		//*****
		
		//한칸씩 내려 갈 때 쓰는 반복문
		for(int i = 0; i<5; i++) {
			//별 출력할 때 쓰는 반복문
			String star = "";
			for(int j=0; j<5; j++) {
				//+ 연산자를 ㅗ할용해서 ***** 만듦
				//star = star + "*"; //변수에 담아서 쓰는 방법
				System.out.print("*");//바로 콘솔창에 찍는 방식
			}
			//System.out.println(star);
			System.out.println();
		}
		
		//*
		//**
		//***
		//****
		//*****
		//한칸한칸 내려갈 때 쓰는 for문
		for(int i=1; i<=5; i++) {
			String star = "";
			for(int j=0; i>j; j++) {
				star = star + "*";
			}
			System.out.println(star);
		}
		
		//***** //1 - 5
		//**** //2 - 4
		//*** //3 - 3
		//** //4 - 2
		//*// 5 - 1
		for(int i=5; i>0; i--) {
			String star = "";
			for(int j=0; j<i; j++) { // 교수님 풀이(int j=i; j>0; j++)
				star = star + "*";
			}
			System.out.println(star);
		}
		
		// 교수님 풀이
//		for(int i =5; i>0; i--){
//			String star ="";
//			for(int j=i; j>0; j++){
//				star += "*";
//			}
//			System.out.println(star);
//		}
				  //i	   //j
		//    * 	1 4, 1 = 5
		//   **		2 3, 2 = 5
		//  ***		3 2, 3 = 5
		// ****		4 1, 4 = 5
		//*****		5 0, 5 = 5
		
		for(int i =5; i>0; i--) {
			for(int j=1; j<=5; j++) {
				if(i>j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}

}
