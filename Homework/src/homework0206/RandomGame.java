package homework0206;

import java.util.Scanner;

public class RandomGame {
	// 50% 확률로 두 개의 게임 중 하나가 셋팅 (인터페이스의 다형성 활용)
	// 인터페이스를 공유하여 중복적인 메소드를 가지고 있기 때문에 사용 가능
	
	public static Keypad getRandomGame() {
		Keypad game = null;
		//random date 출력
		int random = (int)(Math.random()*2)+1;
		//리턴값을 돌려줄 때 삼항 연산자를 많이 사용
		//random == 1일 경우 RPGgame 실행
		//random == 2일 경우 ArcadeGame 실행
//		return (random ==1) ? new RPGgame() : new ArcadeGame();
		if(random == 1) {
			game = new RPGgame();
		}else {
			game = new ArcadeGame();
		}
		return game;
	}
	
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		//인터페이스 다형성, 자동타입변환 
		//-> 하나의 객체로 두개 또는 여러개의 객체 만들어 사용
		Keypad game = getRandomGame(); // 숙제의 핵심
		
		while(run) {
			System.out.println("============================================================================================");
			System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println("============================================================================================");
			System.out.println("입력>");
			int menuNo = Integer.parseInt(sc.nextLine());
			switch(menuNo) {
			case 1:
				game.leftUpButton();
				break;
			case 2:
				game.leftDownButton();
				break;
			case 3:
				game.rightUpButton();
				break;
			case 4:
				game.rightDownButton();
				break;
			case 5:
				game.changeMode();
				break;
			case 0:
				game = getRandomGame();
				break;
			case 9:
				System.out.println("종료");
				run=false;
				break;
			}
		}
	}
}
