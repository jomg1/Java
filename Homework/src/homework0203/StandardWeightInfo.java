package homework0203;

public class StandardWeightInfo extends Human{

	//필드
	Double stdWeight= getStandardWeight();
	
	//생성자
	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
		
	}

	@Override
	public void getInformation() {
		System.out.println(name+"의 신장 "+height+", 몸무게 "+weight+", 표준체중 "+stdWeight+" 입니다.");
		
	}
	
	public double getStandardWeight() {
		return (height-100)*0.9;
	}
	
	//메소드
	
		
	
}
