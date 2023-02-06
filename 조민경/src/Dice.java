package exam;

import java.util.Scanner;

public interface Dice {
	public static void main(String[] args) {
		//1.주사위 크기 2.주사위 굴리기 3. 결과보기 4.가장 많이 나온 수 5.종료
		//1.주사위 크기 (5~10)
		//주사위의 최대 크기가 5~10
		//5->1~5
		//6->1~6
		//...10->1~10
		//5~10을 벗어난 크기를 입력 -> 범위가 벗어났다.
		
		Scanner sc = new Scanner(System.in);
		int[] dice = null;//1.어디서든 설정한 배열을 사용할 수 있게 함 
		//2.데이터 보존하기 위해서(while문 안에 넣으면 반복문을 돌 때마다 초기화됨)
		//3.초기화를 미리 해두어야 case 3,4등에서도 사용 가능.
		int size = 0;
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.주사위 크기 2.주사위 굴리기 3. 결과보기 4.가장 많이 나온 수 5.종료");
			System.out.println("메뉴>");
			String selectNo = sc.nextLine();//문자열로 메뉴 입력받음
			
			switch(selectNo) {
			case "1":
				System.out.println("주사위 크기>");
				size = Integer.parseInt(sc.nextLine());
				//7 -> 배열 크기(사이즈) = 7
				//배열 입장 -> 0~6 -> 주사위 비유 -> 1~7
				//if문 활용 -> 경고창 : 주사위 크기 6~9 
				if(size < 5 || size > 10) {
					System.out.println("5~10 사이의 수를 입력하세요.");
				}
				break;
			case "2":
				//주사위 크기 설정
				//5가 나올때 까지 반복문을 진행 -> while(언제 종료할 지 모르기때문에 사용)
				//랜덤값을 활용해서 숫자를 뽑아낸다.
				//5가 등장하면 반복문을 종료.
				dice=new int[size];
				//총 주사위를 몇번 굴렸는지 확인.
				int count=0;
				//5가 나올때까지 반복하는 반복문
				while(true) {
					//랜덤값 추출
					int random = (int)(Math.random()*size)+1; //size = dice.length
					//각 숫자를 배열에 저장
					//랜덤으로 나온 숫자 -> 배열에서 인덱스로 적용
					//3->배열에서 인덱스 2
					//dice[random-1]=dice[random-1]+1; //숫자에 따른 별찍기 문제 활용(0201숙제)
					dice[random-1]++;
					count++;
					//숫자 5가 등장하면 반복문 종료(숫자를 그만 가지고 나와야한다)
					if(random ==5) {
						break;
					}
				}
				System.out.println("5가 나올때 까지 주사위를 "+count+"번 굴렸습니다.");
				break;
				
			case "3":
				for(int i=0; i<dice.length;i++) {
					System.out.println((i+1)+"은 "+dice[i]+"번 나왔습니다."); 
					//(i+1) 주사위는 1부터 시작하고 배열은 0부터 시작하므로 +1해줌
				}
				break;
			case "4":
				int max=dice[0];
				int index = 0;
				for(int i=0; i<dice.length; i++) {
					if(max<dice[i]) {
						max=dice[i];
						index=i;
					}
				}
				System.out.println("가장 많이 나온 수는 "+(index+1)+"입니다.");
				
				break;
			case "5":
				System.out.println("프로그램 종료");
				run=false;
			}
		}
	}
}
