package com.yedam.bicycle.service;

import java.util.List;
import java.util.Scanner;

import com.yedam.member.service.Member;
import com.yedam.member.service.MemberDAO;
import com.yedam.member.service.MemberRentInfo;
import com.yedam.member.service.MemberService;



public class BicycleService extends MemberService{
	
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
		System.out.println("이용 시간>");
		int time = Integer.parseInt(sc.nextLine());
		System.out.println("금액은 "+(time*1000)+"입니다.");
		System.out.println("투입>");
		int money = Integer.parseInt(sc.nextLine());
		
		MemberRentInfo mInfo = new MemberRentInfo();
		if(money == (time*1000)) {
			System.out.println(memberInfo.getMemberId()+"님, 대여가 완료되었습니다.");
			int result = BicycleDAO.getInstance().rent(num, memberInfo.getMemberId());
			if(result == 0) {
				System.out.println("자전거 정보 업데이트 에러");
			}
			mInfo.setMemId(memberInfo.getMemberId());
				mInfo.setBicycleId(num);
				mInfo.setRentAmount(time*1000);
				int total = BicycleDAO.getInstance().total(memberInfo.getMemberId());
				mInfo.setTotalRentAmount(total + (time*1000));
				int res = BicycleDAO.getInstance().mRent(mInfo);
				if(res == 0) {
					System.out.println("멤버정보 업데이트 에러");
				}
				
			
		}

	}
	
	//연장 및 반납
	public void returnBicycle(Bicycle bicycle) {
		System.out.println("1. 반납 2. 시간 연장 >");
		
			//반납();
		}
	}
	
}
