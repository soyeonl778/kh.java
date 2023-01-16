package com.kh.variable;

// 형변환
public class C_cast {

	/*
	 * 형변환(Casting)
	 * "형태를 바꾼다." => 값의 자료형을 바꾸겠다.
	 * 
	 * 컴퓨터 상에서의 값 처리 규칙
	 * 1. 대입연산자 (=) 를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야 함
	 *    => 즉, 같은 자료형에 해당되는 값만 대입 가능
	 *    => 다른 자료형의 값을 대입하고자 한다면 "형변환" 이 필수
	 * [표현법]
	 * 자료형 변수명 = (바꿀자료형)값;
	 * int num = (int)8.0;
	 * 
	 * 2. 같은 자료형끼리만 연산 가능함, 같은 자료형으로 결과 또한 나오게 됨
	 *    => 즉, 다른자료형끼리 연산을 수행하고 싶다면 적어도 한쪽 값을 "형변환" 으로 맞춰줘야함
	 * [표현법]
	 * 값 + (바꿀자료형)값 
	 * 
	 * 형변환의 종류
	 * 1. 자동형변환 => 자동으로 형변환이 일어나기 때문에 내가 직접 형 변환할 필요가 없음
	 *              작은 바이트의 자료형 값으로 변환할 경우 일어남
	 * 2. 강제형변환 => 자동형변환이 되지 않아 직접 강제로 형변환 해야하는 경우
                                         큰 바이트의 자료형 값을 작은 바이트의 자료형 값으로 변환할 경우 일어남
	 *  [표현법]  
	 * (바꿀자료형)값
	 * (바꿀자료형) : 형변환 연산자, cast 연산자
	*/
	
	// 자동형변환 : 작은 바이트 -> 큰 바이트로 자동 변환되는 경우
	public void autoCasting() {
		
		// 1. int (4byte) -> double (8byte)
		
		int i1 = 10;
		double d1 = (double)i1; // i1은 int 4바이트짜리고 double d1은 8바이트짜리니까 자동으로 형변환이 일어난거임
		
		System.out.println("d1 : " + d1);
		
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result2 = i2 + d2;
		// 12 -> 12.0 + 3.3 = 15.3
		
		System.out.println("result2 : " + result2);
		
		// 2. int (4byte) -> long (8byte)
		int i3 = 1000;
		long l3 = /* (long) */ i3; // = 1000
		
		long l4 = /* (long) */ 2000;
		// L 을 붙이지 않아도 되는 이유 : 자동형변환이 되기 때문
		
		System.out.println("l3 : " + l3);
		System.out.println("l4 : " + l4);
		
		// 3. (특이케이스) 
		
		//long (8byte) -> float (4byte)
		
		long l5 = 100000;
		float f5 = /* (float)*/ l5; // 100000 -> 100000.0
		//정수가 실수로 담길때에는 큰 사이즈의 정수가 작은 사이즈의 실수에 대입 가능
		// => 4byte 짜리 float 는 사실 long 형보다 담을 수 있는 값의 범위가 더 크기 때문
		
		// 4. (중요한 특이케이스)
		// char (2byte) <-> int(4byte) 로 양방향 변환 가능하댄다 어이;없네
		// char 의 범위 : 0 ~ 65XXX 
		// => 각 문자마다 고유의 정수값이 정해져 있다. 음수값은 오류가 난다.
		// 참고) 아스키코드표 (0 ~ 127), 영문 대소문자, 숫자, 기본적인 특수문자)
		//      유니코드표 ( 0 ~ 65xxx, 영문 대소문자, 숫자, 특수문자, 한글, 그 외 언어)
		char ch = 65;
		
		
		System.out.println("ch : " + ch); // 'A'
		
		int num = 'A';
		System.out.println("num : " + num); // 65
		
		// 한글의 경우
		System.out.println("한글 김 : " + (int)'김'); // 44608
		
		// int 값 + char 값
		int sum = /* (int) */ 'A' + 10;
		System.out.println("sum : " + sum); //75

		char result = 'A' + 10;
		System.out.println("result : " + result); // K
		
		// 5. (특이케이스)
		// byte 간의 연산, short 간의 연산
		byte b1 = 1;
		byte b2 = 10;
		
		int sum2 = b1 + b2; // byte sum2 = (byte)(b1 + b2);
		// byte + byte(바이트끼리)는 무조건 int(4byte) 로 취급

		
	} //autoCasting 메소드 영역 끝
	
	// 강제형변환, 명시적형변환 : 큰 바이트의 자료형 -> 작은 바이트의 자료형으로 변환하는 경우
	public void forceCasting() {
		
		//1. double (8byte) -> float (4byte)
		float f1 = (float)4.0; // 반드시 f를 붙여줘야 함!
		
		double d2 = 8.0;
		float f2 = (float)d2; // 8.0
		
		//2. double (8byte) -> int (4byte)
		double d3 = 10.89;
		int i3 = (int)d3;
		
		System.out.println("i3 : " + i3);
		// 소수점 아래 내용들이 사라짐(절삭) => 데이터가 손실된 상황
		// 신중하게 강제 형변환을 해야하는 경우
		
		int iNum = 10;
		double dNum= 5.89;
		
		// int iSum = 1Num + dNum;
		// iNum double 형으로 자동형변환 된 후에 덧셈연산이 이루어짐
		// 10 -> 10.0 + 5.89 = 15.89 -> int 형 변수에 담길 수 없음 (Type Mismach 발생)
		
		// 해결방법 1. 연산 결과를  int 형에 맞춰서 강제형변환
		
		int iSum = (int)(iNum + dNum);
		System.out.println("iSum : " + iSum);
		
		//해결방법2. 덧셈 연산 전에 dNum 을 int 형으로 강제형변환
		// => 자동형변환은 작은 바이트가 큰 바이트로 변환되기 떄문에 원래는 iNum 이 double 로 변환이 되는데
		//    그 이전에 미리 dNum 을 int 로 바꾸겠다.
		
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : " + iSum2);
		
		// 해결방법3. 결과값을 double 형 변수에 담기
		// => 이 경우, 데이터 손실이 없음!
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);
		
		
	}
	
	
	
	
	
	
	
	
}
