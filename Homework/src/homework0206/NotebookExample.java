package homework0206;

public class NotebookExample {
	public static void main(String[] args) {
		PortableNotebook port = new PortableNotebook("한글2020", "크롬", "영화", "안드로이드앱");
		port.writeDocumentaion();
		port.watchVideo();
		port.changeMode();
		port.useApp();
		port.searchInternet();
	}
}
