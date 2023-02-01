package homework0201;

import java.util.Scanner;

public class Homework0201 {
	public static void main(String[] args) {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		
		Scanner sc = new Scanner(System.in);
		
		//상품 수 입력받는 변수
		int prdCount = 0;
		
		//상품의 정보를 보관하는 배열 생성
		Product[] prdAry = null;
		
		while(true) {
			System.out.println("1.상품 수 | 2.상품 및 가격 입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("입력>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.println("상품 수 입력>");
				prdCount = Integer.parseInt(sc.nextLine());
			}else if(selectNo == 2) {
				//배열의 크기
				prdAry = new Product[prdCount];
				
				for(int i=0;i<prdAry.length;i++) {
					//각 배열에 있는 객체 초기화
					prdAry[i] = new Product();
					
					System.out.println("상품 이름 입력>");
					String prdName = sc.nextLine();
					prdAry[i].prdName = prdName;
					
					System.out.println("상품 가격 입력>");
					int price = Integer.parseInt(sc.nextLine());
					prdAry[i].price = price;
					
				}
			}else if(selectNo == 3) {
				for(int i=0;i<prdAry.length;i++) {
					prdAry[i].priceInfo();
				}
			}else if(selectNo == 4) {
				// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
				 int max =prdAry[0].price;
				 int maxIndex = 0;
				 int priceSum = 0;
				 for(int i=0;i<prdAry.length;i++) {
					 if(max< prdAry[i].price) {
						 max = prdAry[i].price;
						 maxIndex = i;
					 }
				 }
				 for(int i=0;i<prdAry.length;i++) {
					 if(i != maxIndex) {
						 priceSum += prdAry[i].price;
					 }
				 }
				 System.out.printf("최고 가격의 제품은 \"%s\"이고, 해당 제품을 제외한 제품들의 총합은 %d입니다.\n",prdAry[maxIndex].prdName,priceSum);
				 
			}else if(selectNo == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		

	}
}
