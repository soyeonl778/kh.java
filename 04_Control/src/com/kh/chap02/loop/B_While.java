package com.kh.chap02.loop;

public class B_While {
	
	/*<While��>
	 *
	 * [ ǥ���� ]
	 * �ʱ��;	
	 * while(���ǽ�) {
	 *
	 * �ݺ������� ������ �ڵ�;
	 * ������;
	 * }
	 * => �ʱ�İ� �������� �ʼ��� �ƴ�
	 *
	 * => ���ǽ��� ���� ����� true�� ��� �ش� �ݺ������� ������ �ڵ带 ������
	 * => �ش� �ڵ带 �����ϰ� �ݴ� �߰�ȣ�� ������ ���� �ٽ� ���� ���ǽ����� �ö󰡼� ���ǰ˻縦 ������
	 * => ���ǽ��� ���� ����� false�� ��쿡�� while���� ���������� ��
	 * => ���� �ݺ��� ������ �ʹٸ� while(true)�� ǥ����
	 *
	 */
	
	public void method1() {
		
		 // �ȳ��ϼ���" 5�� ���
		 /*
		 for(int i = 0; i < 5; i++) {
		 System.out.println((i + 1) + ". �ȳ��ϼ���.");
		 }
		 */
		 // while�� ����
		 int i = 0;
		 while(i < 5) { // ���ǽ�
		 System.out.println("�ȳ��ϼ���.");
		 i++; // ������
		 }
		 // ������ i ���� ���
		 System.out.println("i : " + i); // i = 5
		 /* i : 0 -> i < 5(true) -> "�ȳ��ϼ���." -> i++;
		 /* i : 1 -> i < 5(true) -> "�ȳ��ϼ���." -> i++;
		 /* i : 2 -> i < 5(true) -> "�ȳ��ϼ���." -> i++;
		 /* i : 3 -> i < 5(true) -> "�ȳ��ϼ���." -> i++;
		 /* i : 4 -> i < 5(true) -> "�ȳ��ϼ���." -> i++;
		 /* i : 5 -> i < 5(false) ->
		 *
		 */
		 //i = 5
		 while(i >= 1) {
		 System.out.println("�ȳ���������.");
		 i--;
		 }
		 System.out.println("i : " + i);
		 /*
		 * i : 5 -> i >= 1(true) -> "�ȳ���������." -> i++;
		 * i : 4 -> i >= 1(true) -> "�ȳ���������." -> i++;
		 * i : 3 -> i >= 1(true) -> "�ȳ���������." -> i++;
		 * i : 2 -> i >= 1(true) -> "�ȳ���������." -> i++;
		 * i : 1 -> i >= 1(true) -> "�ȳ���������." -> i++;
		 * i : 0 -> i >= 1(false)
		 *
		 * ������ i�� ����?? 0
		 */
			}
			
	public void method2() {
		
		 // "1 2 3 4 5" ���
		 /*
		 int i = 1; // �ʱ��
		 while(i <= 5) {
		 System.out.print(i + " ");
		 i++; /
		 }
		 */
		 int i = 1;
		 while(i <= 5) {
		 System.out.print(i++ + " ");
		 }
		 System.out.println();
		 System.out.println("i : " + i); // 6
		 /*i : 1 -> i <= 5(true) -> "1" -> i++;
		 /*i : 2 -> i <= 5(true) -> "1 2" -> i++;
		 /*i : 3 -> i <= 5(true) -> "1 2 3" -> i++;
		 /*i : 4 -> i <= 5(true) -> "1 2 3 4 " -> i++;
		 /*i : 5 -> i <= 5(true) -> "1" -> i++;
		 /*i : 6 -> i <= 5(false)
		 *
		 * ������ i�� ����? 6
		 */
		 i = 5;
		 while(i >= 1) {
		 System.out.print(i + " ");
		 i--;
		 }
		 System.out.println();
		 System.out.println("i : " + i); // 0
			}
	
	public void method3() {
		 
		//1���� 10������ �� �հ�
		
		int sum = 0; // ���հ踦 ��Ƶ� ����
		
		// for�� ����
		/*
		for(int i = 1; i <= 10; i++) {
			
			sum += i;
		}
		*/
		
		// While�� ����
		int i = 1; //�ʱ��
		while(i <= 10) {
			sum += i; //sum = sum + i;
			i++;

		}

		System.out.println("sum : " + sum);
	} // method3 �޼ҵ� ���� ��
	
	public void method4() {
		
		// 1���� ������ (1 ~ 100 ����) ������ �� �հ�
		
		// ���� : (int)(Math.random() * ��� ������  + ���ۼ�);
		int random = (int)(Math.random() * 100 + 1);
		
		System.out.println("random : " + random);
		
 		int sum = 0;
 		
 		int i = 1; // �ʱ��
 		while(i <= random) { // ���ǽ�
 			
 			//sum += i; // sum = sum + i;
 			//i++; // ������
 			
 			//���� ������ ���ٷ� ǥ���Ѵٸ�?
 			
 			sum += i++; // ����������
 			
 		}
		System.out.println("sum : " + sum);
	}//method4 �޼ҵ� ���� ��
	
	//���ǽ��� ����� �������� ���� ���
	
	public void method5() {
		
		// ���ǽĿ� ���ؼ� �ݺ��� 0�� �Ͼ�� ���(����)
		/*
		int i = 0;
		while(i > 0) {
			
			System.out.println("�� ����ǳ�..");
		}
		*/
		
		// ���ѹݺ����� ���ư��� ���
		/*
		int i = 1;
		
		while(i >= 1) {
			System.out.println("�� ����ǳ�?");
			i++;			
		}
		 */	
		
		// �ǵ������� ���ѹݺ��� ������ ���� ���
		while(true) {
			
			System.out.println("�� ����ǳ�..?");
		}
		// �ַ� ����ڿ��� ����ε� ����� �Է¹��� ������ �ϴ��� ��� ������ �ְڴ�
		// => �� ��� ���� while(true) �� �� ����
		
	} //method5 �޼ҵ� ���� ��
		
		/*
		 * do-while��
		 * 
		 * [ǥ����]
		 * do {
		 *    ������ �ڵ�; 
		 * } while(���ǽ�); //���ǽľȿ� true�� ���� / false�� out
		 * 
		 * => ������ ���� �˻� ���� ������ ���� 1ȸ�� ������ ��
		 *  (��, ������ ���� �ʴ��� �ݵ�� �ѹ��� �����ϰڴ�.)
		 * => ���ǽ��� ����� true �̸� �ݺ� ����
		 * => ���ǽ��� ����� false�̸� �ݺ����� ��������
		 * 
		 * while���� do-while�� ������
		 * - while���� ó�� ������ ���� �켱������ ���ǰ˻簡 ���� �Ͼ�� true �������� ����
		 * - do-while���� ù ������ ������ ���ǰ˻� ���� ������ �ѹ��� ����
		 */
		
		public void method6() {
			
			int num = 1;
			
			do {
				
				System.out.println("�ȳ�");
				
			} while(num == 0); //���ʿ� ���� ��ü�� false
			
			// ���ʿ� ������ ���� �ʴ��� �ݵ�� �ּ� �ѹ��� ����
	
		} //method7 �޼ҵ� ���� ��
		
		public void method7() {
			
			// "1 2 3 4 5" ���
			
			int i = 1;
			
			do {
				
				System.out.print(i + " ");
				
				i++;
				
			} while(i < 6);
			
			System.out.println();
			System.out.println("i : " + i);
			
		}
				
		
		
		
		
		
	

}
