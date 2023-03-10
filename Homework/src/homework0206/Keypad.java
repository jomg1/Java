package homework0206;

public interface Keypad {
	public static final int NORMAL_MODE = 0;
	public int HARD_MODE = 1;
	
	//왼쪽에서 위쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void leftUpButton();
	//왼쪽에서 아래쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void leftDownButton();
	//오른쪽에서 위쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void rightUpButton();
	//오른쪽에서 아래쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void rightDownButton();
	//모드를 바꾸고 현재 모드를 출력하는 기능 ( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
	public abstract void changeMode();
	
}
