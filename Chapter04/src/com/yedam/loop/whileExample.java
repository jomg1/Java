package com.yedam.loop;

import java.util.Scanner;

public class whileExample {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		//1~5까지의 합 구하기
		while(i<=5) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
		//짝수 구하기
		i = 0;
		while(i<=100) {
			if(i%2 ==0) {
				System.out.println(i);
			}
			i++;
		}
		//무한 루프 - 반복문을 탈출 못하고 계속 실행되는 상황
//		while(true) {
//			System.out.println("실행중");
//		}
//		System.out.println("end of prog");
		
		//계산기 프로그램
		
//		i=0;
//		while(flag) {
//			if(i==50) {
//				flag = false;
//			}
//			i++;
//		}
		
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			//메뉴출력
			System.out.println("1. 더하기 | 4. 종료");
			System.out.println("입력>");
			//메뉴를 선택할 때 필요한 변수
			int no = Integer.parseInt(sc.nextLine());
			
			switch(no) {
			case 1:
				System.out.println("더하고자하는 두개의 수 입력>");
				System.out.println("1>");
				int num = Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num2 = Integer.parseInt(sc.nextLine());
				System.out.println(num + ","+num2+"의 결과 : "+(num+num2));
				break;
			case 4:
				flag = false;
				System.out.println("종료");
				break;
			default:
				System.out.println("메뉴를 잘못 입력하였습니다.");
				break;
			}
		}
		
		//Up & Down(1~100) -> 랜덤값 -> 사용자가 맞추는 게임
		//사용자가 입력한 값에 대해서 비교함.
		//사용자가 입력한 값보다 크면 up
		//사용자가 입력한 값보다 작으면 down
		//사용자가 몇번만에 값을 맞추었는지 프로그램을 구현
		
		//1. 스캐너
		//2. 랜덤값 추출
		
		//1~100 사이의 값을 랜덤 추출
		int randomNo = (int)(Math.random()*100)+1;
		int count = 0;
		System.out.println("UP & DOWN");
		flag = true;

		//맞출때 까지 반복문 -> 기회는 5번만 제공.
//		while(flag) {
//			System.out.println("숫자>");
//			int inputNo = Integer.parseInt(sc.nextLine());
//			//System.out.println(randomNo);
//			count++; //숫자를 뽑은 횟수 조회
//			
//			//조건문 활용해서 UP & DOWN
//			if(randomNo > inputNo) {
//				System.out.println("UP");
//			}else if(randomNo < inputNo) {
//				System.out.println("DOWN");
//			}else if(randomNo == inputNo) {
//				System.out.println("정답입니다.");
//				//반복문, 조건문 강제종료 시킬 때 사용. break;
//				flag=false;
//			}
//			
//		}
//		
//		System.out.println(count + "번만에 맞추셨습니다.");
//		
		//내가 입력한 문자 출력
		//단, q라는 문자를 입력하면 반복문을 종료하고
		//입력했던 문자를 모두 출력하시오.
		
		//입력 받을 문자열
		//출력용으로 사용할 문자열
		
		String word ="";
		String addWord ="";
		flag = true;
		while(flag) {
			System.out.println("문자 입력>");
			//내가 입력한 문자열 저장
			addWord = sc.nextLine();
			//q 외에 데이터를 입력.. 데이터를 저장
			//문자열 + 연산
			//입력한 데이터가 q가 아니라면...
			if(!addWord.equals("q")) {
				word += addWord;
			}else {
				flag = false;
				System.out.println("종료");
			}
			//q를 입력한다면... 종료
		}
		
		System.out.println("입력한 문자>"+word);
		
		//최대값, 최소값
		
		//1) 최대값
		int max = 0;
		int min = 0;
		i = 0;
		
		while(true) {
			System.out.println("숫자 입력(종료 99)>");
			int number = Integer.parseInt(sc.nextLine());
			//반복문이 처음 한바퀴 돌 때 시점 가져오기 위해서.
			if(i == 0 ) {
				//내가 처음으로 넣은 데이터가 최대값이며 최소값이라는 가정.
				//10 30 20 5 4 100
				max = number;
				min= number;
			}
			//반복문이 몇번 돌았는지 확인하기 위한 용도
			i++;
			
			if(number == 99) {
				System.out.println("프로그램 종료");
				break;
			}
			//최대값 구하는 로직
			//비교하고자하는 값(number) > 최대값(max) = 
			if(number > max) {
				max = number;
			}
			//최소값 구하는 로직
			//비교하고자하는 값(입력 값) < 최소값
			if(number < min) {
				min = number;
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		

	}

}
