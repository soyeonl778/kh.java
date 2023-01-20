package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
	/*
	 * * �迭 ����
	 * - ���� ���� : �迭�� �ּҰ��� ����
	 * - ���� ���� : ������ ���ο� �迭�� �ϳ� �����ؼ� ���� ���ΰ����� ����
	 */
	
	//���� ����
	public void method1() {
		
		// ���� �迭
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("== ���� �迭 ��� ==");
		for(int i = 0; i < origin.length; i++) {
			
			System.out.print(origin[i] + " ");
			
		}
		
		// ���纻 �迭
		int[] copy = origin;
		
		System.out.println();
		System.out.println("== ���纹 �迭 ��� ==");
		for(int i = 0; i < copy.length; i++) {
			
			System.out.print(copy[i] + " ");
			
		}
		
		//copy �迭�� �����ϱ�
		copy[2] = 99;
		
		System.out.println();
		System.out.println("== ���纻 �迭 ���� �� ==");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		System.out.println("== ���纻 �迭 ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// ���纻 �迭�� ������ ������ �ߴµ� ���� �迭�� ���뵵 ���� ������ �Ȱ� ����!
		// ���� �迭�� ���� �Բ� ������ �Ǿ��� (������ �ѼյǾ���)
		// ���� ���� => �迭�� �ּҰ��� ����Ǿ� ������ ���纻�� ���� ����
		System.out.println();
		System.out.println(origin);
		System.out.println(copy);
		
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());

	}
	
	// ���� ���� (4���� ���)
	public void method2() {
		
		// 1. for���� �̿��ϴ� ���
		// ���ο� �迭�� ������ �� �� �ε��� ���� ���� ���� ������ �����ϴ� ���
		
		// �����迭
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭
		int[] copy = new int[origin.length];
		/*
		copy[0] = origin[0];
		copy[1] = origin[1];
		...
		copy[�������ε���] = origin[�������ε���];
		*/
		
		for(int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
			
		}
		
		// �� ���簡 �Ǿ����� ���纻 �迭 ���
		
		System.out.println("== ���纻 �迭 ��� ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
			
		}
		// ���纻 �迭 �����ϱ�
		copy[2] = 99;
		
		System.out.println();
		System.out.println("== ���纻 �迭 ���� �� ==");
		System.out.println("== ���� �迭 ��� ==");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
			
		}
		
		System.out.println();
		System.out.println("== ���纻 �迭 ��� ==");
		for(int i = 0; i < copy.length; i++) {
			
			System.out.print(copy[i] + " ");
		}
		
		// �ؽ��ڵ尪 ��
		System.out.println();
		System.out.println("���� �迭�� �ؽ��ڵ� : " + origin.hashCode());
		System.out.println("���纻 �迭�� �ؽ��ڵ� : " + copy.hashCode());
		
	}
	
	public void method3() {
		
		// 2. System Ŭ�������� �����ϴ� arraycopy �޼ҵ带 �̿��ϴ� ���
		
		// ���� �迭
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭
		int[] copy = new int[10];
		// [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
		//  0   0   0   0   0   0   0   0   0   0
		
		// System.arraycopy(�����迭��, �����迭�� ���縦 ������ �ε���, ���纻�迭��, ����ɽ����ε���, �����Ұ���);
		
		System.arraycopy(origin, 0, copy, 0, 5);
		// [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
		//  1   2   3   4   5   0   0   0   0   0
		
		
		
		//System.arraycopy(origin, 0, copy, 2, 5);
		// [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
		//  0   0   1   2   3   4   5   0   0   0
		
		//System.arraycopy(origin, 2, copy, 1, 3);
		// [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
		//  0   3   4   5   0   0   0   0   0   0
		
		//System.arraycopy(origin, 2, copy, 9, 2);
		// [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
		//  0   0   0   0   0   0   0   0   0   3   4
		// ArrayIndexOutOfBoundsException �߻�
		// => �迭�� ���� ���簡 �Ͼ �� �ε����� ������ ����� ������ ���� �߻�
		
		System.out.println("== ���纻 �迭 ��� ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// �ؽ��ڵ� ��
		System.out.println();
		System.out.println("���� �迭�� �ؽ��ڵ� : " + origin.hashCode()); // 1829164700
		System.out.println("���纻 �迭�� �ؽ��ڵ� : " + copy.hashCode()); // 2018699554
		// �ٸ� �ּҰ��� ���� ���� => �ٸ� ���� �����ϰ� ����
		// => �迭 ������ ���� ������ ���� �ʴ´ٴ°��� ���� ������
		
	}
	
	public void method4() {
		
		// 3. Arrays Ŭ�������� �����ϴ� copyOf �޼ҵ带 �̿��� ���
		
		// ���� �迭
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭
		
		// ���纻 �迭 = Arrays.copyOf(�����迭��, �����Ұ��ǰ���);
		int[] copy = Arrays.copyOf(origin, 7);
		
		System.out.println("== ���纻 �迭 ��� ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
			
		}
		
		// �ؽ��ڵ� ��
		System.out.println();
		System.out.println("���� �迭�� �ؽ��ڵ� : " + origin.hashCode());
		System.out.println("���纻 �迭�� �ؽ��ڵ� : " + copy.hashCode());
		
		/*
		 * 2. System.arraycopy �޼ҵ�
		 * ��� �ε����������� ��� ��� ��ġ�� �ε����� �����Ұ��� �� ���� ���� ����
		 * 
		 * 3. Arrays.copyOf �޼ҵ�
		 * ������ ���� �迭�� 0�� �ε����������� ���簡 ����� (��, ���� ������ ���� ��ŭ)
		 * ����, ���� ������ ������ŭ�� �� ���纻 �迭�� ũ��� ������
		 */

	}
	
	public void method5() {
		
		// 4. clone �޼ҵ带 �̿��ϴ� ���
		
		// ���� �迭
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭
		// ���纻�迭�� = �����迭��.clone();
		int[] copy = origin.clone();
		//������ �ɼ��� ������ �� ������, ���� �迭�� ������ �Ȱ��� ���纻 �迭�� �� �� ����
		
		// ��� => "[1, 2, 3, 4, 5]"
		System.out.println("== ���纻 �迭 ��� ==");
		/*
		System.out.print("[");
		for(int i = 0; i <copy.length; i++) {
			
			// ���� ������ �ݺ� ȸ����� copy[i] �� ����ϰڴ�.
			if(i == copy.length - 1) {
			
				System.out.print(copy[i]);
			} else {
				System.out.print(copy[i] + ", ");				
			}
		
		}
		System.out.print("]");
		*/
		
		System.out.println(Arrays.toString(copy));
		// Arrays.toString(����ϰ����ϴ¹迭��);
		// => �հ� �ڿ� [], ���� ���̿��� , �� ���̾ ����ϰ� �ϳ��� ���ڿ��� ���̾ ����ϴ� �޼ҵ�
		
		// �ؽ��ڵ� ��
		System.out.println("���� �迭�� �ؽ��ڵ� : " + origin.hashCode());
		System.out.println("���纻 �迭�� �ؽ��ڵ� : " + copy.hashCode());
		
		
	}

}
