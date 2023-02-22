package com.yedam.admin.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.member.service.Member;

public class AdminDAO extends DAO{
	
	private static AdminDAO aDao = new AdminDAO();
	
	private AdminDAO() {
		
	}
	
	public static AdminDAO getInstance() {
		return aDao;
	}
	
	//1.대여 현황 조회 | 2.자전거 조회 | 3.자전거 관리 메뉴 | 4.회원 관리 메뉴 |
	
	//대여 현황 조회
	
	//자전거 조회 - 전체 조회 (아이디별 조회, 위치별 조회)
	
	//자전거 관리 메뉴 - 자전거 등록, 자전거 삭제, 
	
	//회원 관리 메뉴 - 회원 조회(단건, 전체) / 회원 수정 / 회원 삭제
	
	//회원 관리 - 회원 조회 (전체)
	public List<Member> getMemberList(){
		List<Member> list = new ArrayList<>();
		Member mem = null;
		try {
			conn();
			String sql = "SELECT *\r\n"
					+ "FROM member";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				mem = new Member();
				mem.setMemberId(rs.getString("member_id"));
				mem.setMemberPw(rs.getString("member_pw"));
				mem.setMemberEmail(rs.getString("memeber_email"));
				mem.setMemberAddr(rs.getNString("member_address"));
				mem.setMemberGrade(rs.getString("member_grade"));
				
				list.add(mem);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
}
