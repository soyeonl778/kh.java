package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		  
		
	
	}	
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double a = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("���� : ");
		double b = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("���� : ");
		double c = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("���� : " + (int)(a+b+c));
		System.out.println("��� : " + (int)(a+b+c)/3);
		
	}
	
	
	
	
	
	
	
	/*public void method2() {
		
		//�Ǽ������� ����, ����, ���� ������ ������ �Է� �޾� ������ ��� ���ϱ�.
		//�̶� ������ ����� ���������� ó��
		
		/*
		 * ���� : 90.0 
		 * ���� : 90.0 
		 * ���� : 90.0
		 * 
		 * ���� : 270 
		 * ��� : 90
		 */
		/*
		double korean = 90;
		System.out.println("���� : " + korean);
		
		double english = 90;
		System.out.println("���� : " + english);
		
		double math = 90;
		System.out.println("���� : " + math);
		
		System.out.println();
		
		double total = (int) korean + english + math;
		System.out.println("���� : " + total);
		
		double average = (int) total/3;
		System.out.println("��� : " + average);
	
	} // method2 �޼ҵ� ���� ��
	*/
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		double a = (int)num * num * 3.14;
		double b = (int)num * 2 * 3.14;
		
		
		System.out.printf("���� : %.1f \n", a);
		System.out.printf("�ѷ� : %.1f", b);
		
		//������ ���� ���������� �Է¹޾�
		//���� ������ �ѷ��� ����Ͽ� �Ǽ������� ����Ͻÿ�.
		//(����=������ * ������ * 3.14, �ѷ� =������ * 2 * 3.14)
		/*
		 * ex)������: 5
		 * 
		 * ���� : 78.5 
		 * �ѷ� : 31.4
		 */
		/*
		int radius = 5;
		
		double extent = (int) radius * radius * 3.14;
		double circum = (int) radius * 2 * 3.14;
		
		System.out.println("������ : " + radius);
		System.out.println();
		System.out.println("���� : " + extent);
		System.out.println("�ѷ� : " + circum);
		*/
	}

} //method4 �޼ҵ� ���� ��
