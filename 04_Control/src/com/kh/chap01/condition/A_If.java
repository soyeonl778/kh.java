package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * 단독 if문
	 * 
	 * [표현법]
	 * if(조건식) {
	 *           조건식이 true 일 경우 실행할 코드
	 * }
	 * 
	 * => 조건식의 결과가 참(true) 일 경우 중괄호 블록 안의코드가 실행
	 * => 조건식의 결과가 거짓(false) 일 경우 중괄호 블록안에 코드를 무시하고 건너뜀
	 */
	
	//삼항연산자를 조건문으로 바꿔보기
	
	public void method1() {
		
		//사용자에게 정수값을 입력받은 후
		// "양수입니다", "0입니다", "음수입니다"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		//삼항연산자 버전
		// String result = (num > 0) ? "양수입니다" : ((num == 0) ? "0입니다" : "음수입니다");
		
		//단독 if 버전
		String result = ""; // 결과 문구를 담을 변수를 미리 ""(문자열)로 셋팅
		
		
		if(num > 0) { //양수일 경우
			
			result = "양수입니다";
		}
			
		if(num == 0) { // 0일 경우
			
			result = "0입니다";
		}
		
		if(num < 0) { //음수입니다
			
			result = "음수입니다";
		}	
		
		System.out.println(result);
		
	} //method1 메소드 영역 끝
	
	public void method2() {
		
		// 사용자가 입력한 정수값이 짝수인지 홀수인지 판별 후 출력
		// => 사용자가 입력한 양수값이 짝수인지 홀수인지 판별 후 출력
		// => 기본 전제조건 : 양수
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		/*
		if((num > 0) && (num % 2 == 0)) { // 양수 중에서도 짝수일 경우
		
			System.out.println("짝수입니다");
			
		}
		
		if((num > 0) && (num % 2 == 1)) { // 양수중에서도 홀수일 경우
			
			
			System.out.println("홀수입니다");
		}
		*/
		
		// 중첩 if문
		// => 결과는 동일
		if(num > 0) { //우선적으로 짝수인지 홀수인지 판별하기 전에 양수인지부터 판별하기
			
			// num 이 양수라면 그제서야 짝수인지 홀수인지 판별하겠다.
			if(num % 2 == 0) { //짝수일 경우
				
				System.out.println("짝수입니다");
			}
			
			if(num % 2 == 1) { // 홀수일 경우
				
				System.out.println("홀수입니다");
			}
		}
		
		
		
		
		
	} //method2 메소드 영역 끝
	
	public void method3() {
		
		// 사용자가 입력한 나이값을 가지고 어린이 / 청소년 / 성인 출력
		// 어린이(13세 이하), 청소년(13세 초과 ~19세 이하), 성인(19세 초과)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이입력 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
 		if((age > 0) && (age <= 13)) { //어린이일 경우(0초과 ~13세 이하)
 			
 			System.out.println("어린이입니다");
 		}
 		
 		if((13 < age) && (age <= 19)) {
 			
 			System.out.println("청소년입니다");
 		}
		
		if(age > 19) {
			
			System.out.println("성인입니다");
		}
		
	} // method3 메소드 영역 끝
	
	public void method4() {
		
		// 사용자에게 입력받은 주민번호를 가지고 남자 / 여자 판별 후 출력
		// 주민번호 : yymmdd-x000000
		//=> 1/3 이면 남자, 2/4 이면 여자
		
		// 1. 사용자에게 주민번호 입력받기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 입력(-포함) : ");
		String personId = sc.nextLine(); // "771231-1xxxxxx"
		
		// 2. 입력받은 주민번호로 부터 성별에 해당되는 문자 (7번 인덱스) 만 추출
		char gender = personId.charAt(7); // '1'
		
		// 3. 성별에 해당되는 문자가 1 또는 3 일 경우 => "남자입니다" 출력
		//    성별에 해당되는 문자가 2 또는 4 일 경우 => "여자입니다" 출력
		
		if((gender == '1') || (gender == '3')) {
			
			System.out.println("남자입니다");
		}
		
		if((gender == '2') || (gender == '4')) {
			
			System.out.println("여자입니다");
		}
		
		// 성별자리가 '1' 이 아니고 그리고 '2' 도 아니고 그리고 '3' 도 아니고 그리고
		// '4'도 아닐경우 => 이런 주민등록번호는 이세상에 없덴다ㅡㅡ
		
		if((gender != '1') && (gender != '2') && (gender != '3') && (gender != '4')) {
			
			System.out.println("잘못된 주민번호를 입력했습니다.");
		}
		

	}
	
	

}
