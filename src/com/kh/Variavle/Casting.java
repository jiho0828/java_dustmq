package com.kh.Variavle;

public class Casting {
	/*
	 * Type Casting(자료형변환/ 형변환) <대중요>
	 * 
	 * 자료형을 바꾸는 개념
	 * 
	 * - 자바에서 값을 처리하는 규칙 -
	 * 
	 * 1. =(대입 연선자)를 기준으로 왼쪽 = 오른쪽이 같은 자료형이여야 한다. <머중요>
	 * - 같은 자료형에 해당하는 리터럴값만 대입할 수 있음
	 * - 자료형이 다를경우 값을 바꿔서 대입해야 함
	 * 
	 * 2. 같은 자료형들끼리만 연산이 가능
	 * - 자료형이 다르면 연산 불가능, 둘 중 하나를 형변환을 해 맞춰야함
	 * 
	 * 3. 연산의 결과물도 동일한 자료형
	 * - 3+7 =10, 1.1+2.2 = 3.3
	 * 
	 * [ 표현법 ] (바꾸고싶은자료형)값;
	 * 형변환연산자 / cast연산자
	 * 
	 * 형변환의 종류 
	 * 
	 * 1. 자동형변환(promotion) : 자동으로 형변환이 진행됨
	 * - 작은 크기의 자료형 -> 큰 크기의 자료형
	 * - 직접 형변환 할 필요 없음 
	 *
	 * 2. 강제형병환(Type Castion) : 자동형변환이 이루어지지 않는 경우 진행
	 * - 직접 형변환을 해야할 때 -> 자료형을 통해 진행 
	 */
	
	// boolean : 1Byte
	// char    : 2Byte
	// byte    : 1Byte, short : 2Byte, int : 4Byte, long : 8Byte
	// float   : 4Byte, double : 8Byte
	
	// 자동형변환(Promotion) : 작은 자료형 -> 큰 자로형
	public void autoCasting() {
		
		// 1.System.out.println(" 이 내용을 콘솔창에 출력해보세요");
		
		// 변수 선언과 동시에 초기화
		int num = 7;
		System.out.println(num);
		double doubleNum = (double)num;
		System.out.println(doubleNum);
		System.out.println(num);
		
		// 2. int(정수, 4byte) -> long(정수, 8Byte)
		int bigNum = 120;
		long smallLong = bigNum;
		System.out.println(smallLong);
		
		// 3. long(정수, 8BYte) -> float(실수, 4BYTE) * 특이케이스
		
		long longNumber = 1000L;
		// int i = longNumber;
		float floatNumber = longNumber;
		System.out.println(floatNumber);
		// 정수가 실수로 변환 될 때 큰 사이즈의 정수타입을 작은 사이즈의 실수타입으로 자동형변환해줌
		// 4Byte float형이 long형보다 표현할 수 있는 값의 범위가 넓기 때문
		
		System.out.println("====================");
		
		// 4. char(2Byte, 문자) <-> int(4Byte, 정수)
		
		char ch = 'a';
		// System.out.println(ch);
		int chNum = ch;
		// System.out.println(chNum);
		char ch2 = 97;
		// System.out.println(ch2);
		
		System.out.println('a');
		System.out.println((int)'a');
		System.out.println('a'+3);
		System.out.println('a'+'3');
		System.out.println((int)'3');
		System.out.println('a'+"3");
		
		System.out.println('3');
		System.out.println((char)3);
		System.out.println((char)'3'+(char)3);
		
		// 번외. byte 또는 Short형 간의 연산
		// -128 ~ -127
		
		byte b2 = 126;
		byte b3= 3;
		System.out.println(b2+b3);
		
		// =
		// 비교연산자 (==)
		// 좌항과 우항의 값을 비교해서 결과값을 반환
		// true / false
		System.out.println("비교 연산자 사용");
		System.out.println(1 == 2);
		System.out.println('a' == 'n');
		System.out.println(2 == (int)'2');
		System.out.println((char)2 == '2');
		
		
		// 강제 형 변환 : 큰 크기의 자료형 -> 작은 크기의 자료형
		// 명시적 형 변환이라고도 함
		// (바꿀자료형)값
		
		// double(8Byte) -> int(4Byte)
		double dNum = 10.123123;
		int Num = (int)dNum;
		System.out.printf("%.2f", dNum);
		System.out.println();
		System.out.println(dNum);
		
	}
		
	
}
