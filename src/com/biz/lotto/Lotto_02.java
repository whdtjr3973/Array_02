package com.biz.lotto;

import java.util.Random;

public class Lotto_02 {

	public static void main(String[] args) {
		// 6���� ������ �迭�� �����ϰ�

		// �����迭 ������ŭ �ݺ��� �ϸ鼭
		// 1. ���� ���� 1���� 45���� �� �Ѱ��� ����
		// 2. ������ ���� �迭�� �̹� ��� �ִ��� �˻�
		// 3. �׷��� ������ �迭�� ������ ������ ���

		int[] num1 = new int[6];
//
		Random rnd = new Random();

		for (int i = 0; i < num1.length; i++) {
			int j = rnd.nextInt(45) + 1;

			// num1�迭�� j�� ���� ���� �ִ��� �˻�

			int k = 0;
			for (k = 0; k < num1.length; k++) {
				if (num1[k] == j) {
					break;
				}
			}
			// ���� ��ã�Ҵ�.
			if (k >= num1.length) {
				// ������ j�� num1[i]�� �����ص� �ȴ�.
				num1[i] = j;
			} else {
				// ��ȣ(j)�� �ٽ� �����ؼ�
				// num1[i]�� ������ �ؾ��Ѵ�
				i--;
			}

		}
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + "\t");
		}
	}
}
