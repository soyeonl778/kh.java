package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	/*
	 * switch문
	 * 조건식 없이도 선택적으로 구문을 실행할 수 있게 해주는 조건문
	 * 
	 * switch문과 if문의 차이점
	 * if(조건식) : 조건식을 복잡하게 내 입맛에 맞게 기술 가능, 값의 범위를 제시 가능
	 * switch 조건식X : 내부적으로 "동등 비교(==)" 에 대한 조건이 수행되는 구조
	 * 
	 * [표현법]
	 * switch(앞으로 동등비교를 할 대상자) {
	 * case 값1 : 실행할코드1; // 앞으로 동등비교를 할 대상자 == 값1 가 true 일 경우 실행할코드1을 실행하겠다.
	 *           break;     // 실행할 코드1을 수행하고 switch문을 빠져나가겠다.
	 * case 값2 : 실행할코드2;
	 *           break;
	 * ...
	 * case 값n : 실행할코드n;
	 *           break;
	 * default : 실행할코드; // if-else if문에서 else 구문과 같은 역할
	 *                    // 위의 값1, 값2, 값3, .., 값n 까지
	 *                    // 앞으로 동등비교를 할 대상자와 일치하지 않았다면 default 내의 구문이 실행됨
	 *                    // 이 경우에는 break; 구문은 쓰지 않음         
	 *           
	 * [기존 if문]
	 * if(동등비교대상자 == 값1) {
	 *    실행할코드1;
	 *    
	 * } else if(동등비교대상자 == 값2) {
	 *    실행할코드2;
	 *    
	 * } else if(동등비교대상자 ==값3) {
	 *    실행할코드3;
	 * 
	 * } else {
	 *    위의 조건이 모두 false 일 경우, 실행코드;
	 * }
	 * 
	 */
	
	public void method1() {
		
		/*
		 * 1 ~ 3 사이의 정수값을 입력받아
		 * 1인 경우 "빨간불입니다" 출력
		 * 2인 경우 "파란불입니다" 출력
		 * 3인 경우 "초록불입니다" 출력
		 * 잘못 입력한 경우 "잘못 입력했습니다" 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 3사이의 정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		/*
		 * //기존의 if-else if 문 버전 if(num == 1) {
		 * 
		 * System.out.println("빨간불입니다");
		 * 
		 * } else if(num == 2) {
		 * 
		 * System.out.println("파란불입니다");
		 * 
		 * } else if(num == 3) {
		 * 
		 * System.out.println("초록불입니다");
		 * 
		 * } else {
		 * 
		 * System.out.println("잘못 입력했습니다"); }
		 */
		
		//switch문 버전
		/*switch(num) {
			case 1 : System.out.println("빨간불입니다");
			          break;
			case 2 : System.out.println("파란불입니다");
			         break;
			case 3 : System.out.println("초록불입니다");
			         break;
			default : System.out.println("잘못 입력했습니다.");
		}
		*/
		
		String result = ""; // 결과를 담아둘 용도 ( "빨간불", "파란불", "초록불")
		
		switch(num) {
		case 1 : result = "빨간불";
				break;
		case 2 : result = "파란불";
		        break;
		case 3 : result = "초록불";
				break;
		default : System.out.println("잘못 입력했습니다");
		        return; // return 구문은 default 뒤에 반드시 써야하는 구문은 아님
		                // return 문은 현재 실행중인 메소드 자체를 빠져나가
		                // 현재 실행중인 메소드를 "호출했던곳" 으로 돌아가는 구문이다.
		        
		}
		 
		//result 라는 변수에는 "빨간불", "파란불", "초록불" 중에 하나가 담겨져있음
		System.out.println(result + "입니다");
		
	} //method1 메소드 영역 끝
	
	public void method2() {
		
		//사용자에게 구매할 과일명(사과, 바나나, 복숭아)을 입력받아
		//각 과일마다의 가격을 출력 (사과 1000원, 바나나 2000원, 복숭아 5000원)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------Welcome 과일가게------");
		System.out.print("구매할 과일 (사과, 바나나, 복숭아) 입력 : ");
		String fruit = sc.nextLine();
		
		int price = 0; //가격을 담을  변수
		
		/*
		switch(fruit) {
		case "사과" : price = 1000; break;
		case "바나나" : price = 2000; break;
		case "복숭아" : price = 5000; break;
		default : System.out.println("저희 가게에서 판매하는 과일이 아닙니다.");
		return;
		}
		*/
		
		// if-else if문 버전
		/*if(fruit == "사과") {
			price = 1000;
		} else if(fruit == "바나나") {
			price = 2000;
		} else if(fruit == "복숭아") {
			price = 5000;
		} else {
			System.out.println("저희 가게에서 판매하는 과일이 아닙니다."); return;
		}
		*/
		/*
		 *문자열의 경우 동등비교가 제대로 일어나지 않고있음
		 * => 문자열의 경우 참조자료형이기 때문에 == 으로 동등비교를 하는 순간 주소값 기준으로 동등비교가 일어남
		 * => 문자열의 내용물을 동등비교 하고싶다면 == 대신에 .equals() 메소드를 써야 함!!
		 * [표현법]
		 * 문자열.equals(동등비교하고자하는 문자열);
		 * 문자열 내용물이 일치한다면 true, 일치하지 않는다면 false 값이 반환됨
		 * 
		 */
		
		if(fruit.equals("사과")) {
			price = 1000;
		} else if(fruit.equals("바나나")) {
			price = 2000;
		} else if(fruit.equals("복숭아")) {
			
		} else {
			System.out.println("저희 가게에서 판매하는 과일이 아닙니다");
			return;
		}
		
		// 문자열을 동등비교 하고자 할 때 if문 계열 안에서 직접 조건식을 기술할 경우 .equals 사용
		//                       switch문에서는 case 만 잘 기술하면 내부적으로 알아서 .equals 기준으로 내용물 동등비교가 일어남
				
		// price 에는 각 과일마다의 가격이 담겨있음
		// ㅇㅇ의 가격은 ㅇㅇㅇㅇ원입니다. 출력
		System.out.printf("%s 의 가격은 %d 원 입니다. \n", fruit,price);
		
	} // method2 메소드 영역 끝
	
	// break 를 생략하는 경우
	
	public void method3() {
		
		//사용자로부터 키보드로 등급을 입력받아 해당 등릅별로 권한을 출력하기
		// 1등급 : 관리권한, 쓰기권한, 읽기권한
		// 2등급 : 쓰기권한, 읽기권한
		// 3등급 : 읽기권한
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급 입력 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		switch(grade) { 
		case 1 : System.out.println("관리권한 부여");
		case 2 : System.out.println("쓰기권한 부여");
		case 3 : System.out.println("읽기권한 부여"); break;
		default : System.out.println("잘못입력");
		}
		
		// 내가 동등비교 후 true 가 나오는 시점부터 코드가 실행되는 구조
		// break 구문을 만날 때까지 실행이 이뤄지고,
		// break 구문을 만나면 switch 블럭을 빠져나감

	} //method3 메소드 영역 끝
	
	public void method4() {
		
		//사용자에게 입력받은 주민번호를 가지고
		// 남자 / 여자 인지 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 입력(-포함) : ");
		String Id = sc.nextLine();
		
		char gender = Id.charAt(7); //7번째 자리에있는 인덱스 추출
		
		/*String result = "";
		
		
		switch(gender) {
		case '1' : result = "남자"; break;
		.
		.
		.
		System.out.println(result + "입니다.");
	    }
		*/
		
		//break 생략버전
		/*switch(gender) {
		case '1' :
		case '3' : result = "남자"; break;
		case '2' :
		case '4' : result = "여자"; break;
		default : System.out.println("잘못된 주민번호를 입력했습니다.");return;
		System.out.println(result + "입니다.");
		*/
		
		switch(gender) {
		case '1' : System.out.println("남자"); break;
		case '2' : System.out.println("여자"); break;
		case '3' : System.out.println("남자"); break;
		case '4' : System.out.println("여자"); break;
		default : System.out.println("잘못된 정보입니다");
		return;
		}
	} // method4 메소드 영역 끝
		
	public void method5() {
		
		/*
		 * 사용자에게 1월 ~ 12월 사이의 월을 입력받아
		 * 해당 달의 마지막 날짜를 출력하는 프로그램
		 * 1, 3, 5, 7, 8, 10, 12 => "해당 달은 31일까지입니다"
		 * 4, 6, 9, 11 => "해당 달은 30일까지입니다"
		 * 2 => "해당 달은 28일 또는 29일까지입니다"
		 * 그 외의 달 => "반드시 1월 ~ 12월 까지를 입력해야합니다"
		 *
		 * 예시)
		 * 1월 ~ 12월 사이의 월 입력 : 8
		 * 해당 달은 31일까지입니다
		 */
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("1월 ~ 12월 사이의 월 입력 : ");
		
		int month = sc.nextInt();
		sc.nextLine();
		
		String result = "";
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: result = "해당 달은 31일까지 입니다"; break;
		case 4: case 6: case 9: case 11 : result = "해당 달은 30일까지 입니다"; break;
		case 2 : result = "해당 달은 28일 또는 29일까지 입니다"; break;
		default : System.out.println("반드시 1월 ~ 12월 까지를 입력해야 합니다");
		return;
		}
		
		System.out.println(result);
		
		//break 생략버전도 가넝
		

		
	} //method5 메소드 영역 끝
	
	

}
