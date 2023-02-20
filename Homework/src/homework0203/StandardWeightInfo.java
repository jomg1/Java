package homework0203;

public class StandardWeightInfo extends Human{

	
	
	//생성자
	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
		
	}
	
	//메소드
	
	@Override
	public void getInformation() {
		super.getInformation();
		System.out.printf(" 표중체중 %.1f 입니다.\n",getStandardWeight());
		
	}
	
	
	public double getStandardWeight() {
		double result = (double)( (height-100)*0.9);
		return result;
	}

	
	
	
	//메소드
	
		
	
}
