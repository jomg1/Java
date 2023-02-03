package homework0203;

public class EmpDept extends Employee{
	//필드
	private String part;
	//생성자
	public EmpDept(String name, int pay, String part) {
		super(name, pay);
		this.part = part;
	}
	
	//메소드
	@Override
	public void getInformation() {
		super.getInformation();
		System.out.print("부서:"+part);
	}
	@Override
	public void print() {
		super.print();
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}
	
	
	
}
