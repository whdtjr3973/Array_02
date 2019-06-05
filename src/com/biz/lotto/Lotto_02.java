package com.biz.lotto;

import java.util.Random;

public class Lotto_02 {

	public static void main(String[] args) {
		// 6개의 정수형 배열을 생성하고

		// 정수배열 개수만큼 반복을 하면서
		// 1. 임의 정수 1부터 45까지 중 한개를 생성
		// 2. 생성한 수가 배열에 이미 담겨 있는지 검사
		// 3. 그렇지 않으면 배열에 임의의 정수를 담기

		int[] num1 = new int[6];
//
		Random rnd = new Random();

		for (int i = 0; i < num1.length; i++) {
			int j = rnd.nextInt(45) + 1;

			// num1배열에 j와 같은 값이 있는지 검사

			int k = 0;
			for (k = 0; k < num1.length; k++) {
				if (num1[k] == j) {
					break;
				}
			}
			// 값을 못찾았다.
			if (k >= num1.length) {
				// 생성한 j를 num1[i]에 대입해도 된다.
				num1[i] = j;
			} else {
				// 번호(j)를 다시 생성해서
				// num1[i]에 저장을 해야한다
				i--;
			}

		}
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + "\t");
		}
	}
}
