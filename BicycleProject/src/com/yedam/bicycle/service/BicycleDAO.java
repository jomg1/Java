package com.yedam.bicycle.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.member.service.Member;


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
	public int rent(int bicycleID) {
		
		int result = 0;
		try {
			conn();
			String sql = "update bicycle_info set rental = 'O' where bicycle_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bicycleID);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	public int mRent(int bicycleId) {
		int result = 0;
		try {
			conn();
			String sql = "update bicycle_info set rental = 'O' where bicycle_id = ?";
			
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
	
	//반납(회원)
	public int returnM(Bicycle bicyle) {
		Member member = null;
		int result = 0;
		try {
			conn();
			String sql = "";
			
			pstmt = conn.prepareStatement(sql);
			
			
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
			String sql = "";
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
		
	}
	
	//나의 대여정보 확인
}
