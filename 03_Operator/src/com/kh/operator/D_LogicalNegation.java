package com.kh.operator;

public class D_LogicalNegation {
	
	/*
	 * �� ���� ������ 
	 * ����( true / false ) �� �ݴ�� �ٲ��ִ� ������
	 * 
	 * [ǥ����] 
	 * !����
	 */
	
	public void method1() {
		
		System.out.println("true �� ���� : " + !true); //false
		System.out.println("false �� ���� : " + !false); //true
		
		boolean b = true;
		boolean b2 = !b; // false
		
		System.out.println("b : " + b );
		System.out.println("b2 : " + b2);
		
		//�����������ڴ� �ܼ��� ������ �ٲ��ֱ⸸ ���� �ٽ� �����ϴ� ���ұ����� ���� ����!
		
	}

}
