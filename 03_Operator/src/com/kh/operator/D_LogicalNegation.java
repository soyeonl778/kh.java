package com.kh.operator;

public class D_LogicalNegation {
	
	/*
	 * 논리 부정 연산자 
	 * 논리값( true / false ) 을 반대로 바꿔주는 연산자
	 * 
	 * [표현법] 
	 * !논리값
	 */
	
	public void method1() {
		
		System.out.println("true 의 부정 : " + !true); //false
		System.out.println("false 의 부정 : " + !false); //true
		
		boolean b = true;
		boolean b2 = !b; // false
		
		System.out.println("b : " + b );
		System.out.println("b2 : " + b2);
		
		//논리부정연산자는 단순희 논리값을 바꿔주기만 하지 다시 대입하는 역할까지는 하지 않음!
		
	}

}
