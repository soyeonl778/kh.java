package com.kh.practice2.example;

import java.util.Scanner;

public class OpreatorPractice {
	
	public void practice1() {
		
		//Ű����� �Է¹��� �ϳ��� ������ ����̸� "�����, �ƴϴ�"�� ����Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String result = (num > 0) ? "����Դϴ�" : "����� �ƴմϴ�";
		System.out.printf("%d ��(��) %s. \n", num, result  );
		
	} //practice1 �޼ҵ� ���� ��
	
	public void practice2() {
		
		//Ű����� �Է¹��� �ϳ��� ������ ����̸� "�����"
		//����� �ƴ� ��� 0�̸� "0�̴�" 0�� �ƴϸ� "������"�� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String result = (num > 0) ? "�����" : ((num == 0) ? "0�̴�" : "������"); 
		System.out.println(result);
		
	} //practice2 �޼ҵ� ���� ��
	
	public void practice3() { 
		
		//Ű����� �Է� ���� �ϳ��� ������ ¦���̸� "¦����", ¦���� �ƴϸ� "Ȧ����"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println((num % 2 == 0) ? "¦����" : "Ȧ����");

	} //practice3 �޼ҵ� ���� ��
	
	public void practice4() {
		
		//�ο����� ���� ������ Ű���� �Է� �ް�
		// 1�δ� ��������, ���� �������� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο��� : ");
		int person = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		sc.nextLine();
		
		System.out.println("1�δ� �������� : " + (candy / person));
		System.out.println("���� �������� : " + (candy % person));
		
	} //practice4 �޼ҵ� ���� ��
	
	public void practice5() {
		
		//Ű����� �Է¹��� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���Ͻÿ�
		//�� �� ������ 'm'�̸� ���л�, 'm'�� �ƴϸ� ���л����� ��� ó�� �ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��(���ڸ�) : ");
		int group = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print(((ch == 'M') ? "���л�" : "���л�"));
		
	} //practice5 �޼ҵ� ���� ��
	
	public void practice6() {
		
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		for(int i = 5; i >= 1; i--) {
			
			for(int j = 1; j <= 5; j++) {
				
				if(j>=i) {
					System.out.print("*");
					
				} else {
					
					System.out.print(" ");
				}
			}
			}
			System.out.println();
	} 
		// practice6 �޼ҵ� ���� ��
	
		public void practice7() {
			
			for(int i = 0; i < 5; i++) {
				
				for(int j = 1; j <= 5; j++) {
					
					if(i < j) {
						System.out.print("*");
						
					} else {
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	
		
	}
}
