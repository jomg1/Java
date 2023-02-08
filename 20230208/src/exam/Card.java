package exam;

public class Card {
	//필드
	private String cardNo;
	private String validDate;
	private int cvc;
	
	//생성자
	public Card(String cardNo, String validDate, int cvc) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}

	//메소드
	//각 필드의 getter
	public String getCardNo() {
		return cardNo;
	}

	public String getValidDate() {
		return validDate;
	}

	public int getCvc() {
		return cvc;
	}
	
	public void showCardInfo() {
		System.out.println("카드정보 ( Card NO : "+cardNo+", 유효기간 : "+validDate+", CVC : "+cvc+")");
	}
}
