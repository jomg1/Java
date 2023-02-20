package homework0206;

public interface Notebook extends Tablet{
	public static final int NOTEBOOK_MODE = 1;
	
	//메소드
	public abstract void writeDocumentaion();//문서를 작성하는 기능
	public abstract void searchInternet();//인터넷을 검색하는 기능
}
