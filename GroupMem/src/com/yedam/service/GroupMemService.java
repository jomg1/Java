package com.yedam.service;

import java.util.Scanner;

public class GroupMemService {

	public static GroupMem memberInfo = null;
	Scanner sc = new Scanner(System.in);
	
//	0. 로그인
	public void login() {
		GroupMem gMem = null;
		System.out.println("ID>");
		String memId = sc.nextLine();
		
		gMem = GroupMemDAO.getInstance().login(memId);
		
		if(gMem != null) {
			System.out.println("관리자로 로그인 되었습니다.");
		} else {
			System.out.println("관리자가 아닙니다.");
		}
	}
	
//	1. 새 회원 등록
	public void getMember() {
		GroupMem gMem = 
	}
	
//	2. 모든 회원 조회 -> 가입 날짜순서대로 조회
//	3. 아이디로 회원 조회
//	4. 이메일 변경
//	5. 소모임 인원 강제 탈퇴
	
}
