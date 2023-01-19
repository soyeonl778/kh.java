package com.kh.practice2.example;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		/*
		 * �Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ "�����޴��Դϴ�"�� 
		 * ���� ��ȣ�� ������ "���α׷��� ����˴ϴ�." �� ����ϼ���.
		 * ex)
		 * 1. �Է�
		 * 2. ����
		 * 3. ��ȸ
		 * 4. ����
		 * 9. ����
		 * �޴���ȣ�� �Է��ϼ��� : 
		 * ��ȸ �޴��Դϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�޴���ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String result = "";
		
		switch(num) {
		case 1 : result = "�Է�"; break;
		case 2 : result = "����"; break;
		case 3 : result = "��ȸ"; break;
		case 4 : result = "����"; break;
		case 9 : System.out.println("���α׷��� ����˴ϴ�."); 
		return;
		default : System.out.println("�ٽ� �Է����ּ���.");
		return;
		}
		 
		System.out.println(result + "�޴� �Դϴ�.");
	} // practice1 �޼ҵ� ���� ��.
	
	public void practice2() {
		
		/*
		 * Ű����� ������ �Է¹޾� ������ ����̸鼭 ¦���϶� "¦��" �� ����ϰ� 
		 * ¦���� �ƴϸ� "Ȧ����"�� ����Ͻÿ�. ����� �ƴϸ�
		 * "����� �Է����ּ���" �� ����ϼ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		if(0 > num) {
			System.out.println("����� �Է����ּ���.");
			
		} else if(num % 2 == 0) {
			System.out.println("¦��");
			
		} else {
			System.out.println("Ȧ��");
		}
		
	} //practice2 �޼ҵ� ���� ��
	
	public void practice3() {
		
		/*
		 * ����, ����, ���� �������� ������ Ű����� �Է¹ް� 
		 * �հ�� ����� ����ϰ� �հ�� ����� �̿��Ͽ� 
		 * �հ�/���հ� ó���ϴ� ����� �����ϼ���
		 * (�հ����� :�� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻�)
		 * �հ�������� "�����մϴ�, �հ��Դϴ�!" �� ����ϰ�
		 * ���հ��� ��쿡�� "���հ��Դϴ�." �� ����ϼ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�������� : ");
		int korean = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�������� : ");
		int math = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�������� : ");
		int english = sc.nextInt();
		sc.nextLine();
		
		int total = korean + math + english;
		double average = (int) total / 3;
		
		if((korean >= 40 || math >= 40 || english >= 40) && (average >= 60)) {
		
			System.out.println("�հ� : " + total);
			System.out.println("��� : " + average);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
			
		} else {
				
				System.out.println("���հ��Դϴ�.");			
		}
		
	}	//practice3 �޼ҵ� ���� ��
	
	public void practice4() {
		
		/*
		 * ��
		 */
		
		
	}

}
