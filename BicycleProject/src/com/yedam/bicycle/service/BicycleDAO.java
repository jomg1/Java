package com.yedam.bicycle.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.member.service.Member;
import com.yedam.member.service.MemberRentInfo;
import com.yedam.member.service.MemberService;


public class BicycleDAO extends DAO{
	
	//싱글톤
	private static BicycleDAO bDao = new BicycleDAO();
	
	private BicycleDAO() {
		
	}
	
	public static BicycleDAO getInstance() {
		return bDao;
	}
	
	//자전거 전체 조회
	public List<Bicycle> getBicycleList(){
		List<Bicycle>list = new ArrayList<>();
		Bicycle bicycle = null;
		try {
			conn();
			String sql = "SELECT * \r\n"
					+ "FROM bicycle";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				bicycle = new Bicycle();
				bicycle.setbId(rs.getInt("bicycle_id"));
				bicycle.setbLocation(rs.getString("location"));
				list.add(bicycle);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//대여 가능 자전거 목록 조회
	public List<Bicycle> avaBicycleList(){
		List<Bicycle>list = new ArrayList<>();
		Bicycle bicycle = null;
		try {
			conn();
			String sql = "SELECT *\r\n"
					+ "FROM bicycle_info\r\n"
					+ "WHERE rental = 'X'\r\n"
					+ "AND reservation = 'N'";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				bicycle = new Bicycle();
				bicycle.setbId(rs.getInt("bicycle_id"));
				bicycle.setbLocation(rs.getString("bicycle_location"));
				list.add(bicycle);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//대여 - 자전거 정보 업데이트
	public int rent(int bicycleID, String memId) {
		
		int result = 0;
		try {
			conn();
			String sql = "UPDATE bicycle_info\r\n"
					+ "set rental = 'O', rent_time = sysdate, member_id = ? \r\n"
					+ "WHERE bicycle_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memId);
			pstmt.setInt(2, bicycleID);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//대여 - 멤버 대여 정보 업데이트
	public int mRent(MemberRentInfo mInfo) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE mem_rent_info\r\n"
					+ "SET bicycle_id = ?, rent_date = sysdate, rent_amount = ?, total_amount = NVL(rent_amount,0) + NVL(total_amount,0)\r\n"
					+ "WHERE member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mInfo.getBicycleId());
			pstmt.setDate(2, mInfo.getRentDate());
			pstmt.setInt(3, mInfo.getRentAmount());
			pstmt.setInt(4, mInfo.getTotalRentAmount());
			
			result = pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	//반납(자전거 정보)
	public int returnB(Bicycle bicycle) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE bicycle_info\r\n"
					+ "SET rental = 'X'\r\n"
					+ "SET return_time = sysdate\r\n"
					+ "WHERE bicycle_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bicycle.getbId());
			pstmt.setString(2, bicycle.getbRental());
			pstmt.setDate(3, (Date) bicycle.getbRentalDate());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			disconn();
		}
		return result;
	}
	
	//반납(회원) ---------------수정 요망
	public int returnM(MemberRentInfo mInfo) {
		Member member = null;
		int result = 0;
		try {
			conn();
			String sql = "UPDATE mem_rent_info\r\n"
					+ "SET return_date = sysdate , rent_time = rent_date -  return_date,\r\n"
					+ "total_rent_time = total_rent_time + rent_time\r\n"
					+ "WHERE member_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, );
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//연장
	public int extension(Bicycle bicycle) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE bicycle_info\r\n"
					+ "SET return_time = TO_DATE(?,'yy-mm-dd HH24:mi')\r\n"
					+ "WHERE bicycle_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bicycle.getbId());
			pstmt.setDate(2, null);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
		
	}
	
	//예약
	public int reservation(Bicycle bicycle) {
		int result = 0;
		try {
			conn();
			String sql = "";
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	
}
