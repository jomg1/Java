package com.yedam.bicycle.service;

import java.util.List;
import java.util.Scanner;

import com.yedam.member.service.Member;



public class BicycleService {
	public static Member memberInfo = null;	
	
	Scanner sc = new Scanner(System.in);
	
	//전체 자전거 조회
	public void bicycleList() {
		List<Bicycle>list = BicycleDAO.getInstance().getBicycleList();
		
		System.out.println("전체 자전거 목록입니다.");
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("자전거 번호 : " + list.get(i).getbId());
			System.out.println("자전거 위치 : " + list.get(i).getbLocation());
			System.out.println();
		}
	}
	
	//자전거 대여 - 대여 가능한 자전거 목록 노출 -> 자전거 선택-> 시간 선택 -> 시간에 따른 금액 노출 -> 금액 입력 -> 대여
	//대여 가능한 자전거 목록 노출
	public void avaList() {
		List<Bicycle>list = BicycleDAO.getInstance().avaBicycleList();
		
		System.out.println("현재 대여 가능한 자전거 목록입니다.");
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("자전거 번호 : " + list.get(i).getbId());
			System.out.println("자전거 위치 : " + list.get(i).getbLocation());
			System.out.println();
		}
	}	
	
	public void bicycleRent() {
		System.out.println("자전거 대여 메뉴입니다.");
		avaList();
		System.out.println("자전거 번호>");
		int num = Integer.parseInt(sc.nextLine());
		
		Bicycle bicycle = new Bicycle();
		bicycle.setbId(num);
		bicycle.getbRental();
		
		int result = BicycleDAO.getInstance().rent(num);
		
		if(result > 0) {
			System.out.println("자전거가 대여되었습니다.");
		}else {
			System.out.println("자전거 대여에 실패했습니다. 자전거 ID를 확인해주세요.");
		}
		
	}
	
	//연장 및 반납
	public void returnBicycle(Bicycle bicycle) {
		System.out.println("1. 반납 2. 시간 연장 >");
		String answer = sc.nextLine();
		if(answer.equals("1")) {
			System.out.println("반납되었습니다.");
			//반납();
		}
	}
	
}
