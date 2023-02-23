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
				mem.setMemberEmail(rs.getString("member_email"));
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
	
	//단건 조회
	public Member getMember(String memId) {
		Member mem = null;
		try {
			conn();
			String sql = "SELECT *\r\n"
					+ "FROM member\r\n"
					+ "WHERE member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,memId);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				mem = new Member();
				mem.setMemberId(rs.getString("member_id"));
				mem.setMemberEmail(rs.getString("member_email"));
				mem.setMemberAddr(rs.getString("member_address"));
				mem.setMemberGrade(rs.getString("member_grade"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return mem;
	}
	
	
	//회원 정보 수정
	//이메일 수정
	public int modifyEmail(Member mem) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE member\r\n"
					+ "SET member_email = ?\r\n"
					+ "WHERE member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  mem.getMemberEmail());
			pstmt.setString(2, mem.getMemberId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//주소 수정
	public int modifyAddr(Member mem) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE member\r\n"
					+ "SET member_address = ?\r\n"
					+ "WHERE member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  mem.getMemberAddr());
			pstmt.setString(2, mem.getMemberId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//등급 수정
	public int modifyGrade(Member mem) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE member\r\n"
					+ "SET member_grade = ?\r\n"
					+ "WHERE member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  mem.getMemberGrade());
			pstmt.setString(2, mem.getMemberId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//회원 삭제
	public int deleteMember(String memId) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM member WHERE member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memId);
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
}
