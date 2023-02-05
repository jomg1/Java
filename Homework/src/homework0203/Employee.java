package homework0203;

public class Employee {
	//필드
	private String name;
	private int pay;
	
	
	public String getName() {
		return name;
	}


	public int getPay() {
		return pay;
	}


	//생성자
	public Employee(String name, int pay) {
		this.name = name;
		this.pay = pay;
	}
	//메소드
	public void getInformation() {
		System.out.print("이름:"+name+" 연봉:"+pay);
	}
	public void pirnt() {
		System.out.print("수퍼클래스");
	}
}
