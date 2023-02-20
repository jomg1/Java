package exam;

public class DGBCard extends Card {

	// 필드
	public String company;
	public String cardStaff;

	// 생성자
	public DGBCard(String cardNo, String validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		company = "대구은행";
		this.cardStaff = cardStaff;
	}

	// 메서드
	@Override
	public void showCardInfo() {
		super.showCardInfo();//재사용
		System.out.println("담당직원 - " + cardStaff + ", " + company);
	}
	
}
