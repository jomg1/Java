package com.yedam.loop;

import java.util.Scanner;

public class whileExample02 {

	public static void main(String[] args) {
		
		//오락실
		//투입한 금액만큼 반복문을 진행
		//while문
		//투입한 금액대비 게임을 몇 번 할 수 있을까?
		//예시) 10,000 -> 20번, 5,000원 -> 10번
		int money;
		Scanner sc = new Scanner(System.in);
		System.out.println("====insert Coin====");
		//돈 투입
		money = Integer.parseInt(sc.nextLine());
		
		//money/500 > 0 vs money > 0 (10,300 게임 기회 주어지면 안 됨)
		while(money/500 > 0) {
			//한판에 500원
			System.out.println((money/500) + "판 남음.");
			System.out.println("1. 가위바위보 | 2. Up & Down | 3. 종료");
			//야구 게임(4개의 무작위 번호 맞추는거), 베스킨 등등...
			System.out.println("입력>");
			int gameNo = Integer.parseInt(sc.nextLine());
			
			switch (gameNo) {
			case 1:
				System.out.println("가위바위보 실행~");
				money -= 500;
				break;
			case 2:
				System.out.println("Up & Down 실행~");
				money -= 500;
				break;
			case 3:
				System.out.println("종료~");
				money = 0; // money/500 > 0
				break;
			}
			
			
		}

	}

}
