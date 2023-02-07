package com.yedam.API;

public class StringAPIExample {
	public static void main(String[] args) {
		//1)문자열 뒤집기 -> 반복문 조건만 잘 주면 됨.
		//Stirng str = "abcdefg" -> "gfedcba"
		//뒤에서부터 읽는다고 생각해보기
		//문자열의 길이 =>7, index는 0부터 시작이기때문에 시작점을 길이-1로 잡아줌.
		String str = "abcdefg";
		for(int i =str.length()-1;i>=0;i--) {//length 사용
			System.out.print(str.charAt(i)); //charAt사용
		}
	}
}
