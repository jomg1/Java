package com.yedam.array;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				//학생의 수 = 학생 수만큼 데이터를 입력
				//학생의 성적을 입력하는 배열의 크기
				System.out.println("학생수 입력>");
				studentNum = Integer.parseInt(scanner.nextLine());					
				}else if(selectNo == 2) {
					//1번 메뉴를 변경하고 싶을 때 혹시나 상황을 대비해서 2번에서 배열 생성
					scores = new int[studentNum];
					
					//scores[0] = ...
					//scores[1] = ...
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]>");
					//scores가 가진 인덱스 위치에 바로 값 입력
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			}else if(selectNo == 3) {
				//배열에 담긴 데이터를 출력
				int i = 0;
				for(int var : scores) {
					System.out.println("scores["+i+"]>"+var);
					i++;
//					for(int i =0; scores.length;i++) {
//						System.out.println("scores["+i+"]>"+scores[i]);
//					}
				}
			}else if(selectNo == 4) {
				//최고값, 평균
				int max = scores[0];
				//double avg = 0;
				int sum = 0;
				
				for(int i = 0; i<scores.length;i++) {
					//최고값 구하기
					if(scores[i] > max) {
						max = scores[i];
					}
				}
								
				//합계(평균을 내기 위해서)				
				for(int var : scores) {
					sum += var;
				}
				
				//avg= (double)sum/scores.length;
				
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수:" + (sum/(double)scores.length));
			}else if(selectNo == 5) {
				run = false;
			}
						
		}
		System.out.println("프로그램 종료");
	}
}
