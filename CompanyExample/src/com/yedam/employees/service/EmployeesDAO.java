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

}

