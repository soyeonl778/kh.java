package com.kh.second;

// com.kh.second.MethodTest
public class MethodTest { // MethodTest 클래스 영역 시작
	
	/*
	 * 한 클래스 내에 여러 개의 메소드를 정의해둘 수 있음
	 * 한 클래스 내에 무조건 메인 메소드를 포함할 필요도 없음
	 */
	
	public void testPrintA() { // testPrintA 메소드 영역 시작
		
		// 이 메소드에서 실행하고싶은 코드들 작성
		System.out.println("testPrintA 메소드 실행");
		
		// 첫번째 방법
		/*
		System.out.println("testPrintB 메소드 실행");
		System.out.println("testPrintC 메소드 실행");
		*/
		
		// 두번째 방법
		/*
		testPrintB();
		testPrintC();
		*/
		
		// 세번째 방법
		testPrintB();
		
	} // testPrintA 메소드 영역 끝
	
	public void testPrintB() { // testPrintB 메소드 영역 시작
		
		System.out.println("testPrintB 메소드 실행");
		
		// System.out.println("testPrintC 메소드 실행");
		
		testPrintC();
		
	} // testPrintB 메소드 영역 끝
	
	// testPrintC 메소드 만들기 => System.out.println 으로 "testPrintC 메소드 실행" 출력
	public void testPrintC() { // testPrintC 메소드 영역 시작
		
		System.out.println("testPrintC 메소드 실행");
		
		// testPrintA();
		// 오류를 발생시키는 부분
		// 원인 : testPrintC 메소드에서 testPrintA 메소드를 호출하는 경우 "무한반복" 으로 메소드들이 호출됨
		// 실행결과
		// 프로그램 시작
		// A 실행
		// B 실행
		// C 실행
		// A 실행
		// B 실행
		// C 실행
		// ...
		// 오류 구문 출력 => Exception in thread "main" java.lang.StackOverflowError
		// Exception : 에러를 나타내는 단어
		
		// StackOverflowError
		// 프로그램이 실행 중에 메모리 문제로 인해 종료되는 에러
		// Stack 은 메모리 공간의 유형 중 하나인데, Stack 의 크기를 벗어난 경우 발생
		
	} // testPrintC 메소드 영역 끝
	
	// 현재 이 클래스에는 일반 메소드들만 존재하고 main 메소드가 존재하지 않음
	// => Run As 로 실행 불가능
	
} // MethodTest 클래스 영역 끝
