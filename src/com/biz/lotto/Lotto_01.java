package com.biz.lotto;

import java.util.Random;

public class Lotto_01 {

	public static void main(String[] args) {

		// 6���� ������ �迭�� ���� �� �ʱ�ȭ(����)
		// 1���� 45������ ������ ������ 1���� �迭�� ä��ÿ�

		int[] intNum = new int[6];
		Random rnd = new Random();

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(45) + 1;
			System.out.print(intNum[i] + "\t");
		}

		// �Ǵٸ� ���Ǽ���(1���� 45)�� �ϳ� �����ؼ�
		// num �迭�� ��� �ִ��� �˻�
		// ������ �ִ�
		// ������ ���ٶ�� ǥ��

		int intR = rnd.nextInt(45) + 1;
		int index;
		for (index = 0; index < intNum.length; index++) {
			if (intNum[index] == intR) {
				break;
			}
		}
		System.out.println();
		if (index >= intNum.length) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}

}
