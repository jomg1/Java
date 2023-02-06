package homework0206;

public class KeypadExample {
	public static void main(String[] args) {
		RPGgame rpg = new RPGgame(0);
		rpg.start();
		rpg.leftUpButton();
		rpg.rightUpButton();
		rpg.changeMode();
		rpg.rightUpButton();
		rpg.rightDownButton();
		rpg.leftDownButton();
		rpg.changeMode();
		rpg.rightUpButton();
		
		System.out.println("======================");
		
		ArcadeGame arcade = new ArcadeGame(0);
		arcade.start();
		arcade.leftUpButton();
		arcade.rightUpButton();
		arcade.leftDownButton();
		arcade.changeMode();
		arcade.rightUpButton();
		arcade.leftUpButton();				
		arcade.rightDownButton();
	}
	
}
