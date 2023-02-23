package com.yedam.exe;

import java.util.Scanner;

import com.yedam.admin.service.AdminService;
import com.yedam.member.service.MemberService;

public class ExeApp {
	
	MemberService ms = new MemberService();
	AdminService as = new AdminService();
	Scanner sc = new Scanner(System.in);
	
	// run 메소드 안에 메뉴 선택 용도
	int selectNo = 0;
	
	boolean run = true;
	
	String menu = "";

	public ExeApp() {
		run();
	}
	
	private void run() {
		
		System.out.println("==========🚲자전거 대여 플랫폼 단디타라에 오신 것을 환영합니다🚲==========");
		
		String menu = "";
		while(run) {
			if(MemberService.memberInfo != null && MemberService.memberInfo.getMemberId().equals("admin")) {
				adminMenu();
			}else if(MemberService.memberInfo != null) {
				memberMenu();
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
			modMenu();
			break;
		case "6":
			//로그아웃
			System.out.println("로그아웃 되었습니다.");
			run = false;
			logoutMenu();
			break;
		case "7":
			//회원 탈퇴
			ms.deleteMember();
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
			//대여 현황 조회 - 대여인 id, 이름, 자전거 id, 자전거 관리 위치
			
			break;
		case "2":
			//자전거 조회 - 대여현황+자전거 상태(점검-양호,수리요망,수리)
			
			break;
		case "3":
			//자전거 관리 메뉴 - 자전거 등록, 자전거 삭제, 자전거 정보 수정
			
			
			break;
		case "4":
			//회원 관리 메뉴 - 회원 조회(단건, 전체) / 회원 수정 / 회원 삭제
			memManag();
			break;
			
		case "5":
			//일반 회원 메뉴 들어가기
			memberMenu();
			break;
			
		case "6":
			//로그아웃
			System.out.println("로그아웃 되었습니다.");
			run = false;
			logoutMenu();
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
	
	private void memManag() {
		System.out.println("회원 관리 메뉴입니다.");
		System.out.println("===================================================================");
		System.out.println("1.회원 단건 조회 | 2.회원 전체 조회 | 3.회원 정보 수정 | 4.회원 삭제 | 5.이전 메뉴");
		System.out.println("===================================================================");
		System.out.println("입력>");
		menu = sc.nextLine();
		
		switch (menu) {
		case "1":
			//회원 단건 조회
			as.getMem();
			break;

		case "2":
			//회원 전체 조회
			as.getMemList();
			break;
			
		case "3":
			//회원 정보 수정
			adModMenu();
			break;
			
		case "4":
			//회원 삭제
			as.deleteMember();
			break;
			
		case "5":
			//이전 메뉴
			adminMenu();
			break;
		}

	}
	
	private void adModMenu() {
		System.out.println("===================================================================");
		System.out.println("1.회원 등급 수정 | 2.회원 주소 수정 | 3. 회원 이메일 수정 | 4.이전 메뉴");
		System.out.println("===================================================================");
		System.out.println("입력>");
		
		menu = sc.nextLine();
		
		switch (menu) {
		case "1":
			as.modifyMemGrade();
			break;

		case "2":
			as.modifyMemAddr();
			break;
			
		case "3":
			as.modifyMemEmail();
			break;
			
		case "4":
			memManag();
			break;
		}
	}
	
	private void modMenu() {
		System.out.println("회원 정보 수정 메뉴입니다.");
		System.out.println("===================================================");
		System.out.println("1. 비밀번호 수정 | 2. 주소 수정 | 3. 이메일 수정 | 4.이전 메뉴");
		System.out.println("===================================================");
		System.out.println("입력>");
		
		menu = sc.nextLine();
		
		switch(menu) {
		case "1":
			//비밀번호 수정
			ms.modifyPw();
			break;
		case "2":
			//주소 수정
			ms.modifyAddr();
			break;
		case "3":
			//이메일 수정
			ms.modifyEmail();
			break;
		case "4":
			//이전 메뉴
			memberMenu();
			break;
			
		}
	}
	
	
	
}
