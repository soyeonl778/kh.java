package com.kh.operator;

import java.util.Scanner;


public class F_Logical {
	
	/*
	 * 논리 연산자 
	 * 두 개의 논리값을 연산하는 연산자
	 * 
	 * [표현법] 
	 * 논리값 (논리 연산자) 논리값 
	 * => 결과값도 논리값
	 * 
	 * [종류] 
	 * AND 연산자 : 논리값 && 논리값(그리고, 이면서, ~이고)
	 * 			  = 왼쪽, 오른쪽 둘 다 true 여야지만 결과가 true
	 * OR 연산자 : 논리값 || 논리값(또는, ~이거나)
	 * 			  => 왼쪽, 오른쪽 둘 중 하나라도 true 이면 결과가 true
	 * 
	 */
	
	public void method1() {
		
		// 사용자가 입력한 정수값이 양수  " 이면서" 짝수인지 판별하기

		Scanner sc =  new Scanner(System.in);
		
		System.out.print("정수값 한개 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		boolean result = (num > 0) && (num % 2 == 0);
		//&& 의미 : 그리고, ~이면서, ~이고
		
		System.out.println("사용자가 입력한 값이 양수이면서 짝수입니까? : " + result);
		
	} // method1 메소드 영역 끝
	
	public void method2() {
		
		//사용자가 입력한 정수값이 1 이상 100 이하의 수인지 판별하기
		// 이상 : 크거나 같다
		// 이하 : 작거나 같다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한개 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 1 <= num <= 100 이렇게 수학처럼 묶어서 범위의 크기를 표현할 수 없다.
		// => 사용자가 입력한 정수값이 1보다 크거나 같고, "그리고" 100보다 작거나 같습니까?
		boolean result = (num >= 1) && (num <= 100);
		System.out.println("사용자가 입력한 값이 1이상 100이하 입니까? : " + result);
		
	} // method2 메소드 영역 끝
	
	public void method3() {
		
		// 사용자가 입력한 값이 y "이거나 Y 인지 판별하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계속 하시려면 y 또는 Y를 입력하세요 : ");
		
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		// || 의미 : 또는, ~이거나
		
		System.out.println("사용자가 입력한 값이 y 또는  Y입니까? : " + result);

	} // method3 메소드 영역 끝
	
	public void method4() {
		
		/*
		 * && : AND 연산, 두 개의 조건이 모두 true 여야 결과값이 true
		 * true && true == true
		 * true && false == false
		 * false && true == false
		 * false && false == false
		 * 
		 * || : OR 연산, 두 개의 조건 중 하나라도 true 면 결과값이 true
		 * true || true == true
		 * true || false == true
		 * false|| true == true
		 * false || false == false
		*/
		
		int num1 = 10;
		
		boolean result1 = false && (num1 > 0);
		// 뒤의 비교연산 구문이 Dead code 라고 뜬다.
		// 실행 시 오류가 나지는 않지만
		// 굳이 결과값은 false 일텐데 왜 뒤의 구문을 쓰는지 물어보는 것.

		System.out.println("result1 : " + result1);
		
		boolean result2 = true || (num1 > 0);
		// 실행 시 오류가 나지는 않지만
		// 굳이 결과값은 true 일텐데 왜 뒤의 구문을 쓰는지 물어보는것
		
		System.out.println("result2 : " + result2);
		
	}

}
