package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * if-else문
	 * 
	 * [표현법]
	 * if(조건식) {
	 *      조건식의 결과가 true 일 경우 실행할 코드;
	 * } else {
	 * 
	 *      조건식의 결과가 false 일 경우 실행할 코드;
	 * }
	 * 
	 * => 조건식의 결과가 true 일 경우 if 블럭 안의 내용이 실행되고, if-else 블럭 자체를 빠져나감
	 * => 조건식의결과가 false 일 경우 무조건 else 블럭 안의 내용이 실행된 후 빠져나감
	 */
	
	public void method1() {
		
		// 사용자에게 정수값을 입력받은 후 짝수 / 홀수 출력(양수일경우만 실행되게끔)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 양수인지 먼저 판별하기
		if(num > 0) { //양수일 경우
			
			// 짝수인지 홀수인지 판별하기
			// 조건식 결과가 true 이면 else 블럭은 건너뛴다.
			// => 단독 if문을 두번 쓰는 것보다 불필요한 연산이 줄어들어 조금 더 효율적이다.
			// => else 블럭에서는 별로의 조건을 내세울 필요가 없음!!
			
			
			if(num % 2 == 0) { //짝수일 경우
				
				System.out.println("짝수입니다");
				
			} else { //짝수가 아닐 경우
				
				System.out.println("홀수입니다");
			}
			
		} else { // 양수가 아닐경우
			
			System.out.println("양수를 입력해야 합니다.");
			
		}
		/*// else 대신 단독 if 문도 가능
		 * if(num <= 0) {
		 * 
		 *        System.out.println("양수를 입력해야 합니다")
		 *  }      
		 */
		
	} //method1 메소드 영역 끝
	
	/*
	 *  if-else if문
	 *  동일한 비교대상을 가지고 여러 개의 조건을 제시해 두고자 할 때 사용
	 *  
	 *  [표현법]
	 *  if(조건식1) {
	 *  
	 *       조건식1이 true 일 경우 실행할 코드;
	 * } else if(조건식2) {
	 *          
	 *       조건식2 가 true 일 경우 실행할 코드;
	 * } else if(조건식3) {
	 * 
	 *      조건식4 이 true 일 경우 실행할 코드;
	 * } else {
	 * 
	 *      앞의 조건들이 모두 false 일 경우 반드시 실행할 내용이 있을 경우 실행할 코드;
	 * }
	 * 
	 */
	
	public void method2() {
		
		// 사용자에게 정수를 입력받고 양수 / 0 / 음수인지 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) { // 양수일 경우
			
			System.out.println("양수입니다");
			
		} else if(num == 0) { // 0인 경우
			
			System.out.println("0입니다");
			
		} else { // 양수도 아니고 0도 아닐경우 => 음수일 경우
			
			System.out.println("음수입니다");
			
		}
		
		/* else if(num < 0) {
			
			System.out.println("음수입니다");
			
		} */
				
		} // method2 메소드 영역 끝
	
	public void method3() {
		
		// 사용자에게 나이를 입력받아 어린이 / 청소년 / 성인 판별 후 출력
		// 어린이 (0~13세이하), 청소년(13세초과~19세이하), 성인(19세초과)
		// 단, 나이를 음수로 입력했을 경우 "잘못 입력했습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		// 우선적으로 나이가 음수인지부터 판별
		if(age < 0) { // 음수일 경우
			
			System.out.println("잘못 입력했습니다");
		} else { //음수가 아닐경우
			
			// 어린이, 청소년, 성인인지 판별하기
			if(age <= 13) { //어린이일 경우
				//이미 앞에서 age < 0  조건이 false 임이 밝혀졌음
				// age >= 0 조건을 또 작성할 필요가 없음
				
				System.out.println("어린이입니다");
			} else if(age <= 19) {
				
				System.out.println("청소년입니다");
				
			} else { 
				
				System.out.println("성인입니다");
			}
		} 
		
	} // method3 메소드 영역 끝
	
	//실습문제
	
	public void method4() {
		
		/*
		 * 사용자로부터 정수 형태의 점수를 입력받기
		 * 90점 이상일 경우 "A등급"
		 * 90점 미만 80점 이상일 경우 "B등급"
		 * 80점 미만 70점 이상일 경우 "C등급"
		 * 70점 미만일 경우 "D등급"
		 * 
		 * 예시)
		 * 점수를 입력하세요 : 
		 * 당신의 점수는 89점이고, 등급은 B등급입니다. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int point = sc.nextInt();
		sc.nextLine();
		
		String grade = "";
		/*char grade = '(공백)'; // char 자료형의 경우 일반적으로 ' '(공백)으로 초기화
		 * 
		 * 
		 */
		
		if((point <= 100) && (point >= 0)) {
			
			
			
		} else {
			
			if(point >= 90) {
				
				grade = "A";
						
			} else if(point >= 80) {
				
				grade = "B";
				
			} else if(point >= 70) {
				
				grade = "C";
				
			} else {
				
				grade = "D";
			}
			
		}
		System.out.println("잘못 입력했습니다");
		System.out.print("당신의 점수는 " + point + "점 이고, 등급은 " + grade + "등급 입니다.");
	}


}
