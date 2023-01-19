package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	
	/*
	 * break��
	 * �ݺ����� �����ϴ� �б⹮ �߿��� "���� ����� �ݺ���"�� ���������� ����
	 * break; ������ ������ ���� �ش� break; �� �����L�� �ݺ����� "�� ��" ��������!!
	 * 
	 * [ǥ����]
	 * break;
	 * 
	 * �������� : switch�� ���� break �ʹ� �ٸ� ����
	 *         switch�� ���� break�� �ش� switch���� ���������� �뵵�� ��
	 */
	
	public void method1() {
		
		// �Ź� �ݺ������� ������ �߻��Ǵ� ������ (1 ~ 100) ���
		// ��, �� �������� Ȧ���� ��쿡�� �ݺ����� ���������Բ�(���ѹݺ��� �����Ű�ڴ�)
		
		while(true) {
			
		int random = (int)(Math.random() * 100 + 1);
		
		System.out.println("random : " + random);
			
		// �߻��� �������� Ȧ������ �Ǻ�
		if(random % 2 == 1) { //Ȧ���� ���
			System.out.println("Ȧ���� �߻��߽��ϴ�. ���α׷��� �����մϴ�.");
			//break;
			return; //���� return ������ �̿��ؼ� ���ѹݺ��� �����ų���� ������
			        //������ ���࿡ �ش� �ݺ��� �Ʒ��� �߰����� �������� �����ϰ� �ʹٸ�
			        //return ������ ���°� ���������� ����!!
			
			
		}
		
	 }
		
	// break; ������ ������ ���� �� �������� �̵�
	// System.out.println("�ݺ����� �� �������Գ�..?");
	// return; �������� �ݺ��� ���� �� ���
		
		
		
		
	
   } //method1 �޼ҵ� ���� ��
	
	public void method2() {
		
		// �Ź� ����ڿ��� ���ڿ��� �Է¹��� �� �ش� ���ڿ��� ���� (���ڿ�.length()) ���
		// ��, ����ڰ� �Է��� ���ڿ��� "exit" ���ڿ��� ��ġ�� ��� �ݺ��� ����
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
			
			//���ڿ��� ���̸� ����ϱ� �� �켱������ �� ���ڿ��� ���빰�� "exit" �������� �Ǻ�
			
			if(str.contentEquals("exit")) { //��ġ�Ѵٸ�
				
				break;
			}
			
			System.out.println(str + "�� ���� : " + str.length());
	
		}
		
		System.out.println("���α׷��� ����˴ϴ�.");
		// ���� ���� ���ѹݺ��� ������ �ʴ´ٸ�
		// ���������� �� ������ �ڵ���� Unreachable Code �� �Ǿ����
		
	} // method2 �޼ҵ� ���� ��
	
	public void method3() {
		
		// �Ź� �ݺ������� ����ڿ��� ����� �Է¹޾� 1 ~ ����ڰ� �Է¹��� ������� ���
		// ��, ����ڰ� ���������� ���� �� (����� �ƴ� ��) �� �Է����� ��
		// ����� �� ����� �Է¹��� ������ ������!! (��� �Է� �� ��� �� �ݺ��� ���������ڴ�)
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("��� �Է� : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			// ����� ��� => 1 ~ num ���� ���������� ����ϱ� => �ݺ��� ���������Բ�
			// ����� �ƴ� ��� => �ٽ� �ݺ��� �Ͼ�Բ�
			if(num > 0) { //����� ���
				
				for(int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				
				break; // ���� ���Ե� �ݺ����� �Ѱ��� �������� => while������ ��������
			
			} else { //����� �ƴ� ���
				
				System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���.");
				
			} 
			
		}
				
	}


}
