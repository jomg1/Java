package com.yedam.array;

public class Exam05 {
	public static void main(String[] args) {
		//최대값 또는 최소값이 위치하는 인덱스 구하기
		int[] array = {20,50,70,80,30,10,90,100};
		
		/*
		 * 로직을 통해서 최대값, 최소값의 인덱스 구하기
		 */
		//최대값, 최소값 구하기
		int max=array[0];
		int maxIndex=0;
		int min=array[0];
		int minIndex=0;
		//array[0] -> 첫번째 데이터 출력(인덱스를 활용)
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];//i가 인덱스의 값
				maxIndex=i;
			}
			
			
		}
		for (int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
				minIndex=i;
			}
		}
		
		System.out.println("최대값 인덱스 : "+maxIndex);
		System.out.println("최소값 인덱스 : "+minIndex);
		
		for(int i=0; i<args.length; i++) {
			System.out.println("명령 라인 출력 : " + args[i]);
		}
	}
}
