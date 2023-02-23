package com.yedam.admin.service;

import java.util.List;
import java.util.Scanner;

import com.yedam.member.service.Member;
import com.yedam.member.service.MemberDAO;
import com.yedam.member.service.MemberService;



public class AdminService extends MemberService{
	
	Scanner sc = new Scanner(System.in);

	
	//1.대여 현황 조회 - 대여인 id, 이름, 자전거 id, 자전거 관리 위치
	
	//2.자전거 조회
	
	//3.자전거 관리 메뉴 - 자전거 등록, 삭제
	
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
