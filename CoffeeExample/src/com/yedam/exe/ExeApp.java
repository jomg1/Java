package com.yedam.exe;

import java.util.Scanner;

import com.yedam.service.CoffeeService;

public class ExeApp {
	//프로그램 실행에 대한 내용 작성
	//카페 운영 프로그램
	//메뉴 조회, 상세 조회, 등록, 판매, 삭제, 매출, 종료
	
	int selectNo = 0;
	CoffeeService cs = new CoffeeService();
	Scanner sc = new Scanner(System.in);
	
	public ExeApp() {
		run();
	}
	
	
	private void run() {
		
		while(selectNo != 6){
			switch (selectNo) {
			case 1:
				cs.getCoffeeList();
				break;
			case 2:
				cs.getCoffee();
				break;
			case 3:
				cs.insertCoffee();
				break;
			case 4:
				cs.salesCoffee();
				break;
			case 5:
			cs.deleteMenu();
			break;
			case 6:
				cs.storeSales();
				break;
			case 7:
				System.out.println("bye!");
				break;
			}
		}
	}
	
	private void menu() {
//		메뉴 조회, 상세 조회, 등록, 판매, 삭제, 매출, 종료
		System.out.println(" 1. 전체 메뉴 조회 | 2. 상세 조회 | 3. 커피 등록" 
		+ "| 4. 커피 판매 | 5. 카페 삭제 | 6.매출 정산 | 7.종료 ");
		System.out.println("선택>");
		selectNo = Integer.parseInt(sc.nextLine());
	}
}
