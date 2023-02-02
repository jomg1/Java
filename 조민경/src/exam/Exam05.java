package exam;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] size = null;		
		boolean go = true;
		int count=0; // 주사위 굴린 횟수
		int [] save= null;
		
		while(go) {
			System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료 ===");
			System.out.println("메뉴>");
			int selectNo = Integer.parseInt(sc.nextLine());
			

			
			switch(selectNo) {
			case 1:
				System.out.println("주사위 크기를 입력하세요.");
				int inputSize = Integer.parseInt(sc.nextLine()); 
				if(inputSize <5 || inputSize>11) {
					System.out.println("주사위의 크기는 5~10 사이로 입력하세요.");
					return;
				}
				
				size = new int[inputSize];
				
				break;
			case 2:
				while(true) {
					int num = (int) (Math.random()*size.length)+5;
					
					if(num == 5) {
						break;
					}
					else if(num != 5) {
						count++;
						
					}
				}
			
				
				System.out.println("5가 나올 때까지 주사위를 "+count+"번 굴렸습니다.");
			case 3:
				break;
			case 4:
				break;
			case 5:
				go = false;
				System.out.println("프로그램을 종료합니다.");
			default:
				System.out.println("잘못 선택하셨습니다. 1~5 중 선택하세요.");
			}
			
		}
		
		
		
	}

	private static Object num (int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
