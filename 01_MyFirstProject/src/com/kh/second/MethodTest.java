package com.kh.second;

// com.kh.second.MethodTest
public class MethodTest { // MethodTest Ŭ���� ���� ����
	
	/*
	 * �� Ŭ���� ���� ���� ���� �޼ҵ带 �����ص� �� ����
	 * �� Ŭ���� ���� ������ ���� �޼ҵ带 ������ �ʿ䵵 ����
	 */
	
	public void testPrintA() { // testPrintA �޼ҵ� ���� ����
		
		// �� �޼ҵ忡�� �����ϰ���� �ڵ�� �ۼ�
		System.out.println("testPrintA �޼ҵ� ����");
		
		// ù��° ���
		/*
		System.out.println("testPrintB �޼ҵ� ����");
		System.out.println("testPrintC �޼ҵ� ����");
		*/
		
		// �ι�° ���
		/*
		testPrintB();
		testPrintC();
		*/
		
		// ����° ���
		testPrintB();
		
	} // testPrintA �޼ҵ� ���� ��
	
	public void testPrintB() { // testPrintB �޼ҵ� ���� ����
		
		System.out.println("testPrintB �޼ҵ� ����");
		
		// System.out.println("testPrintC �޼ҵ� ����");
		
		testPrintC();
		
	} // testPrintB �޼ҵ� ���� ��
	
	// testPrintC �޼ҵ� ����� => System.out.println ���� "testPrintC �޼ҵ� ����" ���
	public void testPrintC() { // testPrintC �޼ҵ� ���� ����
		
		System.out.println("testPrintC �޼ҵ� ����");
		
		// testPrintA();
		// ������ �߻���Ű�� �κ�
		// ���� : testPrintC �޼ҵ忡�� testPrintA �޼ҵ带 ȣ���ϴ� ��� "���ѹݺ�" ���� �޼ҵ���� ȣ���
		// ������
		// ���α׷� ����
		// A ����
		// B ����
		// C ����
		// A ����
		// B ����
		// C ����
		// ...
		// ���� ���� ��� => Exception in thread "main" java.lang.StackOverflowError
		// Exception : ������ ��Ÿ���� �ܾ�
		
		// StackOverflowError
		// ���α׷��� ���� �߿� �޸� ������ ���� ����Ǵ� ����
		// Stack �� �޸� ������ ���� �� �ϳ��ε�, Stack �� ũ�⸦ ��� ��� �߻�
		
	} // testPrintC �޼ҵ� ���� ��
	
	// ���� �� Ŭ�������� �Ϲ� �޼ҵ�鸸 �����ϰ� main �޼ҵ尡 �������� ����
	// => Run As �� ���� �Ұ���
	
} // MethodTest Ŭ���� ���� ��
