package homework0203;

public class EmpDept {
	//필드
	public String name;
	public int pay;
	
	//생성자
	public EmpDept(String name, int pay, String string) {
		this.name = name;
		this.pay = pay;
	}
	//메소드
	//getter 생성
	public String getName() {
		return name;
	}

	public int getPay() {
		return pay;
	}
	public void getInforamtin() {
		System.out.print("이름 : "+" 연봉 : "+pay);
	}
	public void print() {
		System.out.println("수퍼클래스");
	}
	
	
}
