package homework0206;

public interface Tablet extends Notebook{
	public static final int TABLET_MODE = 2;
	
	//메소드
	public abstract void watchVideo();//영상을 출력하는 기능
	public abstract void useApp();//앱을 사용하는 기능
}
