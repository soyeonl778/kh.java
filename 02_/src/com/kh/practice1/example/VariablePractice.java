package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ��� :");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		String gender = sc.nextLine();
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		Double cm = sc.nextDouble();
		sc.nextLine();
		
		System.out.printf("Ű %.1f�� %d�� %s %s�� �ݰ����ϴ�^^ \n", cm, age, gender, name);
		// �� Ű�κ��� �Ҽ��� 6�ڸ����� �������� �˴ٰ��� �� ;; ��� ã����!!! %.1f �ϸ� �Ҽ��� ���ڸ����� ǥ�Ⱑ��, .3 �ϸ� ���ڸ� ǥ��!
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.println("���ϱ� ��� : " + (a+b));
		System.out.println("���� ��� : " + (a-b));
		System.out.println("���ϱ� ��� : " + (a*b));
		System.out.println("������ �� ��� : " + (a/b));
		System.out.println("������ �������� ��� : " + (a%b));
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double a = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("���� : ");
		double b = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("���� : " + (a*b));
		System.out.println("�ѷ� : " + ((a*b)*2));
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String str = sc.nextLine();
		
		char a = str.charAt(0);
		char b = str.charAt(1);
		char c = str.charAt(2);
		
		System.out.println("ù��° ���� : " + a);
		System.out.println("�ι�° ���� : " + b);
		System.out.println("����° ���� : " + c);
		
		
		
		
	}
	
	
	//���� 1�� Ǯ��
	
		public void inputTest3() {
			
			//�̸�(String), ����(String), ����(int), Ű(double)
			
			Scanner sc = new Scanner(System.in);
			
			
			System.out.print("�̸��� �Է��Ͻÿ� : ");
			String name = sc.nextLine();
			
			System.out.print("������ �Է��Ͻÿ�(��/��) :");
			String gender = sc.nextLine();
					
			System.out.print("���̸� �Է��Ͻÿ� : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Ű�� �Է��Ͻÿ� : ");
			double height = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Ű" + height + "��" + age + "��" + gender + "��" + name + "�� �ݰ����ϴ�^^");
			System.out.println("���� : " + gender);
			System.out.println("���� : " + age);
			System.out.println("Ű : " + height);
			
		} // inputTest3 �޼ҵ� ���� ��
		
		//���� Ÿ���� �Է¹޴� ���
		public void inputTest4() {
			
			Scanner sc = new Scanner(System.in);
			
			/*
			 * Scanner Ŭ�������� �����ϴ� �Է¿� �޼ҵ��
			 * ���ڿ��� �Է¹��� �� => sc.next(), sc.nextLine()
			 * �������� �Է¹��� �� => sc.nextInt(), sc.nextByte(), sc.nextShort(),sc.nextLong();
			 * �Ǽ����� �Է¹��� �� => sc.nextDouble(), sc.nextFloat(), 
			 * ���ڸ� �Է¹��� �� => sc.nextChar() �������� �ʴ� �޼ҵ�!
			 *                sc.nextLine() ���� ���ڿ��ν� �Է��� ���� �� 0��° �ε����� ���ڸ� "����"
			 */
			
			// �̸�(String), ����(char), ����(int), Ű(double)
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			System.out.print("����(M/F) : ");
			// char gender = sc.nextChar();
			
			/* 
			 * index : ����, ��ȣ, ����, .. �̷���
			 * 
			 * ex)
			 * "apple" ���ڿ��� �ε���
			 *  12345 
			 *  01234
			 *  
			 *  "apple" ���ڿ����� 3�� �ε����� ���ڴ�? "��"
			 */
			
			/*
			 * charAt �޼ҵ�
			 * ���ڿ��κ��� x��° ���ڸ� �������ִ� �޼ҵ�
			 * [ǥ����]
			 * ���ڿ���.charAt(���� ��ġ��);
			 * 
			 * ��������
			 * ���� ���ڿ��� ���� �� ���� �� ������ ū �ε��� ���� �����Ѵٸ�
			 * StringIndexOutOfBoundsException �߻�
			 * => �ַ� ���ڿ��� �� ���� < ������ ������ �ε��� ��ġ�� �� ��� �߻�
			 * 
			 */
			
			char gender = sc. nextLine().charAt(0); // charAt->���° ���ڿ� �̾��ټ� �ִ� �޼ҵ�
			
			System.out.print("���� : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			
			System.out.print("Ű : ");
			double height = sc.nextDouble();
			sc.nextLine();
			
			
			System.out.println("�̸� : " + name);
			System.out.println("���� : " + gender);
			System.out.println("���� : " + age);
			System.out.println("Ű : " + height);
			

		}
		
		public void method7() {
			
			Scanner sc = new Scanner(System.in);
			
			//���� ���ΰ��� �Ǽ������� �Է� �޾�
			// �簢���� ������ �ѷ��� ����Ͽ� ���
			// ex) ���� :
			//     ���� : 
			//     ���� : 
			//     �ѷ� : 
			
			
			System.out.print("���� : ");
			double row = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("���� : ");
			double column = sc.nextDouble();
			sc.nextLine();

			System.out.println("���� : " + (row * column));
			System.out.println("�ѷ� : " + (row + column)*2);

			
		} //method3 �޼ҵ� ���� ��

			
			
			
			
		}

