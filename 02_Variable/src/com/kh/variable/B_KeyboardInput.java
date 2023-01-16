package com.kh.variable;

import java.util.Scanner; //�ش� ��Ű���� �ִ� Ŭ������ ������ ���ڴٰ� ����

//����ڰ� Ű����� �Է��� ���� ������ ����ϴ� ���

public class B_KeyboardInput {
	
	public void inputTest1() {
		
		/*
		 * �ڹٿ��� �̹� �����ϰ� �ִ� java.util.Scanner Ŭ������ ����
		 * (���� ���� Ŭ������ �ƴ�)
		 * Scanner Ŭ���� �ȿ��� ����ڷκ��� Ű����� �Է¹����� �ְ� ���ִ� �޼ҵ���� �ۼ��Ǿ�����
		 * => �� �޼ҵ���� ȣ���ؼ� ����� ����
		 */
		
		// �ٸ� Ŭ������ �ִ� �޼ҵ带 ȣ���ϰ��� �� ���
		// 1. �ش� Ŭ������ �뺯�� �̸��� �켱������ ����(new)
		Scanner sc = new Scanner(System.in);
		// System.in : �Է¹��� ���� ����Ʈ ������ �о���̰ڴ�.
		//             ����� ��½ÿ��� System.out �� �����~!
		
		//������� �������� (�̸�, ����, Ű) �Է¹ޱ�
		
		//�Է¹ް��� �ϴ� ������ ���� ����ؼ� �Է��� ����
		System.out.print("����� �̸��� �����Դϱ�? : ");
		
		//�̸�: "�̼ҿ�" ..... => String Ÿ��
		
		//����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �޼ҵ� : next(), nextLine()
		
		//sc.next(); // ȣ�� ������ �ۼ��Ѵٸ� �Է¸� �ް� ��
		// String name = sc.next();
		// next() : ����ڰ� �Է��� �� �߿��� ���� (�����̽��� ��ĭ) �� ���� ��� �� ���� ���������� �Է��� �޾��ִ� ����
		
		// System.out.println(name); // "�� �ҿ�" �� �Է��� ��� "��" �� ���
		
		String name = sc.nextLine();
		// nextLine() : ����ڰ� �Է��� �� �� ���� (���� ��ĭ) �� ���� ��� ���� (�����̽��� ��ĭ) �� �����ϰ� ���๮�� �������� �� �Է��� �޾��ִ� ����
		//              Ư�� ����ڰ� �Է��� ���� ������ ���Ե� ������ ���� ��� �����ϰ� nextLine �� ����!
		//              ex) ���ּ� (����� ���Ǳ� �Ÿ��� ____)
		
		System.out.println(name); //"�� �ҿ�" �� �Է��� ��� "�� �ҿ�" �� �״�� ���
		
		
		System.out.print("����� ���̴� ����Դϱ�? : ");
		
		// ����: 20, 21, 22, .. => ������(int)
		
		// ����ڰ� �Է��� ���� int ������ �޾ƿ��� �޼ҵ� : nextInt()
		
		int age = sc.nextInt();
		
		System.out.print("����� Ű�� �� cm �Դϱ�? : ");
		
		//Ű : 164.8 , 161.3, ... => �Ǽ���(double)
		
		// ����ڰ� �Է��� ���� double ������ �޾ƿ��� �޼ҵ� : nextDouble()
		double height = sc.nextDouble();
		
		//name, age, height �� �̿��ؼ� �ϳ��� ���ڿ��� ���
		// ___���� ���̴� ___���̰�, Ű�� ____.__cm �Դϴ�. �������� ���
		
		System.out.println(name + "���� ���̴� " + age + " ���̰�, Ű��" + height + "cm �Դϴ�.");

		// ������ �޼ҵ���� Ư¡ : ����ڰ� ����Ű�� ĥ������ ������, ���� ����� ���ÿ� ���� �Է¹޾� ��ٷ� �����ϴ� ����
		

	} // inputTest1 �޼ҵ� ���� ��
	
	//Ű����� ���� ���Է¹��� �� ���� �߻��Ǵ� ����
	public void inputTest2() {
		
		//Scanner Ŭ������ �뺯�� �̸� ����
		Scanner sc = new Scanner(System.in);
		
		// ������� �������� (�̸�, ����, �ּ�, Ű) �� �Է¹޾� ����ϴ� ���α׷�
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt(); // ���ۿ� ���๮�ڰ� �����ִ� ����
		//���۸� ����ִ� �޼ҵ� : nextLine()
		//���۸� ���� �뵵�� nextLine �޼ҵ带 ����ϰ� ���� ��쿡��
		sc.nextLine();
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		
		
		System.out.println("***" + name + "���� ��������***");
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		System.out.println("Ű : " + height);
		
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

	} // inputTest4 �޼ҵ� ���� ��
	
	//charAt ����
	public void inputTest5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		//str�κ��� ù��°, �ι�°, ����° ���ڸ� ���� �̾Ƽ� ���
		
		/*
		 * ����
		 * ���ڿ��� �Է��ϼ��� : apple
		 * ù��° ���� : a
		 * �ι�° ���� : p
		 * ����° ���� : p
		 */
		
		
		char first = str.charAt(0);
				
		char second = str.charAt(1);
		
		char third = str.charAt(2);
		
		//char first = sc.nextLine().charAt(0); �̷��� �ᵵ ��(String str = ~~~~ �̰� �����)
		// System.out.println("ù��° ���� : " + str.charAt(0)); �̷��� �ٷ� ���� ��
		
		
		
		
		
		System.out.println("ù��° ���� : " + first);
		System.out.println("�ι�° ���� : " + second);
		System.out.println("����° ���� : " + third);
		
	} // inputTest5 �޼ҵ� ���� ��
	
	// ����2
	public void inputTest6() {
		
		//���� �ΰ� �Է�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		// ������ ���� ���
		
		/*
		 * int result1 = num1 + num2; int result2 = num1 - num2; int result3 = num1 *
		 * num2; int result4 = num1 / num2;
		 * 
		 * System.out.println("���ϱ� ��� : " + result1); 
		 * System.out.println("���� ��� : " + result2); 
		 * System.out.println("���ϱ� ��� : " + result3);
		 * System.out.println("������ ��� : " + result4);
		 */
		
		
		
		// ������ ���� �ʴ� ���
		
		System.out.println("���ϱ� ��� : " + (num1 + num2));
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("������ ��� : " + (num1 / num2));
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
