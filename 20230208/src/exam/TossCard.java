package exam;

public class TossCard extends Card{
	//필드
	private String company;
	public String cardStaff;
	
	//생성자
	public TossCard(String cardNo, String validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.company = "Toss";//this..
		this.cardStaff = cardStaff;
	}

	//메서드 시그니처 오버라이딩
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card NO, "+getCardNo());
		System.out.println("담당직원 - "+cardStaff+", "+company);
	}
	
	

}
