package com.kh.operator;

import java.util.Scanner;


public class F_Logical {
	
	/*
	 * �� ������ 
	 * �� ���� ������ �����ϴ� ������
	 * 
	 * [ǥ����] 
	 * ���� (�� ������) ���� 
	 * => ������� ����
	 * 
	 * [����] 
	 * AND ������ : ���� && ����(�׸���, �̸鼭, ~�̰�)
	 * 			  = ����, ������ �� �� true �������� ����� true
	 * OR ������ : ���� || ����(�Ǵ�, ~�̰ų�)
	 * 			  => ����, ������ �� �� �ϳ��� true �̸� ����� true
	 * 
	 */
	
	public void method1() {
		
		// ����ڰ� �Է��� �������� ���  " �̸鼭" ¦������ �Ǻ��ϱ�

		Scanner sc =  new Scanner(System.in);
		
		System.out.print("������ �Ѱ� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		boolean result = (num > 0) && (num % 2 == 0);
		//&& �ǹ� : �׸���, ~�̸鼭, ~�̰�
		
		System.out.println("����ڰ� �Է��� ���� ����̸鼭 ¦���Դϱ�? : " + result);
		
	} // method1 �޼ҵ� ���� ��
	
	public void method2() {
		
		//����ڰ� �Է��� �������� 1 �̻� 100 ������ ������ �Ǻ��ϱ�
		// �̻� : ũ�ų� ����
		// ���� : �۰ų� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Ѱ� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 1 <= num <= 100 �̷��� ����ó�� ��� ������ ũ�⸦ ǥ���� �� ����.
		// => ����ڰ� �Է��� �������� 1���� ũ�ų� ����, "�׸���" 100���� �۰ų� �����ϱ�?
		boolean result = (num >= 1) && (num <= 100);
		System.out.println("����ڰ� �Է��� ���� 1�̻� 100���� �Դϱ�? : " + result);
		
	} // method2 �޼ҵ� ���� ��
	
	public void method3() {
		
		// ����ڰ� �Է��� ���� y "�̰ų� Y ���� �Ǻ��ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��� �Ͻ÷��� y �Ǵ� Y�� �Է��ϼ��� : ");
		
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		// || �ǹ� : �Ǵ�, ~�̰ų�
		
		System.out.println("����ڰ� �Է��� ���� y �Ǵ�  Y�Դϱ�? : " + result);

	} // method3 �޼ҵ� ���� ��
	
	public void method4() {
		
		/*
		 * && : AND ����, �� ���� ������ ��� true ���� ������� true
		 * true && true == true
		 * true && false == false
		 * false && true == false
		 * false && false == false
		 * 
		 * || : OR ����, �� ���� ���� �� �ϳ��� true �� ������� true
		 * true || true == true
		 * true || false == true
		 * false|| true == true
		 * false || false == false
		*/
		
		int num1 = 10;
		
		boolean result1 = false && (num1 > 0);
		// ���� �񱳿��� ������ Dead code ��� ���.
		// ���� �� ������ ������ ������
		// ���� ������� false ���ٵ� �� ���� ������ ������ ����� ��.

		System.out.println("result1 : " + result1);
		
		boolean result2 = true || (num1 > 0);
		// ���� �� ������ ������ ������
		// ���� ������� true ���ٵ� �� ���� ������ ������ ����°�
		
		System.out.println("result2 : " + result2);
		
	}

}
