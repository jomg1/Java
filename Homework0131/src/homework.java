import java.util.Arrays;
import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		
		//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		int ans=arr1[0];
		int arr1Index=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==60) {
				ans=arr1[i];
				arr1Index=i;
			}
		}
		System.out.println("값이 60인 곳의 인덱스 : " + arr1Index);
		
		//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		int answer2 = 0;
		System.out.println("인덱스가 3인 곳을 제외한 값 : ");
		for(int i=0;i<arr1.length;i++) {
			if(i!=3) {
				answer2 += arr1[i];
				System.out.print(arr1[i]+"\t");
			}
		}		
		System.out.println();
				
		//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
  		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
		
		int[] arr2 = { 10, 20, 30, 50, 3, 60, -3 };
		System.out.println("변경하고 싶은 값의 인덱스 번호>");
		int a= Integer.parseInt(sc.nextLine());
		for(int i=0;i<arr2.length;i++) {
			if(i==a) {
				arr2[i] = 1000;				
			}
			
		}
		System.out.println("변경된 이후 배열 값 : "+Arrays.toString(arr2));
						
		//문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		
		
		int max = arr1[0];
		int min = arr1[0];
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>max) {
				max = arr1[i];
			}
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]<min) {
				min = arr1[i];
			}
		}
		System.out.println("주어진 배열 : "+Arrays.toString(arr1));
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);

		
		//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		int[] arr3 = new int[10];
		System.out.println("양의 정수 10개를 입력하세요.");
		for(int i=0; i<arr3.length; i++) {			
			//arr3이 가진 인덱스 위치에 바로 값 입력
			System.out.println((i+1)+"번째 양의 정수>");
			arr3[i] = Integer.parseInt(sc.nextLine());						
		}
		System.out.print("3의 배수 : ");
		for(int i=0;i<arr3.length;i++) {
			int sam=0;
			if(arr3[i] % 3 == 0) {
				sam += arr3[i];
				System.out.print(sam+" ");	
			}
		}
		System.out.println();
		
		

		// 추가 문제]
		// answer 배열에 담긴 데이터를 읽고 각 숫자마다 개수만큼'*'를 찍는다.
		// 아래 빈 영역에 코드를 입력하여 프로그램을 완성하여라
	
		//	public static void main(String[] args) {
				int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
				int[] counter = new int[4];
		
				for (int i = 0; i < answer.length; i++) {
					//answer의 숫자의 갯수 -> counter 인덱스 매칭
					//answer에서 데이터(값)이 나왔을 때 
					//-> counter의 인덱스로 바꾼다.
					//answer -> 1
					//counter[0] = counter[0]+1;
					//answer -> 4
					//counter[3] = counter[3]+1;
					counter[answer[i]-1]++;
					//counter[answer[i]-1] += 1;
				}
				//counter 배열의 크기만큼
				for (int i = 0; i < counter.length; i++) {
					//counter[0] = answer에서 숫자 1의 갯수 = 3
					for(int j=0; j<counter[i]; j++) {
						System.out.print("*");
					}
		
					System.out.println();
				}
		//	}
		// ***
		// **
		// **
		// ****
		
	}
}
