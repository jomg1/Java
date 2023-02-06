package homework0206;

public class Performance extends Culture {
	//필드
	public String genre;
	//생성자
	public Performance(String title, int directors, int actors, String genre) {
		super(title, directors, actors);
		this.genre = genre;
	}
	//메소드
	@Override
	public void getInformation() {
		System.out.println("공연제목 : " + title);
		System.out.println("감독 : " + directors);
		System.out.println("배우 : " + actors);
		System.out.println("공연총점 : " + totalScore);
		System.out.println("영화평점 : " + getGrade());

	}

}
