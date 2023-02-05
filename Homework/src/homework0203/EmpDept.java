package homework0203;

public class EmpDept extends Employee{
	//필드
	private String part;
	
	
	public String getPart() {
		return part;
	}

	//생성자
	public EmpDept(String name, int pay, String part) {
		super(name, pay);
		this.part=part;
	}
	//메소드

	

	@Override
	public void pirnt() {
		super.pirnt();
		System.out.print("\n서브클래스");
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println(" 부서:"+part);
	}
	
	
}
