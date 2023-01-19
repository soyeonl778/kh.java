package com.kh.chap02.loop;

public class B_While {
	
	/*<While문>
	 *
	 * [ 표현법 ]
	 * 초기식;	
	 * while(조건식) {
	 *
	 * 반복적으로 실행할 코드;
	 * 증감식;
	 * }
	 * => 초기식과 증감식은 필수는 아님
	 *
	 * => 조건식의 연산 결과가 true일 경우 해당 반복적으로 실행할 코드를 실행함
	 * => 해당 코드를 실행하고 닫는 중괄호를 만나는 순간 다시 위의 조건식으로 올라가서 조건검사를 진행함
	 * => 조건식의 연산 결과가 false인 경우에는 while문을 빠져나가게 됨
	 * => 무한 반복을 돌리고 싶다면 while(true)로 표현함
	 *
	 */
	
	public void method1() {
		
		 // 안녕하세요" 5번 출력
		 /*
		 for(int i = 0; i < 5; i++) {
		 System.out.println((i + 1) + ". 안녕하세요.");
		 }
		 */
		 // while문 버전
		 int i = 0;
		 while(i < 5) { // 조건식
		 System.out.println("안녕하세요.");
		 i++; // 증감식
		 }
		 // 마지막 i 값을 출력
		 System.out.println("i : " + i); // i = 5
		 /* i : 0 -> i < 5(true) -> "안녕하세요." -> i++;
		 /* i : 1 -> i < 5(true) -> "안녕하세요." -> i++;
		 /* i : 2 -> i < 5(true) -> "안녕하세요." -> i++;
		 /* i : 3 -> i < 5(true) -> "안녕하세요." -> i++;
		 /* i : 4 -> i < 5(true) -> "안녕하세요." -> i++;
		 /* i : 5 -> i < 5(false) ->
		 *
		 */
		 //i = 5
		 while(i >= 1) {
		 System.out.println("안녕히가세요.");
		 i--;
		 }
		 System.out.println("i : " + i);
		 /*
		 * i : 5 -> i >= 1(true) -> "안녕히가세요." -> i++;
		 * i : 4 -> i >= 1(true) -> "안녕히가세요." -> i++;
		 * i : 3 -> i >= 1(true) -> "안녕히가세요." -> i++;
		 * i : 2 -> i >= 1(true) -> "안녕히가세요." -> i++;
		 * i : 1 -> i >= 1(true) -> "안녕히가세요." -> i++;
		 * i : 0 -> i >= 1(false)
		 *
		 * 마지막 i의 값은?? 0
		 */
			}
			
	public void method2() {
		
		 // "1 2 3 4 5" 출력
		 /*
		 int i = 1; // 초기식
		 while(i <= 5) {
		 System.out.print(i + " ");
		 i++; /
		 }
		 */
		 int i = 1;
		 while(i <= 5) {
		 System.out.print(i++ + " ");
		 }
		 System.out.println();
		 System.out.println("i : " + i); // 6
		 /*i : 1 -> i <= 5(true) -> "1" -> i++;
		 /*i : 2 -> i <= 5(true) -> "1 2" -> i++;
		 /*i : 3 -> i <= 5(true) -> "1 2 3" -> i++;
		 /*i : 4 -> i <= 5(true) -> "1 2 3 4 " -> i++;
		 /*i : 5 -> i <= 5(true) -> "1" -> i++;
		 /*i : 6 -> i <= 5(false)
		 *
		 * 마지막 i의 값은? 6
		 */
		 i = 5;
		 while(i >= 1) {
		 System.out.print(i + " ");
		 i--;
		 }
		 System.out.println();
		 System.out.println("i : " + i); // 0
			}
	
	public void method3() {
		 
		//1에서 10까지의 총 합계
		
		int sum = 0; // 총합계를 담아둘 변수
		
		// for문 버전
		/*
		for(int i = 1; i <= 10; i++) {
			
			sum += i;
		}
		*/
		
		// While문 버전
		int i = 1; //초기식
		while(i <= 10) {
			sum += i; //sum = sum + i;
			i++;

		}

		System.out.println("sum : " + sum);
	} // method3 메소드 영역 끝
	
	public void method4() {
		
		// 1부터 랜덤값 (1 ~ 100 사이) 까지의 총 합계
		
		// 공식 : (int)(Math.random() * 몇개의 랜덤값  + 시작수);
		int random = (int)(Math.random() * 100 + 1);
		
		System.out.println("random : " + random);
		
 		int sum = 0;
 		
 		int i = 1; // 초기식
 		while(i <= random) { // 조건식
 			
 			//sum += i; // sum = sum + i;
 			//i++; // 증감식
 			
 			//위의 두줄을 한줄로 표현한다면?
 			
 			sum += i++; // 후위연산자
 			
 		}
		System.out.println("sum : " + sum);
	}//method4 메소드 영역 끝
	
	//조건식을 제대로 지정하지 않은 경우
	
	public void method5() {
		
		// 조건식에 의해서 반복이 0번 일어나는 경우(오류)
		/*
		int i = 0;
		while(i > 0) {
			
			System.out.println("잘 실행되나..");
		}
		*/
		
		// 무한반복으로 돌아가는 경우
		/*
		int i = 1;
		
		while(i >= 1) {
			System.out.println("잘 실행되나?");
			i++;			
		}
		 */	
		
		// 의도적으로 무한반복을 돌리고 싶은 경우
		while(true) {
			
			System.out.println("잘 실행되나..?");
		}
		// 주로 사용자에게 제대로된 결과를 입력받을 때까지 일단은 계속 여지를 주겠다
		// => 이 경우 보통 while(true) 쓸 수 있음
		
	} //method5 메소드 영역 끝
		
		/*
		 * do-while문
		 * 
		 * [표현법]
		 * do {
		 *    실행할 코드; 
		 * } while(조건식); //조건식안에 true면 실행 / false면 out
		 * 
		 * => 별도의 조건 검사 없이 무조건 최초 1회는 실행이 됨
		 *  (즉, 조건이 맞지 않더라도 반드시 한번은 수행하겠다.)
		 * => 조건식의 결과가 true 이면 반복 수행
		 * => 조건식의 결과가 false이면 반복문을 빠져나옴
		 * 
		 * while문과 do-while문 차이점
		 * - while문은 처음 수행할 때도 우선적으로 조건검사가 먼저 일어나고 true 여야지만 실행
		 * - do-while문은 첫 실행은 별도의 조건검사 없이 무조건 한번은 실행
		 */
		
		public void method6() {
			
			int num = 1;
			
			do {
				
				System.out.println("안녕");
				
			} while(num == 0); //애초에 조건 자체가 false
			
			// 애초에 조건이 맞지 않더라도 반드시 최소 한번은 수행
	
		} //method7 메소드 영역 끝
		
		public void method7() {
			
			// "1 2 3 4 5" 출력
			
			int i = 1;
			
			do {
				
				System.out.print(i + " ");
				
				i++;
				
			} while(i < 6);
			
			System.out.println();
			System.out.println("i : " + i);
			
		}
				
		
		
		
		
		
	

}
