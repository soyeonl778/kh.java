package com.kh.practice2.example;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice4() {
		//����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ�����
		//��� ���ڸ� �Ųٷ� ����ϼ���. ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �Ѵ�
		// ex) 1�̻��� ���ڸ� �Է��ϼ��� : 4
		// 4 3 2 1
		// 1�̻��� ���ڸ� �Է��ϼ��� : 0
		// �߸� �Է��ϼ̽��ϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		// n���� -1�� �����鼭 ����Ϸ���?
		if(n < 1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			continue;
		} 
		for(int i = n; i >= 1; i--) {
			
			System.out.print(i + " ");
		} break;
		}
	
	} // practice4 �޼ҵ� ���� ��
	
	public void practice11() {
		
		//����ڷκ��� ���� ���ڿ� ������ �Է¹޾�
		//������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����Ͻÿ�
		//��, ��µǴ� ���ڴ� �� 10�� �Դϴ�.
		//ex)
		//���� ���� : 4
		//���� : 3
		// 4 7 10 13 16 19 22 25 28 31
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print(a+" ");
			
			a += b;

		}
		
	}

}
