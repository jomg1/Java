package com.yedam.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class GroupMemDAO extends DAO{

	private static GroupMemDAO gDao = new GroupMemDAO();
	
	private GroupMemDAO() {
		
	}
	
	public static GroupMemDAO getInstance() {
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
	
	//모든 회원 조회 -> 가입 날짜 순서대로 조회
	public List<GroupMem> getGrupMemList(){
		List<GroupMem> list = new ArrayList<>();
		GroupMem gMem = null;
		try {
			conn();
			String sql = "SELECT *\n"
					+ "FROM groupmem\n"
					+ "ORDER BY join_date DESC";
			
			while(rs.next()) {
				gMem = new GroupMem();
				gMem.setMemId(rs.getString("mem_id"));
				gMem.setMemName(rs.getString("mem_name"));
				gMem.setJoinDate(rs.getString("join_date"));
				gMem.setMemEmail(rs.getString("mem_email"));
				gMem.setMemAge(rs.getInt("mem_age"));
				
				list.add(gMem);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//아이디로 회원 조회
	public GroupMem getGroupMem(String memId) {
		GroupMem gMem = null;
		try {
			conn();
			String sql = "SELECT *\n"
					+ "FROM groupmem\n"
					+ "WHERE mem_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memId);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				gMem = new GroupMem();
				gMem.setMemName(rs.getString("mem_id"));
				gMem.setMemName(rs.getString("mem_name"));
				gMem.setJoinDate(rs.getString("join_date"));
				gMem.setMemEmail(rs.getString("mem_email"));
				gMem.setMemAge(rs.getInt("mem_age"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return gMem;
	}
	
	//이메일 변경
	public int updateGroupMem(GroupMem gMem) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE groupmem\n"
					+ "SET mem_email = ? \n"
					+ "WHERE mem_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gMem.getMemEmail());
			pstmt.setString(2, gMem.getMemId());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;	
		
	}
	
	
	//소모임 인원 강제 탈퇴
	public int deleteGroupMem(String memId) {
		int result = 0;
		try {
			String sql = "DELETE FROM groupmem WHERE mem_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memId);
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	
}
