package com.kh.practice2.example;

public class CastingPractice {
	
	public void method2() {
		
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
	
	public void method4() {
		
		//������ ���� ���������� �Է¹޾�
		//���� ������ �ѷ��� ����Ͽ� �Ǽ������� ����Ͻÿ�.
		//(����=������ * ������ * 3.14, �ѷ� =������ * 2 * 3.14)
		/*
		 * ex)������: 5
		 * 
		 * ���� : 78.5 
		 * �ѷ� : 31.4
		 */
		
		int radius = 5;
		
		double extent = (int) radius * radius * 3.14;
		double circum = (int) radius * 2 * 3.14;
		
		System.out.println("������ : " + radius);
		System.out.println();
		System.out.println("���� : " + extent);
		System.out.println("�ѷ� : " + circum);
		
	}

} //method4 �޼ҵ� ���� ��
