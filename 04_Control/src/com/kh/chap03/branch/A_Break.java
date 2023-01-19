package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	
	/*
	 * break문
	 * 반복문을 보조하는 분기문 중에서 "가장 가까운 반복문"을 빠져나가는 구문
	 * break; 구문을 만나는 순간 해당 break; 가 속해힜는 반복문을 "한 겹" 빠져나감!!
	 * 
	 * [표현법]
	 * break;
	 * 
	 * 주의할점 : switch문 안의 break 와는 다른 개념
	 *         switch문 안의 break는 해당 switch문을 빠져나가는 용도일 뿐
	 */
	
	public void method1() {
		
		// 매번 반복적으로 새로이 발생되는 랜덤값 (1 ~ 100) 출력
		// 단, 그 랜덤값이 홀수일 경우에는 반복문을 빠져나가게끔(무한반복을 종료시키겠다)
		
		while(true) {
			
		int random = (int)(Math.random() * 100 + 1);
		
		System.out.println("random : " + random);
			
		// 발생된 랜덤값이 홀수인지 판별
		if(random % 2 == 1) { //홀수일 경우
			System.out.println("홀수가 발생했습니다. 프로그램을 종료합니다.");
			//break;
			return; //물론 return 구문을 이용해서 무한반복을 종료시킬수는 있지만
			        //하지만 만약에 해당 반복문 아래의 추가적인 구문들을 실행하고 싶다면
			        //return 구문을 쓰는게 적합하지는 않음!!
			
			
		}
		
	 }
		
	// break; 구문을 만나는 순간 이 시점으로 이동
	// System.out.println("반복문을 잘 빠져나왔나..?");
	// return; 구문으로 반복을 종료 할 경우
		
		
		
		
	
   } //method1 메소드 영역 끝
	
	public void method2() {
		
		// 매번 사용자에게 문자열을 입력받은 후 해당 문자열의 길이 (문자열.length()) 출력
		// 단, 사용자가 입력한 문자열이 "exit" 문자열과 일치할 경우 반복을 종료
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			//문자열의 길이를 출력하기 전 우선적으로 이 문자열의 내용물이 "exit" 인지부터 판별
			
			if(str.contentEquals("exit")) { //일치한다면
				
				break;
			}
			
			System.out.println(str + "의 길이 : " + str.length());
	
		}
		
		System.out.println("프로그램이 종료됩니다.");
		// 만약 위의 무한반복이 끝나지 않는다면
		// 마찬가지로 이 시점의 코드들은 Unreachable Code 가 되어버림
		
	} // method2 메소드 영역 끝
	
	public void method3() {
		
		// 매번 반복적으로 사용자에게 양수를 입력받아 1 ~ 사용자가 입력받은 양수까지 출력
		// 단, 사용자가 정상적이지 않은 수 (양수가 아닌 수) 를 입력했을 때
		// 제대로 된 양수를 입력받을 때까지 돌리기!! (양수 입력 후 출력 후 반복을 빠져나가겠다)
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("양수 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			// 양수일 경우 => 1 ~ num 까지 순차적으로 출력하기 => 반복을 빠져나가게끔
			// 양수가 아닐 경우 => 다시 반복이 일어나게끔
			if(num > 0) { //양수일 경우
				
				for(int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				
				break; // 내가 포함된 반복문은 한겹을 빠져나감 => while문으로 빠져나감
			
			} else { //양수가 아닌 경우
				
				System.out.println("잘못입력했습니다. 다시 입력해주세요.");
				
			} 
			
		}
				
	}


}
