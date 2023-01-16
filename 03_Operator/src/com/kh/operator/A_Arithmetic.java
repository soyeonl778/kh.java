package com.kh.operator;

public class A_Arithmetic {
	
	/*
	 * 산술연산자
	 * 이항 연산자로써 연산 방법과 우선순위가 일반 수학 산술과 동일한 연산자
	 * 
	 * 산술 연산자의 종류
	 * 덧셈 => +
	 * 뺄셈 => -
	 * 곱셈 => *
	 * 나눗셈 => / (나눗셈에서 "몫"을 구함)
	 * 모듈러(Modular) => % (나눗셈에서 "나머지"를 구함)
	 * 
	*/
	
	public void method1() {
	
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		// 괄호를 묶지 않는다면
		//String 처럼 각각 숫자 10과 3을 문자열처럼 나열되기 때문에 103이 나옴.
		
		System.out.println("num1 - num2 = " + (num1 - num2));
		// 뺄셈의 경우 괄호로 묶어주지 않으면
		// string 처럼 각각 숫자 10, 3 과 -를 따로 인식하기 때문에 문법적 오류가 발생
		// => 우선순위가 동일할 경우에는 왼쪽부터 차례대로 실행되기 때문에
		//    문자열 + 숫자 - 숫자 => 문자열 - 숫자 로 인식됨
		// (num1 - num2) 처럼 괄호로 묶어줘야함!!
		
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		
		System.out.println("num1 % num2 = " + (num1 % num2));
		// 곱셈 과 나눗셈 , 모듈러의 경으 덧셈보다 우선순위가 높기 때문에
		// 괄호로 묶지 않아도 정확한 결과가 나옴
		// => 단, 가독성을 위해 모든 연산시 괄호로 묶는걸 권장
		
		//나눗셈, 모듈러 연산 시 주의할 점
		//System.out.println(10 / 0);
		//System.out.println(10 % 0);
		// java.lang.ArithmeticException / by zero 라는 오류가 발생
		// => 수학과 마찬가지로 0으로 나누기는 불가!! 주의해야한다.
		
		double a = 35; // 35 -> 35.0
		double b = 10; // 10 - 10.0
		
		System.out.println("a + b = " + (a + b)); //45.0
		System.out.println("a - b = " + (a - b)); //25.0
		System.out.println("a * b = " + (a * b)); //350.0
		System.out.println("a / b = " + (a / b)); //3.5
		System.out.println("a % b = " + (a % b)); //5.0
		// 실수끼리의 실행결과는 실수

		
	} // method1 메소드 영역 끝
	
	//연습문제
	public void method2() {
		
		/*
		 * 인원수 , 사탕의 갯수를 키보드 입력 받고
		 * 1인당 통일하게 나눠가진 사탕의 갯수와 나눠주고 남은 사탕의 갯수
		 * 
		 * 예시
		 * 인원수 : 5
		 * 사탕갯수 : 164
		 * ------------
		 * 1인당 사탕 갯수 : 
		 * 나눠주고 남은 사탕 갯수 :
		 */
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		
		System.out.print("인원수 : ");
		int person = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사탕갯수 : ");
		int candy = sc.nextInt();
		sc.nextLine();
		
		System.out.println("-------------");
		
		System.out.println("1인당 사탕 갯수 : " + (candy / person));
		
		System.out.println("나눠주고 남은 사탕 갯수 : " + (candy % person));
		
		
		
		
		
		
	}
}
