package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		  
		
	
	}	
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double a = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("영어 : ");
		double b = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("수학 : ");
		double c = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("총점 : " + (int)(a+b+c));
		System.out.println("평균 : " + (int)(a+b+c)/3);
		
	}
	
	
	
	
	
	
	
	/*public void method2() {
		
		//실수형으로 국어, 영어, 수학 세과목 점수를 입력 받아 총점과 평균 구하기.
		//이때 총점과 평균은 정수형으로 처리
		
		/*
		 * 국어 : 90.0 
		 * 영어 : 90.0 
		 * 수학 : 90.0
		 * 
		 * 총점 : 270 
		 * 평균 : 90
		 */
		/*
		double korean = 90;
		System.out.println("국어 : " + korean);
		
		double english = 90;
		System.out.println("영어 : " + english);
		
		double math = 90;
		System.out.println("수학 : " + math);
		
		System.out.println();
		
		double total = (int) korean + english + math;
		System.out.println("총점 : " + total);
		
		double average = (int) total/3;
		System.out.println("평균 : " + average);
	
	} // method2 메소드 영역 끝
	*/
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		double a = (int)num * num * 3.14;
		double b = (int)num * 2 * 3.14;
		
		
		System.out.printf("면적 : %.1f \n", a);
		System.out.printf("둘레 : %.1f", b);
		
		//반지름 값을 정수형으로 입력받아
		//원의 면적과 둘레를 계산하여 실수형으로 출력하시오.
		//(면적=반지름 * 반지름 * 3.14, 둘레 =반지름 * 2 * 3.14)
		/*
		 * ex)반지름: 5
		 * 
		 * 면적 : 78.5 
		 * 둘레 : 31.4
		 */
		/*
		int radius = 5;
		
		double extent = (int) radius * radius * 3.14;
		double circum = (int) radius * 2 * 3.14;
		
		System.out.println("반지름 : " + radius);
		System.out.println();
		System.out.println("면적 : " + extent);
		System.out.println("둘레 : " + circum);
		*/
	}

} //method4 메소드 영역 끝
