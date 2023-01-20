package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	/*
	 * ���� : "�ڷ����� �� �� �ϳ���" �� ���� �� �ִ� ����
	 * 		��) int a = 10;
	 * 		    a = 20;
	 * 
	 * �迭 : "�ڷ����� �� ������"�� ���� �� �ִ� ����
	 * 		��) int[] a = new int[3]; // int ���� �ڷᰡ �� �� �ִ� ���� 3�� ����ڴ�.
	 *                               // ��[0], [1], [2] �� �����
	 *                               //�ε����� �׻� 0���� �����Ѵ�. (�߿�)
	 *                               // �迭�� ũ�� = 3 -> ������ �ε��� = 2
	 *                               // �迭�� ũ�� = 5 -> ������ �ε��� = 4
	 *                               // ���ڿ��� ���� = 7 -> ������ �ε��� = 6
	 *                               // �迭�� ũ�� = n -> ������ �ε��� = n -1
	 *         a[0] = 5;
	 *         a[1] = 10;
	 *         a[2] = 15;
	 */
	
	public void method1() {
		
		// �迭�� �� ��� �ұ�?
		// �������� ������ ���α׷����� �ϰ� �Ǹ�..
		// 0, 1, 2, 3, 4 ����ؾ���
		/*
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// 0, 1, 2, 3, 4 ����ؾ���
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		// �ݺ��� ��� �Ұ�
		for(int i = 1; i <= 5; i++) {
			
			// System.out.println(numi);
			System.out.println("num" + i);
			
		}
		
		// 0, 1, 2, 3, 4 �� ���ؾ���
		int sum = num1 + num2 + num3 + num4 + num5;
		*/
		
		// ������ ������ �þ�� ����
		
		// �迭�� ������ ���α׷��� �ϱ�
		// 0, 1, 2, 3, 4 ����ؾ���
		
		/*
		 * 1. �迭 ����
		 * [ǥ����] => �ΰ��� ǥ������ �ִ�.
		 * �ڷ��� �迭��[];
		 * �ڷ���[] �迭��; // �� ����� �� ���̾�
		 */
		
		//int a; // ���� ���� 
		//int arr[]; // �迭 ����
		//int[] arr; 
		
		/*
		 * 2. �迭 �Ҵ�
		 * �� �迭�� ��� ������ �����Ұ����� ���� �迭�� ũ�⸦ �������ִ� ����
		 * ������ ������ŭ ���� �� ���� �������
		 * [ǥ����]
		 * �迭�� = new �ڷ���[�迭ũ��];
		 */
		
		//arr = new int[5];
		
		//�迭�� ����� ���ÿ� �Ҵ絵 �����ϴ�.
		//[ǥ����]
		// �ڷ���[] �迭�� = new �ڷ��� [�迭ũ��];
		
		int[] arr = new int[5];
		
		// �� �������ʹ� �迭�� Ȱ���� �� ����!!
		
		/*
		 * 3. �迭�� �� �ε��� �ڸ��� �� ����
		 * [ǥ����]
		 * �迭��[�ε���] = ��
		 */
		
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		//�迭�� ���� ū ���� : �ݺ����� Ȱ���� �� �ִ�.
		for(int i = 0; i < 5; i++) {
			arr[i] = i;
		}
		
		//���
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		// ��� ���� �ݺ����� Ȱ�� �����ϴ�!!
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[1]);
		}
		
		// �� �հ� ���ϱ�
		int sum = 0;
		
		// �ݺ��� Ȱ�� ����
		// sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		for(int i = 0; i < 5; i++) {
			sum = sum + arr[1]; // sum += arr[1];
		}
		System.out.println("sum : " + sum);
		
		System.out.println("arr : " + arr);
		//[I@6d06d69c �� ���� �� �� ���� ���� ���´�.(�ּҰ�)
		
	} //�޼ҵ� ��
	
	public void method2() {
		
		int i = 10;
		
		int[] iArr = new int[5];
		
		System.out.println("1 : " + i);
		
		System.out.println("iArr : " + iArr); // [I@6d06d69c
		
		double[] dArr = new double[3];
		
		System.out.println("dArr : " + dArr); // [D@7852e922

		/*
		 * �⺻�ڷ��� (8�� : boolean, char, byte, short, int, long, float, double)
		 * => ���� ���� �ٷ� ���� �� �ִ� ���� (�Ϲݺ���)
		 * 
		 * �� �̿��� �ڷ��� (int[], double[], short[], String, Scanner, A_Array, ...)
		 * => �ּ� ���� ����ִ� ���� (���� ����, ���۷��� ����)
		 */
		
		// �ܰ��� �ּҰ��� �������� ���·� �˷��ִ� �޼ҵ� : hashCode()
		System.out.println("iArr : " + iArr);
		System.out.println("iArr�� �ؽ��ڵ尪 : " + iArr.hashCode());

		System.out.println("dArr : " + dArr);
		System.out.println("dArr�� �ؽ��ڵ尪 : " + dArr.hashCode());
		
		
	} //method2 ���� ��
	
	public void method3() {
		
		int[] iArr = new int[3]; // [0], [1], [2]
		double[] dArr = new double[3]; // [0], [1], [2]
		
		// System.out.println(iArr);
		// System.out.println(dArr);
		
		//�迭�� ����ִ� ���� ���� ����ϰ��� �� ���
		// => �迭��[���ȣ]
		System.out.println(iArr[0]);
		
		// �迭�� ��� �� �� �ݺ����� ���� �� ����.
		// 0�� �ε����������� ������ �ε������� ���������� �ݺ����� Ȱ���غ���
		//������ �ε���  == �迭�� ũ�� - 1
		/*
		for(int i = 0; i < 3; i++) {
			
			// iArr[i] += i + 1;
			System.out.println("iArr[" + i + "] : " + iArr[i]);
			
		}
		*/
		// �迭�� �ݺ����� Ȱ���� ��� ������ ��
		// => �迭�� ����� �Ѿ�� �ݺ��� ������ ArrayIndexOutOfBoundsException �߻�
		
		// �迭�� ũ�⸦ �ƴ� ��� 
		// [ǥ����]
		// �迭��.length
		System.out.println("iArr �迭�� ũ�� : " + iArr.length);
		System.out.println("dArr �迭�� ũ�� : " + dArr.length);
		
		//iArr �迭 ���������� ���
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		// dArr �迭 ���������� ���
		for(int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
			
		}
		/*
		 * ������ �迭�� �ε����� ���� �������� �ʴ��� ���� �������
		 * ��? Heap �������� ���� �� ������ ������ �� ����!!
		 * => JVM �� ���� �⺻������ �ʱ�ȭ�� ��������
		 */
	
	} //method3 ���� ��
		
	public void method4() {
			
			
			int[] arr = new int[5]; // [0] [1] [2] [3] [4]
			                        //  0   0   0   0   0
			/*
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
			arr[4] = 5;
			arr[5] = 6; // ArrayIndexOutOfBoundsException �߻�( �迭�� ���ý� ������ ����� ����)
			*/
			
			// �� ������ ���� �ݺ���
			for(int i = 0; i < arr.length; i++) { // i : 0 1 2 3 4
				
				arr[i] = (i + 1);				
			}
			
			// �� ���� �������� arr �迭�� ��� �濡�� �������� ������� ����
			
			int sum = 0;
			// �� ��°� ���� ������ ���� �ݺ���
			for(int i = 0; i < arr.length; i++) { // i : 0 1 2 3 4 
				
				System.out.print(arr[i] + " "); // "1 2 3 4 5"���
				sum = sum + arr[i];
			}
			
			// �� ���� �������� "1 2 3 4 5" �� ��µ��� ����
			// �� ���� �������� sum ���� 1 + 2 + 3 + 4 + 5 ����� ������� ����
			
			System.out.println();
			System.out.println("sum : " + sum);
			
			System.out.println(arr); //�ܰ��� �ּҰ�
			System.out.println(arr.hashCode());
	}
			
			//�ǽ�����
			
	public void method5() {
				
				/*
				 * ���� 10���� ������ �� �ִ� �迭�� ������ ��
				 * �迭�� �� �濡 ������ ���� �����ϴ� ���α׷� ������
				 * 
				 * �������� ����: 51 ~ 100
				 * arr[0] : 61
				 * arr[1] : 56
				 * arr[2] : 87
				 * ...
				 * arr[9] : 81
				 */
		int[] arr = new int[10];
				
		for(int i = 0; i < arr.length; i++) {
			
			int random = (int)(Math.random() * 50 + 51);
			
			
			System.out.println("arr[" + i + "] : " + random);
				
			}
		for(int i = 0; i < arr.length; i++) {
			
			
			System.out.printf("arr[%d] : %d \n", i, arr);
		}
					
	}
	public void method6() {
		
		int[] arr = new int[5];
		
		System.out.println(arr); //[I@6d06d69c
		System.out.println(arr.hashCode()); //1829164700
		
		/*
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8;
		 * arr[4] = 10;
		 */
		
		// ���Կ� for��
		int value = 2; // ���ԵǴ� ���� ���ۼ�
		for(int i = 0; i < arr.length; i++) {
			
			// arr[i] = (i + 1) * 2;
			arr[i] = value;
			value += 2;
		}
		
		// ��¿� for��
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		// arr[5] = 12;
		// arr[6] = 14;
		
		/*
		 * *�迭�� ���� ū ����
		 * �ѹ� �Ҵ� �ÿ� ������ �迭�� ũ��� ���� �Ұ����ϴ�.
		 * => �迭�� ũ�⸦ �����ϰ��� �Ѵٸ� ��¿�� ���� ���ο� �迭�� �ٽ� ������ �Ѵ�.
		 * (������� �ٽ� �� �ʿ�� ����, �Ҵ縸 �ٽ� �ؼ� ������� �ٲ�ġ�� �Ѵ�)
		 */
		
		arr = new int[7];
		
		System.out.println("=== arr ���� ��===");
		System.out.println(arr);
		System.out.println(arr.hashCode());
		
		/*
		 * �޸𸮰����� �׻� ������ �ּҰ� �ο�, ������ �����Ǿ��� �ּ����� �ּ����� ���� ��ġ�� �ʴ´�.
		 * ���� ���� �迭�� ũ�⸦ �����ϰ��� ���ο� �迭�� �Ҵ��Ͽ� �ּҰ��� �����Ѵٸ�
		 * ������ �����ϰ� �ִ� ������ ����� ���ο� ������ ��������.
		 * 
		 * ������ ������ ������ �迭�� Heap ������ ���� ���ٴ�
		 * ���� �ð��� ������ "������ �÷���(GC)" �� ���ؼ� �����ȴ�!! => ������ �÷��� (�ڵ� �޸� ����)
		 */
		
		// ���� ����Ǿ��ִ� ���� ������ �Ѵٸ�?
		arr = null; // null : �ƹ��͵� �������� ������ ��Ÿ���� '��'
		
		System.out.println("=== ������� ���� �� ===");
		System.out.println(arr); // null ���
		
		arr[0] = 10; // NullPointerException �̶�� ������ �߻�
		// ������ �ּҰ� ���µ� (null) ��� �����ҷ�? ��� ������ �˷��ִ� ��
		
		System.out.println(arr.hashCode());
		
		/*
		// �⺻ �ڷ����� �⺻���� ������ ���� => ���� ���� �����ؾ���
		//int a;
		//System.out.println(a);
		int a = 0;
		double d = 0.0;
		char c = ' ';
		
		String str = "";
		
		// ���� �ڷ����� �⺻���� null �̴�.
		int[] iArr = null;
		double[] dArr = null;
		Scanner sc = null; 
		*/
		
		// �迭�� �Ҵ���� �Ϸ���
		// heap ������ ���� �迭���� JVM �� ���ؼ� �ʱⰪ�� ä����
		// => ���� int �� �迭�̶�� ��� ���� �ʱⰪ 0���� ä����
		// => ���� short �� �迭�̶�� ��簪�� �ʱⰪ 0���� ä���� (��, �������� ��� �ʱⰪ 0���� ä����)
		// => ���� double �� �迭�̶�� ��簪�� �ʱⰪ 0.0 ���� ä���� (��, �Ǽ����� ��� �ʱⰪ 0.0���� ä����)
		// => ���� char �� �迭�̶�� ��簪�� �ʱⰪ '  ' ���� ä����
		// => ���� String �� �迭�̶�� ��簪�� �ʱⰪ null �� ä����
		
	}
	
	public void method7() {
		
		/*
		 * 3���� ����ڿ��� �Ź� Ű�� ������ �Է¹ް�, �迭�� ���
		 * 3���� Ű ������ ���
		 * 3���� Ű�� �� �հ�� ��ձ��� ���(printf�� ���)
		 * 
		 * ����)
		 * Ű �Է�(cm) : 162.1
		 * Ű �Է�(cm) : 149.9
		 * Ű �Է�(cm) : 183.5
		 * 162.1
		 * 149.9
		 * 183.5
		 * 3���� Ű�� �� �հ� : 495.5
		 * 3���� Ű�� ��� : 165.2
		 */
	
		Scanner sc = new Scanner(System.in);
		
		double[] heights = new double[3]; // [0] [1] [2]
		
		for(int i = 0; i < heights.length; i++) {
			
			System.out.print("Ű �Է�(cm) : ");
			heights[i] = sc.nextDouble();
			sc.nextLine();
			
		}
		
		// 3���� Ű ���� ��� + �� �հ�
		double sum = 0.0; // Ű�� �� �հ�
		
		for(int i = 0; i < heights.length; i++) { // i : 0 1 2
			
			System.out.println(heights[i]);
			
			sum = sum + heights[i];
			
		}
		
		// �� ���� �������� �̹� ��� Ű���� ����� �Ϸ��
		// �� ���� �������� sum ���� ��� Ű���� ���� ��ϵǾ�����
		
		// �� �հ�, ��� ���
		System.out.printf("3���� Ű�� �� �հ� : %.1f \n", sum);
		System.out.printf("3���� Ű ��� : %.1f \n", sum / heights.length);
		
	}
	
	public void method8() {
		
		/*
		 * �ÿ��ڿ��� ���ڿ� �ϳ��� �Է¹ް�
		 * ������ ���ڵ��� char �迭�� �Űܴ�� => �迭�� ���� ������ ���(�ٹٲ� ����)
		 * 
		 * ����)
		 * ���ڿ� �ϳ� �Է� : strawberry
		 * s t r a w b e r r y
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� �ϳ� �Է� : ");
		String str = sc.nextLine();
		
		// ������ ���ڸ� ���� char �迭�� ���� (�迭�� ũ�� == ���ڿ��� ����)
		
		char[] arr = new char[str.length()];
		
		/*
		arr[0] = str.charAt(0);
		arr[1] = str.charAt(1);
		arr[2] = str.charAt(2);
		...
		*/
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = str.charAt(i); 
		}
		
		// �ٹٲ� ���� ���
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void method9() {
		
		// �����ϴ� ������ ������ �Է� ���� ��
		// ������ ������ŭ ���� �� �ִ� �迭 ���� �� ������ �迭�� �����ϴ� ������ �Է¹޾�
		// ��� �� ����ϱ�
		
		/*
		 * ����) �����ϴ� ���� ���� : 2
		 * �����ϴ� ���ϸ� �Է� : ���� 
		 * �����ϴ� ���ϸ� �Է� : ������ 
		 * ���� ������
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ϴ� ���� ���� : ");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		String[] fruit = new String[num]; 
		
		for(int i = 0; i < fruit.length; i++) {
			
			System.out.print("�����ϴ� ���ϸ� �Է� : ");
			fruit[i] = sc.nextLine();
		}
		
		for(int i = 0; i < fruit.length; i++) {
			
			System.out.print(fruit[i] + " ");
			
		}

}
	
	public void method10() {
		
		//�迭 ����� ���ÿ� �Ҵ� (ũ�� ����)
		int[] arr = new int[4]; // [0] [1] [2] [3]
								//  0   0   0   0
		
		//�迭�� �� �ε����� ���� ����
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		// �迭�� ���������� �� �濡 ó������ ���� �����ϴ� �� "�ʱ�ȭ" ��� �Ѵ�.
		
		// �迭 ���� �� �Ҵ�� ���ÿ� �ʱ�ȭ (����) ���� �ѹ��� ������ ��� 2����
		// ���1.
		int[] arr1 = new int[] {1, 2, 3, 4}; // [0] [1] [2] [3]
											 //  1   2   3   4
		// ���2.
		int[] arr2 = {1, 2, 3, 4}; // [0] [1] [2] [3]
								   //  1   2   3   4
		
		System.out.println(arr == arr1); // false
		System.out.println(arr1 == arr2); // 
		System.out.println(arr2 == arr); //
		// �ּҰ� ���� ������̱� ������ false �� ���� (���ڿ��� ��쿡�� ����)
		
	}
		// ����
		
		public void method11() {
			
			
		/* �ζǹ�ȣ ������
		 * 
		 * �ζ� �� : 1���� 45������ ������ ������ 6�� ���ڸ� �̴´�.(�ߺ�x)
		 *        ���� ���ڵ��� ���� ���ڿ������� ū ���� ������� �������� �ؾ���(��������)(���)
		 * 
		 * ��Ʈ : ������������ �迭�� ���� ���ڵ��� ���ġ���ִ� �޼ҵ�
		 * [ǥ����]
		 * Arrays.sort(���������������ġ�ϰ����ϴ¹迭��);
		 * 
		 */
		
		
		
		}
			
}
