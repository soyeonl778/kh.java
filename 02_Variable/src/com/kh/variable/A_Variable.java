package com.kh.variable;

public class A_Variable {
	
	//�ñް� �ٹ��ð��� �ٹ��ϼ��� ���ؼ� ������ ����ؼ� ����ϴ� �޼ҵ�
	public void printSalary() {
		
		System.out.println("====���������====");
		
		System.out.println("�ñ� : 9620��");
		System.out.println("�ٹ��ð� : 6�ð�");
		System.out.println("�ٹ��ϼ� : 5��");
		
		// ���� = �ñ� x �ٹ��ð� x �ٹ��ϼ�
		// ȫ�浿 : ______�� �������� ����ϰ� �ʹ�!
		
		// 1. �ڹٿ��� ���� ������ x ǥ�ð� �ƴ϶� * ��ȣ�� ��Ÿ����.
		// 2. �ڹٿ��� ���ڿ��� "" �ȿ� ǥ���Ѵ�.
		// 3. �ڹٿ��� ���ڴ� �׳� ǥ���Ѵ�.
		// 4. �ڹٿ��� ���ڿ��� ���ڸ� ���̾ ǥ���ϰ� ������ + ��ȣ�� �̿�
		// 5. 
		
		System.out.println("������ : " + 9620 * 6 * 5 + "��");
		System.out.println("����� : " + 9620 * 6 * 5 + "��");
		System.out.println("�輭�� : " + 9620 * 6 * 5 + "��");
		
		System.out.println(); //����� ������ ���� ������ ����Ű�� �ѹ� ���� ȿ��
		
		System.out.println("==== ��������� ====");
		
		// ���� ����� ���� ���� ����
		
		int pay = 9620;
		int time = 6;
		int day = 5;
		
		System.out.println("�ñ� : " + pay + "��");
		System.out.println("�ٹ��ð� : " + time + "�ð�");
		System.out.println("�ٹ��ϼ� : " + day + "��");
		
		int salary = pay * time * day;
		
		System.out.println("������ : " + salary + "��");
		System.out.println("����� : " + salary + "��");
		System.out.println("�輭�� : " + salary + "��");
		
		/*
		 * ������ ����ϴ� ����
		 * 1. ������ �켱������ ���� �ǹ̸� �ο��� �������� ����Ѵ�. (�������� ����)
		 * 2. �� �ѹ� ���� ����� �ΰ� �ʿ��� ������ ��� ����� �������� ����Ѵ�. (���뼺�� ����)
		 * 3. ���������� ���� ���� �� �� �ִ�.
		 */

	} //printSalary �޼ҵ� ���� ��
	
	// ������ ����
	public void declareVariable() {
		
		/*
		 * ������ ����
		 * ���� ����ϱ� ���� ������ �޸� ������ Ȯ���� �ΰڴ�. = ���� ���� ���ڸ� ����ڴ�.
		 * [ǥ����]
		 * �ڷ��� ������;
		 * 
		 * �ڷ�� : ������ ũ�� �� ������ �����ϴ� �κ�
		 * ������ : ������ �̸��� ���ϴ� �κ�
		 * 
		 * ��������� ��������
		 * 1. �������� �ҹ��ڷ� �����ϰԲ� �̸� ������ ��(��, ��Ÿ ǥ��� 
		 * 2. ���� ����({���}�ȿ����� ������ ���������� ����Ұ�
		 * 3. �ش� ����({����}) �� ����� ������ �ش� ���� �������� ��� ����
		 *    (�ٸ� �޼ҵ忡���� ��� �Ұ� => "��������" ����)
		 */
		
		// ----�ڷ����� ���� ���� ----
		//1. ����(���� = true / false)
		boolean isTrue; //1byte
		
		//2. ������
		//2_1. ������(�Ҽ����� ���� ����)
		byte bNum; //1byte (-128 ~ 127)
		short sNum; //2byte (-32768 ~ 32767)
		int iNum; //4byte (-21�� ___ ~ 21�� ___)
		long lNum; //8byte (int ���� �� ���� �����͸� ǥ���� �� ����)
		
		//2_2. �Ǽ��� (�Ҽ����� �ִ� ����)
		float fNum; // 4byte (�Ҽ��� �Ʒ� 7�ڸ����� ǥ�� ����)
		double dNum; // 8byte (�Ҽ��� �Ʒ� 15�ڸ����� ǥ�� ����) => �Ǽ��� �ڷ��� �� �⺻��
		// �Ҽ��� �Ʒ� ���ڰ� �� ���� ���� ���� ��Ȯ�� ���� ���� �� �ֱ� ����
		
		// 3. ������ (���� �Ѱ�)
		char ch; // 2byte
		
		// ---- ������� �ؼ� �� 8���� �ڷ��� = "�⺻�ڷ���" ----
		
		// 4. ���ڿ��� (������, �����ڷ���)
		String str; // ������ �̻�? 4byte
		
		// ---- ������� �ؼ� �� 9���� �� ���ڰ� ������ ----
		
		/*
		 * ������ ���� ����
		 * ������ ���� ����ϰڴ�. = ���ڿ� ���� ��ڴ�.
		 * [ ǥ���� ]
		 * ������ = ��;
		 */
		
	isTrue = true;
	
	bNum = 1;
	sNum = 2;
	iNum = 4;
	lNum = 8L; // long ���� �˷��ֱ� ���� l �Ǵ� L �� ǥ�����ִ� �� (L�� �� ����)
	fNum = 4.0f; // float ���� �˷��ֱ� ���� �ݵ�� f �� ǥ������� �Ѵ�.
	dNum = 8.0;
	
	ch = 'A'; // ����Ÿ�� ���� ���� �ݵ�� ''�ȿ� �־���� �Ѵ�.
	str = "ABC"; // ���ڿ� Ÿ�� ���� ���� �ݵ�� "" �ȿ� �־���� �Ѵ�.
	
	// �� ������ ��� ���� ���
	System.out.println("isTrue : " + isTrue);
	System.out.println("bNum : " + bNum);
	System.out.println("sNum : " + sNum);
	System.out.println("iNum : " + iNum);
	System.out.println("lNum : " + lNum);
	System.out.println("fNum : " + fNum);
	System.out.println("dNum : " + dNum);
	System.out.println("ch : " + ch);
	System.out.println("str : " + str);
		
	} // declareVariable �޼ҵ� ���� ��
	
