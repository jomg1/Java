package com.yedam.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {
	//DAO -> DATA ACCESS OBJECT
	//JAVA <-> DB 연결 할 때 쓰는 객체
	//JDBC를 통해서 JAVA <-> DB가 연결된다.
	//해당 클래스에는 JDBC에 대한 내용이 들어옴
	//OJDBC를 사용
	
	//java -> DB 연결할 때 쓰는 객체
	protected Connection conn = null;
	
	//Query문(SQL, 질의)을 가지고 해당 Query문 실행하는 객체 (1)
	protected PreparedStatement pstmt = null;
	
	//Query문(SQL, 질의)을 가지고 해당 Query문 실행하는 객체 (2) 둘 중 하나
	protected Statement stmt = null;
	
	//SELECT(조회) 결과값을 반환받는 객체
	protected ResultSet rs = null;
	
	//hr 계정 접속
	
	String driver ="oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "hr";
	String pw = "hr";
	
	//DB 연결 메소드
	public void conn() {
		//1. 드라이버 로딩
		try {
			Class.forName(driver);
			//2. DB 연결
			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//연결 해제
	public void disconn() {
		try {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
