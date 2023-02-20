package com.yedam.employees.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.departments.service.Departments;

public class EmployeesDAO extends DAO{

	//싱글톤
	private static EmployeesDAO employeeDao = null;
	
	private EmployeesDAO () {
		
	}
	
	public static EmployeesDAO getInstance() {
		if(employeeDao == null) {
			employeeDao = new EmployeesDAO();
		}
		return employeeDao;
	}

	//모든 사원 조회
	public List<Employees> getEmployeesList(){
		List<Employees> list = new ArrayList<>();
		Employees emp = null;
		
		try {
			conn();
			String sql = "select * from emp";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				emp = new Employees();
				emp.setEmployeeId(rs.getInt("imployee_id"));
				emp.setEmpName(rs.getString("first_name"));
				emp.setHiredate(rs.getString("hire_date"));
				emp.setSalary(rs.getInt("salary"));
				
				list.add(emp);
			
		}
			}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//단건 조회
	
	public Employees getImployee(int imployeeKey) {
		Employees emp = null;
		
		try {
			conn();
			String sql = "select * from emp where employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  imployeeKey);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setEmpName(rs.getString("first_name"));
				emp.setHiredate(rs.getString("hire_date"));
				emp.setSalary(rs.getInt("salary"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			disconn();
		}
		return emp;
		}
	
	//사원 삭제, 수정, 등록
	//삭제
	public int deleteEmp(Employees emp) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM dept WHERE employee_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  emp.getEmployeeId());
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//수정
	public int modifyEmp(Employees emp) {
		int result = 0;
		try {
			conn();
			String sql = "update set salary = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  emp.getSalary());
			
			result = pstmt.executeUpdate();//실행 결과를 확실히 알기 위해서 result에 결과값을 넣어준다.
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//등록
	public int insertEmp(Employees emp) {
		int result = 0;
		try {
			conn();
			String sql = "insert into dept values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getEmpName());
			pstmt.setString(3, emp.getHiredate());
			pstmt.setInt(4, emp.getSalary());
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	

}

