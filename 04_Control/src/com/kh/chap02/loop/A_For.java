package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 * for문
	 * 괄호 안의 반복을 지정하는 부분이 초기식, 조건식, 증감식으로 이루어져 있음
	 * 각각 세미클론으로 구분한다.
	 * 
	 * [표현법]
	 * for(초기식;        조건식;         증감식) {
	 * 
	 * 
	 *       반복적으로 실행할 코드;
	 *  }
	 * -초기식 : 반복문이 실행될 때 "초기에 단 한번만 실행되는 구문"
	 *         (이 반복문에서 사용할 변수를 선언 및 초기화 하는 구문)
	 *         ex) int i = 0; 
	 * -조건식 : "반복문이 계속 수행될 조건" 을 작성하는 구문
	 *         조건식의 결과가 true 일 경우 반복문 진행
	 *         조건식의 결과가 false 일 경우 반복문을 멈추고 빠져나옴
	 *         (보통 초기식에 제시한 변수를 가지고 조건식을 지정함)
	 *         ex) i < 10;
	 * -증감식 : 반복문을 제어하는 변수값을 "증감"시키는 구문
	 *         (보통 초기식에 제시된 변수를 가지고 증감식을 작성
	 *         ex) i++
	 *             i += 1
	 * 
	 * for문의 흐름
	 * for문을 만나는 순간
	 * 초기식 -> 조건식(조건검사) -> true 일 경우 실행하고자 하는 코드 실행 -> 증감식
	 *         조건식(조건검사) -> true 일 경우 실행하고자 하는 코드 실행 -> 증감식
	 *         조건식(조건검사) -> true 일 경우 실행하고자 하는 코드 실행 -> 증감식
	 *         ...
	 *         조건식(조건검사) -> false 일 경우 코드 실행 x
	 * => 매 번 조건식의 조건 검사를 통해서 조건이 true 일 경우만 반복해서 실행되게끔 하는 원리
	 */
	
	public void method1() {
		
		//"안녕하세요" 를 5번 반복해서 출력하고 싶다!
		/*
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		*/
		
		// 적은 횟수일 경우에는 복사 붙여넣기가 가능하지만
		// 100번 반복하고싶은 경우에는?
		// 1000번 반복하고싶은 경우에는?
		
		// 5회 반복할수 있게 for문 작성
		// i 값이 1에서부터 5보다 작거나 같을때까지 1씩 증가할동안 반복 수행
		// i : 1, 2, 3, 4, 5 => 5회
		
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.println("안녕하세요");
		}
		
	} // method1 메소드 영역 끝
	
	public void method2() {
		
		//i 값이 1에서부터 6보다 작을 때 까지 1씩 증가할동안 반복 수행
		//i : 1, 2, 3, 4, 5 => 5회
		for(int i = 1; i < 6; i++) {
			
			System.out.println("반갑습니다.");
		}
		
		// i값이 11에서부터 16보다 작을 때까지 1씩 증가할 동안 반복 수행
		// i : 11, 12, 13, 14, 15 => 5회
		for(int i = 11; i < 16; i++) {
			
			System.out.println("다시만나요.");
		}
		
		// i값 출력
		//System.out.println("i : " + i);
		// => 초기식에서 선언한 변수는 해당 for문의 중괄호 영역 안에서만 사용 가능 (지역변수 개념)
		
	} // method2 메소드 영역 끝
	
	public void method3() {
		
		// i 값이 1에서부터 10보다 작을때까지 매번 2씩 증가할동안 반복 수행
		// i = 1, 3, 5, 7, 9 => 5회
		for(int i = 1; i < 10; i += 2) {
			
			System.out.println("하이");
		}
		
	} //method3 메소드 영역 끝
	
	public void method4() {
		
		// i 값이 10에서부터 6보다 크거나 같을 때까지 매번 1씩 감소할 동안 반복 수행
		// i : 10, 9, 8, 7, 6 => 5회
		for(int i = 10; i >= 6; i--) {
			
			System.out.println("헬로우");
		}
		
		// 제일 단순하게 반복되는 횟수를 지정하는 표현법
		// int i = 0; i < 반복시키고자하는횟수; i++
		
		// int i = 0; i < 3; i++
		
		//"빠이" 를 5번 출력
		for(int i = 0; i < 5; i++) {
			
			System.out.println("빠이");
		}
		
	} // method4 메소드 영역 끝
	
	//조건식을 제대로 지정하지 않는 경우
	public void method5() {
		
		for(int i = 0; i > 10; i++) { //조건식 부등호를 잘못기입
			
			System.out.println("잘 출력되나..?");
		}
		/*
		for(int i = 0; true; i = i * 0) { //무한반복
			
			System.out.println("잘 되나...?");
		}
		*/
		
		for(;;) {
			
			System.out.println("잘출력되나");
		}
		
		//만약 의도적으로 무한 반복을 수행하고 싶다면
		//조건식 부분을 대놓고 true 로 적어주면 됨
		//또는 for(;;) 로 작성해도 문법적 오류가 아닌 조건식 부분이 true 로 간주가되서
		//무한 반복을 수행할 수 있다.
		
	} // method5 메소드 영역 끝
	
	
	//고정적인 문자열 말고 매번 달라지는 출력 결과 보기
	public void method6() {
		
		// i 값이 1에서부터 11보다 작을떄까지 1씩 증가할동안 반복 수행
		
		for(int i = 1; i < 11; i++) {
			
			System.out.println("i : " + i);
		}

	} //method6 메소드 영역 끝
	
	public void method7() { 
		
		// 1 에서부터 10까지 줄바꿈 없이 아래의 형태로 출력해보고 싶다!
		// 1 2 3 4 5 6 7 8 9 10
		
		/*
		for(int i = 1; i < 11; i++) {
			
			System.out.print(i + " ");
		}
		*/
		
		for(int i = 0; i < 10; i++) {
			
			System.out.print((i + 1) + " ");
			
		}
	}//method7 메소드 영역 끝
	
	public void method8() {
		
		// 첫번째풀이
		// 1부터 10까지의 정수 중 홀수만을 출력
		// 1 3 5 7 9
		
		for(int i = 1; i < 10; i += 2) { // 반복 총 5번
			
			System.out.print(i + " ");
		}
	
		System.out.println();
		
		//두번째 풀이
		for(int i = 1; i < 11; i++) { 
			// i 값이 "홀수"일 경우에만 출력하고 싶다
			if(i % 2 == 1) {
				System.out.print(i + " ");
				
			}
			
		}
	} //method8 메소드 영역 끝
	
	public void method9() {
		
		// 1에서부터 10까지의 총 합계
		// 첫번째 풀이
		// int sum = 1+2+3+4+5+6+7+8+9+10;
		
		// 두번째 풀이
		/*
		 * int sum = 0;
		 * 
		 * sum += 1; -> sum = sum + 1; => 1
		 * sum += 2; -> sum = sum + 2; => 3
		 * sum += 3; -> sum = sum + 3; => 6
		 * ...
		 * sum += 10;
		 * 
		 * 규칙을 찾자!!
		 */
		
		int sum = 0; // 누적 합의 결과를 담아둘 변수
					// 항상 0으로 세팅해야함 => 정확한 결과를 얻기 위해서
		
		for(int i = 1; i <= 10; i++) {
			
			sum += i;
		}
		
		System.out.println("sum : " + sum);

	} // method9 메소드 영역 끝
	
	public void method10() {
		
		// 1에서부터 사용자가 입력한 정수까지의 합을 모두 더해서 출력해보기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		sc.nextLine();
				
		int sum = 0;
		
		if(num > 0) { 
			
			for(int i = 1; i <= num; i++) {
				sum = sum + i;	
			}
			
			System.out.println("sum : " + sum);	
		} else {
			
			System.out.println("잘못입력했습니다.");
			
		} // method10 메소드 영역 끝
	
	}
	
	public void method11() {
			
		// 1에서부터 매번 달라지는 랜덤값 (1~10사이의 정수
		/*
		 * Math 클래스에 정의되어있는 random() 메소드를 호출해서
		 * 매번 다른 랜덤값을 얻어올 수 있음
		 * 	
		 * random() 메소드를 호출할 경우
		 * 0.0 ~ 0.9999999... 사이의 랜덤값이 발생
		 * 0.0 <= 랜덤값 < 1.0
		 */
		
		// Math 클래스의 메소드를 호출하고자 할 경우 대변할 이름을 생성하지 않아도 됨
		//double random = Math.random();
		//System.out.println(random);
		
		//int random = (int) Math.random(); // double 형이라서 오류
		// (int)Math.random() 강제형변환을 하면 어느 랜덤값이던지 0이 뜰 것임!!
		
		//0.0 ~ 0.99999... 이므로
		// 10을 곱해보자 => 0.0~9.99999...
		// 1 ~ 10 사이의 랜덤값을 구하기 원하므로 1을 더해보자 => 1.0 ~ 10.9999..
		// 정수형태의 랜덤값을 구하기 원하므로 int 형으로 강제형변환해보자 => 1~10
		
		//ex) 만약 11 ~ 20 사이의 랜덤수를 구하고 싶음
		// 0.0 ~ 0.9999...
		// 10 을 곱해보자 => 0.0 ~ 9.99999..
		// 11을 더해보자 => 11.0 ~ 20.9999..
		//int로 강제형변환 => 11 ~ 20
		
		// 만약 1 ~ 10 사이의 랜덤수를 구할 경우
		
		// 공식 : (int)(Math.random() * 몇개의랜덤값 + 시작수);
		
		int random = (int)(Math.random() * 10 + 1);
		// System.out.println(random);
		
		int sum = 0;
		
		System.out.println("현재 발생한 랜덤값 : " + random);
		
		for(int i = 1; i <= random; i++) {
			
			sum = sum + i; 
			
		}
		
		System.out.printf("1에서부터 %d까지의 총 합은 %d 입니다. \n", random, sum);
		
	} // method11 메소드 영역 끝
	
	public void method12() {
		
		// 사용자로부터 2~9사이의 정수를 입력받아서 구구단 출력
		
		/*
		 * 예시
		 * 2~9사이의 정수 입력 : 2
		 * ---2단---
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 X 3 = 6
		 * ...
		 * 2 X 9 = 18
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2 ~ 9 사이의 정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		
		// 2 ~ 9 사이의 정수가 맞는지 먼저 판별
		if((2 <= num) && (num <= 9)) {
			
			System.out.printf("--- %d단 --- \n", num);
			//반복문을 이용해서 구구단 출력
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d \n", num, i, num * i);
			}
		} else {
			System.out.println("2 ~ 9사이의 정수가 아닙니다.");
			
		}
		
	} // method12 메소드 영역 끝
	
	// 중첩 for문
	public void method13() {
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int i = 0; i < 3; i++) { //바깥쪽 for문
			
			//System.out.println("1 2 3 4 5");
			
			for(int j = 1; j <= 5; j++) { //안쪽 for문
				
				System.out.print(j +  " ");
			}
			
			System.out.println(); //줄바꿈
		}
		
		//중첩 for문의 경우 반복횟수를 알고싶다면
		//바깥쪽 for문의 반복횟수 * 안쪽 for문의 반복횟수
	
	} // method13 메소드 영역 끝
	
	public void method14() {
		
		// *****
		// *****
		// *****
		// *****
		// *****
		
		
		for(int i = 1; i <= 5; i++) {
			
			//System.out.println("*****");
			
			for(int j = 1; j <= 5; j++) {
				
				System.out.print("*");
			}
			
			System.out.println(); //줄바꿈 해줘야함
		}
		
		
	} // method14 메소드 영역 끝
	
	public void method15() {
		
		// 1*** => 1행 1열
		// *2** => 2행 2열
		// **3* => 3행 3열
		// ***4 => 4행 4열
		// => 공통적인 규칙이라고 한다면 매번 4글자씩 출력하고있음
		
		for(int i = 1; i <= 4; i++) { // i는 행
			
			for(int j = 1; j <= 4; j++) { // j는 열
				
				// System.out.print("*");
				// System.out.print(숫자);
				
				// 행값(i) 과 열값(j)이 일치할경우 일치하는 그 값을 출력해보기
				if(i == j) {
					
					System.out.print(j);
				} else {
					System.out.print("*");
					
				}
				
			}
			System.out.println(); //줄바꿈	
		}
		
	} // method15 메소드 영역 끝
	
	public void method16() {
		
		//*
		//**
		//***
		//****
		//*****
		
			
			/*
			if(i == 1) {
				for(int j = 1; j <= 1; j++) { //반복 1회
					System.out.print("*");
				} 		
			} else if(i == 2) {
			   for(int j = 1; j <= 2; j++) { //반복 2회
				System.out.print("*");	
			}
		}
		*/
		for(int i = 1; i <= 5; i++) {
			
		for(int j = 1; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println(); //줄바꿈
		}
	  } // method16 메소드 영역 끝
	
	public void method17() {
		
		/*
		--- 2 단 ---
		2 X 1 = 2
		2 X 2 = 4
		2 X 3 = 6
		2 X 4 = 8
		2 X 5 = 10
		2 X 6 = 12
		2 X 7 = 14
		2 X 8 = 16
		2 X 9 = 18
		--- 3 단 ---
		3 X 1 = 3
		3 X 2 = 6
		3 X 3 = 9
		3 X 4 = 12
		3 X 5 = 15
		3 X 6 = 18
		3 X 7 = 21
		3 X 8 = 24
		3 X 9 = 27
		--- 4 단 ---
		4 X 1 = 4
		4 X 2 = 8
		4 X 3 = 12
		4 X 4 = 16
		4 X 5 = 20
		4 X 6 = 24
		4 X 7 = 28
		4 X 8 = 32
		4 X 9 = 36
		--- 5 단 ---
		5 X 1 = 5
		5 X 2 = 10
		5 X 3 = 15
		5 X 4 = 20
		5 X 5 = 25
		5 X 6 = 30
		5 X 7 = 35
		5 X 8 = 40
		5 X 9 = 45
		--- 6 단 ---
		6 X 1 = 6
		6 X 2 = 12
		6 X 3 = 18
		6 X 4 = 24
		6 X 5 = 30
		6 X 6 = 36
		6 X 7 = 42
		6 X 8 = 48
		6 X 9 = 54
		--- 7 단 ---
		7 X 1 = 7
		7 X 2 = 14
		7 X 3 = 21
		7 X 4 = 28
		7 X 5 = 35
		7 X 6 = 42
		7 X 7 = 49
		7 X 8 = 56
		7 X 9 = 63
		--- 8 단 ---
		8 X 1 = 8
		8 X 2 = 16
		8 X 3 = 24
		8 X 4 = 32
		8 X 5 = 40
		8 X 6 = 48
		8 X 7 = 56
		8 X 8 = 64
		8 X 9 = 72
		--- 9 단 ---
		9 X 1 = 9
		9 X 2 = 18
		9 X 3 = 27
		9 X 4 = 36
		9 X 5 = 45
		9 X 6 = 54
		9 X 7 = 63
		9 X 8 = 72
		9 X 9 = 81
		*/
		
		for(int i = 2; i <= 9; i++) {
			
			System.out.printf("--- %d단 --- \n", i);
			
			for(int j = 1; j <= 9; j++) {
				
				System.out.printf("%d x %d = %d \n", i, j, i * j);
			}
			
			System.out.println(); //줄바꿈
		}
		
	} // method17 메소드 영역 끝
	
	//숙제
	public void method18() {
		/*
		 * 사용자로부터 정수 2개를 입력받아
		 * 그 해당 정수 사이의 숫자들을 순차적으로 출력하는 프로그램을 작성
		 * 단, 두 정수가 일치한다면 "정수1과 정수2의 값이 같습니다"
		 *
		 * 예시)
		 * 정수1 입력 : 3
		 * 정수2 입력 : 9
		 * 3 4 5 6 7 8 9
		 *
		 * 정수1 입력 : 8
		 * 정수2 입력 : 5
		 * 5 6 7 8
		 *
		 * 정수1 입력 : 7
		 * 정수2 입력 : 7
		 * 정수1과 정수2의 값이 같습니다
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력  : " );
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(num1 != num2) {
		   
			if(num2 > num1) {
			
			for(int i = num1; i <= num2; i++) {
			
				System.out.print(i + " ");
			}
		} 
		 else if(num1 > num2) {
			 
			 for(int i = num2; i <= num1; i++) {
				 System.out.print(i + " ");
			 }
		  }
		} else {
			
			System.out.println("두 수가 같습니다.");
		}
		
	} // method18 영역 끝
	
	public void method19() {
		
		/*
		 * 사용자로부터 영문 문자열을 입력받아
		 * 각자리의 문자를 하나씩 출력하는 프로그램
		 * 예시)
		 * 영문 문자열을 입력하세요 : Hello
		 * 0번째 글자 : H
		 * 1번째 글자 : e
		 * 2번째 글자 : l
		 * 3번째 글자 : l
		 * 4번째 글자 : o 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문 문자열을 입력하세요 :");
		
		String n = sc.nextLine();
		
		for(int i = 0; i < 5; i++) {
			
			char c = n.charAt(i);
			
			System.out.println(i+"번째 글자는 "+c);
			
		}

	} //method19 메소드 작업 끝
	
}
	

