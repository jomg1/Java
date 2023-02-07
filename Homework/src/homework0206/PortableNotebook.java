package homework0206;

public class PortableNotebook implements Notebook, Tablet{
	
	//필드
	private int mode;
	String document;
	String browser;
	String video;
	String app;
	
	//생성자
	
	// 생성자
	public PortableNotebook(String documet, String browser,String video, String app) {
			mode = Notebook.NOTEBOOK_MODE;
			System.out.println("NOTEBOOK_MODE");
			this.document = documet;
			this.browser = browser;
			this.video = video;
			this.app =app;
					
		}
	
	//메소드
	@Override
	public void watchVideo() {
		System.out.println(video+"를 시청.");
		
	}

	@Override
	public void useApp() {
		if(mode==Notebook.NOTEBOOK_MODE) {
			mode=Notebook.TABLET_MODE;
		System.out.println(app+"를 실행.");
	}else if(mode==Notebook.TABLET_MODE) {
		System.out.println(app+"를 실행.");
	}
	}

	
	@Override
	public void writeDocumentaion() {
		System.out.println(document+"을 통해 문서를 작성.");
		
	}

	@Override
	public void searchInternet() {
		System.out.println(browser+"를 통해 인터넷을 검색.");
		
	}
	
	public void changeMode() {
		if(mode==NOTEBOOK_MODE) {
			mode=TABLET_MODE;
			System.out.println("TABLET_MODE");
		}else {
			mode=NOTEBOOK_MODE;
			System.out.println("NOTEBOOK_MODE");
		}
	}

	
}
