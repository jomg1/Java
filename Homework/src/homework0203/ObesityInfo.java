package homework0203;

public class ObesityInfo extends StandardWeightInfo{
	
	
	//생성자
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
		
	}
	
	//메소드
	
	
	
	public double getObesity() {
		//부모 클래스에 있는 표준 체중 메소드를 활용해서 비만도 연산
		double bmi = (weight - super.getStandardWeight())/super.getStandardWeight()*100;
		return bmi;
		
	
	}

	@Override
	public void getInformation() {
		//bmi에 따른 비만도를 알려줘야 함.
		double bmi = getObesity();
		String obesity = null;
		if(bmi <= 18.5) {
			obesity = "저체중";
		}else if(bmi <= 22.9) {
			obesity = "정상";
		}else if(bmi <= 24.9) {
			obesity = "과체중";
		} else {
			obesity = "비만";
		}
		System.out.println(name + "님의 신장 "
				+ height + ", 몸무게 : " + weight+
				", " + obesity +"입니다.");
	}
	
	
	
}
