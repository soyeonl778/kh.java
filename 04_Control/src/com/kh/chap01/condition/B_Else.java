package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * if-else��
	 * 
	 * [ǥ����]
	 * if(���ǽ�) {
	 *      ���ǽ��� ����� true �� ��� ������ �ڵ�;
	 * } else {
	 * 
	 *      ���ǽ��� ����� false �� ��� ������ �ڵ�;
	 * }
	 * 
	 * => ���ǽ��� ����� true �� ��� if �� ���� ������ ����ǰ�, if-else �� ��ü�� ��������
	 * => ���ǽ��ǰ���� false �� ��� ������ else �� ���� ������ ����� �� ��������
	 */
	
	public void method1() {
		
		// ����ڿ��� �������� �Է¹��� �� ¦�� / Ȧ�� ���(����ϰ�츸 ����ǰԲ�)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// ������� ���� �Ǻ��ϱ�
		if(num > 0) { //����� ���
			
			// ¦������ Ȧ������ �Ǻ��ϱ�
			// ���ǽ� ����� true �̸� else ���� �ǳʶڴ�.
			// => �ܵ� if���� �ι� ���� �ͺ��� ���ʿ��� ������ �پ��� ���� �� ȿ�����̴�.
			// => else �������� ������ ������ ������ �ʿ䰡 ����!!
			
			
			if(num % 2 == 0) { //¦���� ���
				
				System.out.println("¦���Դϴ�");
				
			} else { //¦���� �ƴ� ���
				
				System.out.println("Ȧ���Դϴ�");
			}
			
		} else { // ����� �ƴҰ��
			
			System.out.println("����� �Է��ؾ� �մϴ�.");
			
		}
		/*// else ��� �ܵ� if ���� ����
		 * if(num <= 0) {
		 * 
		 *        System.out.println("����� �Է��ؾ� �մϴ�")
		 *  }      
		 */
		
	} //method1 �޼ҵ� ���� ��
	
	/*
	 *  if-else if��
	 *  ������ �񱳴���� ������ ���� ���� ������ ������ �ΰ��� �� �� ���
	 *  
	 *  [ǥ����]
	 *  if(���ǽ�1) {
	 *  
	 *       ���ǽ�1�� true �� ��� ������ �ڵ�;
	 * } else if(���ǽ�2) {
	 *          
	 *       ���ǽ�2 �� true �� ��� ������ �ڵ�;
	 * } else if(���ǽ�3) {
	 * 
	 *      ���ǽ�4 �� true �� ��� ������ �ڵ�;
	 * } else {
	 * 
	 *      ���� ���ǵ��� ��� false �� ��� �ݵ�� ������ ������ ���� ��� ������ �ڵ�;
	 * }
	 * 
	 */
	
	public void method2() {
		
		// ����ڿ��� ������ �Է¹ް� ��� / 0 / �������� �Ǻ� �� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) { // ����� ���
			
			System.out.println("����Դϴ�");
			
		} else if(num == 0) { // 0�� ���
			
			System.out.println("0�Դϴ�");
			
		} else { // ����� �ƴϰ� 0�� �ƴҰ�� => ������ ���
			
			System.out.println("�����Դϴ�");
			
		}
		
		/* else if(num < 0) {
			
			System.out.println("�����Դϴ�");
			
		} */
				
		} // method2 �޼ҵ� ���� ��
	
	public void method3() {
		
		// ����ڿ��� ���̸� �Է¹޾� ��� / û�ҳ� / ���� �Ǻ� �� ���
		// ��� (0~13������), û�ҳ�(13���ʰ�~19������), ����(19���ʰ�)
		// ��, ���̸� ������ �Է����� ��� "�߸� �Է��߽��ϴ�" ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		// �켱������ ���̰� ������������ �Ǻ�
		if(age < 0) { // ������ ���
			
			System.out.println("�߸� �Է��߽��ϴ�");
		} else { //������ �ƴҰ��
			
			// ���, û�ҳ�, �������� �Ǻ��ϱ�
			if(age <= 13) { //����� ���
				//�̹� �տ��� age < 0  ������ false ���� ��������
				// age >= 0 ������ �� �ۼ��� �ʿ䰡 ����
				
				System.out.println("����Դϴ�");
			} else if(age <= 19) {
				
				System.out.println("û�ҳ��Դϴ�");
				
			} else { 
				
				System.out.println("�����Դϴ�");
			}
		} 
		
	} // method3 �޼ҵ� ���� ��
	
	//�ǽ�����
	
	public void method4() {
		
		/*
		 * ����ڷκ��� ���� ������ ������ �Է¹ޱ�
		 * 90�� �̻��� ��� "A���"
		 * 90�� �̸� 80�� �̻��� ��� "B���"
		 * 80�� �̸� 70�� �̻��� ��� "C���"
		 * 70�� �̸��� ��� "D���"
		 * 
		 * ����)
		 * ������ �Է��ϼ��� : 
		 * ����� ������ 89���̰�, ����� B����Դϴ�. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int point = sc.nextInt();
		sc.nextLine();
		
		String grade = "";
		/*char grade = '(����)'; // char �ڷ����� ��� �Ϲ������� ' '(����)���� �ʱ�ȭ
		 * 
		 * 
		 */
		
		if((point <= 100) && (point >= 0)) {
			
			
			
		} else {
			
			if(point >= 90) {
				
				grade = "A";
						
			} else if(point >= 80) {
				
				grade = "B";
				
			} else if(point >= 70) {
				
				grade = "C";
				
			} else {
				
				grade = "D";
			}
			
		}
		System.out.println("�߸� �Է��߽��ϴ�");
		System.out.print("����� ������ " + point + "�� �̰�, ����� " + grade + "��� �Դϴ�.");
	}


}
