package homework0201;

public class Product {

	//필드
	String prdName;
	int price;
	
	//생성자
	public Product() {
		
	}
		
	public Product(String prdName, int price) {
		this.prdName = prdName;
		this.price = price;
	}
	
	//메소드
	void priceInfo() {
		System.out.print(prdName+" : "+price+"원\n" );		
	}
	
	
	
}
