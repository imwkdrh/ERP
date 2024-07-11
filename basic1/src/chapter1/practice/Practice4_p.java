package chapter1.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice4_p {
	public static void main(String[] args) {
		
		//	모두 대문자 만들기
		//	사용자로부터 문자열 statement를 입력받고
		//	입력 받은 문자열을 영어라면 모두 대문자로 변경하여
		//	문자배열에 저장한 후 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력 : ");
		String statement = sc.nextLine();
		System.out.println("입력받은 문자열은 : " + statement);
		char[] statementChars = statement.toCharArray();
		sc.close();
		//char[] resultChars = new char[statement.length()];
		
		for(int index=0;index<statementChars.length;index++) {
			char charater = statementChars[index];
			boolean lowerEnglish = charater >=97 && charater <= 122;
			if(!lowerEnglish) continue;
				
			statementChars[index]= (char)(charater-32);
		}
		System.out.println(statementChars);
		
	}
}
