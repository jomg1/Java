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
	
	//회원가입 - 멤버 인포 생성
	public int createMemInfo(Member mem) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO mem_rent_info(member_id)\r\n"
					+ "VALUES(?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem.getMemberId());
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//회원 조회 - 단건 조회
	public Member getMember() {
		Member mem = null;
		
		try {
			conn(); 
			String sql = "SELECT *\r\n"
					+ "FROM member\r\n"
					+ "WHERE member_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, MemberService.memberInfo.getMemberId());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				mem = new Member();
				mem.setMemberId(rs.getString("member_id"));
				mem.setMemberPw(rs.getNString("member_pw"));
				mem.setMemberAddr(rs.getString("member_addr"));
				mem.setMemberGrade(rs.getString("member_grade"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return mem;
	}
	
	//회원 정보 수정 - 비밀번호, 이메일, 주소
	//비밀번호
	public int modifyPw(Member member) {
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
	
	//이메일
	public int modifyEmail(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE member\r\n"
					+ "SET member_email = ?\r\n"
					+ "WHERE member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  member.getMemberEmail());
			pstmt.setString(2, member.getMemberId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//주소
	public int modifyAdd(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE member\r\n"
					+ "SET member_address = ?\r\n"
					+ "WHERE member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  member.getMemberAddr());
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
	
	//대여 정보 확인
	public List<MemberRentInfo> getMemInfoList(){
		List<MemberRentInfo> list = new ArrayList<>();
		MemberRentInfo memInfo = null;
		try {
			conn();
			String sql = "SELECT *\r\n"
					+ "FROM mem_rent_info\r\n"
					+ "WHERE member_id = ?";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				memInfo = new MemberRentInfo();
				memInfo.setMemId(rs.getString("member_id"));
				memInfo.setRentDate(rs.getDate("rent_date"));
				memInfo.setReturnDate(rs.getDate("return_date"));
				memInfo.setRentTime(rs.getDate("rent_time"));
				memInfo.setRentAmount(rs.getInt("rent_amount"));
				memInfo.setTotalRentTime(rs.getDate("total_rent_time"));
				memInfo.setTotalRentAmount(rs.getInt("total_amount"));
				
				list.add(memInfo);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	
	
	
}
