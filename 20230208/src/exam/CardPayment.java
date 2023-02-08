package exam;

public class CardPayment implements Payment {
		
	//필드
	double cardRatio;
	
	//생성자
	CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}
	
	@Override
	public int online(int price) {
		int cardOnline = (int) ((price)* (cardRatio+0.05));
		
		return cardOnline;
	}

	@Override
	public int offline(int price) {
		int cardOffline = (int) ((price)* (cardRatio+0.05));
		return cardOffline;
	}

	@Override
	public void showInfo() {
		System.out.println("***카드로 결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : " + (cardRatio+0.05));
		System.out.println("오프라인 결제시 총 할인율 : " + (cardRatio+0.03));
		System.out.println("온라인 결제 금액 : " );
		System.out.println("오프라인 결제 금액 : ");

	}

}
