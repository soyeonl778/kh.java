package com.kh.operator;

public class C_Compound {

	/*
	 * 복합 대입 연산자 
	 * 산술 연산자와 대입 연산자를 합께 사용하는 연산자
	 * 
	 * [종류] += -+ *= /= %=
	 * 
	 * ex) a = a + 1; => a += 1; 
	 * 기존의 a 값에 1을 더해 a 에 다시 대입해주겠다.
	 */
	
	public void method1() {
		
		int num = 12;
		System.out.println("현재 num : " + num);
		
		//num 을 3 증가시키기
		num = num + 3;
		System.out.println("3증가시킨 num : " + num);
		
		//num 을 3 증가시키기
		// 변수명 += 값;
		num += 3; // num = num + 3; 와 같은 뜻
		System.out.println("또 3 증가시킨 num : " + num);
		
		//num 을 5 감소시키기
		num -= 5; // num = num - 5; 와 같은 뜻
		System.out.println("5 감소시킨 num : " + num);
		
		//num 을 6배 증가시키기
		num *= 6; // num = num * 6; 와 같은 뜻
		System.out.println("6배 증가시킨 num : " + num);
		
		// num 을 2배 감소시키기
		num /= 2; // num = num / 2; 와 같은 뜻
		System.out.println("2배 감소시킨 num : " + num);
		
		// num 을 4로 나눴을때의 나머지를 num 에 대입
		num %= 4; // num = num % 4; 와 같은 뜻
		System.out.println("4로 나누고 남은 num : " + num);
		
		// += 의 경우 문자열 접합도 가능하다.
		String str = "Hello";
		
		// "HelloWorld" 라는 문자열 만들기
		//str = str + "world";
		str += "world";
		
		
		System.out.println(str);

	}

}
