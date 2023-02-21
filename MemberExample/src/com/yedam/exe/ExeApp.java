package com.yedam.exe;

import java.util.Scanner;

import com.yedam.service.MemberService;

public class ExeApp {
	
	MemberService ms = new MemberService();
	Scanner sc = new Scanner(System.in);
	
	boolean run = true;
	
	String menu = "";
	
	public ExeApp() {
		run();
	}
	
	private void run() {
		//내 정보 조회, 탈퇴, 수정 
		//static -> 로그인, 로그아웃 (자바(프로그램) 종료 전까지 해당 정보를 가지고 있음)

		String menu = "";
		while(run) {
			//1. 로그인이 되어 있을 때 메뉴창
			//2. 로그인이 되어 있지 않을 때 메뉴창
			if(MemberService.memberInfo != null) { //로그인이 되었다.
				//로그인 후 메뉴 출력
				loginMenu();
			}else if(MemberService.memberInfo == null) { //로그인이 되지 않았다.
				//로그인 전 메뉴
				logoutMenu();
			}
		}
		
		
	}
	
	private void loginMenu() {
		//내정보 조회, 탈퇴, 수정
		System.out.println("=========================");
		System.out.println("====1.조회 2.수정 3.탈퇴====");
		System.out.println("=========================");
		System.out.println("입력>"); 
		menu = sc.nextLine();
		
		switch(menu) {
		case "1":
			//조회
			ms.getMember();
			break;
		case "2":
			//수정
			ms.modifyMember();
			break;
		case "3":
			//탈퇴
			ms.deleteMember();
			break;
		}
	}
	private void logoutMenu() {
		System.out.println("1. 로그인 | 2. 종료");
		System.out.println("입력>");
		menu = sc.nextLine();
		if(menu.equals("1")){
			ms.login();
		}else if(menu.equals("2")) {
			run = false;
			System.out.println("프로그램 종료");
		}
	}
}
