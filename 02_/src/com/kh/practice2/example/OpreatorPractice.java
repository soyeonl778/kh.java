package com.kh.practice2.example;

import java.util.Scanner;

public class OpreatorPractice {
	
	public void practice1() {
		
		//키보드로 입력받은 하나의 정수가 양수이면 "양수다, 아니다"를 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String result = (num > 0) ? "양수입니다" : "양수가 아닙니다";
		System.out.printf("%d 은(는) %s. \n", num, result  );
		
	} //practice1 메소드 영역 끝
	
	public void practice2() {
		
		//키보드로 입력받은 하나의 정수가 양수이면 "양수다"
		//양수가 아닌 경우 0이면 "0이다" 0이 아니면 "음수다"를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String result = (num > 0) ? "양수다" : ((num == 0) ? "0이다" : "음수다"); 
		System.out.println(result);
		
	} //practice2 메소드 영역 끝
	
	public void practice3() { 
		
		//키보드로 입력 받은 하나의 정수가 짝수이면 "짝수다", 짝수가 아니면 "홀수다"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println((num % 2 == 0) ? "짝수다" : "홀수다");

	} //practice3 메소드 영역 끝
	
	public void practice4() {
		
		//인원수와 사탕 개수를 키보드 입력 받고
		// 1인당 사탕개수, 남는 사탕개수 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 : ");
		int person = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		sc.nextLine();
		
		System.out.println("1인당 사탕개수 : " + (candy / person));
		System.out.println("남는 사탕개수 : " + (candy % person));
		
	} //practice4 메소드 영역 끝
	
	public void practice5() {
		
		//키보드로 입력받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하시오
		//이 때 성별이 'm'이면 남학생, 'm'이 아니면 여학생으로 출력 처리 하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("반(숫자만) : ");
		int group = sc.nextInt();
		sc.nextLine();
		
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print(((ch == 'M') ? "남학생" : "여학생"));
		
	} //practice5 메소드 영역 끝
	
	public void practice6() {
		
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		for(int i = 5; i >= 1; i--) {
			
			for(int j = 1; j <= 5; j++) {
				
				if(j>=i) {
					System.out.print("*");
					
				} else {
					
					System.out.print(" ");
				}
			}
			}
			System.out.println();
	} 
		// practice6 메소드 영역 끝
	
		public void practice7() {
			
			for(int i = 0; i < 5; i++) {
				
				for(int j = 1; j <= 5; j++) {
					
					if(i < j) {
						System.out.print("*");
						
					} else {
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	
		
	}
}
