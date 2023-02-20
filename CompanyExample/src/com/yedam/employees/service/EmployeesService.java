package com.yedam.employees.service;

import java.util.List;
import java.util.Scanner;


public class EmployeesService {
	
	Scanner sc = new Scanner(System.in);
	
	//모든 사원 조회
	public void getEmployeesList() {
		List<Employees>list = EmployeesDAO.getInstance().getEmployeesList();
		System.out.println("==================================================");
		for(int i=0; i<list.size(); i++) {
			System.out.println("사원 번호 : " + list.get(i).getEmployeeId());
			System.out.println("사원 이름 : " + list.get(i).getEmpName());
			System.out.println("입 사 일 : " + list.get(i).getHiredate());
			System.out.println("급   여 : " + list.get(i).getSalary());
			System.out.println("=============================================");
		}
	}
	
	//사원 조회
	public void getEmployees() {
		System.out.println("사원 번호>");
		int empNo = Integer.parseInt(sc.nextLine());
		Employees emp = EmployeesDAO.getInstance().getImployee(empNo);
		
		if (emp == null) {
			System.out.println("조회된 결과 없음");
		} else {
			System.out.println("사원 번호 : " + emp.getEmployeeId());
			System.out.println("사원 이름 : " + emp.getEmpName());
			System.out.println("입 사 일 : " + emp.getHiredate());
			System.out.println("급   여 : " + emp.getSalary());
		}
	}
	
	//등록
	public void insertEmp() {
		System.out.println("==================사원 추가==================");
		System.out.println("사원 번호>");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.println("사원 이름>");
		String empName = sc.nextLine();
		System.out.println("사원 입사일>");
		String empHire = sc.nextLine();
		System.out.println("사원 급여>");
		int empSal = Integer.parseInt(sc.nextLine());
		System.out.println("============================================");
		
		Employees emp = new Employees();
		emp.setEmployeeId(empNo);
		emp.setEmpName(empName);
		emp.setHiredate(empHire);
		emp.setSalary(empSal);
		
		int result = EmployeesDAO.getInstance().insertEmp(emp);
		
		if(result > 0) {
			System.out.println("사원 등록 완료");
		} else {
			System.out.println("사원 등록 실패");
		}
	}
	
	//수정
	public void modifyEmp() {
		System.out.println("수정 사원 번호>");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.println("바꿀 급여>");
		int empSal = Integer.parseInt(sc.nextLine());
		
		Employees emp = new Employees();
		emp.setEmployeeId(empNo);
		emp.setSalary(empSal);
		
		int result = EmployeesDAO.getInstance().modifyEmp(emp);
		
		if(result > 0) {
			System.out.println("사원 수정 완료");
		} else {
			System.out.println("사원 수정 실패");
		}
		
	}
	
	//삭제
	public void deleteEmp() {
		System.out.println("삭제 사원 번호>");
		int empNo = Integer.parseInt(sc.nextLine());
		
		Employees emp = new Employees();
		emp.setEmployeeId(empNo);
		
		int result = EmployeesDAO.getInstance().deleteEmp(emp);
		
		if(result > 0) {
			System.out.println("사원 삭제 완료");
		} else {
			System.out.println("사원 삭제 실패");
		}
	}
	
	

}
