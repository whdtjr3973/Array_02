package com.biz.arr;

import java.util.Random;

public class Array_03 {

	public static void main(String[] args) {

		int[] intKor = new int[100];
		Random rnd = new Random();
		
		// ���� for�� �̿��ؼ�
		// �迭�� � ������ ���(�����ϱ�)��
		// ���������� ���� ������ ���� ���� �� ����.
		for(int n : intKor) {
			n = rnd.nextInt(50);
		}
		for(int n : intKor) {
			System.out.println(n);
		}		
		
		// ����for�� ����Ҷ�
		// �迭����� ���� �����ϰ��� �Ҷ�
		
		int index = 0;
		for(int n : intKor) {
			intKor[index++] = rnd.nextInt(50);
		}
		
		// ���� for�� index ������ ����Ͽ�
		// ���ٿ� 5���� �迭 ��Ҹ� �����Ͽ�
		// ǥ���ϴ� ���
		index = 0;
		for(int n : intKor) {
			System.out.print(n);
			if(++index %5 == 0)System.out.println();
			else System.out.print(", ");
		}
		
	}

}
