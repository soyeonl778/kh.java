package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
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
		
		public void method3() {
			
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

