package com.kh.variable;

public class A_Variable {
	
	//시급과 근무시간과 근무일수를 곱해서 월급을 계산해서 출력하는 메소드
	public void printSalary() {
		
		System.out.println("====변수사용전====");
		
		System.out.println("시급 : 9620원");
		System.out.println("근무시간 : 6시간");
		System.out.println("근무일수 : 5일");
		
		// 월급 = 시급 x 근무시간 x 근무일수
		// 홍길동 : ______원 형식으로 출력하고 싶다!
		
		// 1. 자바에서 곱셈 연산은 x 표시가 아니라 * 기호로 나타낸다.
		// 2. 자바에서 문자열은 "" 안에 표현한다.
		// 3. 자바에서 숫자는 그냥 표현한다.
		// 4. 자바에서 문자열과 숫자를 연이어서 표현하고 싶으면 + 기호를 이용
		// 5. 
		
		System.out.println("강현우 : " + 9620 * 6 * 5 + "원");
		System.out.println("김다은 : " + 9620 * 6 * 5 + "원");
		System.out.println("김서영 : " + 9620 * 6 * 5 + "원");
		
		System.out.println(); //출력할 내용이 없기 때문에 엔터키만 한번 쳐준 효과
		
		System.out.println("==== 변수사용후 ====");
		
		// 월급 계산을 위한 변수 셋팅
		
		int pay = 9620;
		int time = 6;
		int day = 5;
		
		System.out.println("시급 : " + pay + "원");
		System.out.println("근무시간 : " + time + "시간");
		System.out.println("근무일수 : " + day + "일");
		
		int salary = pay * time * day;
		
		System.out.println("강현우 : " + salary + "원");
		System.out.println("김다은 : " + salary + "원");
		System.out.println("김서영 : " + salary + "원");
		
		/*
		 * 변수를 사용하는 이유
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 사용한다. (가독성이 좋음)
		 * 2. 단 한번 값을 기록해 두고 필요할 때마다 계속 사용할 목적으로 사용한다. (재사용성이 높음)
		 * 3. 유지보수를 보다 쉽게 할 수 있다.
		 */

	} //printSalary 메소드 영역 끝
	
	// 변수의 선언
	public void declareVariable() {
		
		/*
		 * 변수의 선언
		 * 값을 기록하기 위한 변수를 메모리 공간에 확보해 두겠다. = 값을 담을 상자를 만들겠다.
		 * [표현법]
		 * 자료형 변수명;
		 * 
		 * 자료명 : 변수의 크기 및 종류를 지정하는 부분
		 * 변수명 : 변수의 이름을 정하는 부분
		 * 
		 * 변수선언시 주의할점
		 * 1. 변수명은 소문자로 시작하게끔 이름 지어줄 것(단, 낙타 표기법 
		 * 2. 같은 영역({어기}안에서는 동일한 변수명으로 선언불가
		 * 3. 해당 영역({여기}) 에 선언된 변수는 해당 영역 내에서만 사용 가능
		 *    (다른 메소드에서는 사용 불가 => "지역변수" 개념)
		 */
		
		// ----자료형에 대한 개념 ----
		//1. 논리형(논리값 = true / false)
		boolean isTrue; //1byte
		
		//2. 숫자형
		//2_1. 정수형(소수점이 없는 숫자)
		byte bNum; //1byte (-128 ~ 127)
		short sNum; //2byte (-32768 ~ 32767)
		int iNum; //4byte (-21억 ___ ~ 21억 ___)
		long lNum; //8byte (int 보다 더 많은 데이터를 표현할 수 있음)
		
		//2_2. 실수형 (소수점이 있는 숫자)
		float fNum; // 4byte (소수점 아래 7자리까지 표현 가능)
		double dNum; // 8byte (소수점 아래 15자리까지 표현 가능) => 실수형 자료형 중 기본형
		// 소수점 아래 숫자가 더 붙을 수록 보다 정확한 값을 담을 수 있기 떄문
		
		// 3. 문자형 (문자 한개)
		char ch; // 2byte
		
		// ---- 여기까지 해서 총 8개의 자료형 = "기본자료형" ----
		
		// 4. 문자열형 (참조형, 참조자료형)
		String str; // 사이즈 미상? 4byte
		
		// ---- 여기까지 해서 총 9개의 빈 상자가 생성됨 ----
		
		/*
		 * 변수에 값을 대입
		 * 변수에 값을 기록하겠다. = 상자에 값을 담겠다.
		 * [ 표현법 ]
		 * 변수명 = 값;
		 */
		
	isTrue = true;
	
	bNum = 1;
	sNum = 2;
	iNum = 4;
	lNum = 8L; // long 임을 알려주기 위해 l 또는 L 을 표기해주는 편 (L을 더 권장)
	fNum = 4.0f; // float 임을 알려주기 위해 반드시 f 를 표기해줘야 한다.
	dNum = 8.0;
	
	ch = 'A'; // 문자타입 같은 경우는 반드시 ''안에 넣어줘야 한다.
	str = "ABC"; // 문자열 타입 같은 경우는 반드시 "" 안에 넣어줘야 한다.
	
	// 각 변수에 담긴 값들 출력
	System.out.println("isTrue : " + isTrue);
	System.out.println("bNum : " + bNum);
	System.out.println("sNum : " + sNum);
	System.out.println("iNum : " + iNum);
	System.out.println("lNum : " + lNum);
	System.out.println("fNum : " + fNum);
	System.out.println("dNum : " + dNum);
	System.out.println("ch : " + ch);
	System.out.println("str : " + str);
		
	} // declareVariable 메소드 영역 끝
	
