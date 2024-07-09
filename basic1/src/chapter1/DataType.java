package chapter1;

public class DataType {
	public static void main(String[] args) {
		
		//	기본형 데이터 타입
		
		//	정수형 데이터 타입 : 실수부가 존재하지 않는 정수를 나타냄 (부호를 가지고 있음)
		
		//	byte : 1byte(8bit)의 크기를 가지는 정수형 데이터 타입
		//	-128 ~ +127
		byte byte1 = -128;
		//	byte1 = 128;
		
		
		//	short : 2byte(16bit)의 크기를 가지는 정수형 데이터 타입
		// -32768 ~ +32767
		short short1 = 128;
		short1 = 32767;
		//	short1 = 32768;
		
		
		//	int : 4byte(32bit)의 크기를 가지는 정수형 데이터 타입
		//	-2147483648 ~ +2147483647
		int int1 = 32768;
		int1 = 2_147_483_647;
		//	정수형 리터럴 상수는 int 타입임
		//	int1 = 2_147_483_648L;

		
		
		//	long : 8byte(64bit)의 크기를 가지는 정수형 데이터 타입
		//	-9223372036854775808 ~ +9223372036854775807
		long long1 = 3_000_000_000L;
		
		//	가장 많이 사용되는 정수형 타입 : int
		//	메모리 공간을 절약할 때 사용되는 정수형 타입 : byte, short
		//	큰 수를 다룰 때 사용되는 정수형 타입 : long
		
		//	정수형 int에 연산 결과를 저장하는 데이터 타입으로 사용할 때는
		//	연산 결과가 범위를 초과할 수 있는지 주의할 필요가 있다
		int a = 200000, b = 300000;
		int result = a + b;
		System.out.println(result);
		result = a * b;
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}