	// ������ �ʱ�ȭ (����ִ� ������ ���ʷ� ���� �����ϴ� ��)
	public void initVariable() {
		
		/*
		 * ���� ����� ���ÿ� �ʱ�ȭ
		 * ������ �����ϰ� �����ϴ� ������ �ѹ��� ǥ�� �����ϴ�.
		 * [ǥ����]
		 * �ڷ��� ������ = ��;
		 */
		
		// 1. ����
		boolean isTrue = true; // 1byte
		
		//2_1. ������
		byte bNum = 1; // 1byte
		short sNum = 2; // 2byte
		int iNum = 4; //4byte
		long lNum = 8; //8byte
		
		//2_2. �Ǽ���
		float fNum = 4.0f; // 4byte
		double dNum = 8.0; //8byte
		
		// 3. ������
		char ch = '��'; // 2byte
		
		// 4. ���ڿ��� (������, �����ڷ���)
		String str = "�ڹ� ������"; //ǥ������δ� 4byte
		
		// �� ������ ��� ���� ���
		
		System.out.println("isTrue �� ���� �� : " + isTrue);
		System.out.println("bNum �� ���� �� : " + bNum);
		System.out.println("sNum �� ���� �� : " + sNum);
		System.out.println("iNum �� ���� �� : " + iNum);
		System.out.println("lNum �� ���� �� : " + lNum);
		System.out.println("fNum �� ���� �� : " + fNum);
		System.out.println("dNum �� ���� �� : " + dNum);
		System.out.println("ch �� ���� �� : " + ch);
		System.out.println("str �� ���� �� : " + str);
		
	} //initVariable �޼ҵ� ���� ��
	
	// ���
	public void constant() {
		
		/*
		 * ���
		 * �׻� ���������� ������ �ʴ� ���� �ǹ�
		 * ���� �� �� �տ� final Ű���带 ���´�.
		 * ���ʻ� ����� �̸��� ���� ������ ��� �빮�ڷ� ���
		 *  
		 * 
		 * 
		 */
		
		//����
		int age = 20;
		System.out.println("age : " + age);
		
		// ����Ư) ���� ���� �� ����
		age = 21;
		System.out.println("����� age : " + age);
		
		//���
		/*
		 * final int AGE;
		 * AGE = 20;
		 */
		final int AGE = 20;
		System.out.println("��� AGE : " + AGE);
		
		//���Ư) ���� �� ����
		//AGE = 21;
		
	} //constant �޼ҵ� ���� ��
	
	//�����÷ο� ����
	public void overflow() {
		
		// byte �� 1byte ¥�� ���� => -128 ~ 127
		byte bNum = 127;
		
		System.out.println("before : " + bNum);
		
		// 127 ���ٰ� 1 ���� �����ּ��� ��� ���
		bNum++;
		// �� ����� �� �����ٸ� bNum �� ���� 128�� �ɰ���
		
		System.out.println("after : " + bNum);
		
		
		
		
		
		
		
		
	}
	
}
