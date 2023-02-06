package homework0206;

public class CultureExample {
	public static void main(String[] args) {
		Movie movie = new Movie("추격자",7,5,"액션");
		
		movie.setTotalScore(4);
		movie.setTotalScore(4);
		movie.setTotalScore(4);
		movie.getGrade();
		movie.getInformation();
		
		Performance perfo = new Performance("지킬앤하이드",9,10,"스릴러");
		
		perfo.setTotalScore(5);
		perfo.setTotalScore(5);
		perfo.setTotalScore(5);
		perfo.setTotalScore(5);
		perfo.setTotalScore(5);
		perfo.setTotalScore(5);
		perfo.setTotalScore(5);
		perfo.setTotalScore(3);
		perfo.setTotalScore(4);
		perfo.setTotalScore(4);
		
		perfo.getGrade();
		perfo.getInformation();
		
	}
}
