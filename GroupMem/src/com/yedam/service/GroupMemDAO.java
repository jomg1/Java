package com.yedam.service;

import com.yedam.common.DAO;

public class GroupMemDAO extends DAO{

	private static GroupMemDAO gDao = new GroupMemDAO();
	
	private GroupMemDAO getInstance() {
		return gDao;
	}
	
	//로그인
	
	public GroupMem login(String id) {
		GroupMem mem = null;
		try {
			conn();
			String sql = "SELECT *\r\n"
					+ "FROM gorupmem\r\n"
					+ "WHERE mem_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				mem = new GroupMem();
				mem.setMemId(rs.getString("mem_id"));
				mem.setMemName(rs.getString("mem_name"));
				mem.setJoinDate(rs.getString("join_date"));
				mem.setMemEmail(rs.getString("mem_email"));
				mem.setMemAge(rs.getInt("mem_age"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return mem;
	}
	
	//새 회원 등록
	public int insertMem(GroupMem member) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO smallgroup VALUES ?,?,?,?,?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,member.getMemId());
			pstmt.setString(2, member.getMemName());
			pstmt.setString(3,member.getJoinDate());
			pstmt.setString(4, member.getMemEmail());
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
}
