package com.yedam.student;

import java.util.List;
import java.util.Scanner;



public class StudentService {
	
	Scanner sc = new Scanner(System.in);
	
	//전체 학생 정보 조회
	public void getStudentList() {
		List<Student>list = StudentDAO.getInstance().getStudentList();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	
	//학번 조회
	public void getStudent() {
		System.out.println("학번 입력>");
		int stdId = Integer.parseInt(sc.nextLine());
//		Student std = StudentDAO.getInstance().getStudent(stdId);
		
		Student std =
		StudentDAO.getInstance().getStudent(stdId);
		
		System.out.println("조회한 결과>");
		System.out.println(std.toString());
		
		
//		if(std == null) {
//			System.out.println("조회된 결과 없음");
//		} else {
//			System.out.println("학생 번호 : " + std.getStdId());
//			System.out.println("학생 이름 : " + std.getStdName());
//			System.out.println("학생 전공 : " + std.getStdMajor());
//			System.out.println("학생 점수 : " + std.getStdPoint());
//		}
	}
	
	//학생 등록
	public void insertStd() {
		Student std = new Student();
		
		System.out.println("========학생 등록========");
		
		System.out.println("학번>");
		//변수 지정 -> 객체 대입
		std.setStdId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("이름>");
		std.setStdName(sc.nextLine());
		
		System.out.println("전공>");
		std.setStdMajor(sc.nextLine());
		
		System.out.println("점수>");
		std.setStdPoint(Double.parseDouble(sc.nextLine()));
		
		int result = StudentDAO.getInstance().insertStd(std);
		
		if(result>0) {
			System.out.println("학생 정보 등록 완료");
		}else {
			System.out.println("학생 정보 등록 실패");
		}
	}
	
	//학생 제적
	public void deleteStd() {
		System.out.println("========학생 삭제========");
		System.out.println("삭제 학생 번호>");
		int stdId = Integer.parseInt(sc.nextLine());
		
		Student std = new Student();
		std.setStdId(stdId);
		int result = StudentDAO.getInstance().deleteStd(stdId);
		
		if(result > 0) {
			System.out.println("학생 정보 삭제 완료");
		}else {
			System.out.println("학생 정보 삭제 실패");
		}
	}
	
	//학생 전공 변경
	public void updateStd() {
		Student std = new Student();
		System.out.println("========전공 변경========");
		System.out.println("학번 입력>");
		int stdId = Integer.parseInt(sc.nextLine());
		System.out.println("변경 전공>");
		String stdMajor = sc.nextLine();
		
		std.setStdId(stdId);
		std.setStdMajor(stdMajor);
		
		int result = StudentDAO.getInstance().updateStd(std);
		
		if(result > 0) {
			System.out.println("전공 수정 완료");
		}else {
			System.out.println("전공 수정 실패");
		}
	}
	
	//전공별 성적 합계, 성적 평균
	public void getAnalyze() {
		//List<Student> list = new ArrayList<>();
		List<Student> list = StudentDAO.getInstance().getAnalyze();//결과 바로 넣어주기 가능
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("======전공별 분석======");
			System.out.println("전공명 : " + list.get(i).getStdMajor());
			System.out.println("합 계 : " + list.get(i).getStdSum());
			System.out.println("평 균 : " + list.get(i).getStdAvg());
			System.out.println("학생수 : " + (int)(list.get(i).getStdSum()/list.get(i).getStdAvg())+"명");
			System.out.println("======전공별 분석======");
		}
	}
	
}
