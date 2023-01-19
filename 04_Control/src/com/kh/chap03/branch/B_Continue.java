package com.kh.chap03.branch;

public class B_Continue {
	
	/*
	 * continue 문
	 * 반복문 안에서 사용하는 구문
	 * continue; 을 만나게되면 그 뒤에 어떤 구문이 있든간에 신행하지 않고
	 * 가장 가까운 반복문으로 올라가겠다 라는 의미
	 * 
	 * [표현법]
	 * continue;
	 */
	
	public void method1() {
		
		// 1부터 10까지 홀수만을 출력
		// "1 3 5 7 9"
		
		// 방법1. i 변수에 애초에 홀수만 담기게 유도하는 방법
		/*
		 * for(int i = 1; i <= 10 ; i += 2) { //5회반복
			System.out.print(i + " ");
		}
		*/
	/*	
		// 방법2. 10까지 반복을 돌리되, 홀수일 경우만 출력는 방법
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) { //홀수일 경우
			System.out.print(i + " ");
		}
	}
	*/

	//방법3. continue 문을 사용하는 버전
	for(int i = 1; i <= 10; i++) { //10회반복
		
		if(i % 2 == 0) { //짝수인 경우
			
			continue; // 컨티뉴 걸어놓은 코드는 실행하지 않고 다음 증감식으로 넘어감
		}
		
		System.out.print(i + " "); // 짝수일 경우에는 if문에서 false이기 때문에 바로 여기로 나오기에 바로 출력한것
		
	}
	
	} //method1 메소드 영역 끝
	
	public void method2() {
		
		// 1부터 100까지의 총 합계
		// 단, 6의 배수값은 제외하고 더해보자
		
		int sum = 0;
		
		// continue 를 안쓴 버전
		
		/*
		for(int i = 1; i <= 100; i++) {
			
			if(i % 6 != 0) { //6의 배수가 아닌경우 덧셈 진행
				sum += i;
			}
		}
		System.out.println("sum : " + sum);
		*/
		
		//continue 를 쓴 버전
		for(int i = 1; i <= 100; i++) {
			
			if(sum % 6 == 0) { //6의 배수인 경우 건너뛰겠다.
				continue;				
			}
			sum += i;
		}
		
		
		System.out.println("sum : " +sum);
		
	} //method2 메소드 영역 끝
	
	//실습문제
	
	public void method3() {
		
		//2단에서 ~ 9단까지 출력하긴 하되, 4의 배수단은 제외하고 출력하기(4단, 8단)
		
		for(int i = 2; i <= 9; i++) {
			
			if(i % 4 == 0) { //4의 배수라면 => 스킵
			continue;
		
			}
			System.out.printf("-----%d단----- \n", i);				
				
		    for(int j = 1; j <= 9; j++) {
			System.out.printf("%d * %d = %d \n", i, j, i * j);
			
		}
		
	}
		
	}	
		
		
}
