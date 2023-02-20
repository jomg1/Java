package com.yedam.inheri;

public class Child extends Parent{
	//child
	
	//필드
	//lastName, 혈액형, 나이, 취미
	private String lastName;
	private char bloodType;
	private int age;
	private String habbit;
	
	//생성자
	
	//메소드
	@Override
	public void getInfo() {		
		super.getInfo();
		System.out.println("내 이름 : "+lastName);
		System.out.println("혈액형 : "+bloodType+"형");
		System.out.println("나 이 : "+age);
		System.out.println("취  미 : "+habbit);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getBloodType() {
		return bloodType;
	}

	public void setBloodType(char bloodType) {
		this.bloodType = bloodType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHabbit() {
		return habbit;
	}

	public void setHabbit(String habbit) {
		this.habbit = habbit;
	}
	
}
