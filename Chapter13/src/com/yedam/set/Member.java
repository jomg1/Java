package com.yedam.set;

public class Member {
	//필드
	public String name;
	public int age;
	//생성자
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
	}
	//메소드
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member member = (Member)obj;
//			if(member.name.equals(name)&&member.age==age) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		//name = "또치" -> 100번지 -> hashcode값 : 10
//		//age = 20
//		//10 + 20 = 30(멤버 객체가 가질 수 있는 해시코드 값)
//		return name.hashCode() + age;
//	}
//	
	//이름만 같으면 같은 객체로 확인하고자 할 때
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
//			if(member.name.equals(name) && member.age==age) {
//				return true;
//			}
			if(member.name.equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		//name = "또치" -> 100번지 -> hashcode값 : 10
		//age = 20
		//10 + 20 = 30
//		return name.hashCode() + age;
		return name.hashCode();
	}
	
}
