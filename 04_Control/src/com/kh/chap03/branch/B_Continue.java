package com.kh.chap03.branch;

public class B_Continue {
	
	/*
	 * continue ��
	 * �ݺ��� �ȿ��� ����ϴ� ����
	 * continue; �� �����ԵǸ� �� �ڿ� � ������ �ֵ簣�� �������� �ʰ�
	 * ���� ����� �ݺ������� �ö󰡰ڴ� ��� �ǹ�
	 * 
	 * [ǥ����]
	 * continue;
	 */
	
	public void method1() {
		
		// 1���� 10���� Ȧ������ ���
		// "1 3 5 7 9"
		
		// ���1. i ������ ���ʿ� Ȧ���� ���� �����ϴ� ���
		/*
		 * for(int i = 1; i <= 10 ; i += 2) { //5ȸ�ݺ�
			System.out.print(i + " ");
		}
		*/
	/*	
		// ���2. 10���� �ݺ��� ������, Ȧ���� ��츸 ��´� ���
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) { //Ȧ���� ���
			System.out.print(i + " ");
		}
	}
	*/

	//���3. continue ���� ����ϴ� ����
	for(int i = 1; i <= 10; i++) { //10ȸ�ݺ�
		
		if(i % 2 == 0) { //¦���� ���
			
			continue; // ��Ƽ�� �ɾ���� �ڵ�� �������� �ʰ� ���� ���������� �Ѿ
		}
		
		System.out.print(i + " "); // ¦���� ��쿡�� if������ false�̱� ������ �ٷ� ����� �����⿡ �ٷ� ����Ѱ�
		
	}
	
	} //method1 �޼ҵ� ���� ��
	
	public void method2() {
		
		// 1���� 100������ �� �հ�
		// ��, 6�� ������� �����ϰ� ���غ���
		
		int sum = 0;
		
		// continue �� �Ⱦ� ����
		
		/*
		for(int i = 1; i <= 100; i++) {
			
			if(i % 6 != 0) { //6�� ����� �ƴѰ�� ���� ����
				sum += i;
			}
		}
		System.out.println("sum : " + sum);
		*/
		
		//continue �� �� ����
		for(int i = 1; i <= 100; i++) {
			
			if(sum % 6 == 0) { //6�� ����� ��� �ǳʶٰڴ�.
				continue;				
			}
			sum += i;
		}
		
		
		System.out.println("sum : " +sum);
		
	} //method2 �޼ҵ� ���� ��
	
	//�ǽ�����
	
	public void method3() {
		
		//2�ܿ��� ~ 9�ܱ��� ����ϱ� �ϵ�, 4�� ������� �����ϰ� ����ϱ�(4��, 8��)
		
		for(int i = 2; i <= 9; i++) {
			
			if(i % 4 == 0) { //4�� ������ => ��ŵ
			continue;
		
			}
			System.out.printf("-----%d��----- \n", i);				
				
		    for(int j = 1; j <= 9; j++) {
			System.out.printf("%d * %d = %d \n", i, j, i * j);
			
		}
		
	}
		
	}	
		
		
}
