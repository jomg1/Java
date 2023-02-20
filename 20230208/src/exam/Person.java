package exam;

public class Person {	
	//필드
	private String ssn;
	private String name;
	private String address;
	
	
	
	public String getSsn() {
		return ssn;
	}



	public void setSsn(String ssn) {
		this.ssn = ssn;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	//생성자
	public Person() {
		
	}
	
	public Person(String ssn, String name, String address) {
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
}
