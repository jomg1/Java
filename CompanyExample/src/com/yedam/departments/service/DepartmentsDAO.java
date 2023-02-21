package com.yedam.departments.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class DepartmentsDAO extends DAO{
	
	//싱글톤
	private static DepartmentsDAO departDao = null;
	
	private DepartmentsDAO() {
		
	}
	
	public static DepartmentsDAO getInstance() {
		if(departDao == null) {
			departDao = new DepartmentsDAO();
		}
		return departDao;
	}
	
	//모든 부서 조회, 한 부서 조회, 부서 삭제, 수정, 등록
	//명심!! 각 DAO에서 사용하는 쿼리는 반드시 SqlDeveloper에서 실행해보고 자바에 적용시킬 것.
	
	//모든 부서 조회
	public List<Departments> getDepartmentsList(){
		List<Departments> list = new ArrayList<>();
		Departments depart = null;
		try{
			conn();
			String sql = "select * from dept";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				depart = new Departments();
				depart.setDepartmentId(rs.getInt("department_id"));
				depart.setDepartmentName(rs.getString("department_name"));
				depart.setLocationId(rs.getInt("location_id"));
				depart.setManagerId(rs.getInt("manager_id"));
				
				list.add(depart);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return list;
	}
	
	// 단건 조회
	public Departments getDepartment(int departmentKey) {
		Departments depart = null;
		
		try {
			conn();
			String sql = "select * from dept where department_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  departmentKey);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				depart = new Departments();
				depart.setDepartmentId(rs.getInt("department_id"));
				depart.setDepartmentName(rs.getString("department_name"));
				depart.setLocationId(rs.getInt("location_id"));
				depart.setManagerId(rs.getInt("manager_id"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return depart;
	}
	
	//부서 삭제, 수정, 등록
	//삭제
	public int deleteDept(Departments d) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM dept WHERE department_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  d.getDepartmentId());
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//수정
	public int modifyDept(Departments dept) {
		int result = 0;
		try {
			conn();
			String sql = "update set manager_id = ? where department_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  dept.getManagerId());
			pstmt.setInt(2,  dept.getDepartmentId());
			
			result = pstmt.executeUpdate();//실행 결과를 확실히 알기 위해서 result에 결과값을 넣어준다.
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//등록
	public int insertDept(Departments dept) {
		int result = 0;
		try {
			conn();
			String sql = "insert into dept values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDepartmentId());
			pstmt.setString(2, dept.getDepartmentName());
			pstmt.setInt(3, dept.getManagerId());
			pstmt.setInt(4, dept.getLocationId());
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	

	
	
}
