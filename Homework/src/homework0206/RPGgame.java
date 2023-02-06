package homework0206;

public class RPGgame implements Keypad{
	//필드
	int mode=Keypad.NORMAL_MODE;
	
	//생성자
	public RPGgame(int mode) {
		
	}
	//메소드
	public void start() {
		System.out.println("RPGgame 실행");
	}
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다");
		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다");
		
	}

	@Override
	public void rightUpButton() {
		if(mode==0) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		} else if(mode==1) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
		
	}

	@Override
	public void rightDownButton() {
		if(mode==0) {
			System.out.println("캐릭터가 일반 공격.");
		}else if(mode==1) {
			System.out.println("캐릭터가 HIT 공격.");
		}
		
	}

	@Override
	public void changeMode() {
		if(mode==0) {
			mode=1;
			System.out.println("현재 모드 : HARD_MODE");
		} else if(mode==1) {
			mode=0;
			System.out.println("현재 모드 : NORMAL_MODE");
		}
		
	}

}
