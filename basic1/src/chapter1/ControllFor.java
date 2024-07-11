package chapter1;

import java.util.Arrays;

public class ControllFor {
	public static void main(String[] args) {
		
		//	반복문 : 특정 조건에 만족하면 지정한 코드블럭을 반복 실행함
		
		//	for문 : 일반적으로 반복 횟수가 정해져 있을 때 사용하는 반복문
		//	for (조건에서 사용할 변수 초기화; 조건; 조건에 사용할 변수 변경) {반복할 코드 블럭)
		
		
		
		for (int count=1; count <=100; count++) {
			System.out.print(count+" ");
			if((count%10) == 0) {
				System.out.println();
			}
		}
		System.out.println("========================");
		
		
		
		
		
		
//		System.out.println("4*2=8");
//		System.out.println("4*3=12");
//		System.out.println("4*4=16");
//		System.out.println("4*5=20");
//		System.out.println("4*6=24");
//		System.out.println("4*7=28");
//		System.out.println("4*8=32");
//		System.out.println("4*9=36");
		
//		System.out.println("4*count=count*4");
		
		for(int count=1;count<=9;count+=2) {
			System.out.println("4*"+count+"="+(count*4));
		}
		System.out.println("========================");
		String[] fruits = new String[] {"apple", "banana", "cacao"};
		
//		System.out.println(fruits[0]);
//		System.out.println(fruits[1]);
//		System.out.println(fruits[2]);
		
		for(int index = 0; index < fruits.length; index++) {
			System.out.println(fruits[index]);
		}
		System.out.println("========================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
