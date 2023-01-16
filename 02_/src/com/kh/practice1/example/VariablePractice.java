package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
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
			
			/*
			 * charAt 메소드
			 * 문자열로부터 x번째 글자만 추출해주는 메소드
			 * [표현법]
			 * 문자열값.charAt(뽑을 위치값);
			 * 
			 * 주의할점
			 * 만약 문자열의 글자 수 보다 더 범위가 큰 인덱스 값을 제시한다면
			 * StringIndexOutOfBoundsException 발생
			 * => 주로 문자열의 총 길이 < 추출할 문자의 인덱스 위치값 일 경우 발생
			 * 
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
			

		}
		
		public void method3() {
			
			Scanner sc = new Scanner(System.in);
			
			//가로 세로값을 실수형으로 입력 받아
			// 사각형의 면적과 둘레를 계산하여 출력
			// ex) 가로 :
			//     세로 : 
			//     면적 : 
			//     둘레 : 
			
			
			System.out.print("가로 : ");
			double row = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("세로 : ");
			double column = sc.nextDouble();
			sc.nextLine();

			System.out.println("면적 : " + (row * column));
			System.out.println("둘레 : " + (row + column)*2);

			
		} //method3 메소드 영역 끝

			
			
			
			
		}

