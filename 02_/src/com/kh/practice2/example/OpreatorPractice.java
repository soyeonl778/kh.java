package com.kh.practice2.example;

import java.util.Scanner;

public class OpreatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("���� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num < 0) {
			
			System.out.println("����� �ƴϴ�");
			
		} else {
			
			System.out.println("�����");
		}
		
		/*
		//Ű����� �Է¹��� �ϳ��� ������ ����̸� "�����, �ƴϴ�"�� ����Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String result = (num > 0) ? "����Դϴ�" : "����� �ƴմϴ�";
		System.out.printf("%d ��(��) %s. \n", num, result  );
		*/
		
	} //practice1 �޼ҵ� ���� ��
	
	public void practice2() {
		
		System.out.print("���� : ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
			
			System.out.println("�����");
			
		} else if(num == 0) {
			
			System.out.println("0�̴�");
			
		} else {
			
			System.out.println("������");
			
		}
		
		//Ű����� �Է¹��� �ϳ��� ������ ����̸� "�����"
		//����� �ƴ� ��� 0�̸� "0�̴�" 0�� �ƴϸ� "������"�� ���
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String result = (num > 0) ? "�����" : ((num == 0) ? "0�̴�" : "������"); 
		System.out.println(result);
		*/
		
	} //practice2 �޼ҵ� ���� ��
	
	public void practice3() { 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num % 2 == 0) {
			
			System.out.println("¦����");
		} else {
			
			System.out.println("Ȧ����");
			
		}
		
		//Ű����� �Է� ���� �ϳ��� ������ ¦���̸� "¦����", ¦���� �ƴϸ� "Ȧ����"
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println((num % 2 == 0) ? "¦����" : "Ȧ����");
		*/

	} //practice3 �޼ҵ� ���� ��
	
	public void practice4() {
		
		//�ο����� ���� ������ Ű���� �Է� �ް�
		// 1�δ� ��������, ���� �������� ���
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� ���� : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.println("1�δ� ���� ���� : " + (b / a));
		System.out.println("���� ���� ���� : " + (b % a));		
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο��� : ");
		int person = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		sc.nextLine();
		
		System.out.println("1�δ� �������� : " + (candy / person));
		System.out.println("���� �������� : " + (candy % person));
		*/
	} //practice4 �޼ҵ� ���� ��
	
	public void practice5() {
		
		//Ű����� �Է¹��� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���Ͻÿ�
		//�� �� ������ 'm'�̸� ���л�, 'm'�� �ƴϸ� ���л����� ��� ó�� �ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String str = sc.nextLine();
		
		System.out.print("�г�(���ڸ�) : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��(���ڸ�) : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		if((ch == 'm') || (ch == 'M')) {
			
			System.out.println("���л�");
		} else if((ch == 'f') || (ch == 'F')) {
			
			System.out.println("���л�");
		} else {
			
			System.out.println("�߸��Է��߽��ϴ�.");
		}

		/*
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
		*/
		
	} //practice5 �޼ҵ� ���� ��
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		if(age <= 13) {
			
			System.out.println("���");
		} else if (age <= 19) {
			
			System.out.println("û�ҳ�");
			
		} else {
			
			System.out.println("����");
		}
		
	} //�޼ҵ�6 ��
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� : ");
		int c = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		int total = a + b + c;
		System.out.println("�հ� : " + total);
		
		double average = (int) total / 3; 
		System.out.println("��� : " + average);
		
		if((a >= 40) && (b >= 40) && (c >= 40)) {
			
			if(average >= 60) {
				
				System.out.println("�հ�");
			}
			
		} else {
			
			System.out.println("���հ�");
		}
		
		
		
	} //�޼ҵ� 7 ��
	
	public void practice8() {
		
		//�ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����϶�
		Scanner sc = new Scanner(System.in);
	
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
		String id = sc.nextLine();
		
		char ch = id.charAt(7);
		
		if((ch == '1') || (ch == '3')) {
			
			System.out.println("�����Դϴ�.");
			
		} else if((ch == '2') || (ch == '4')) {
			
			System.out.println("�����Դϴ�");
			
		} else {
			
			System.out.println("�߸��Է��߽��ϴ�");
		}
		
	} //�޼ҵ� 8��
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�Է� : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		if((num1 >= a) || (num2 < a)) {
			
			System.out.println("true");
		} else {
			
			System.out.println("false");
		}
		
	} //�޼ҵ�9 ��
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� 1 : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�Է� 2 : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�Է� 3 : ");
		int c = sc.nextInt();
		sc.nextLine();
		
		if((a == b) || (b == c) || (a == c)) {
			
			System.out.println("true");
		} else {
			
			System.out.println("false");
		}
		
		
	}
	
	
	public void practice11() {
		
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
	
		public void practice() {
			
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
