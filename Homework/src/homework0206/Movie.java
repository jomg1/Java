package homework0206;

public class Movie extends Culture{

	//필드
	public String genre;
	
	//생성자
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
		System.out.println("=====================");
		
	}
	
}
