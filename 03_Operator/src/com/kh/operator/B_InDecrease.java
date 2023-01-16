package com.kh.operator;

public class B_InDecrease {

	/*
	 * ���� ������ �ѹ��� ���� 1 ������Ű�ų� �ѹ��� ���� 1���ҽ�Ű�� ���׿�����
	 * 
	 * [����] 
	 * ++ : ���� 1 ������Ű�� ������ 
	 * ++��; => ����������
	 * ��++; => ����������
	 * 
	 * -- : ���� 1 ���ҽ�Ű�� ������ --��; ��--;
	 * 
	 * (���� ������)�� : �������� => ������ ��ó��
	 * ��(���� ������) : �������� => ��ó�� ������
	 */

	public void method1() {
		
		int num = 10;
		System.out.println("num : " + num);
		
		num++; // num ������ ���� 1�� ������Ű�ڴ�.
		       // ��, num = num + 1; �� ���� �ǹ�
		
		System.out.println("����� num  : " + num);
		
		
	} // method �޼ҵ� 1���� ��
	
	public void method2() {
		
		//����������
		int a = 10;
		int b = ++a; // a ���� ���� �������� �ϰ� ���� b ��� ������ �����Ѵ�.
		
		System.out.println("a : " + a + ", b : " + b);
		
		//��������
		int c = 10;
		int d = c++; // d��� ������ �� ���� ���� �����ϰ� ���� c ���� �������� �Ѵ�.
		
		System.out.println("c : " + c + ", d : " + d);
		
	} // method2 �޼ҵ� ���� ��
	
	public void method3() {
		
		int num1 = 20;
		int result1 = num1++ * 3;
		// result1 = 20 * 3 ���� �� num1 = num1 + 1 ������ �Ͼ
		
		System.out.println("num1 : " + num1);
		System.out.println("result1 : " + result1);
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		// num2 = num2 + 1 ���� �� result2 = 21 * 3 ������ �Ͼ
		
		System.out.println("num2 : " +  num2);
		System.out.println("result2 : " + result2);

	} //method3 �޼ҵ� ���� ��
	
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
