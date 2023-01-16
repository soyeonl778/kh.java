package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 * 삼항 연산자
	 * 3개의 항목을 가지고 연산하는 연산자
	 * 조건 판별 후 조건에 알맞는 값을 반환하는 역할
	 * 
	 * [표현법]
	 * (조건식) ? (조건이 true 일 경우의 결과값) : (조건이 false일 경우의 결과값)
	*/
	
	public void method1() {
		
		// 사용자가 입력한 정수값이 양수인지 아닌지를 판별 후 그에 맞는 결과를 출력
		// true => "양수입니다" / false => " 양수가 아닙니다" 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 결과값이 String 이기 때문에 String 변수를 선언해서 삼항연산자 이용해보기
		// String result = (num > 0) ? "양수입니다" : "양수가 아닙니다";	
		// System.out.println(num + "은" + result);
		
		//System.out.println(num + "은" + ((num > 0) ? "양수입니다" : "양수가 아닙니다"));
		System.out.println(num + "은" + ((num <= 0) ? "양수가 아닙니다" : "양수입니다"));
		
		/*
		 * 삼항 연산자 사용 시 주의할 점
		 * 1. 산술연산이 삼항연산보다 우선순위가 높으므로 산술연산과 같이 쓸 경우 괄호로 묶어 우선순위를 높여야 함
		 * 2. 결론적으로 같은 결과를 출력하지만 조건에 따라 참 거짓 결과가 다르므로 : 기존으로 왼쪽과 오른쪽의 내용이 다를 수 있음 
		*/
	
	} // method1 메소드 영역 끝
	
	public void method2() {
		
		//사용자가 입력한 정수값이 짝수인지 홀수인지 판별 후 출력
		// 짝수일 경우 => "짝수입니다" / 홀수일 경우 => "홀수입니다"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String result = (num % 2 == 0) ? "짝수입니다" : "홀수입니다";
		System.out.printf("%d 은(는) %s. \n", num, result);
		
	} //method2 메소드 영역 끝
	
	public void method3() {
		
		// 사용자로부터 영문자 하나를 입력받아 대문자인지 대문자가 아닌지 판별 후 출력
		// =>아스키코드표(각 문자마다 고유한 숫자값을 가지고 있음)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 한문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// ch 가 대문자 범위에 포함이 되어있는 검사
		// 대문자 범위 : 'A' ~ 'Z'
		// 숫자 범위 : 65 ~ 90
		// 65 <= ch <= 90 -> (ch >= 65) && (ch <= 90) -> (ch >= 'A') && (ch <= 'Z')
		//(char 와 int 사이에는 "자동형변환" 이 일어남)
		String result = ((ch >= 'A') && (ch <= 'Z')) ? "대문자 입니다" : "대문자가 아닙니다";
		System.out.printf("%c 은(는) %s. \n", ch, result);
		
	} // method3 메소드 영역 끝
	
	//삼항 연산자 "중첩" 사용
	
	public void method4() {
		
		//method1() 의 내용을 보환
		//사용자가 입력한 정수값이 양수인지, 0인지, 음수인지 판별 후 그에 맞는 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String result = (num > 0) ? "양수입니다" : ((num == 0) ? "0 입니다" : "음수입니다");
		System.out.printf(result);
		
		
	} // method4 메소드 영역 끝
	
	// 숙제
	public void method5() {
		
		/*
		 * 두 개의 정수값과 '+' 또는 '-'의 문자를 하나 입력받아 
		 * + 일 경우 두 정수값의 덧셈 연산한 결과 
		 * - 일 경우 두 정수값의 뺄셈
		 * 연산한 결과 둘 다 아닌 경우 "잘못입력했습니다."출력
		 * 
		 * 예시)
		 * 연산자 입력(+ or -) : -
		 * 첫번째 정수 : 9
		 * 두번째 정수 : 2
		 * 잘못입력했습니다.
		 * 
		 * 힌트) 각 결과에 따른 값들이 자료형이 다름!
		 */
		
	} // method5 메소드 영역 끝
	
	//숙제
	public void method6() {
		
		/*
		 * 사용자로부터 나이를 키보드로 입력 받아 각 나이 구간에 맞는 명칠을 출력하기
		 * 13세 이하까지는 "어린이"
		 * 13세 초과~ 19세 이하까지는 "청소년"
		 * 19세 초과부터는 "성인"
		 * 
		 * 예시)
		 * 나이를 입력하세요 : 6 
		 * 어린이입니다.
		 * 
		*/		
		
	} // method6 메소드 영역 끝
	
	
	
	
	
	

}
