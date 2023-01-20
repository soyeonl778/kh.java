package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	/*
	 * 변수 : "자료형의 값 단 하나만" 을 담을 수 있는 개념
	 * 		예) int a = 10;
	 * 		    a = 20;
	 * 
	 * 배열 : "자료형의 값 여러개"를 담을 수 있는 개념
	 * 		예) int[] a = new int[3]; // int 형의 자료가 들어갈 수 있는 방을 3개 만들겠다.
	 *                               // 방[0], [1], [2] 을 만든것
	 *                               //인덱스는 항상 0부터 시작한다. (중요)
	 *                               // 배열의 크기 = 3 -> 마지막 인덱스 = 2
	 *                               // 배열의 크기 = 5 -> 마지막 인덱스 = 4
	 *                               // 문자열의 길이 = 7 -> 마지막 인덱스 = 6
	 *                               // 배열의 크기 = n -> 마지막 인덱스 = n -1
	 *         a[0] = 5;
	 *         a[1] = 10;
	 *         a[2] = 15;
	 */
	
	public void method1() {
		
		// 배열을 왜 써야 할까?
		// 변수만을 가지고 프로그래밍을 하게 되면..
		// 0, 1, 2, 3, 4 기록해야함
		/*
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// 0, 1, 2, 3, 4 출력해야함
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		// 반복문 사용 불가
		for(int i = 1; i <= 5; i++) {
			
			// System.out.println(numi);
			System.out.println("num" + i);
			
		}
		
		// 0, 1, 2, 3, 4 를 더해야함
		int sum = num1 + num2 + num3 + num4 + num5;
		*/
		
		// 변수의 갯수가 늘어나면 힘듦
		
		// 배열을 가지고 프로그래밍 하기
		// 0, 1, 2, 3, 4 기록해야함
		
		/*
		 * 1. 배열 선언
		 * [표현법] => 두가지 표현법이 있다.
		 * 자료형 배열명[];
		 * 자료형[] 배열명; // 이 방식을 더 많이씀
		 */
		
		//int a; // 변수 선언 
		//int arr[]; // 배열 선언
		//int[] arr; 
		
		/*
		 * 2. 배열 할당
		 * 이 배열에 몇개의 값들을 보관할건지에 대해 배열의 크기를 지정해주는 과정
		 * 지정한 갯수만큼 값이 들어갈 방이 만들어짐
		 * [표현법]
		 * 배열명 = new 자료형[배열크기];
		 */
		
		//arr = new int[5];
		
		//배열을 선언과 동시에 할당도 가능하다.
		//[표현법]
		// 자료형[] 배열명 = new 자료형 [배열크기];
		
		int[] arr = new int[5];
		
		// 이 시점부터는 배열을 활용할 수 있음!!
		
		/*
		 * 3. 배열의 각 인덱스 자리에 값 대입
		 * [표현법]
		 * 배열명[인덱스] = 값
		 */
		
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		//배열의 가장 큰 장점 : 반복문을 활용할 수 있다.
		for(int i = 0; i < 5; i++) {
			arr[i] = i;
		}
		
		//출력
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		// 출력 또한 반복문을 활용 가능하다!!
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[1]);
		}
		
		// 총 합계 구하기
		int sum = 0;
		
		// 반복문 활용 가능
		// sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		for(int i = 0; i < 5; i++) {
			sum = sum + arr[1]; // sum += arr[1];
		}
		System.out.println("sum : " + sum);
		
		System.out.println("arr : " + arr);
		//[I@6d06d69c 와 같은 알 수 없는 값이 나온다.(주소값)
		
	} //메소드 끝
	
	public void method2() {
		
		int i = 10;
		
		int[] iArr = new int[5];
		
		System.out.println("1 : " + i);
		
		System.out.println("iArr : " + iArr); // [I@6d06d69c
		
		double[] dArr = new double[3];
		
		System.out.println("dArr : " + dArr); // [D@7852e922

		/*
		 * 기본자료형 (8개 : boolean, char, byte, short, int, long, float, double)
		 * => 실제 값을 바로 담을 수 있는 변수 (일반변수)
		 * 
		 * 그 이외의 자료형 (int[], double[], short[], String, Scanner, A_Array, ...)
		 * => 주소 값을 담고있는 변수 (참조 변수, 레퍼런스 변수)
		 */
		
		// 외계어같은 주소값을 십진수의 형태로 알려주는 메소드 : hashCode()
		System.out.println("iArr : " + iArr);
		System.out.println("iArr의 해쉬코드값 : " + iArr.hashCode());

		System.out.println("dArr : " + dArr);
		System.out.println("dArr의 해시코드값 : " + dArr.hashCode());
		
		
	} //method2 영역 끝
	
	public void method3() {
		
		int[] iArr = new int[3]; // [0], [1], [2]
		double[] dArr = new double[3]; // [0], [1], [2]
		
		// System.out.println(iArr);
		// System.out.println(dArr);
		
		//배열에 들어있는 실제 값을 출력하고자 할 경우
		// => 배열명[방번호]
		System.out.println(iArr[0]);
		
		// 배열을 출력 할 때 반복문을 쓰면 더 좋다.
		// 0번 인덱스에서부터 마지막 인덱스까지 순차적으로 반복문을 활용해보기
		//마지막 인덱스  == 배열의 크기 - 1
		/*
		for(int i = 0; i < 3; i++) {
			
			// iArr[i] += i + 1;
			System.out.println("iArr[" + i + "] : " + iArr[i]);
			
		}
		*/
		// 배열에 반복문을 활용할 경우 주의할 점
		// => 배열의 사이즈를 넘어서서 반복을 돌리면 ArrayIndexOutOfBoundsException 발생
		
		// 배열의 크기를 아는 방법 
		// [표현법]
		// 배열명.length
		System.out.println("iArr 배열의 크기 : " + iArr.length);
		System.out.println("dArr 배열의 크기 : " + dArr.length);
		
		//iArr 배열 순차적으로 출력
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		// dArr 배열 순차적으로 출력
		for(int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
			
		}
		/*
		 * 각각의 배열의 인덱스에 값을 대입하지 않더라도 뭔가 담겨있음
		 * 왜? Heap 공간에는 절대 빈 공간이 존재할 수 없음!!
		 * => JVM 에 의해 기본값으로 초기화를 진행해줌
		 */
	
	} //method3 영역 끝
		
	public void method4() {
			
			
			int[] arr = new int[5]; // [0] [1] [2] [3] [4]
			                        //  0   0   0   0   0
			/*
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
			arr[4] = 5;
			arr[5] = 6; // ArrayIndexOutOfBoundsException 발생( 배열의 인택스 범위를 벗어났기 때문)
			*/
			
			// 값 대입을 위한 반복문
			for(int i = 0; i < arr.length; i++) { // i : 0 1 2 3 4
				
				arr[i] = (i + 1);				
			}
			
			// 이 시점 기준으로 arr 배열의 모든 방에는 정수값이 들어있을 거임
			
			int sum = 0;
			// 값 출력과 누적 덧셈을 위한 반복문
			for(int i = 0; i < arr.length; i++) { // i : 0 1 2 3 4 
				
				System.out.print(arr[i] + " "); // "1 2 3 4 5"출력
				sum = sum + arr[i];
			}
			
			// 이 시점 기준으로 "1 2 3 4 5" 가 출력됐을 거임
			// 이 시점 기준으로 sum 에는 1 + 2 + 3 + 4 + 5 결과가 들어있을 거임
			
			System.out.println();
			System.out.println("sum : " + sum);
			
			System.out.println(arr); //외계어같은 주소값
			System.out.println(arr.hashCode());
	}
			
			//실습문제
			
	public void method5() {
				
				/*
				 * 정수 10개를 보관할 수 있는 배열을 생성한 후
				 * 배열의 각 방에 랜덤한 수를 대입하는 프로그램 만들어라
				 * 
				 * 랜덤값의 범위: 51 ~ 100
				 * arr[0] : 61
				 * arr[1] : 56
				 * arr[2] : 87
				 * ...
				 * arr[9] : 81
				 */
		int[] arr = new int[10];
				
		for(int i = 0; i < arr.length; i++) {
			
			int random = (int)(Math.random() * 50 + 51);
			
			
			System.out.println("arr[" + i + "] : " + random);
				
			}
		for(int i = 0; i < arr.length; i++) {
			
			
			System.out.printf("arr[%d] : %d \n", i, arr);
		}
					
	}
	public void method6() {
		
		int[] arr = new int[5];
		
		System.out.println(arr); //[I@6d06d69c
		System.out.println(arr.hashCode()); //1829164700
		
		/*
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8;
		 * arr[4] = 10;
		 */
		
		// 대입용 for문
		int value = 2; // 대입되는 값의 시작수
		for(int i = 0; i < arr.length; i++) {
			
			// arr[i] = (i + 1) * 2;
			arr[i] = value;
			value += 2;
		}
		
		// 출력용 for문
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		// arr[5] = 12;
		// arr[6] = 14;
		
		/*
		 * *배열의 가장 큰 단점
		 * 한번 할당 시에 지정한 배열의 크기는 변경 불가능하다.
		 * => 배열의 크기를 변경하고자 한다면 어쩔수 없이 새로운 배열을 다시 만들어야 한다.
		 * (선언까지 다시 할 필요는 없음, 할당만 다시 해서 연결고리만 바꿔치기 한다)
		 */
		
		arr = new int[7];
		
		System.out.println("=== arr 변경 후===");
		System.out.println(arr);
		System.out.println(arr.hashCode());
		
		/*
		 * 메모리공간은 항상 고유한 주소값 부여, 기존에 생성되었던 주소지와 주소지와 절대 겹치지 않는다.
		 * 만약 내가 배열의 크기를 변경하고자 새로운 배열을 할당하여 주소값을 대입한다면
		 * 기존에 참조하고 있던 연결이 끊기고 새로운 연결이 지어진다.
		 * 
		 * 연결이 끊어진 기존의 배열을 Heap 영역에 동동 떠다님
		 * 일정 시간이 지나면 "가비지 컬렉터(GC)" 에 의해서 삭제된다!! => 가비지 컬렉션 (자동 메모리 관리)
		 */
		
		// 현재 연결되어있는 고리를 끊고자 한다면?
		arr = null; // null : 아무것도 존재하지 않음을 나타내는 '값'
		
		System.out.println("=== 연결고리를 끊은 후 ===");
		System.out.println(arr); // null 출력
		
		arr[0] = 10; // NullPointerException 이라는 오류가 발생
		// 접글할 주소가 없는데 (null) 어떻게 접근할래? 라고 오류를 알려주는 것
		
		System.out.println(arr.hashCode());
		
		/*
		// 기본 자료형의 기본값은 다음과 같다 => 내가 직접 셋팅해야함
		//int a;
		//System.out.println(a);
		int a = 0;
		double d = 0.0;
		char c = ' ';
		
		String str = "";
		
		// 참조 자료형의 기본값은 null 이다.
		int[] iArr = null;
		double[] dArr = null;
		Scanner sc = null; 
		*/
		
		// 배열을 할당까지 완료함
		// heap 영역에 실제 배열에는 JVM 에 의해서 초기값이 채워짐
		// => 만약 int 형 배열이라면 모든 값이 초기값 0으로 채워짐
		// => 만약 short 형 배열이라면 모든값이 초기값 0으로 채워짐 (즉, 정수형일 경우 초기값 0으로 채워짐)
		// => 만약 double 형 배열이라면 모든값이 초기값 0.0 으로 채워짐 (즉, 실수형일 경우 초기값 0.0으로 채워짐)
		// => 만약 char 형 배열이라면 모든값이 초기값 '  ' 으로 채워짐
		// => 만약 String 형 배열이라면 모든값이 초기값 null 로 채워짐
		
	}
	
	public void method7() {
		
		/*
		 * 3명의 사용자에게 매번 키의 정보를 입력받고, 배열에 담기
		 * 3명의 키 정보를 출력
		 * 3명의 키의 총 합계와 평균까지 출력(printf문 사용)
		 * 
		 * 예시)
		 * 키 입력(cm) : 162.1
		 * 키 입력(cm) : 149.9
		 * 키 입력(cm) : 183.5
		 * 162.1
		 * 149.9
		 * 183.5
		 * 3명의 키의 총 합계 : 495.5
		 * 3명의 키의 평균 : 165.2
		 */
	
		Scanner sc = new Scanner(System.in);
		
		double[] heights = new double[3]; // [0] [1] [2]
		
		for(int i = 0; i < heights.length; i++) {
			
			System.out.print("키 입력(cm) : ");
			heights[i] = sc.nextDouble();
			sc.nextLine();
			
		}
		
		// 3명의 키 정보 출력 + 총 합계
		double sum = 0.0; // 키의 총 합계
		
		for(int i = 0; i < heights.length; i++) { // i : 0 1 2
			
			System.out.println(heights[i]);
			
			sum = sum + heights[i];
			
		}
		
		// 이 시점 기준으로 이미 모든 키들은 출력이 완료됨
		// 이 시점 기준으로 sum 에는 모든 키들의 합이 기록되어있음
		
		// 총 합계, 평균 출력
		System.out.printf("3명의 키의 총 합계 : %.1f \n", sum);
		System.out.printf("3명의 키 평균 : %.1f \n", sum / heights.length);
		
	}
	
	public void method8() {
		
		/*
		 * 시용자에게 문자열 하나를 입력받고
		 * 각각의 문자들을 char 배열에 옮겨담기 => 배열에 들은 값들을 출력(줄바꿈 없이)
		 * 
		 * 예시)
		 * 문자열 하나 입력 : strawberry
		 * s t r a w b e r r y
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 하나 입력 : ");
		String str = sc.nextLine();
		
		// 각각의 글자를 담을 char 배열을 생성 (배열의 크기 == 문자열의 길이)
		
		char[] arr = new char[str.length()];
		
		/*
		arr[0] = str.charAt(0);
		arr[1] = str.charAt(1);
		arr[2] = str.charAt(2);
		...
		*/
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = str.charAt(i); 
		}
		
		// 줄바꿈 없이 출력
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void method9() {
		
		// 좋아하는 과일의 갯수를 입력 받은 후
		// 과일의 갯수만큼 담을 수 있는 배열 생성 후 각각의 배열에 좋아하는 과일을 입력받아
		// 기록 후 출력하기
		
		/*
		 * 예시) 좋아하는 과일 갯수 : 2
		 * 좋아하는 과일명 입력 : 딸기 
		 * 좋아하는 과일명 입력 : 복숭아 
		 * 딸기 복숭아
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("좋아하는 과일 갯수 : ");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		String[] fruit = new String[num]; 
		
		for(int i = 0; i < fruit.length; i++) {
			
			System.out.print("좋아하는 과일명 입력 : ");
			fruit[i] = sc.nextLine();
		}
		
		for(int i = 0; i < fruit.length; i++) {
			
			System.out.print(fruit[i] + " ");
			
		}

}
	
	public void method10() {
		
		//배열 선언과 동시에 할당 (크기 지정)
		int[] arr = new int[4]; // [0] [1] [2] [3]
								//  0   0   0   0
		
		//배열의 각 인덱스에 값을 대입
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		// 배열도 마찬가지로 각 방에 처음으로 값을 대입하는 걸 "초기화" 라고 한다.
		
		// 배열 선언 및 할당과 동시에 초기화 (대입) 까지 한번에 끝내는 방법 2가지
		// 방법1.
		int[] arr1 = new int[] {1, 2, 3, 4}; // [0] [1] [2] [3]
											 //  1   2   3   4
		// 방법2.
		int[] arr2 = {1, 2, 3, 4}; // [0] [1] [2] [3]
								   //  1   2   3   4
		
		System.out.println(arr == arr1); // false
		System.out.println(arr1 == arr2); // 
		System.out.println(arr2 == arr); //
		// 주소값 간의 동등비교이기 때문에 false 가 나옴 (문자열의 경우에도 동일)
		
	}
		// 숙제
		
		public void method11() {
			
			
		/* 로또번호 생성기
		 * 
		 * 로또 룰 : 1부터 45까지의 랜덤한 숫자중 6개 숫자를 뽑는다.(중복x)
		 *        뽑힌 숫자들을 작은 숫자에서부터 큰 숫자 순서대로 나열까지 해야함(오름차순)(어센딩)
		 * 
		 * 힌트 : 오름차순으로 배열에 들은 숫자들을 재배치해주는 메소드
		 * [표현법]
		 * Arrays.sort(오름차순으로재배치하고자하는배열명);
		 * 
		 */
		
		
		
		}
			
}
