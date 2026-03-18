package com.kh.Variavle;

public class Variable {

	// 변수 : Memory(RAM) 에 값을 저장하기 위한 공간
	// ex) 바지
	public void 바지를저장하는기능() {
		String 옷장 = "긴바지";
		String 행거 = "반바지";
		System.out.println(행거);
	}

	// 변수를 사용했을 때 장점 ?!
	// 점심메뉴 풀력 프로그램 ~
	public void findLunchMenu() {

		// 1. 메뉴 출력 (메뉴명, 가격)
		// 2. 메뉴판 보고 주문 했다고 가정
		// 3. 내야할 금액 출력

		System.out.println("--- 변수를 사용하기 전 ---");

		System.out.println("메뉴판 > ");
		System.out.println("1. 트리플 치즈버거세트(15000)");
		System.out.println("2. 빅맥세트(8397) ");
		System.out.println("3. 슈슈버거세트(9210)");

		System.out.println("------------");

		System.out.println("트리플치즈버거세트 4개 주문");
		System.out.println(15000 * 4 + "원 입니다.");

		System.out.println("빅맥세트9개 주문");
		System.out.println(8397 * 9 + "원 입니다.");

		System.out.println("슈슈버거세트 4개 주문");
		System.out.println(9210 * 4 + "원 입니다.");

		System.out.println("------------");

		System.out.println("------------------");
		System.out.println("변수를 사용해 봅시다 ~");

		// 메뉴명과 가격이라는 값을 담을 공간
		// 변수를 선언하고 변수공간에 값을 대입해서 사용

		String setOne = "KH아카데미표 슈슈버거세트";
		int setOnePrice = 9800;
		String setTwo = "KH아카데미표 믹백세트";
		int setTwoPrice = 8800;

		System.out.println("메뉴판 >");
		System.out.println(setOne + ", 가격");
		System.out.println(setTwo + ", 가격");
		System.out.println(setOne + "를 10개 시켰습니다");
		System.out.println((setOnePrice * 10) + "원 입니다.");
		System.out.println(setTwo + "를 5개 시켰습니다");
		System.out.println((setTwoPrice * 5) + "원 입니다.");

		/*
		 * 1. 딱 한 번 값을 대입해서 필요한 순간마다 다시 사용할 수 있음 재사용성이 높아짐 2. 동일한 값을 수정해야 할 때 한 번만 수정하면
		 * 됨 실수의 확률이 줄어든다 3. 값에 의미를 부여할 수 있음 가독성이 높아짐
		 */
	}

	// 변수를 사용하는 방법
	public void declareVariable() {
		/*
		 * 변수 선언 방법
		 * 
		 * int price;
		 * 
		 * 자료형(DataType) 변수식별자; 변수를 선언하고 난 뒤 처음 값을 대입하는 과정을 초기화(Initialzation)라고 함 초기화를
		 * 통해 대입한 값을 초기화 라고 함
		 */
		// System.out.println(setOne);
		// 변수는 자신이 선언된 {Scope}에서만 사용될 수 있음
		// local variable(지역변수)
		/*
		 * 식별자(Identifier) 클래스명 메소드명 변수명 등 개발자가 만들어서 이용하는 고유의 이름 - 식별자를 만들 때 꼭 지켜야 하는 규칙
		 * -
		 * 
		 * 1. Keyword(예약어)는 식별자로 사용할 수 없음 2. 공백은 포함할 수 없음 3. 대 소문자를 구분하고 길이제한은 없음 4. 문자
		 * 숫자 _ $ 를 포한할 수 있음 5. 문자 _ $ 로만 시작할 수 있음
		 * 
		 * 1. 영어만 사용 가능 2.첫글자는 대문자료 표기 3.명사 형용사를 서술적으로 연결해서 사용
		 * 
		 * 
		 * - 변수 명명 규칙 -
		 * 
		 * 명사적 의미를 갖게 만드어 줌 첫 글자를 소문자로 표기 얀걀더;ㄴ 딘앋,ㄹㅇ,; 찻 ㄱ,ㄹ질,ㄹ 데믄지러 펵;
		 * 
		 * - 메소드 명명 규칙
		 * 
		 * 동사적 의미를 갖게 만들어줌 첫 글자를 소문자로 연결된 단어들의 첫글자를 대문자로 표기 메소드 식별자의 경우 식별자 위에 반드시 한 쌍의
		 * () 를 붙임 메소드에는 일반적으로 _를 표기하지 않음
		 * 
		 * - 상수 명명 규칙 -
		 * 
		 * 모든 문자를 대문자로 표기 단어와 단어 사이를 _를 사용해서 구분
		 * 
		 * 
		 */

		// asdf

		// 변수의 밗을 대입하고 출력하기 위해서는 선언 및 초기화 작업이 필요함

		// 변수의 자료형
		// Java의 가본자료형, 원시자료형(Primitive Type)

		/*
		 * 1. 논리자료형 (논리 값 : true / false ) 변수선언 : 자료형 변수식별자;
		 */

		boolean isTrue; // 변수 선언
		// System.out.println(isTrue);
		// 지역변수 (local variable) 는 초기화를 하지 않으면 사용할 수 없음
		isTrue = true; // 초기화
		System.out.println(isTrue);
		isTrue = false; // 변수에 값을 대입한다
		System.out.println(isTrue);

		// 2.숫자 자료형
		/*
		 * 정수형에는 4가지 자료유형이 존재함 byte, short, int, long
		 * 
		 * 정수형
		 */
		byte byteNumber = 1;
		short shortNumber = 2;
		long longNumber = 3;
		int intNumber = 4;

		// 실수형
		float floatNumber = 2.2F;
		double doubleNumber = 3.33;

		// 3. 단일 문자형

		char money = '돈';

		// 4. 문자열 : 참조자료형
		String str = "문자열"; // 문자열은 반드시 쌍따옴표

		System.out.print("논리자료형 : " + isTrue);

		System.out.print("정수 자료형 : " + byteNumber);
		System.out.print("정수자료형 :" + shortNumber);
		System.out.print("정수자로형 : " + longNumber);
		System.out.print("정수자료형 : " + intNumber);

		System.out.print("실수자료형 : " + floatNumber);
		System.out.print("실수자료형 : " + doubleNumber);

		System.out.print("문자자료형: " + money);

		System.out.print("문자열 자료형 :" + str);

		// 출력문의 종류
		// System.out.print();
		// System.out.println(); - 개행한다
		// System.out.printf(); - 개행안함

		// %b : 논리 타입
		// %d : 정수 타입
		// %f : 실수 타입
		// %c, %C : 단일 문자 타입
		// %s, %S : 문자열
		// System.out.printlm();

		// 상수 - 프로그래밍 언어 - 값을 변경하지 않을 변수 공간
		//
	}

}
