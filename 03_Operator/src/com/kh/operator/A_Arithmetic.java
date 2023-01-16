package com.kh.operator;

public class A_Arithmetic {
	
	/*
	 * ���������
	 * ���� �����ڷν� ���� ����� �켱������ �Ϲ� ���� ����� ������ ������
	 * 
	 * ��� �������� ����
	 * ���� => +
	 * ���� => -
	 * ���� => *
	 * ������ => / (���������� "��"�� ����)
	 * ��ⷯ(Modular) => % (���������� "������"�� ����)
	 * 
	*/
	
	public void method1() {
	
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		// ��ȣ�� ���� �ʴ´ٸ�
		//String ó�� ���� ���� 10�� 3�� ���ڿ�ó�� �����Ǳ� ������ 103�� ����.
		
		System.out.println("num1 - num2 = " + (num1 - num2));
		// ������ ��� ��ȣ�� �������� ������
		// string ó�� ���� ���� 10, 3 �� -�� ���� �ν��ϱ� ������ ������ ������ �߻�
		// => �켱������ ������ ��쿡�� ���ʺ��� ���ʴ�� ����Ǳ� ������
		//    ���ڿ� + ���� - ���� => ���ڿ� - ���� �� �νĵ�
		// (num1 - num2) ó�� ��ȣ�� ���������!!
		
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		
		System.out.println("num1 % num2 = " + (num1 % num2));
		// ���� �� ������ , ��ⷯ�� ���� �������� �켱������ ���� ������
		// ��ȣ�� ���� �ʾƵ� ��Ȯ�� ����� ����
		// => ��, �������� ���� ��� ����� ��ȣ�� ���°� ����
		
		//������, ��ⷯ ���� �� ������ ��
		//System.out.println(10 / 0);
		//System.out.println(10 % 0);
		// java.lang.ArithmeticException / by zero ��� ������ �߻�
		// => ���а� ���������� 0���� ������� �Ұ�!! �����ؾ��Ѵ�.
		
		double a = 35; // 35 -> 35.0
		double b = 10; // 10 - 10.0
		
		System.out.println("a + b = " + (a + b)); //45.0
		System.out.println("a - b = " + (a - b)); //25.0
		System.out.println("a * b = " + (a * b)); //350.0
		System.out.println("a / b = " + (a / b)); //3.5
		System.out.println("a % b = " + (a % b)); //5.0
		// �Ǽ������� �������� �Ǽ�

		
	} // method1 �޼ҵ� ���� ��
	
	//��������
	public void method2() {
		
		/*
		 * �ο��� , ������ ������ Ű���� �Է� �ް�
		 * 1�δ� �����ϰ� �������� ������ ������ �����ְ� ���� ������ ����
		 * 
		 * ����
		 * �ο��� : 5
		 * �������� : 164
		 * ------------
		 * 1�δ� ���� ���� : 
		 * �����ְ� ���� ���� ���� :
		 */
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		
		System.out.print("�ο��� : ");
		int person = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�������� : ");
		int candy = sc.nextInt();
		sc.nextLine();
		
		System.out.println("-------------");
		
		System.out.println("1�δ� ���� ���� : " + (candy / person));
		
		System.out.println("�����ְ� ���� ���� ���� : " + (candy % person));
		
		
		
		
		
		
	}
}
