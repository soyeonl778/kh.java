package com.kh.practice2.example;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		/*
		 * 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 "ㅇㅇ메뉴입니다"를 
		 * 종료 번호를 누르면 "프로그램이 종료됩니다." 를 출력하세요.
		 * ex)
		 * 1. 입력
		 * 2. 수정
		 * 3. 조회
		 * 4. 삭제
		 * 9. 종료
		 * 메뉴번호를 입력하세요 : 
		 * 조회 메뉴입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴번호를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String result = "";
		
		switch(num) {
		case 1 : result = "입력"; break;
		case 2 : result = "수정"; break;
		case 3 : result = "조회"; break;
		case 4 : result = "삭제"; break;
		case 9 : System.out.println("프로그램이 종료됩니다."); 
		return;
		default : System.out.println("다시 입력해주세요.");
		return;
		}
		 
		System.out.println(result + "메뉴 입니다.");
	} // practice1 메소드 영역 끝.
	
	public void practice2() {
		
		/*
		 * 키보드로 정수를 입력받아 정수가 양수이면서 짝수일때 "짝수" 를 출력하고 
		 * 짝수가 아니면 "홀수다"를 출력하시오. 양수가 아니면
		 * "양수만 입력해주세요" 를 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		if(0 > num) {
			System.out.println("양수만 입력해주세요.");
			
		} else if(num % 2 == 0) {
			System.out.println("짝수");
			
		} else {
			System.out.println("홀수");
		}
		
	} //practice2 메소드 영역 끝
	
	public void practice3() {
		
		/*
		 * 국어, 영어, 수학 세과목의 점수를 키보드로 입력받고 
		 * 합계와 평균을 계산하고 합계와 평균을 이용하여 
		 * 합격/불합격 처리하는 기능을 구현하세요
		 * (합격조건 :세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상)
		 * 합격했을경우 "축하합니다, 합격입니다!" 를 출력하고
		 * 불합격인 경우에는 "불합격입니다." 를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		sc.nextLine();
		
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		sc.nextLine();
		
		int total = korean + math + english;
		double average = (int) total / 3;
		
		if((korean >= 40 || math >= 40 || english >= 40) && (average >= 60)) {
		
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + average);
			System.out.println("축하합니다, 합격입니다!");
			
		} else {
				
				System.out.println("불합격입니다.");			
		}
		
	}	//practice3 메소드 영역 끝
	
	public void practice4() {
		
		/*
		 * 아
		 */
		
		
	}

}
