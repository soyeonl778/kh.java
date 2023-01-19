package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * �ܵ� if��
	 * 
	 * [ǥ����]
	 * if(���ǽ�) {
	 *           ���ǽ��� true �� ��� ������ �ڵ�
	 * }
	 * 
	 * => ���ǽ��� ����� ��(true) �� ��� �߰�ȣ ��� �����ڵ尡 ����
	 * => ���ǽ��� ����� ����(false) �� ��� �߰�ȣ ��Ͼȿ� �ڵ带 �����ϰ� �ǳʶ�
	 */
	
	//���׿����ڸ� ���ǹ����� �ٲ㺸��
	
	public void method1() {
		
		//����ڿ��� �������� �Է¹��� ��
		// "����Դϴ�", "0�Դϴ�", "�����Դϴ�"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		//���׿����� ����
		// String result = (num > 0) ? "����Դϴ�" : ((num == 0) ? "0�Դϴ�" : "�����Դϴ�");
		
		//�ܵ� if ����
		String result = ""; // ��� ������ ���� ������ �̸� ""(���ڿ�)�� ����
		
		
		if(num > 0) { //����� ���
			
			result = "����Դϴ�";
		}
			
		if(num == 0) { // 0�� ���
			
			result = "0�Դϴ�";
		}
		
		if(num < 0) { //�����Դϴ�
			
			result = "�����Դϴ�";
		}	
		
		System.out.println(result);
		
	} //method1 �޼ҵ� ���� ��
	
	public void method2() {
		
		// ����ڰ� �Է��� �������� ¦������ Ȧ������ �Ǻ� �� ���
		// => ����ڰ� �Է��� ������� ¦������ Ȧ������ �Ǻ� �� ���
		// => �⺻ �������� : ���
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		/*
		if((num > 0) && (num % 2 == 0)) { // ��� �߿����� ¦���� ���
		
			System.out.println("¦���Դϴ�");
			
		}
		
		if((num > 0) && (num % 2 == 1)) { // ����߿����� Ȧ���� ���
			
			
			System.out.println("Ȧ���Դϴ�");
		}
		*/
		
		// ��ø if��
		// => ����� ����
		if(num > 0) { //�켱������ ¦������ Ȧ������ �Ǻ��ϱ� ���� ����������� �Ǻ��ϱ�
			
			// num �� ������ �������� ¦������ Ȧ������ �Ǻ��ϰڴ�.
			if(num % 2 == 0) { //¦���� ���
				
				System.out.println("¦���Դϴ�");
			}
			
			if(num % 2 == 1) { // Ȧ���� ���
				
				System.out.println("Ȧ���Դϴ�");
			}
		}
		
		
		
		
		
	} //method2 �޼ҵ� ���� ��
	
	public void method3() {
		
		// ����ڰ� �Է��� ���̰��� ������ ��� / û�ҳ� / ���� ���
		// ���(13�� ����), û�ҳ�(13�� �ʰ� ~19�� ����), ����(19�� �ʰ�)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
 		if((age > 0) && (age <= 13)) { //����� ���(0�ʰ� ~13�� ����)
 			
 			System.out.println("����Դϴ�");
 		}
 		
 		if((13 < age) && (age <= 19)) {
 			
 			System.out.println("û�ҳ��Դϴ�");
 		}
		
		if(age > 19) {
			
			System.out.println("�����Դϴ�");
		}
		
	} // method3 �޼ҵ� ���� ��
	
	public void method4() {
		
		// ����ڿ��� �Է¹��� �ֹι�ȣ�� ������ ���� / ���� �Ǻ� �� ���
		// �ֹι�ȣ : yymmdd-x000000
		//=> 1/3 �̸� ����, 2/4 �̸� ����
		
		// 1. ����ڿ��� �ֹι�ȣ �Է¹ޱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ �Է�(-����) : ");
		String personId = sc.nextLine(); // "771231-1xxxxxx"
		
		// 2. �Է¹��� �ֹι�ȣ�� ���� ������ �ش�Ǵ� ���� (7�� �ε���) �� ����
		char gender = personId.charAt(7); // '1'
		
		// 3. ������ �ش�Ǵ� ���ڰ� 1 �Ǵ� 3 �� ��� => "�����Դϴ�" ���
		//    ������ �ش�Ǵ� ���ڰ� 2 �Ǵ� 4 �� ��� => "�����Դϴ�" ���
		
		if((gender == '1') || (gender == '3')) {
			
			System.out.println("�����Դϴ�");
		}
		
		if((gender == '2') || (gender == '4')) {
			
			System.out.println("�����Դϴ�");
		}
		
		// �����ڸ��� '1' �� �ƴϰ� �׸��� '2' �� �ƴϰ� �׸��� '3' �� �ƴϰ� �׸���
		// '4'�� �ƴҰ�� => �̷� �ֹε�Ϲ�ȣ�� �̼��� �����٤Ѥ�
		
		if((gender != '1') && (gender != '2') && (gender != '3') && (gender != '4')) {
			
			System.out.println("�߸��� �ֹι�ȣ�� �Է��߽��ϴ�.");
		}
		

	}
	
	

}
