package com.kh.second.run;

import com.kh.second.MethodTest; // 해당 패키지에 있는 클래스를 가져다 쓰겠다.

// com.kh.second.run.Run
public class Run { // Run 클래스 영역 시작

	// 프로그램 시작을 위한 main 메소드 만들기
	public static void main(String[] args) { // main 메소드 영역 시작
		
		System.out.println("프로그램 시작");
		
		/*
		 * * Method 의 호출
		 * 해당 메소드의 구문들이 실행되게끔 하고싶다면 "호출" 이라는걸 해줘야함
		 * 
		 * * Method 호출 방법
		 * 같은 클래스에 있는 메소드를 호출하고자 한다면 단순히 호출만 해주면 됨
		 * [ 표현법 ]
		 * 호출하고자하는메소드명();
		 * 
		 * 그렇다면 다른 클래스에 있는 메소드를 호출하고자 한다면?
		 */
		
		// testPrintA();
		// 다른 클래스에 있는 메소드를 호출할 때 메소드명만 딸랑 호출할 수 없다!!
		
		// 1. 호출하고자 하는 메소드가 존재하는 클래스를 생성 (new) 이라는걸 해줘야 한다.
		// [ 표현법 ]
		// 클래스명 대변할이름 = new 클래스명();
		// MethodTest mt = new MethodTest();
		
		// => 기본적으로 현재 같은 패키지 내에 해당 클래스를 찾을 수 없을 경우 오류 발생
		// (다른 패키지에 존재하는 클래스라서 못찾음)
		
		// 해결방법
		// 1) 해당 클래스가 정확히 어떤 패키지에 있는 클래스인지 명시해주는 방법 (풀 클래스명)
		// com.kh.second.MethodTest mt = new com.kh.second.MethodTest();
		
		// 2) 해당 클래스명을 그냥 작성하되, 이 클래스가 어떤 패키지에 속해있는지 선언문 (import) 을 추가
		// => 주로 쓰이는 방법
		MethodTest mt = new MethodTest();
		
		// 2. 생성 후 이제 해당 클래스에 있는 메소드를 호출 (실행)
		// [ 표현법 ]
		// 대변할이름.호출하고자하는메소드명();
		
		/*
		mt.testPrintA();
		mt.testPrintB();
		mt.testPrintC();
		*/
		
		// testPrintA 메소드 하나 호출 만으로 A, B, C 모두를 호출하는 결과를 얻으려면?
		mt.testPrintA();
		
	} // main 메소드 영역 끝
	
} // Run 클래스 영역 끝

