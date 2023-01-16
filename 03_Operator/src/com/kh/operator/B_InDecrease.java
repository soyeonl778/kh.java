package com.kh.operator;

public class B_InDecrease {

	/*
	 * 증감 연산자 한번에 값을 1 증가시키거나 한번에 값을 1감소시키는 단항연산자
	 * 
	 * [종류] 
	 * ++ : 값을 1 증가시키는 연산자 
	 * ++값; => 전위연산자
	 * 값++; => 후위연산자
	 * 
	 * -- : 값을 1 감소시키는 연산자 --값; 값--;
	 * 
	 * (증감 연산자)값 : 전위연산 => 선증감 후처리
	 * 값(증감 연산자) : 후위연산 => 선처리 후증감
	 */

	public void method1() {
		
		int num = 10;
		System.out.println("num : " + num);
		
		num++; // num 변수의 값에 1을 증가시키겠다.
		       // 즉, num = num + 1; 과 같은 의미
		
		System.out.println("변경된 num  : " + num);
		
		
	} // method 메소드 1영역 끝
	
	public void method2() {
		
		//전위연산자
		int a = 10;
		int b = ++a; // a 값을 먼저 전위증가 하고 나서 b 라는 변수에 대입한다.
		
		System.out.println("a : " + a + ", b : " + b);
		
		//후위연산
		int c = 10;
		int d = c++; // d라는 변수에 ㅊ 값을 먼저 대입하고 나서 c 값을 후위증가 한다.
		
		System.out.println("c : " + c + ", d : " + d);
		
	} // method2 메소드 영역 끝
	
	public void method3() {
		
		int num1 = 20;
		int result1 = num1++ * 3;
		// result1 = 20 * 3 연산 후 num1 = num1 + 1 연산이 일어남
		
		System.out.println("num1 : " + num1);
		System.out.println("result1 : " + result1);
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		// num2 = num2 + 1 연산 후 result2 = 21 * 3 연산이 일어남
		
		System.out.println("num2 : " +  num2);
		System.out.println("result2 : " + result2);

	} //method3 메소드 영역 끝
	
	public void method4() {
		
		int a = 5;
		int b = 10;
		int c = (++a) + b;
		int d = c / a;
		int e = c % a;
		int f = e++;
		int g = (--b) + (d--);
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		
		System.out.println(e);
		
		
		
	}
	
}
