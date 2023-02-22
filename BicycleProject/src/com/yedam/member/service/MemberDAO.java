package com.yedam.member.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class MemberDAO extends DAO{
	
	//싱글톤
	private static MemberDAO mDao = new MemberDAO();
	
	private MemberDAO() {
		
	}
	
	public static MemberDAO getInstance() {
		return mDao;
	}
	
	//1.로그인 기능
	public Member login(String id) {
		Member mem = null;
		try {
			conn();
			String sql = "SELECT *\r\n"
					+ "FROM member\r\n"
					+ "WHERE member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				mem = new Member();
				mem.setMemberId(rs.getString("member_id"));
				mem.setMemberPw(rs.getString("member_pw"));
				mem.setMemberEmail(rs.getString("member_email"));
				mem.setMemberAddr(rs.getNString("member_address"));
				mem.setMemberGrade(rs.getString("member_grade"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return mem;
	}
	
	//회원 가입, 회원 등록
	public int insertMem(Member mem) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO member(member_id, member_pw,member_email,member_address)\r\n"
					+ "VALUES(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem.getMemberId());
			pstmt.setString(2, mem.getMemberPw());
			pstmt.setString(3, mem.getMemberEmail());
			pstmt.setString(4, mem.getMemberAddr());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//회원 정보 수정 - 비밀번호, 이메일, 주소
	//현재는 비밀번호
	public int modifyMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE member\r\n"
					+ "SET member_pw = ?\r\n"
					+ "WHERE member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  member.getMemberPw());
			pstmt.setString(2, member.getMemberId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//회원 탈퇴, 삭제
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
	
	//회원 조회 - 전체 조회
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
	
	//회원 조회 - 단건 조회
	public Member getMember(int memberKey) {
		Member mem = null;
		try {
			conn();
			String sql = "SELECT *\r\n"
					+ "FROM member\r\n"
					+ "WHERE member_id = ?";
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return mem;
	}
	
	
}