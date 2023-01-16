package com.kh.third;

import com.kh.first.HelloEveryone;

public class MyName {

	public void callMyName() {
		
		System.out.println("안녕하세요 제 이름은 홍길동입니다.");
	
		
		// 또 다른 클래스에 있는 메소드 호출해보기
		// => HelloEveryone 클래스에 정의해둔 main 메소드
		
		//1. HelloEveryone 클래스를 대변할 이름을 먼저 만들기
		//=> 패스(static 이기 때문에, 언제든지 호출할 준비가 되어있기 때문에
		
		//2. 단, 어느 클래스의 메소드인지 정확하게 언급은 해줘야함
		//=> 클래스명.호출할메소드명();
		
		HelloEveryone.main(null);
		
		System.out.println("잘 되나?");
		
	}
}

/* 자바의 명명규칙 (개발자들 사이의 약속 = 코딩컨벤션)
 * 1. 영어 사용
 * 2. 띄어쓰기 불가
 * 3. 의미부여를 해서 여러 단어를 조합해서 짓는다.
 * 4. Package 명은 소문자로 짓는다.
 * 5. Class 명은 첫글자가 대문자로 시작한다.
 * => 4,5 번 규칙 합체 : 코드상에서 클래스의 풀네임을 작성할 때 한눈에 어디까지가 패키지명이고 어디까지가 클래스명인지 구분하기 위함
 *    ex) com.kh.first 패키지에 HelloEveryone 클래스를 만들었음
 *        이 클래스의 풀네임은? com.kh.first.HelloEveryone 
 *        com.kh.third 패키지에 MyName 클래스를 만들었음
 *        이 클래스의 풀네임은? com.kh.third.MyName
 * 6. Method 명은 첫글자가 소문자로 시작한다.
 * 7. 변수명(대변할 이름)은 첫글자가 소문자로 시작한다.
 * 8. 공통 원칙 : 여러개의 단어를 조합해서 이름을 지을 경우에는 
 *            띄어쓰기 대신 각 단어별로 첫글자를 대문자로 적어서 가독성을 높여준다.
 *            =>낙타봉 표기법(Camel Case)
 *            
 * ex) 클래스명 Methodtest -> MethodTest
 *     메소드명 testprint -> testPrint
 *     
 *     
 * 
 * 
 */


