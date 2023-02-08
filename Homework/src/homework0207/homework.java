package homework0207;

import java.util.Arrays;
import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
//		//1) 세 개의 단어를 입력 받아 그 중 가장 짧은 단어와 길이 리턴하기
//		예시 )  입력> tiger
//		          입력> lion
//		          입력> rabbit
//		          출력> 가장 짧은 단어는 lion이며, 길이는 4 입니다.

		Scanner sc = new Scanner(System.in);
		System.out.println("단어1 입력>");
		String firstWord = sc.nextLine();
		System.out.println("단어2 입력>");
		String secondWord = sc.nextLine();
		System.out.println("단어3 입력>");
		String thirdWord = sc.nextLine();
		//최소값 구하는 반복문 사용 또는 if문
		//최소값 구하기
		
		String shortWord = firstWord + " : " + firstWord.length();
		if(firstWord.length() > secondWord.length()) {
			shortWord = secondWord + " : " + secondWord.length();
			if(secondWord.length() > thirdWord.length()) {
				shortWord = thirdWord + " : " + thirdWord.length();
			}
		}else {
			if(firstWord.length() > thirdWord.length()) {
				shortWord = thirdWord + " : " + thirdWord.length();
			}
		}
		
		System.out.println(shortWord );
		
//		// 2) 문자열 개수 세기
//		-> 입력 문자열에서 알파벳, 숫자, 공백의 개수를 구하시오.
//		예시) 
//		-> 입력 : 1a2b3c4d 5e
//		-> 출력 : 문자 :5개, 숫자:5개, 공백 : 1개
		
		
		String str = sc.nextLine();
		int space = 0;
		int num = 0;
		int cha = 0;
		
		
		
//		byte[] byte1 = str5.getBytes();
//		System.out.println(Arrays.toString(byte1));
//		for(int i=0;i<byte1.length;i++) {
//			if(byte1[i]==32) {
//				space++;
//			}else if(byte1[i]>=48||byte1[i]<=57) {
//				num++;
//			}else if(byte1[i]>=97||byte1[i]<=122) {
//				cha++;
//			}
//		}
		
		//교수님 답안
		for(int i = 0; i < str.length(); i++) {
			char tempStr = str.charAt(i);
			
			if(tempStr == ' ') {//아스키 코드값을 바로 넣어주어도 됨 32
				space++;
			}else if(tempStr >= '0' && tempStr <='9') {
				num++;
			} else if(tempStr >='a'&&tempStr <='z') {
				cha++;
			}
		}
		
		System.out.println("문자 :"+cha+"개, 숫자 : "+num+"개, 공백 : "+space+"개");
		
//		//3) 중복되는 문자가 없는 문자열에서 두 문자사이의 거리 구하기
//		조건 : 입력되는 두 문자를 제외한 가운데 문자의 갯수를 두 문자간 거리로 한다.
//		예시)
//		-----------------------------------
//		-> 입력 : 첫번째 문자 : c
//		-> 입력 : 두번째 문자 : f
//		-> 출력 : 두 문자간의 거리 : 2
//		------------------------------------
//		-> 입력 : 첫번째 문자 : e
//		-> 입력 : 두번째 문자 : a
//		-> 출력 : 두 문자간의 거리 : 3
		
		System.out.println("입력>");
		String alpha = sc.nextLine();
//		-> 입력 : "abcdefghijklmnopqrstuvwxyz"
		
		System.out.println("첫번째 문자>");
		String firstWord1 = sc.nextLine();
		System.out.println("두번째 문자>");
		String secondWord2 = sc.nextLine();
		
		int firstIndex = alpha.indexOf(firstWord1);
		int secondeIndex = alpha.indexOf(secondWord2);
		
//		//각 문자의 위치를 찾은 다음 큰 수 - 작은 수
		if(firstIndex < secondeIndex) {
			System.out.println("두 문자간의 거리 : "+(secondeIndex - firstIndex-1));//거리 구한것에서 -1하면 가운데 문자 갯수로 거리가 구해짐.
		}else if(firstIndex > secondeIndex) {
			System.out.println("두 문자간의 거리 : "+(firstIndex-secondeIndex-1));
		}
		
//		//4) 중복문자 제거
//		입력 : aaabbccceedddd
//		출력 : abcd
		// 1) 세 개의 단어를 입력 받아 그 중 가장 짧은 단어와 길이 리턴하기
		
		System.out.println("입력>");
		String strList = sc.nextLine();
		
		//indexOf, charAt
		//aaabbccceedddd
		//indexOf = 중복된 값이 있으면 
		//charAt(0)~charAt(문자열.length()-1)//문자열을 하나하나 잘라옴
		//charAt(0)->a
		//indexOf(a)->a의 위치->index:0
		//하나하나 잘라오는 문자열에 대한 위치값
		//a가 처음으로 나타난 곳 == 현재 나의 위치
		//indexOf(charAt(i)) == i
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<strList.length();i++) {
			if(strList.indexOf(strList.charAt(i))==i) {
				System.out.println(i);
				sb.append(strList.charAt(i));
			}
		}
		System.out.println(sb);
		
	}
}
