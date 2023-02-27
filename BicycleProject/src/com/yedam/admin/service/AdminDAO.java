package com.yedam.admin.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.bicycle.service.Bicycle;
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
	public List<Bicycle> rentState(){
		List<Bicycle> list = new ArrayList<>();
		Bicycle b = null;
		try {
			conn();
			String sql = "SELECT bicycle_id, bicycle_location, rental\r\n"
					+ "FROM bicycle_info\r\n"
					+ "ORDER BY bicycle_location";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				b = new Bicycle();
				b.setbId(rs.getInt("bicycle_id"));
				b.setbLocation(rs.getString("bicycle_location"));
				b.setbRental(rs.getString("rental"));
				list.add(b);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			disconn();
		}
		return list;
	}
	
	//자전거 조회 - 전체 조회 
	public List<Bicycle> getBicycleList(){
		List<Bicycle> list = new ArrayList<>();
		Bicycle b = null;
		try {
			conn();
			String sql = "SELECT bicycle_id, bicycle_location, rental, TO_CHAR(rent_time, 'yy/mm/dd HH24:mi') rent_time,\r\n"
					+ "TO_CHAR(return_time,'yy/mm/dd HH24:mi') return_time,\r\n"
					+ "member_id AS \"rent_member\", reservation, TO_CHAR(reservation_date,'yy/mm/dd HH24:mi') reservation_date, condition\r\n"
					+ "FROM bicycle_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				b = new Bicycle();
				b.setbId(rs.getInt("bicycle_id"));
				b.setbLocation(rs.getString("bicycle_location"));
				b.setbRental(rs.getString("rental"));
				b.setbRentalDate(rs.getDate("rent_time"));
				b.setbReturnDate(rs.getDate("return_time"));
				b.setbReservation(rs.getString("reservation"));
				b.setbReservationDate(rs.getDate("reservation_date"));
				b.setbRentMem(rs.getString("rent_member"));
				list.add(b);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//자전거 관리 메뉴 - 자전거 등록, 자전거 삭제, 
	//자전거 등록
	public int insertBicycle(Bicycle bicycle) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO bicycle VALUES(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bicycle.getbId());
			pstmt.setString(2, bicycle.getbLocation());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			disconn();
		}
		return result;
		
	}
	//자전거 정보 등록
	public int insertBicycleInfo(Bicycle bicycle) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO bicycle_info(bicycle_id, bicycle_location)\r\n"
					+ "VALUES (?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bicycle.getbId());
			pstmt.setString(2, bicycle.getbLocation());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//자전거 삭제
	public int deleteBicycle(int bId) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM bicycle WHERE bicycle_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bId);
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	//자전거 정보 삭제
	public int deleteBicycleInfo(int bId) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM bicycle_info WHERE bicycle_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bId);
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
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