	// 변수의 초기화 (비어있는 변수에 최초로 값을 대입하는 것)
	public void initVariable() {
		
		/*
		 * 변수 선언과 동시에 초기화
		 * 변수를 선언하고 대입하는 과정을 한번에 표현 가능하다.
		 * [표현법]
		 * 자료형 변수명 = 값;
		 */
		
		// 1. 논리형
		boolean isTrue = true; // 1byte
		
		//2_1. 정수형
		byte bNum = 1; // 1byte
		short sNum = 2; // 2byte
		int iNum = 4; //4byte
		long lNum = 8; //8byte
		
		//2_2. 실수형
		float fNum = 4.0f; // 4byte
		double dNum = 8.0; //8byte
		
		// 3. 문자형
		char ch = '김'; // 2byte
		
		// 4. 문자열형 (참조형, 참조자료형)
		String str = "자바 공부중"; //표면상으로는 4byte
		
		// 각 변수에 담긴 값들 출력
		
		System.out.println("isTrue 에 들은 값 : " + isTrue);
		System.out.println("bNum 에 들은 값 : " + bNum);
		System.out.println("sNum 에 들은 값 : " + sNum);
		System.out.println("iNum 에 들은 값 : " + iNum);
		System.out.println("lNum 에 들은 값 : " + lNum);
		System.out.println("fNum 에 들은 값 : " + fNum);
		System.out.println("dNum 에 들은 값 : " + dNum);
		System.out.println("ch 에 들은 값 : " + ch);
		System.out.println("str 에 들은 값 : " + str);
		
	} //initVariable 메소드 영역 끝
	
	// 상수
	public void constant() {
		
		/*
		 * 상수
		 * 항상 고정적으로 변하지 않는 수를 의미
		 * 선언 시 맨 앞에 final 키워드를 적는다.
		 * 관례상 상수의 이름을 지을 때에는 모두 대문자로 기술
		 *  
		 * 
		 * 
		 */
		
		//변수
		int age = 20;
		System.out.println("age : " + age);
		
		// 변수특) 값이 변할 수 있음
		age = 21;
		System.out.println("변경된 age : " + age);
		
		//상수
		/*
		 * final int AGE;
		 * AGE = 20;
		 */
		final int AGE = 20;
		System.out.println("상수 AGE : " + AGE);
		
		//상수특) 변할 수 없음
		//AGE = 21;
		
	} //constant 메소드 영역 끝
	
	//오버플로우 현상
	public void overflow() {
		
		// byte 는 1byte 짜리 상자 => -128 ~ 127
		byte bNum = 127;
		
		System.out.println("before : " + bNum);
		
		// 127 에다가 1 증가 시켜주세요 라고 명령
		bNum++;
		// 이 명령이 잘 먹힌다면 bNum 의 값은 128이 될것임
		
		System.out.println("after : " + bNum);
		
		
		
		
		
		
		
		
	}
	
}
