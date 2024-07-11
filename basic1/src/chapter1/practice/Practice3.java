package chapter1.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		
		//	문자열 자르기
		//	사용자로부터 시작인덱스와 종료인덱스를 입력받고
		//	입력받은 시작 인덱스와 종료 인덱스까지 문자열을 잘라서 자른 문자열을 출력
		
		//	string 기능 substring을 사용하지 않고 char[]을 이용하여 작성
		
		String statment = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘 못 그린 기린 그림이다.";
		
		System.out.println("0부터 "+(statment.length()-1)+"까지의 정수 :");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작 인덱스 : ");
		int startIndex = sc.nextInt();
		System.out.println("종료 인덱스 : ");
		int endIndex = sc.nextInt();
		
		char[] resultChars = new char[(endIndex-startIndex)+1];
		System.out.println(endIndex-startIndex+1);
				
		for(int index=0; index < resultChars.length ;index++) {
			char start = statment.charAt(startIndex);
			resultChars[index]=start;
			startIndex++;
		}
		System.out.println(Arrays.toString(resultChars));
		
		sc.close();
	}
}
