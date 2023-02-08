package exam;

public class Application {

	public static void main(String[] args) {
		
		//문제2
		Card card = new Card("5432-4567-9534-3657","20251203",253);
		TossCard toss = new TossCard("5432-4567-9534-3657","20251203",253,"신빛용");
		DGBCard dgb = new DGBCard("5432-4567-9534-3657","20251203",253,"신빛용");
		
		card.showCardInfo();
		System.out.println();
		toss.showCardInfo();
		System.out.println();
		dgb.showCardInfo();
		System.out.println();
		
		//문제3
		int price = 10000;
		
		Payment card1 = new CardPayment(0.08);
		card1.showInfo();
		System.out.println("온라인 결제 금액 : " + card1.online(price));
		System.out.println("오프라인 결제 금액 : " + card1.offline(price));
		
		Payment simple = new SimplePayment(0.05);
		simple.showInfo();
		System.out.println("온라인 결제 금액 : " + simple.online(price));
		System.out.println("오프라인 결제 금액 : " + simple.offline(price));
	}

}
