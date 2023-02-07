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
		String str = sc.nextLine();
		System.out.println("단어2 입력>");
		String str2 = sc.nextLine();
		System.out.println("단어3 입력>");
		String str3 = sc.nextLine();
		//최소값 구하는 반복문 사용 또는 if문
		//최소값 구하기
//		for()
		
		System.out.println("가장 짧은 단어는"  );
		
//		// 2) 문자열 개수 세기
//		-> 입력 문자열에서 알파벳, 숫자, 공백의 개수를 구하시오.
//		예시) 
//		-> 입력 : 1a2b3c4d 5e
//		-> 출력 : 문자 :5개, 숫자:5개, 공백 : 1개

		String str5=" 1a2b3c4d 5e";
		int space = 0;
		int num = 0;
		int cha = 0;
		byte[] byte1 = str5.getBytes();
		System.out.println(Arrays.toString(byte1));
		for(int i=0;i<byte1.length;i++) {
			if(byte1[i]==32) {
				space++;
			}else if(byte1[i]>=48||byte1[i]<=57) {
				num++;
			}else if(byte1[i]>=97||byte1[i]<=122) {
				cha++;
			}
		}
		System.out.println("문자 :"+cha+"개, 숫자 : "+num+"개, 공백 : "+space+"개");
		
//		//3) 중복되는 문자가 없는 문자열에서 두 문자사이의 거리 구하기
//		조건 : 입력되는 두 문자를 제외한 가운데 문자의 갯수를 두 문자간 거리로 한다.
//		예시)
//		-> 입력 : "abcdefghijklmnopqrstuvwxyz"
//		-----------------------------------
//		-> 입력 : 첫번째 문자 : c
//		-> 입력 : 두번째 문자 : f
//		-> 출력 : 두 문자간의 거리 : 2
//		------------------------------------
//		-> 입력 : 첫번째 문자 : e
//		-> 입력 : 두번째 문자 : a
//		-> 출력 : 두 문자간의 거리 : 3
		
		
//		//4) 중복문자 제거
//		입력 : aaabbccceedddd
//		출력 : abcd
		// 1) 세 개의 단어를 입력 받아 그 중 가장 짧은 단어와 길이 리턴하기
		
		
		
		
		
	}
}
