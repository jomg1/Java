package com.yedam.exe;

import java.util.Scanner;

import com.yedam.member.service.MemberService;

public class ExeApp {
	
	MemberService ms = new MemberService();
	Scanner sc = new Scanner(System.in);
	
	// run 메소드 안에 메뉴 선택 용도
	int selectNo = 0;
	
	boolean run = true;
	
	String menu = "";

	public ExeApp() {
		run();
	}
	
	private void run() {
		
		System.out.println("==========자전거 대여 플랫폼 단디타라에 오신 것을 환영합니다🚲🚲==========");
		
		String menu = "";
		while(run) {
			if(MemberService.memberInfo != null) {
				memberMenu();
			}else if(MemberService.memberInfo != null && MemberService.memberInfo.getMemberGrade().equals("admin")) {
				adminMenu();
			}else if(MemberService.memberInfo == null) {
				logoutMenu();
			}
			
		}
		
		
		
	}
	
	
	private void memberMenu() {
		//내정보 조회, 탈퇴, 수정
		System.out.println("============================================================================================");
		System.out.println("1.자전거 조회 | 2.자전거 대여 | 3.연장 및 반납 | 4.나의 대여 정보 확인 | 5.정보 수정 | 6.로그아웃 | 7.회원 탈퇴");
		System.out.println("============================================================================================");
		System.out.println("입력>"); 
		menu = sc.nextLine();
		
		switch(menu) {
		case "1":
			//자전거 조회
			
			break;
		case "2":
			//자전거 대여
			
			break;
		case "3":
			//연장 및 반납
			
			break;
		case "4":
			//대여 정보 확인
			break;
		case "5":
			//본인 정보 수정
		case "6":
			//로그아웃
			System.out.println("로그아웃 되었습니다.");
			run = false;
			break;
		case "7":
			//회원 탈퇴
			break;
		}
	}
	
	private void adminMenu() {
		//내정보 조회, 탈퇴, 수정
		System.out.println("관리자로 로그인하셨습니다.");
		System.out.println("=====================================================================================");
		System.out.println("1.대여 현황 조회 | 2.자전거 조회 | 3.자전거 관리 메뉴 | 4.회원 관리 메뉴 | 5.일반 회원 메뉴 | 6.로그아웃");
		System.out.println("=====================================================================================");
		System.out.println("입력>"); 
		menu = sc.nextLine();
		
		switch(menu) {
		case "1":
			//대여 현황 - 
			
			break;
		case "2":
			//수정
			
			break;
		case "3":
			//탈퇴
			
			break;
		}
	}
	
	private void logoutMenu() {
		System.out.println("1. 로그인 | 2.회원 가입 | 3. 종료");
		System.out.println("입력>");
		menu = sc.nextLine();
		if(menu.equals("1")) {
			ms.login();
		}else if(menu.equals("2")){
			ms.join();
		}else if(menu.equals("3")) {
			run = false;
			System.out.println("프로그램을 종료합니다.");
		}
	}
}
