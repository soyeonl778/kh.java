package com.kh.practice2.example;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice4() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의
		//모든 숫자를 거꾸로 출력하세요. 단, 입력한 수는 1보다 크거나 같아야 한다
		// ex) 1이상의 숫자를 입력하세요 : 4
		// 4 3 2 1
		// 1이상의 숫자를 입력하세요 : 0
		// 잘못 입력하셨습니다.
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		// n에서 -1씩 빠지면서 출력하려면?
		if(n < 1) {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			continue;
		} 
		for(int i = n; i >= 1; i--) {
			
			System.out.print(i + " ");
		} break;
		}
	
	} // practice4 메소드 영역 끝
	
	public void practice11() {
		
		//사용자로부터 시작 숫자와 공차를 입력받아
		//일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하시오
		//단, 출력되는 숫자는 총 10개 입니다.
		//ex)
		//시작 숫자 : 4
		//공차 : 3
		// 4 7 10 13 16 19 22 25 28 31
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("공차 : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print(a+" ");
			
			a += b;

		}
		
	}

}
