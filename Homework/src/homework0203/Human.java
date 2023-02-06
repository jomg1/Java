package homework0203;

public class Human {
	//필드
	public String name;
	public int height;
	public int weight; 
	
	//생성자
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	//메소드
	public void getInformation() {
		 System.out.print(name+"의 신장 "+height+", 몸무게 "+weight);
	}
}
