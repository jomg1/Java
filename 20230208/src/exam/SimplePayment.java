package exam;

public class SimplePayment implements Payment {
	
	//필드
		double simplePaymentRatio;
		
		//생성자
		SimplePayment(double cardRatio) {
			this.simplePaymentRatio = cardRatio;
		}
	
	@Override
	public int online(int price) {
		int simpleOnline = (int) ((price) * (simplePaymentRatio + 0.05));

		return simpleOnline;
	}

	@Override
	public int offline(int price) {
		int simpleOffline = (int) ((price) * (simplePaymentRatio + 0.03));
		return simpleOffline;
		
		
	}

	@Override
	public void showInfo() {
		System.out.println("***간편결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : " + (simplePaymentRatio+0.05));
		System.out.println("오프라인 결제시 총 할인율 : " + (simplePaymentRatio+0.03));
		System.out.println("온라인 결제 금액 : " );
		System.out.println("오프라인 결제 금액 : ");

	}

}
