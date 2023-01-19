package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 * for��
	 * ��ȣ ���� �ݺ��� �����ϴ� �κ��� �ʱ��, ���ǽ�, ���������� �̷���� ����
	 * ���� ����Ŭ������ �����Ѵ�.
	 * 
	 * [ǥ����]
	 * for(�ʱ��;        ���ǽ�;         ������) {
	 * 
	 * 
	 *       �ݺ������� ������ �ڵ�;
	 *  }
	 * -�ʱ�� : �ݺ����� ����� �� "�ʱ⿡ �� �ѹ��� ����Ǵ� ����"
	 *         (�� �ݺ������� ����� ������ ���� �� �ʱ�ȭ �ϴ� ����)
	 *         ex) int i = 0; 
	 * -���ǽ� : "�ݺ����� ��� ����� ����" �� �ۼ��ϴ� ����
	 *         ���ǽ��� ����� true �� ��� �ݺ��� ����
	 *         ���ǽ��� ����� false �� ��� �ݺ����� ���߰� ��������
	 *         (���� �ʱ�Ŀ� ������ ������ ������ ���ǽ��� ������)
	 *         ex) i < 10;
	 * -������ : �ݺ����� �����ϴ� �������� "����"��Ű�� ����
	 *         (���� �ʱ�Ŀ� ���õ� ������ ������ �������� �ۼ�
	 *         ex) i++
	 *             i += 1
	 * 
	 * for���� �帧
	 * for���� ������ ����
	 * �ʱ�� -> ���ǽ�(���ǰ˻�) -> true �� ��� �����ϰ��� �ϴ� �ڵ� ���� -> ������
	 *         ���ǽ�(���ǰ˻�) -> true �� ��� �����ϰ��� �ϴ� �ڵ� ���� -> ������
	 *         ���ǽ�(���ǰ˻�) -> true �� ��� �����ϰ��� �ϴ� �ڵ� ���� -> ������
	 *         ...
	 *         ���ǽ�(���ǰ˻�) -> false �� ��� �ڵ� ���� x
	 * => �� �� ���ǽ��� ���� �˻縦 ���ؼ� ������ true �� ��츸 �ݺ��ؼ� ����ǰԲ� �ϴ� ����
	 */
	
	public void method1() {
		
		//"�ȳ��ϼ���" �� 5�� �ݺ��ؼ� ����ϰ� �ʹ�!
		/*
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		*/
		
		// ���� Ƚ���� ��쿡�� ���� �ٿ��ֱⰡ ����������
		// 100�� �ݺ��ϰ���� ��쿡��?
		// 1000�� �ݺ��ϰ���� ��쿡��?
		
		// 5ȸ �ݺ��Ҽ� �ְ� for�� �ۼ�
		// i ���� 1�������� 5���� �۰ų� ���������� 1�� �����ҵ��� �ݺ� ����
		// i : 1, 2, 3, 4, 5 => 5ȸ
		
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.println("�ȳ��ϼ���");
		}
		
	} // method1 �޼ҵ� ���� ��
	
	public void method2() {
		
		//i ���� 1�������� 6���� ���� �� ���� 1�� �����ҵ��� �ݺ� ����
		//i : 1, 2, 3, 4, 5 => 5ȸ
		for(int i = 1; i < 6; i++) {
			
			System.out.println("�ݰ����ϴ�.");
		}
		
		// i���� 11�������� 16���� ���� ������ 1�� ������ ���� �ݺ� ����
		// i : 11, 12, 13, 14, 15 => 5ȸ
		for(int i = 11; i < 16; i++) {
			
			System.out.println("�ٽø�����.");
		}
		
		// i�� ���
		//System.out.println("i : " + i);
		// => �ʱ�Ŀ��� ������ ������ �ش� for���� �߰�ȣ ���� �ȿ����� ��� ���� (�������� ����)
		
	} // method2 �޼ҵ� ���� ��
	
	public void method3() {
		
		// i ���� 1�������� 10���� ���������� �Ź� 2�� �����ҵ��� �ݺ� ����
		// i = 1, 3, 5, 7, 9 => 5ȸ
		for(int i = 1; i < 10; i += 2) {
			
			System.out.println("����");
		}
		
	} //method3 �޼ҵ� ���� ��
	
	public void method4() {
		
		// i ���� 10�������� 6���� ũ�ų� ���� ������ �Ź� 1�� ������ ���� �ݺ� ����
		// i : 10, 9, 8, 7, 6 => 5ȸ
		for(int i = 10; i >= 6; i--) {
			
			System.out.println("��ο�");
		}
		
		// ���� �ܼ��ϰ� �ݺ��Ǵ� Ƚ���� �����ϴ� ǥ����
		// int i = 0; i < �ݺ���Ű�����ϴ�Ƚ��; i++
		
		// int i = 0; i < 3; i++
		
		//"����" �� 5�� ���
		for(int i = 0; i < 5; i++) {
			
			System.out.println("����");
		}
		
	} // method4 �޼ҵ� ���� ��
	
	//���ǽ��� ����� �������� �ʴ� ���
	public void method5() {
		
		for(int i = 0; i > 10; i++) { //���ǽ� �ε�ȣ�� �߸�����
			
			System.out.println("�� ��µǳ�..?");
		}
		/*
		for(int i = 0; true; i = i * 0) { //���ѹݺ�
			
			System.out.println("�� �ǳ�...?");
		}
		*/
		
		for(;;) {
			
			System.out.println("����µǳ�");
		}
		
		//���� �ǵ������� ���� �ݺ��� �����ϰ� �ʹٸ�
		//���ǽ� �κ��� ����� true �� �����ָ� ��
		//�Ǵ� for(;;) �� �ۼ��ص� ������ ������ �ƴ� ���ǽ� �κ��� true �� ���ְ��Ǽ�
		//���� �ݺ��� ������ �� �ִ�.
		
	} // method5 �޼ҵ� ���� ��
	
	
	//�������� ���ڿ� ���� �Ź� �޶����� ��� ��� ����
	public void method6() {
		
		// i ���� 1�������� 11���� ���������� 1�� �����ҵ��� �ݺ� ����
		
		for(int i = 1; i < 11; i++) {
			
			System.out.println("i : " + i);
		}

	} //method6 �޼ҵ� ���� ��
	
	public void method7() { 
		
		// 1 �������� 10���� �ٹٲ� ���� �Ʒ��� ���·� ����غ��� �ʹ�!
		// 1 2 3 4 5 6 7 8 9 10
		
		/*
		for(int i = 1; i < 11; i++) {
			
			System.out.print(i + " ");
		}
		*/
		
		for(int i = 0; i < 10; i++) {
			
			System.out.print((i + 1) + " ");
			
		}
	}//method7 �޼ҵ� ���� ��
	
	public void method8() {
		
		// ù��°Ǯ��
		// 1���� 10������ ���� �� Ȧ������ ���
		// 1 3 5 7 9
		
		for(int i = 1; i < 10; i += 2) { // �ݺ� �� 5��
			
			System.out.print(i + " ");
		}
	
		System.out.println();
		
		//�ι�° Ǯ��
		for(int i = 1; i < 11; i++) { 
			// i ���� "Ȧ��"�� ��쿡�� ����ϰ� �ʹ�
			if(i % 2 == 1) {
				System.out.print(i + " ");
				
			}
			
		}
	} //method8 �޼ҵ� ���� ��
	
	public void method9() {
		
		// 1�������� 10������ �� �հ�
		// ù��° Ǯ��
		// int sum = 1+2+3+4+5+6+7+8+9+10;
		
		// �ι�° Ǯ��
		/*
		 * int sum = 0;
		 * 
		 * sum += 1; -> sum = sum + 1; => 1
		 * sum += 2; -> sum = sum + 2; => 3
		 * sum += 3; -> sum = sum + 3; => 6
		 * ...
		 * sum += 10;
		 * 
		 * ��Ģ�� ã��!!
		 */
		
		int sum = 0; // ���� ���� ����� ��Ƶ� ����
					// �׻� 0���� �����ؾ��� => ��Ȯ�� ����� ��� ���ؼ�
		
		for(int i = 1; i <= 10; i++) {
			
			sum += i;
		}
		
		System.out.println("sum : " + sum);

	} // method9 �޼ҵ� ���� ��
	
	public void method10() {
		
		// 1�������� ����ڰ� �Է��� ���������� ���� ��� ���ؼ� ����غ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		sc.nextLine();
				
		int sum = 0;
		
		if(num > 0) { 
			
			for(int i = 1; i <= num; i++) {
				sum = sum + i;	
			}
			
			System.out.println("sum : " + sum);	
		} else {
			
			System.out.println("�߸��Է��߽��ϴ�.");
			
		} // method10 �޼ҵ� ���� ��
	
	}
	
	public void method11() {
			
		// 1�������� �Ź� �޶����� ������ (1~10������ ����
		/*
		 * Math Ŭ������ ���ǵǾ��ִ� random() �޼ҵ带 ȣ���ؼ�
		 * �Ź� �ٸ� �������� ���� �� ����
		 * 	
		 * random() �޼ҵ带 ȣ���� ���
		 * 0.0 ~ 0.9999999... ������ �������� �߻�
		 * 0.0 <= ������ < 1.0
		 */
		
		// Math Ŭ������ �޼ҵ带 ȣ���ϰ��� �� ��� �뺯�� �̸��� �������� �ʾƵ� ��
		//double random = Math.random();
		//System.out.println(random);
		
		//int random = (int) Math.random(); // double ���̶� ����
		// (int)Math.random() ��������ȯ�� �ϸ� ��� �������̴��� 0�� �� ����!!
		
		//0.0 ~ 0.99999... �̹Ƿ�
		// 10�� ���غ��� => 0.0~9.99999...
		// 1 ~ 10 ������ �������� ���ϱ� ���ϹǷ� 1�� ���غ��� => 1.0 ~ 10.9999..
		// ���������� �������� ���ϱ� ���ϹǷ� int ������ ��������ȯ�غ��� => 1~10
		
		//ex) ���� 11 ~ 20 ������ �������� ���ϰ� ����
		// 0.0 ~ 0.9999...
		// 10 �� ���غ��� => 0.0 ~ 9.99999..
		// 11�� ���غ��� => 11.0 ~ 20.9999..
		//int�� ��������ȯ => 11 ~ 20
		
		// ���� 1 ~ 10 ������ �������� ���� ���
		
		// ���� : (int)(Math.random() * ��Ƿ����� + ���ۼ�);
		
		int random = (int)(Math.random() * 10 + 1);
		// System.out.println(random);
		
		int sum = 0;
		
		System.out.println("���� �߻��� ������ : " + random);
		
		for(int i = 1; i <= random; i++) {
			
			sum = sum + i; 
			
		}
		
		System.out.printf("1�������� %d������ �� ���� %d �Դϴ�. \n", random, sum);
		
	} // method11 �޼ҵ� ���� ��
	
	public void method12() {
		
		// ����ڷκ��� 2~9������ ������ �Է¹޾Ƽ� ������ ���
		
		/*
		 * ����
		 * 2~9������ ���� �Է� : 2
		 * ---2��---
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 X 3 = 6
		 * ...
		 * 2 X 9 = 18
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2 ~ 9 ������ ���� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		
		// 2 ~ 9 ������ ������ �´��� ���� �Ǻ�
		if((2 <= num) && (num <= 9)) {
			
			System.out.printf("--- %d�� --- \n", num);
			//�ݺ����� �̿��ؼ� ������ ���
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d \n", num, i, num * i);
			}
		} else {
			System.out.println("2 ~ 9������ ������ �ƴմϴ�.");
			
		}
		
	} // method12 �޼ҵ� ���� ��
	
	// ��ø for��
	public void method13() {
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int i = 0; i < 3; i++) { //�ٱ��� for��
			
			//System.out.println("1 2 3 4 5");
			
			for(int j = 1; j <= 5; j++) { //���� for��
				
				System.out.print(j +  " ");
			}
			
			System.out.println(); //�ٹٲ�
		}
		
		//��ø for���� ��� �ݺ�Ƚ���� �˰�ʹٸ�
		//�ٱ��� for���� �ݺ�Ƚ�� * ���� for���� �ݺ�Ƚ��
	
	} // method13 �޼ҵ� ���� ��
	
	public void method14() {
		
		// *****
		// *****
		// *****
		// *****
		// *****
		
		
		for(int i = 1; i <= 5; i++) {
			
			//System.out.println("*****");
			
			for(int j = 1; j <= 5; j++) {
				
				System.out.print("*");
			}
			
			System.out.println(); //�ٹٲ� �������
		}
		
		
	} // method14 �޼ҵ� ���� ��
	
	public void method15() {
		
		// 1*** => 1�� 1��
		// *2** => 2�� 2��
		// **3* => 3�� 3��
		// ***4 => 4�� 4��
		// => �������� ��Ģ�̶�� �Ѵٸ� �Ź� 4���ھ� ����ϰ�����
		
		for(int i = 1; i <= 4; i++) { // i�� ��
			
			for(int j = 1; j <= 4; j++) { // j�� ��
				
				// System.out.print("*");
				// System.out.print(����);
				
				// �ప(i) �� ����(j)�� ��ġ�Ұ�� ��ġ�ϴ� �� ���� ����غ���
				if(i == j) {
					
					System.out.print(j);
				} else {
					System.out.print("*");
					
				}
				
			}
			System.out.println(); //�ٹٲ�	
		}
		
	} // method15 �޼ҵ� ���� ��
	
	public void method16() {
		
		//*
		//**
		//***
		//****
		//*****
		
			
			/*
			if(i == 1) {
				for(int j = 1; j <= 1; j++) { //�ݺ� 1ȸ
					System.out.print("*");
				} 		
			} else if(i == 2) {
			   for(int j = 1; j <= 2; j++) { //�ݺ� 2ȸ
				System.out.print("*");	
			}
		}
		*/
		for(int i = 1; i <= 5; i++) {
			
		for(int j = 1; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println(); //�ٹٲ�
		}
	  } // method16 �޼ҵ� ���� ��
	
	public void method17() {
		
		/*
		--- 2 �� ---
		2 X 1 = 2
		2 X 2 = 4
		2 X 3 = 6
		2 X 4 = 8
		2 X 5 = 10
		2 X 6 = 12
		2 X 7 = 14
		2 X 8 = 16
		2 X 9 = 18
		--- 3 �� ---
		3 X 1 = 3
		3 X 2 = 6
		3 X 3 = 9
		3 X 4 = 12
		3 X 5 = 15
		3 X 6 = 18
		3 X 7 = 21
		3 X 8 = 24
		3 X 9 = 27
		--- 4 �� ---
		4 X 1 = 4
		4 X 2 = 8
		4 X 3 = 12
		4 X 4 = 16
		4 X 5 = 20
		4 X 6 = 24
		4 X 7 = 28
		4 X 8 = 32
		4 X 9 = 36
		--- 5 �� ---
		5 X 1 = 5
		5 X 2 = 10
		5 X 3 = 15
		5 X 4 = 20
		5 X 5 = 25
		5 X 6 = 30
		5 X 7 = 35
		5 X 8 = 40
		5 X 9 = 45
		--- 6 �� ---
		6 X 1 = 6
		6 X 2 = 12
		6 X 3 = 18
		6 X 4 = 24
		6 X 5 = 30
		6 X 6 = 36
		6 X 7 = 42
		6 X 8 = 48
		6 X 9 = 54
		--- 7 �� ---
		7 X 1 = 7
		7 X 2 = 14
		7 X 3 = 21
		7 X 4 = 28
		7 X 5 = 35
		7 X 6 = 42
		7 X 7 = 49
		7 X 8 = 56
		7 X 9 = 63
		--- 8 �� ---
		8 X 1 = 8
		8 X 2 = 16
		8 X 3 = 24
		8 X 4 = 32
		8 X 5 = 40
		8 X 6 = 48
		8 X 7 = 56
		8 X 8 = 64
		8 X 9 = 72
		--- 9 �� ---
		9 X 1 = 9
		9 X 2 = 18
		9 X 3 = 27
		9 X 4 = 36
		9 X 5 = 45
		9 X 6 = 54
		9 X 7 = 63
		9 X 8 = 72
		9 X 9 = 81
		*/
		
		for(int i = 2; i <= 9; i++) {
			
			System.out.printf("--- %d�� --- \n", i);
			
			for(int j = 1; j <= 9; j++) {
				
				System.out.printf("%d x %d = %d \n", i, j, i * j);
			}
			
			System.out.println(); //�ٹٲ�
		}
		
	} // method17 �޼ҵ� ���� ��
	
	//����
	public void method18() {
		/*
		 * ����ڷκ��� ���� 2���� �Է¹޾�
		 * �� �ش� ���� ������ ���ڵ��� ���������� ����ϴ� ���α׷��� �ۼ�
		 * ��, �� ������ ��ġ�Ѵٸ� "����1�� ����2�� ���� �����ϴ�"
		 *
		 * ����)
		 * ����1 �Է� : 3
		 * ����2 �Է� : 9
		 * 3 4 5 6 7 8 9
		 *
		 * ����1 �Է� : 8
		 * ����2 �Է� : 5
		 * 5 6 7 8
		 *
		 * ����1 �Է� : 7
		 * ����2 �Է� : 7
		 * ����1�� ����2�� ���� �����ϴ�
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 �Է�  : " );
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("����2 �Է� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(num1 != num2) {
		   
			if(num2 > num1) {
			
			for(int i = num1; i <= num2; i++) {
			
				System.out.print(i + " ");
			}
		} 
		 else if(num1 > num2) {
			 
			 for(int i = num2; i <= num1; i++) {
				 System.out.print(i + " ");
			 }
		  }
		} else {
			
			System.out.println("�� ���� �����ϴ�.");
		}
		
	} // method18 ���� ��
	
	public void method19() {
		
		/*
		 * ����ڷκ��� ���� ���ڿ��� �Է¹޾�
		 * ���ڸ��� ���ڸ� �ϳ��� ����ϴ� ���α׷�
		 * ����)
		 * ���� ���ڿ��� �Է��ϼ��� : Hello
		 * 0��° ���� : H
		 * 1��° ���� : e
		 * 2��° ���� : l
		 * 3��° ���� : l
		 * 4��° ���� : o 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���ڿ��� �Է��ϼ��� :");
		
		String n = sc.nextLine();
		
		for(int i = 0; i < 5; i++) {
			
			char c = n.charAt(i);
			
			System.out.println(i+"��° ���ڴ� "+c);
			
		}

	} //method19 �޼ҵ� �۾� ��
	
}
	

