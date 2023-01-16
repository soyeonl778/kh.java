package com.kh.variable;

public class D_Printf {
	
	public void printfTest() {
		
		/*
		 * 출력문(출력메소드)
		 * 콘솔창에 내용물을 출력하기 위해서 사용되는 구문
		 * 
		 * 출력문의 종류
		 * System.out.println(출력하고자하는값); => 값 출력 후 줄바꿈(개행) 넣어줌
		 * System.out.print(출력하고자 하는값); => 값 출력만 해줌
		 * 
		 * System.out.printf("출력하고자하는형식", 출력하고자하는값들);
		 * => f 는 format (형식) 을 의미
		 * => 형식에 맞춰서 값들이 출력되고 줄바꿈은 일어나지 않음
		 * => 문자열 안에 값의 종류에 따라서 형식을 잡아줘야하고, 출력하고자 하는 값들을 형식에 맞게 나열한다.
		 * 
		 * 형식
		 * 정수 => %d
		 * 실수 => %f
		 * 문자 => %c
		 * 문자열 => %s
		 * 
		 * 형식 사용 예시
		 * "%s님 안녕하세요"
		*/	
		
		// 정수 테스트
		int iNum1 = 10;
		int iNum2 = 20;
		
		// iNum1 : xx, iNum2 : xx 형식으로 출력
		// 1. println 을 사용하기
		System.out.println("iNum1 : " + iNum1 + ", iNum2 : " + iNum2);
		
		//2. printf 를 사용하기
		// => 정수값이므로 %d 라는 형식으로 자리를 잡아준다.
		//    줄바꿈 기능은 없으므로 개행문자 '\n'을 추가해준다.

		System.out.printf("iNum1 : %d, iNum2 : %d \n", iNum1, iNum2);
		// 이 형식에는 구멍이 2개, 그 구멍들은 각각 "정수" 형식
		
		//10 + 20 = 30 을 출력해보기
		//1. println 을 사용하기
		
		System.out.println(iNum1 + "+" + iNum2 + "=" + (iNum1 + iNum2));
		
		//2. printf 를 사용하기
		System.out.printf("%d + %d = %d \n", iNum1, iNum2, iNum1 + iNum2);
		//이 형식에는 구멍이 3개야, 그 구멍들은 각각 "정수"로 틀어막아
		
		//정수 형식(%d) 과 같이 쓸 수 있는 옵션
		System.out.printf("%5d \n", iNum1); // %5d : 5칸의 띄어쓰기를 확보한뒤에 오른쪽에 붙여서 출력
		System.out.printf("%-5d \n", iNum1); // %-5d : 5칸의 띄어쓰기를 확보한뒤 왼쪽으로 붙여서 출력
		
		// 실수 테스트
		double dNum = 4.27546789;
		System.out.printf("dNum : %f \n", dNum); // dNum : 4.275468
		// %f : 소수점 아래 7번째에서 반올림되어 소수점 아래 6번째 자리까지만 출력됨.
		
		System.out.printf("dNum : %.1f \n", dNum); // dNum : 4.3
		// $.1f : 소수점 아래 2번째 자리에서 반올림되어 소수점 아래 1번쨰 자리까지만 출력
		//. 자릿수로 제어 쌉가넝
		
		// 문자와 문자열 테스트
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s \n", ch, str);
		System.out.printf("%C %S \n", ch, str);
		
		//printf 는 포맷 단 한번 제시로 간편하게 출력이 가능하다.
		// 단, 지정한 포맷의 갯수와 종류, 순서가 정확히 맞아야한다. ***

		
	}

}
