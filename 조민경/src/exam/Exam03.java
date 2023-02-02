package exam;

public class Exam03 {
	public static void main(String[] args) {
		
		int fiveH=0;
		int oneH=0;
		int ohsip=0;
		int ten=0;
		
		int[] coinUnit = new int[4];
		int money = 2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			
				
					fiveH = (money/500);
					oneH = (money%500)/100;
					ohsip = (money%500)%100/50;
					ten = (money%500)%100%50/10;
				
				
			}
		
		
		System.out.println("500원 : "+fiveH+"개, 100원 : "+oneH+"개, 50원 : "+ohsip+"개, 10원 : "+ten+"개");
	}
}
