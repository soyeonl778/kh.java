package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
	/*
	 * * 배열 복사
	 * - 얕은 복사 : 배열의 주소값만 복사
	 * - 깊은 복사 : 동일한 새로운 배열을 하나 생성해서 실제 내부값들을 복사
	 */
	
	//얕은 복사
	public void method1() {
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("== 원본 배열 출력 ==");
		for(int i = 0; i < origin.length; i++) {
			
			System.out.print(origin[i] + " ");
			
		}
		
		// 복사본 배열
		int[] copy = origin;
		
		System.out.println();
		System.out.println("== 복사복 배열 출력 ==");
		for(int i = 0; i < copy.length; i++) {
			
			System.out.print(copy[i] + " ");
			
		}
		
		//copy 배열을 수정하기
		copy[2] = 99;
		
		System.out.println();
		System.out.println("== 복사본 배열 수정 후 ==");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		System.out.println("== 복사본 배열 ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// 복사본 배열만 가지고 수정을 했는데 원본 배열의 내용도 같이 수정이 된것 같다!
		// 원본 배열의 값도 함께 변경이 되었음 (원본이 훼손되었음)
		// 얕은 복사 => 배열의 주소값이 복사되어 원본과 복사본이 같은 상태
		System.out.println();
		System.out.println(origin);
		System.out.println(copy);
		
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());

	}
	
	// 깊은 복사 (4가지 방법)
	public void method2() {
		
		// 1. for문을 이용하는 방법
		// 새로운 배열을 생성한 후 각 인덱스 별로 내부 값을 일일히 대입하는 방법
		
		// 원본배열
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열
		int[] copy = new int[origin.length];
		/*
		copy[0] = origin[0];
		copy[1] = origin[1];
		...
		copy[마지막인덱스] = origin[마지막인덱스];
		*/
		
		for(int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
			
		}
		
		// 잘 복사가 되었는지 복사본 배열 출력
		
		System.out.println("== 복사본 배열 출력 ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
			
		}
		// 복사본 배열 수정하기
		copy[2] = 99;
		
		System.out.println();
		System.out.println("== 복사본 배열 수정 후 ==");
		System.out.println("== 원본 배열 출력 ==");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
			
		}
		
		System.out.println();
		System.out.println("== 복사본 배열 출력 ==");
		for(int i = 0; i < copy.length; i++) {
			
			System.out.print(copy[i] + " ");
		}
		
		// 해시코드값 비교
		System.out.println();
		System.out.println("원본 배열의 해시코드 : " + origin.hashCode());
		System.out.println("복사본 배열의 해시코드 : " + copy.hashCode());
		
	}
	
	public void method3() {
		
		// 2. System 클래스에서 제공하는 arraycopy 메소드를 이용하는 방법
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열
		int[] copy = new int[10];
		// [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
		//  0   0   0   0   0   0   0   0   0   0
		
		// System.arraycopy(원본배열명, 원본배열의 복사를 시작할 인덱스, 복사본배열명, 복사될시작인덱스, 복사할갯수);
		
		System.arraycopy(origin, 0, copy, 0, 5);
		// [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
		//  1   2   3   4   5   0   0   0   0   0
		
		
		
		//System.arraycopy(origin, 0, copy, 2, 5);
		// [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
		//  0   0   1   2   3   4   5   0   0   0
		
		//System.arraycopy(origin, 2, copy, 1, 3);
		// [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
		//  0   3   4   5   0   0   0   0   0   0
		
		//System.arraycopy(origin, 2, copy, 9, 2);
		// [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
		//  0   0   0   0   0   0   0   0   0   3   4
		// ArrayIndexOutOfBoundsException 발생
		// => 배열의 깊은 복사가 일어날 떄 인덱스의 범위를 벗어났기 때문에 오류 발생
		
		System.out.println("== 복사본 배열 출력 ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// 해시코드 비교
		System.out.println();
		System.out.println("원본 배열의 해시코드 : " + origin.hashCode()); // 1829164700
		System.out.println("복사본 배열의 해시코드 : " + copy.hashCode()); // 2018699554
		// 다른 주소값을 갖고 있음 => 다른 곳을 참조하고 있음
		// => 배열 수정시 서로 영향을 받지 않는다는것을 유추 가능함
		
	}
	
	public void method4() {
		
		// 3. Arrays 클래스에서 제공하는 copyOf 메소드를 이용한 방법
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열
		
		// 복사본 배열 = Arrays.copyOf(원본배열명, 복사할값의갯수);
		int[] copy = Arrays.copyOf(origin, 7);
		
		System.out.println("== 복사본 배열 출력 ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
			
		}
		
		// 해시코드 비교
		System.out.println();
		System.out.println("원본 배열의 해시코드 : " + origin.hashCode());
		System.out.println("복사본 배열의 해시코드 : " + copy.hashCode());
		
		/*
		 * 2. System.arraycopy 메소드
		 * 몇번 인덱스에서부터 몇개를 어느 위치의 인덱스에 복사할건지 다 직접 지정 가능
		 * 
		 * 3. Arrays.copyOf 메소드
		 * 무조건 원본 배열의 0번 인덱스에서부터 복사가 진행됨 (단, 내가 제시한 갯수 만큼)
		 * 또한, 내가 제시한 갯수만큼이 곧 복사본 배열의 크기로 지정됨
		 */

	}
	
	public void method5() {
		
		// 4. clone 메소드를 이용하는 방법
		
		// 원본 배열
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열
		// 복사본배열명 = 원본배열명.clone();
		int[] copy = origin.clone();
		//복잡한 옵션을 지정할 수 없지만, 원본 배열과 완전히 똑같은 복사본 배열을 얻어낼 수 있음
		
		// 출력 => "[1, 2, 3, 4, 5]"
		System.out.println("== 복사본 배열 출력 ==");
		/*
		System.out.print("[");
		for(int i = 0; i <copy.length; i++) {
			
			// 만약 마지막 반복 회차라면 copy[i] 만 출력하겠다.
			if(i == copy.length - 1) {
			
				System.out.print(copy[i]);
			} else {
				System.out.print(copy[i] + ", ");				
			}
		
		}
		System.out.print("]");
		*/
		
		System.out.println(Arrays.toString(copy));
		// Arrays.toString(출력하고자하는배열명);
		// => 앞과 뒤에 [], 값들 사이에는 , 로 연이어서 깔끔하게 하나의 문자열로 연이어서 출력하는 메소드
		
		// 해시코드 비교
		System.out.println("원본 배열의 해시코드 : " + origin.hashCode());
		System.out.println("복사본 배열의 해시코드 : " + copy.hashCode());
		
		
	}

}
