package homework0207;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		// 1) 세 개의 단어를 입력 받아 그 중 가장 짧은 단어와 길이 리턴하기
		
		int min;
		Scanner sc = new Scanner(System.in);
		System.out.println("단어1 입력>");
		String str = sc.nextLine();
		System.out.println("단어2 입력>");
		String str2 = sc.nextLine();
		System.out.println("단어3 입력>");
		String str3 = sc.nextLine();
		//최소값 구하는 반복문 사용 또는 if문
		if(str.length()>str2.length()) {
			min = str2.length();
		}else if(str.length()<str2.length()) {
			min=str.length();
		}
		
	}
}
