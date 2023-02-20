package homework0206;

public class RPGgame implements Keypad{
	//필드
	private int currentMode;
	
	//생성자
	public RPGgame() {
		currentMode = Keypad.NORMAL_MODE;
		System.out.println("RPGgmae 실행");
	}
	//메소드
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");
		
	}

	@Override
	public void rightUpButton() {
		if(currentMode==Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		} else if(currentMode==Keypad.HARD_MODE) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
		
	}

	@Override
	public void rightDownButton() {
//		if(currentMode==Keypad.NORMAL_MODE) {
//			System.out.println("캐릭터가 일반 공격.");
//		}else if(currentMode==Keypad.HARD_MODE) {
//			System.out.println("캐릭터가 HIT 공격.");
//		}
		switch(currentMode) {
		case Keypad.NORMAL_MODE://0
			System.out.println("캐릭터가 일반 공격.");
			break;
		case Keypad.HARD_MODE://1
			System.out.println("캐릭터가 HIT 공격.");
			break;
		}
		
	}

	@Override
	public void changeMode() {
		if(currentMode==Keypad.NORMAL_MODE) {
			currentMode=Keypad.HARD_MODE;
			System.out.println("현재 모드 : HARD_MODE");
		} else if(currentMode==Keypad.HARD_MODE) {
			currentMode=Keypad.NORMAL_MODE;
			System.out.println("현재 모드 : NORMAL_MODE");
		}
		
		//currentMode = (currentMode == KeyPad.HARD_MODE) ? KeyPad.NORMAL_MODE : KeyPad.HARD_MODE;
	}

}
