package homework0206;

public class Movie extends Culture{

	//필드
	public String genre;
	
	//생성자
	//Movie 객체가 만들어 질 때 Culture 객체도 함께 만들어야하므로 생성자에 내용이 포함되어야 한다.
	public Movie(String title, int directors, int actors, String genre) {
		super(title, directors, actors);
		this.genre = genre;
		
	}

	@Override
	public void getInformation() {
		System.out.println("영화제목 : " + title);
		System.out.println("감독 : " + directors);
		System.out.println("배우 : " + actors);
		System.out.println("영화총점 : " + totalScore);
		System.out.println("영화평점 : " + getGrade());
		
		
	}
	
}
