package com.kh.Variavle;

import java.util.Scanner; 

public class Input {

	/*
	 * 키보드를 이용해서 프로그램을 사용하는 사용자에게 값을 입력받기
	 * 자바에서 제공해주는 Scanner라는 클래스 사용
	 * Scanner라는 클래스에 존재하는 메소드들을 호출해서 입력을 받을 수 있음
	 */
	
	public void inputTest() {
		
		Scanner sc = new Scanner(System.in);
		// System.in : 표준 입력 도구에서 입력하는 값들을 받겠다는 뜻(바이트단위)
		
		System.out.println("피자가게 온 것 환영.");
		System.out.println("------- 피자가게 메뉴판 -------");
		System.out.println("1. 치즈 피자");
		System.out.println("2. 스테이크 피자");
		System.out.println("3. 고구마피자");
		System.out.println("-------------------------");
		System.out.println("주문할 피자를 입력하셈 > ");
		
		// next() : 사용자가 입력한 값 중 공백문자가 있을 경우 공백문자 이전까지만 입력
		String select = sc.next();
		// 사용자가 어떤 값을 입력하던지 입력한 값을 다시 화면상에 출력
		System.out.println(select + "을(를) 주문함");
		
		// 개수 : 몇 판 ?
		System.out.println("몇 판 주문 ? (숫자입력) > ");
		// 1 2 3 4 5 6 ~
		int pizzaNumber = sc.nextInt();
		System.out.println(select + "를" + pizzaNumber + "판 주문함");
		
		System.out.print("주소 입력하셈 > ");
		// nextLine() : 사용자가 입력한 값을 공백과 무관하게 개형문자 이전까지 전체를 다 읽어오는 기능
		// nextLine() : 입력버퍼에서 개행문자 이전까지의 모든 값을 가져온 후 입력버퍼에 존재하는 개행문자를 날려줌
		sc.nextLine();
		String address = sc.nextLine(); 
		
		System.out.println(address + "로 배달함");
	}
	
	
}
