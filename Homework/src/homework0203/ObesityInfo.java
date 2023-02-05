package homework0203;

public class ObesityInfo extends StandardWeightInfo{
	//필드
	double result;
	String obsityResult;
	
	//생성자
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
		
	}
	
	//메소드
	public void getInformation() {
		System.out.println(name+"님의 신장"+height+", 몸무게"+weight+", "+"입니다.");
	}
	
	public double getObesity() {
		((double)Weight - super.stdWeight())/super.stdWeight() * 100);
		return result;
	}
	
	public void obesity() {
		if (result >= 10 || result >=20) {
			System.out.print("과체중");
		}else if(result > 20 || result >=30) {
			System.out.print("경도 비만");
		}else if(result > 30 || result >=50) {
			System.out.print("중등도 비만");
		}else if(result >50) {
			System.out.print("고도 비만");
		}
	}
	
	
}
