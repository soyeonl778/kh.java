package com.kh.variable;

import java.util.Scanner; //해당 패키지에 있는 클래스를 가져다 쓰겠다고 선언

//사용자가 키보드로 입력한 값을 변수에 기록하는 방법

public class B_KeyboardInput {
	
	public void inputTest1() {
		
		/*
		 * 자바에서 이미 제공하고 있는 java.util.Scanner 클래스가 있음
		 * (내가 만든 클래스가 아님)
		 * Scanner 클래스 안에는 사용자로부터 키보드로 입력받을수 있게 해주는 메소드들이 작성되어있음
		 * => 이 메소드들을 호출해서 사용할 예정
		 */
		
		// 다른 클래스에 있는 메소드를 호출하고자 할 경우
		// 1. 해당 클래스를 대변할 이름을 우선적으로 생성(new)
		Scanner sc = new Scanner(System.in);
		// System.in : 입력받은 값을 바이트 단위로 읽어들이겠다.
		//             참고로 출력시에는 System.out 을 썼었음~!
		
		//사용자의 인적사항 (이름, 나이, 키) 입력받기
		
		//입력받고자 하는 내용을 먼저 출력해서 입력을 유도
		System.out.print("당신의 이름은 무엇입니까? : ");
		
		//이름: "이소연" ..... => String 타입
		
		//사용자가 입력한 값을 문자열로 받아오는 메소드 : next(), nextLine()
		
		//sc.next(); // 호출 구문만 작성한다면 입력만 받고 끝
		// String name = sc.next();
		// next() : 사용자가 입력한 값 중에서 공백 (스페이스바 한칸) 이 있을 경우 그 공백 이전까지만 입력을 받아주는 역할
		
		// System.out.println(name); // "이 소연" 을 입력한 경우 "이" 만 담김
		
		String name = sc.nextLine();
		// nextLine() : 사용자가 입력한 값 중 개행 (엔터 한칸) 이 있을 경우 공백 (스페이스바 한칸) 에 무관하게 개행문자 이전까지 다 입력을 받아주는 역할
		//              특히 사용자가 입력한 값에 공백이 포함될 여지가 있을 경우 안전하게 nextLine 을 쓰자!
		//              ex) 집주소 (서울시 관악구 신림동 ____)
		
		System.out.println(name); //"이 소연" 을 입력한 경우 "이 소연" 이 그대로 담김
		
		
		System.out.print("당신의 나이는 몇살입니까? : ");
		
		// 나이: 20, 21, 22, .. => 정수형(int)
		
		// 사용자가 입력한 값을 int 형으로 받아오는 메소드 : nextInt()
		
		int age = sc.nextInt();
		
		System.out.print("당신의 키는 몇 cm 입니까? : ");
		
		//키 : 164.8 , 161.3, ... => 실수형(double)
		
		// 사용자가 입력한 값을 double 형으로 받아오는 메소드 : nextDouble()
		double height = sc.nextDouble();
		
		//name, age, height 를 이용해서 하나의 문자열로 출력
		// ___님의 나이는 ___살이고, 키는 ____.__cm 입니다. 형식으로 출력
		
		System.out.println(name + "님의 나이는 " + age + " 살이고, 키는" + height + "cm 입니다.");

		// 각각의 메소드들의 특징 : 사용자가 엔터키를 칠때까지 대기상태, 변수 선언과 동시에 값을 입력받아 곧바로 대입하는 구조
		

	} // inputTest1 메소드 영역 끝
	
	//키보드로 값을 ㄷ입력받을 떄 종종 발생되는 문제
	public void inputTest2() {
		
		//Scanner 클래스를 대변할 이름 생성
		Scanner sc = new Scanner(System.in);
		
		// 사용자의 인적사항 (이름, 나이, 주소, 키) 을 입력받아 출력하는 프로그램
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt(); // 버퍼에 개행문자가 남아있는 상태
		//버퍼를 비워주는 메소드 : nextLine()
		//버퍼를 비우는 용도로 nextLine 메소드를 사용하고 싶을 경우에는
		sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		
		
		System.out.println("***" + name + "님의 개인정보***");
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("키 : " + height);
		
	}
	
	
	//숙제 1번 풀이
	
	public void inputTest3() {
		
		//이름(String), 성별(String), 나이(int), 키(double)
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름을 입력하시오 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하시오(남/여) :");
		String gender = sc.nextLine();
				
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("키를 입력하시오 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("키" + height + "인" + age + "살" + gender + "자" + name + "님 반갑습니다^^");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
	} // inputTest3 메소드 영역 끝
	
	//문자 타입을 입력받는 방법
	public void inputTest4() {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Scanner 클래스에서 제공하는 입력용 메소드들
		 * 문자열을 입력받을 때 => sc.next(), sc.nextLine()
		 * 정수값을 입력받을 때 => sc.nextInt(), sc.nextByte(), sc.nextShort(),sc.nextLong();
		 * 실수값을 입력받을 때 => sc.nextDouble(), sc.nextFloat(), 
		 * 문자를 입력받을 때 => sc.nextChar() 존재하지 않는 메소드!
		 *                sc.nextLine() 으로 문자열로써 입력을 받은 후 0번째 인덱스의 문자만 "추출"
		 */
		
		// 이름(String), 성별(char), 나이(int), 키(double)
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		// char gender = sc.nextChar();
		
		/* 
		 * index : 색인, 번호, 순번, .. 이런뜻
		 * 
		 * ex)
		 * "apple" 문자열의 인덱스
		 *  12345 
		 *  01234
		 *  
		 *  "apple" 문자열에서 3번 인덱스의 문자는? "ㅣ"
		 */
		
		char gender = sc. nextLine().charAt(0); // charAt->몇번째 문자열 뽑아줄수 있는 메소드
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);

	} // inputTest4 메소드 영역 끝
	
	//charAt 연습
	public void inputTest5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		//str로부터 첫번째, 두번째, 세번째 글자를 각각 뽑아서 출력
		
		/*
		 * 예시
		 * 문자열을 입력하세요 : apple
		 * 첫번째 글자 : a
		 * 두번째 글자 : p
		 * 세번째 글자 : p
		 */
		
		
		char first = str.charAt(0);
				
		char second = str.charAt(1);
		
		char third = str.charAt(2);
		
		//char first = sc.nextLine().charAt(0); 이렇게 써도 됌(String str = ~~~~ 이거 지우고)
		// System.out.println("첫번째 글자 : " + str.charAt(0)); 이렇게 바로 들어가도 됌
		
		
		
		
		
		System.out.println("첫번째 글자 : " + first);
		System.out.println("두번째 글자 : " + second);
		System.out.println("세번째 글자 : " + third);
		
	} // inputTest5 메소드 영역 끝
	
	// 숙제2
	public void inputTest6() {
		
		//정수 두개 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		// 변수를 쓰는 방법
		
		/*
		 * int result1 = num1 + num2; int result2 = num1 - num2; int result3 = num1 *
		 * num2; int result4 = num1 / num2;
		 * 
		 * System.out.println("더하기 결과 : " + result1); 
		 * System.out.println("빼기 결과 : " + result2); 
		 * System.out.println("곱하기 결과 : " + result3);
		 * System.out.println("나누기 결과 : " + result4);
		 */
		
		
		
		// 변수를 쓰지 않는 방법
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
