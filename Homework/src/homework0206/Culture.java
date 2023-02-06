package homework0206;

public abstract class Culture {
	//필드
	//제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
	public String title; //제목
	int directors; //참여감독 수
	public int actors; //참여배우 수
	public int audience=0; //관객 수
	public int totalScore = 0; //총점
	
	//생성자
	//제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
	public Culture(String title, int directors, int actors) {
		this.title = title;
		this.directors = directors;
		this.actors = actors;
	}
	
	//메소드
	//관객수와 총점을 누적시키는 기능
	
	public void setTotalScore(int score) {	
		totalScore += score;
		audience++;
	}
	
	//평점을 구하는 기능
	public String getGrade() {
		String grade=null;
		int avgScore = totalScore / audience;
		if(avgScore > 4.1 || avgScore <=5) {
			grade = "☆☆☆☆☆";
		}else if(avgScore >3) {
			grade = "☆☆☆☆";
		}else if(avgScore >2) {
			grade = "☆☆☆";
		}else if(avgScore >1) {
			grade = "☆☆";
		}else {
			grade = "☆";
		}
		return grade;
	}
	
	//정보를 출력하는 추상 메소드
	public abstract void getInformation();
	
}
