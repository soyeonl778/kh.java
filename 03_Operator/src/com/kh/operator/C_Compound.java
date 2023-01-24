package com.kh.operator;

public class C_Compound {

	/*
	 * ���� ���� ������ 
	 * ��� �����ڿ� ���� �����ڸ� �ղ� ����ϴ� ������
	 * 
	 * [����] += -+ *= /= %=
	 * 
	 * ex) a = a + 1; => a += 1; 
	 * ������ a ���� 1�� ���� a �� �ٽ� �������ְڴ�.
	 */
	
	public void method1() {
		
		int num = 12;
		System.out.println("���� num : " + num);
		
		//num �� 3 ������Ű��
		num = num + 3;
		System.out.println("3������Ų num : " + num);
		
		//num �� 3 ������Ű��
		// ������ += ��;
		num += 3; // num = num + 3; �� ���� ��
		System.out.println("�� 3 ������Ų num : " + num);
		
		//num �� 5 ���ҽ�Ű��
		num -= 5; // num = num - 5; �� ���� ��
		System.out.println("5 ���ҽ�Ų num : " + num);
		
		//num �� 6�� ������Ű��
		num *= 6; // num = num * 6; �� ���� ��
		System.out.println("6�� ������Ų num : " + num);
		
		// num �� 2�� ���ҽ�Ű��
		num /= 2; // num = num / 2; �� ���� ��
		System.out.println("2�� ���ҽ�Ų num : " + num);
		
		// num �� 4�� ���������� �������� num �� ����
		num %= 4; // num = num % 4; �� ���� ��
		System.out.println("4�� ������ ���� num : " + num);
		
		// += �� ��� ���ڿ� ���յ� �����ϴ�.
		String str = "Hello";
		
		// "HelloWorld" ��� ���ڿ� �����
		//str = str + "world";
		str += "world";
		
		
		System.out.println(str);

	}

}
