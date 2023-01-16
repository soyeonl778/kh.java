package com.kh.operator;

import java.util.Scanner;

public class E_Comparison {
	
	/*
	 * 비교연산자 (관계연산자) 
	 * 두개의 값을 가지고 비교해주는 연산자 
	 * => 비교 연산한 결과가 참일 경우 true / 거짓일 경우 false 값을 반환 
	 *    (숫자 기준으로 비교했을 때 숫자끼리 연산하면 논리값으로 결과가 나옴!)
	 * => 후에 특정 조건을 제시할 수 있는 "조건문"에서 많이 쓰일 예정
	 * 
	 * [종류]
	 * 크고 작음을 비교
	 * a < b : a 가 b 보다 작습니까?
	 * a > b : a 가 b 보다 큽니까?
	 * a <= b : a 가 b 보다 작거나 같습니까?
	 * a >= b : a 가 b 보다 크거나 같습니까?
	 * 
	 * 일치함을 비교
	 * a == b : a 와 b 가 일치합니까?
	 * a != b : a 와 b 가 일치하지 않습니까?
	 * 
	 */
	
	public void method1() {
		
		int a = 10;
		int b = 25;
		
		System.out.println("a > b : " + (a > b));
		// 비교연산보다 산술연산이 우선순위가 더 높기 때문에 
		//(a>b)는 괄호로 묶어 우선순위를 높여줘야 한다.
		System.out.println("a <= b : " + (a <= b)); // true
		
		boolean result1 = a == b; // false
		// 동등비교의 경우 대입연산보다 우선순위가 높기 떄문에 괄호를 표현하지 않아도 되지만
		// 가독성을 위해 (a==b) 처럼 괄호로 욲는 것을 권장한다.
		System.out.println("result1 : " + result1);
		
		boolean result2 = (a != b); // true
		System.out.println("result2 : " + result2);
		
		// 산술연산 + 비교연산
		System.out.println(a - b < 0); //true
		//a - b 의 결과가 0 보다 작습니까?
		
		// 산술연산 + 비교연산의 대표적인 예시
		// 어떤 값을 2로 나눴을 때의 나머지값이 0이냐 1이냐를 가지고
		//짝수인지 홀수인지 판별 가능
		// => 2로 나누었을 때 나머지가 0 이면 짝수, 1 이면 홀수
		
		System.out.println("a 가 짝수입니까? : " + (a % 2 == 0)); // true
		System.out.println("b 가 홀수입니까? : " + (b % 2 == 1)); // true
		
	} // method1 메소드 영역 끝
	
	// 연습문제
	
	public void method2() {
		
		/*
		 * 사용자로부터 정수값 한 개를 입력받아 해당 값이 조건을 만족하는지 출력
		 * 
		 * 예시)
		 * 정수값 한개 입력 : 20
		 * 사용자가 입력한 값은 양수입니까? : true
		 * 사용자가 입력한 값은 짝수입니까? : true
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한개 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("사용자가 입력한 값은 양수입니까? : " + (num > 0));
		System.out.println("사용자가 입력한 값은 짝수입니까? : " + (num % 2 == 0));
		





	}

}
