package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	/*
	 * switch��
	 * ���ǽ� ���̵� ���������� ������ ������ �� �ְ� ���ִ� ���ǹ�
	 * 
	 * switch���� if���� ������
	 * if(���ǽ�) : ���ǽ��� �����ϰ� �� �Ը��� �°� ��� ����, ���� ������ ���� ����
	 * switch ���ǽ�X : ���������� "���� ��(==)" �� ���� ������ ����Ǵ� ����
	 * 
	 * [ǥ����]
	 * switch(������ ����񱳸� �� �����) {
	 * case ��1 : �������ڵ�1; // ������ ����񱳸� �� ����� == ��1 �� true �� ��� �������ڵ�1�� �����ϰڴ�.
	 *           break;     // ������ �ڵ�1�� �����ϰ� switch���� ���������ڴ�.
	 * case ��2 : �������ڵ�2;
	 *           break;
	 * ...
	 * case ��n : �������ڵ�n;
	 *           break;
	 * default : �������ڵ�; // if-else if������ else ������ ���� ����
	 *                    // ���� ��1, ��2, ��3, .., ��n ����
	 *                    // ������ ����񱳸� �� ����ڿ� ��ġ���� �ʾҴٸ� default ���� ������ �����
	 *                    // �� ��쿡�� break; ������ ���� ����         
	 *           
	 * [���� if��]
	 * if(����񱳴���� == ��1) {
	 *    �������ڵ�1;
	 *    
	 * } else if(����񱳴���� == ��2) {
	 *    �������ڵ�2;
	 *    
	 * } else if(����񱳴���� ==��3) {
	 *    �������ڵ�3;
	 * 
	 * } else {
	 *    ���� ������ ��� false �� ���, �����ڵ�;
	 * }
	 * 
	 */
	
	public void method1() {
		
		/*
		 * 1 ~ 3 ������ �������� �Է¹޾�
		 * 1�� ��� "�������Դϴ�" ���
		 * 2�� ��� "�Ķ����Դϴ�" ���
		 * 3�� ��� "�ʷϺ��Դϴ�" ���
		 * �߸� �Է��� ��� "�߸� �Է��߽��ϴ�" ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 3������ ���� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		/*
		 * //������ if-else if �� ���� if(num == 1) {
		 * 
		 * System.out.println("�������Դϴ�");
		 * 
		 * } else if(num == 2) {
		 * 
		 * System.out.println("�Ķ����Դϴ�");
		 * 
		 * } else if(num == 3) {
		 * 
		 * System.out.println("�ʷϺ��Դϴ�");
		 * 
		 * } else {
		 * 
		 * System.out.println("�߸� �Է��߽��ϴ�"); }
		 */
		
		//switch�� ����
		/*switch(num) {
			case 1 : System.out.println("�������Դϴ�");
			          break;
			case 2 : System.out.println("�Ķ����Դϴ�");
			         break;
			case 3 : System.out.println("�ʷϺ��Դϴ�");
			         break;
			default : System.out.println("�߸� �Է��߽��ϴ�.");
		}
		*/
		
		String result = ""; // ����� ��Ƶ� �뵵 ( "������", "�Ķ���", "�ʷϺ�")
		
		switch(num) {
		case 1 : result = "������";
				break;
		case 2 : result = "�Ķ���";
		        break;
		case 3 : result = "�ʷϺ�";
				break;
		default : System.out.println("�߸� �Է��߽��ϴ�");
		        return; // return ������ default �ڿ� �ݵ�� ����ϴ� ������ �ƴ�
		                // return ���� ���� �������� �޼ҵ� ��ü�� ��������
		                // ���� �������� �޼ҵ带 "ȣ���ߴ���" ���� ���ư��� �����̴�.
		        
		}
		 
		//result ��� �������� "������", "�Ķ���", "�ʷϺ�" �߿� �ϳ��� ���������
		System.out.println(result + "�Դϴ�");
		
	} //method1 �޼ҵ� ���� ��
	
	public void method2() {
		
		//����ڿ��� ������ ���ϸ�(���, �ٳ���, ������)�� �Է¹޾�
		//�� ���ϸ����� ������ ��� (��� 1000��, �ٳ��� 2000��, ������ 5000��)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------Welcome ���ϰ���------");
		System.out.print("������ ���� (���, �ٳ���, ������) �Է� : ");
		String fruit = sc.nextLine();
		
		int price = 0; //������ ����  ����
		
		/*
		switch(fruit) {
		case "���" : price = 1000; break;
		case "�ٳ���" : price = 2000; break;
		case "������" : price = 5000; break;
		default : System.out.println("���� ���Կ��� �Ǹ��ϴ� ������ �ƴմϴ�.");
		return;
		}
		*/
		
		// if-else if�� ����
		/*if(fruit == "���") {
			price = 1000;
		} else if(fruit == "�ٳ���") {
			price = 2000;
		} else if(fruit == "������") {
			price = 5000;
		} else {
			System.out.println("���� ���Կ��� �Ǹ��ϴ� ������ �ƴմϴ�."); return;
		}
		*/
		/*
		 *���ڿ��� ��� ����񱳰� ����� �Ͼ�� �ʰ�����
		 * => ���ڿ��� ��� �����ڷ����̱� ������ == ���� ����񱳸� �ϴ� ���� �ּҰ� �������� ����񱳰� �Ͼ
		 * => ���ڿ��� ���빰�� ����� �ϰ�ʹٸ� == ��ſ� .equals() �޼ҵ带 ��� ��!!
		 * [ǥ����]
		 * ���ڿ�.equals(������ϰ����ϴ� ���ڿ�);
		 * ���ڿ� ���빰�� ��ġ�Ѵٸ� true, ��ġ���� �ʴ´ٸ� false ���� ��ȯ��
		 * 
		 */
		
		if(fruit.equals("���")) {
			price = 1000;
		} else if(fruit.equals("�ٳ���")) {
			price = 2000;
		} else if(fruit.equals("������")) {
			
		} else {
			System.out.println("���� ���Կ��� �Ǹ��ϴ� ������ �ƴմϴ�");
			return;
		}
		
		// ���ڿ��� ����� �ϰ��� �� �� if�� �迭 �ȿ��� ���� ���ǽ��� ����� ��� .equals ���
		//                       switch�������� case �� �� ����ϸ� ���������� �˾Ƽ� .equals �������� ���빰 ����񱳰� �Ͼ
				
		// price ���� �� ���ϸ����� ������ �������
		// ������ ������ �����������Դϴ�. ���
		System.out.printf("%s �� ������ %d �� �Դϴ�. \n", fruit,price);
		
	} // method2 �޼ҵ� ���� ��
	
	// break �� �����ϴ� ���
	
	public void method3() {
		
		//����ڷκ��� Ű����� ����� �Է¹޾� �ش� ����� ������ ����ϱ�
		// 1��� : ��������, �������, �б����
		// 2��� : �������, �б����
		// 3��� : �б����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �Է� : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		switch(grade) { 
		case 1 : System.out.println("�������� �ο�");
		case 2 : System.out.println("������� �ο�");
		case 3 : System.out.println("�б���� �ο�"); break;
		default : System.out.println("�߸��Է�");
		}
		
		// ���� ����� �� true �� ������ �������� �ڵ尡 ����Ǵ� ����
		// break ������ ���� ������ ������ �̷�����,
		// break ������ ������ switch ���� ��������

	} //method3 �޼ҵ� ���� ��
	
	public void method4() {
		
		//����ڿ��� �Է¹��� �ֹι�ȣ�� ������
		// ���� / ���� ���� �Ǻ� �� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ �Է�(-����) : ");
		String Id = sc.nextLine();
		
		char gender = Id.charAt(7); //7��° �ڸ����ִ� �ε��� ����
		
		/*String result = "";
		
		
		switch(gender) {
		case '1' : result = "����"; break;
		.
		.
		.
		System.out.println(result + "�Դϴ�.");
	    }
		*/
		
		//break ��������
		/*switch(gender) {
		case '1' :
		case '3' : result = "����"; break;
		case '2' :
		case '4' : result = "����"; break;
		default : System.out.println("�߸��� �ֹι�ȣ�� �Է��߽��ϴ�.");return;
		System.out.println(result + "�Դϴ�.");
		*/
		
		switch(gender) {
		case '1' : System.out.println("����"); break;
		case '2' : System.out.println("����"); break;
		case '3' : System.out.println("����"); break;
		case '4' : System.out.println("����"); break;
		default : System.out.println("�߸��� �����Դϴ�");
		return;
		}
	} // method4 �޼ҵ� ���� ��
		
	public void method5() {
		
		/*
		 * ����ڿ��� 1�� ~ 12�� ������ ���� �Է¹޾�
		 * �ش� ���� ������ ��¥�� ����ϴ� ���α׷�
		 * 1, 3, 5, 7, 8, 10, 12 => "�ش� ���� 31�ϱ����Դϴ�"
		 * 4, 6, 9, 11 => "�ش� ���� 30�ϱ����Դϴ�"
		 * 2 => "�ش� ���� 28�� �Ǵ� 29�ϱ����Դϴ�"
		 * �� ���� �� => "�ݵ�� 1�� ~ 12�� ������ �Է��ؾ��մϴ�"
		 *
		 * ����)
		 * 1�� ~ 12�� ������ �� �Է� : 8
		 * �ش� ���� 31�ϱ����Դϴ�
		 */
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("1�� ~ 12�� ������ �� �Է� : ");
		
		int month = sc.nextInt();
		sc.nextLine();
		
		String result = "";
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: result = "�ش� ���� 31�ϱ��� �Դϴ�"; break;
		case 4: case 6: case 9: case 11 : result = "�ش� ���� 30�ϱ��� �Դϴ�"; break;
		case 2 : result = "�ش� ���� 28�� �Ǵ� 29�ϱ��� �Դϴ�"; break;
		default : System.out.println("�ݵ�� 1�� ~ 12�� ������ �Է��ؾ� �մϴ�");
		return;
		}
		
		System.out.println(result);
		
		//break ���������� ����
		

		
	} //method5 �޼ҵ� ���� ��
	
	

}
