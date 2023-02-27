package com.yedam.member.service;

import java.util.List;
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
			int re = MemberDAO.getInstance().createMemInfo(mem);
			if(re == 0) {
				System.out.println("에러발생");
			}
		}else {
			System.out.println("회원 가입에 실패했습니다.");
		}
	}
	
	
	//정보수정 4-1) 비밀번호 수정 | 4-2) 이메일 수정 | 4-3) 주소 수정
	//비밀번호 수정
	public void modifyPw() {
		Member member = new Member();
		System.out.println("비밀번호 변경>");
		member.setMemberPw(sc.nextLine());
		System.out.println("회원ID>");
		member.setMemberId(sc.nextLine());
		
		int result = MemberDAO.getInstance().modifyPw(member);
		
		if(result > 0) {
			System.out.println("비밀번호 수정 완료");
		}else {
			System.out.println("비밀번호 수정 실패");
		}
		
	}
	
	//이메일 수정
	public void modifyEmail() {
		Member member = new Member();
		System.out.println("EMAIL 변경>");
		member.setMemberPw(sc.nextLine());
		System.out.println("회원ID>");
		member.setMemberId(sc.nextLine());
		
		int result = MemberDAO.getInstance().modifyEmail(member);
		
		if(result > 0) {
			System.out.println("EMAIL 수정 완료");
		}else {
			System.out.println("EMAIL 수정 실패");
		}
		
	}
	
	//주소 수정
	public void modifyAddr() {
		Member member = new Member();
		System.out.println("주소 변경>");
		member.setMemberAddr(sc.nextLine());
		System.out.println("회원ID>");
		member.setMemberId(sc.nextLine());
		
		int result = MemberDAO.getInstance().modifyAdd(member);
		
		if(result > 0) {
			System.out.println("주소 수정 완료");
		}else {
			System.out.println("주소 수정 실패");
		}
		
	}
	
	//회원 탈퇴
	public void deleteMember() {
		System.out.println("회원ID>");
		int result = MemberDAO.getInstance().deleteMember(sc.nextLine());
		
		//자신의 ID를 넣었다.
		//로그인 되어있는 상태에서 회원 탈퇴 -> 로그아웃.
		if(result > 0) {
			MemberService.memberInfo = null;//로그아웃
			System.out.println("탈퇴가 완료되었습니다. 이용해주셔서 감사합니다.");
		} else {
			System.out.println("탈퇴에 실패했습니다.");
		}
	}
	
	
	//대여 정보 조회

	public void getMemInfoList() {
		List<MemberRentInfo> list = MemberDAO.getInstance().getMemInfoList();
		System.out.println();
		for(int i=0; i<list.size();i++) {
			System.out.println("나의 ID : " + list.get(i).getMemId());
			System.out.println("대여 날짜 : " + list.get(i).getRentDate());
			System.out.println("반납 날짜 : " + list.get(i).getReturnDate());
			System.out.println("이용 시간 : " + list.get(i).getRentTime());
			System.out.println("이용 금액 : " + list.get(i).getRentAmount());
			System.out.println("총 이용 시간 : " + list.get(i).getTotalRentTime());
			System.out.println("총 이용 금액 : " + list.get(i).getTotalRentAmount());
			System.out.println();
		}
	}
	
	
	
}
