package exam;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단 입력>");
		int m = Integer.parseInt(sc.nextLine());
		
		
		for(int i = 1; i<=m; i++) {//i가 입력된 값보다 작을 때까지 반복
			System.out.println(m + " x " + i + " = " +(m*i));
		}
			
	} 
}
