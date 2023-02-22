package com.yedam.member.service;

import java.util.Scanner;

public class MemberService {

	public static Member memberInfo = null;
	Scanner sc = new Scanner(System.in);
	
	//1.로그인
	public void login() {
		Member mem = null;
		System.out.println("ID>");
		String memberId = sc.nextLine();
		System.out.println("PW>");
		String memberPw = sc.nextLine();
		
		mem = MemberDAO.getInstance().login(memberId);
		
		
		if(mem != null) {
			if(mem.getMemberPw().equals(memberPw)) {
				System.out.println(mem.getMemberId()+"님 환영합니다.🎉✨");
				System.out.println(mem.getMemberId()+"님의 등급은 "+mem.getMemberGrade()+" 입니다.");
				memberInfo = mem;
			}
			else {
				System.out.println("비밀번호가 틀립니다.😢");
			}
		}else {
			System.out.println("해당 아이디는 존재하지 않습니다.");
		}
	}
	
	//회원가입
	public void join() {
		Member mem = new Member();
		System.out.println("================회원 가입===============");
		System.out.println("ID>");
		mem.setMemberId(sc.nextLine());
		System.out.println("PW>");
		mem.setMemberPw(sc.nextLine());
		System.out.println("Email>");
		mem.setMemberEmail(sc.nextLine());
		System.out.println("Address>");
		mem.setMemberAddr(sc.nextLine());
		
		int result = MemberDAO.getInstance().insertMem(mem);
		
		if(result>0) {
			System.out.println("회원 가입이 완료되었습니다.");
		}else {
			System.out.println("회원 가입에 실패했습니다.");
		}
	}
	
}
