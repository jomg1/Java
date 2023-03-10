package com.yedam.admin.service;

import java.util.List;
import java.util.Scanner;

import com.yedam.bicycle.service.Bicycle;
import com.yedam.bicycle.service.BicycleDAO;
import com.yedam.member.service.Member;
import com.yedam.member.service.MemberDAO;
import com.yedam.member.service.MemberService;



public class AdminService extends MemberService{
	
	Scanner sc = new Scanner(System.in);

	
	//1.대여 현황 조회
	public void rentState() {
		List<Bicycle> list = AdminDAO.getInstance().rentState();
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			System.out.println("자전거 번호 : " + list.get(i).getbId());
			System.out.println("자전거 위치 : " + list.get(i).getbLocation());
			System.out.println("대여 여부 : " + list.get(i).getbRental());
			System.out.println();
		}
	}

	//2.자전거 조회
	public void getBicycle() {
		List<Bicycle> list = AdminDAO.getInstance().getBicycleList();
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			System.out.println("자전거 번호 : " + list.get(i).getbId());
			System.out.println("자전거 위치 : " + list.get(i).getbLocation());
			System.out.println("대여 여부 : " + list.get(i).getbRental());
			System.out.println("대여 회원 : " + list.get(i).getbRentMem());
			System.out.println("대여 시간 : " + list.get(i).getbRentalDate());
			System.out.println("반납 시간 : " + list.get(i).getbReturnDate());
			System.out.println("예약 여부 : " + list.get(i).getbReservation());
			System.out.println("예약 날짜 : " + list.get(i).getbReservationDate());
			System.out.println("자전거 상태 : " + list.get(i).getbCondition());
			System.out.println("================================================================");
		}
	}
	
	//3.자전거 관리 메뉴 - 자전거 등록, 삭제
	//자전거 등록
	public void insertBicycle() {
		Bicycle bicycle = new Bicycle();
		System.out.println("등록할 자전거 번호 >");
		bicycle.setbId(Integer.parseInt(sc.nextLine()));
		System.out.println("자전거 관리 위치 >");
		bicycle.setbLocation(sc.nextLine());
		
		int result = AdminDAO.getInstance().insertBicycle(bicycle);
		if(result >0) {
			System.out.println("자전거 등록 완료");
			int re = AdminDAO.getInstance().insertBicycleInfo(bicycle);
			if(re == 0) {
				System.out.println("에러발생");
			}
		}else {
			System.out.println("자전거 등록 실패");
		}
	}
	
	//자전거 삭제
	public void DeleteBicycle() {
		Bicycle bicycle = new Bicycle();
		System.out.println("삭제할 자전거 번호>");
		int bId = Integer.parseInt(sc.nextLine());
		
		bicycle = new Bicycle();
		bicycle.setbId(bId);
		int result = AdminDAO.getInstance().deleteBicycleInfo(bId);
		
		if(result > 0) {
			System.out.println("자전거 삭제 완료");
			int re = AdminDAO.getInstance().deleteBicycle(bId);
			if(re == 0) {
				System.out.println("에러 발생");
			}
		}else {
			System.out.println("자전거 삭제 실패");
		}
	}
	
	//4.회원 관리 메뉴 - 회원 조회, 회원 수정, 회원 삭제
	//4-1) 회원 조회 전체, 단건
	//단건
	public void getMem() {
		System.out.println("회원 ID>");
		String memId = sc.nextLine();
		Member mem = AdminDAO.getInstance().getMember(memId);
		if(mem == null) {
			System.out.println("조회된 결과 없음");
		}else {
			System.out.println("=========="+memId+"님의 정보==========");
			System.out.println("회원 ID : " + mem.getMemberId());
			System.out.println("회원 등급 : " + mem.getMemberGrade());
			System.out.println("회원 주소 : "+ mem.getMemberAddr());
			System.out.println("회원 EMAIL : " + mem.getMemberEmail());
		}
		
	}
	
	//전체
	public void getMemList() {
		List<Member> list = AdminDAO.getInstance().getMemberList();
		System.out.println();
		for(int i=0; i<list.size();i++) {
			System.out.println("회원 ID : " + list.get(i).getMemberId());
			System.out.println("회원 등급 : " + list.get(i).getMemberGrade());
			System.out.println("회원 주소 : " + list.get(i).getMemberAddr());
			System.out.println("회원 EMAIL : " + list.get(i).getMemberEmail());
			System.out.println("=============================================");
		}
	}
	
	
	//4-2) 회원 수정
	//등급 수정
	public void modifyMemGrade() {
		System.out.println("============등급 수정 메뉴============");
		System.out.println("회원 ID>");
		String memId = sc.nextLine();
		System.out.println("변경 등급>");
		String memGrade = sc.nextLine();
		
		Member mem = new Member();
		mem.setMemberId(memId);
		mem.setMemberGrade(memGrade);
		
		int result = AdminDAO.getInstance().modifyGrade(mem);
		
		if(result > 0) {
			System.out.println("등급 수정 완료");
		}else {
			System.out.println("등급 수정 실패");
		}
	}
	
	//주소 수정
	public void modifyMemAddr() {
		System.out.println("============주소 수정 메뉴============");
		System.out.println("회원 ID>");
		String memId = sc.nextLine();
		System.out.println("변경 주소>");
		String memAdd = sc.nextLine();
		
		Member mem = new Member();
		mem.setMemberId(memId);
		mem.setMemberAddr(memAdd);
		
		int result = AdminDAO.getInstance().modifyAddr(mem);
		
		if(result > 0) {
			System.out.println("주소 수정 완료");
		}else {
			System.out.println("주소 수정 실패");
		}
	}
	
	//이메일 수정
	public void modifyMemEmail() {
		System.out.println("============EMAIL 수정 메뉴============");
		System.out.println("회원 ID>");
		String memId = sc.nextLine();
		System.out.println("변경 EMAIL>");
		String memEmail = sc.nextLine();
		
		Member mem = new Member();
		mem.setMemberId(memId);
		mem.setMemberEmail(memEmail);
		
		int result = AdminDAO.getInstance().modifyEmail(mem);
		
		if(result > 0) {
			System.out.println("Email 수정 완료");
		}else {
			System.out.println("Email 수정 실패");
		}
	}
	
	//4-3)회원 삭제
	public void deleteMember() {
		System.out.println("============회원 삭제 메뉴============");
		System.out.println("삭제 ID>");
		String memId = sc.nextLine();
		
		Member mem = new Member();
		mem.setMemberId(memId);
		
		int result = MemberDAO.getInstance().deleteMember(memId);
		
		if(result > 0) {
			System.out.println("회원 삭제 완료");
		}else {
			System.out.println("회원 삭제 실패");
		}
	}
	
}
