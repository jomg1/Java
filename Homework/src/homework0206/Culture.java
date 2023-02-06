package homework0206;

public class Culture {
	//필드
	//제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
	public String title; //제목
	int movieDirector; //참여감독 수
	public int actors; //참여배우 수
	public int audience=0; //관객 수
	public int totalScore = 0; //총점
	
	//생성자
	//제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
	public Culture(String title, int movieDirector, int actors) {
		
	}
	
	//메소드
	//관객수와 총점을 누적시키는 기능
	int a=0;
	public void setTotalScore(int score) {	
		totalScore += score;
		audience++;
	}
	
	//평점을 구하는 기능
	public String getGrade() {
		String grade=null;
		int avgScore = totalScore / audience;
		switch(avgScore) {
		case 5:
			grade = "★★★★★";
		case 4:
			grade = "★★★★";
		case 3:
			grade = "★★★";
		case 2:
			grade = "★★";
		case 1:
			grade = "★";
		}
		return grade;
	}
	
}
