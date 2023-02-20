package com.yedam.lotto;

import java.util.ArrayList;
import java.util.List;

public class Lotto {
	public static void main(String[] args) {
		//lotto 배열 생성
		int [] lotto = new int[6]; // 배열 생성, 6개의 공간을 만듦, 한정된 공간
		
		lotto[0] = 1;
		lotto[5] = 5;
		
		//list 활용 쉬움
		List<Integer> intList = new ArrayList<>(); //인터페이스(메소드존재)=오버라이딩<>();
		//List<Integer> intList = new ArrayList<Integer>();
		//		<객체가 들어가야 함>, 내가 만든 클래스도 가능함
		intList.add(1); //0번 방
		intList.add(2); //1번 방
		intList.add(3); //2번 방
		
		intList.get(0); //리스트안의 데이터를 가져올 때 사용
		
		intList.set(0, 10);
		
		System.out.println(intList.get(0));
		
	}
}
