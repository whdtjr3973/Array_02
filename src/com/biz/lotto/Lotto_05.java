package com.biz.lotto;

import java.util.Random;

public class Lotto_05 {

	public static void main(String[] args) {

		/*
		 * 1. 정수형 배열을 45개를 생성 2. 순서대로 1~45까지의 숫자를 각각 대입 배열요소에는 중복된 값이 없다. 3. 45개의 배열을
		 * 무작위로 섞기(suffle) 4. 섞인 배열에서 0번부터 5번까지를 추출해서 5. 콘솔에 보여주기
		 */
		int[] nums = new int[45];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		// 횟수를 정하지 않는 반복문
		// 무한 반복
		// for(;;) {}
		// 보통은 for문을 이용하여 무한반복을 사용하지 않는다.

		// 무한반복
//		boolean a = 1 == 1 ;
//		int index = 100;
//		while (index > 0) { // while(true)
//			index--;
//		}
//		while(true) {
//			if(!a) break;
//		}
		Random rnd = new Random();
		int loop = nums.length * 3;
		while (loop > 0) {

			// 임의로 0 ~ 44까지 숫자 2개를생성해서
			// 각각 변수에 대입
			int index1 = rnd.nextInt(nums.length);
			int index2 = rnd.nextInt(nums.length);

			// 두개의 변수에 저장된 값이 다르면
			if (index1 != index2) {
				int _t = nums[index1];
				nums[index1] = nums[index2];
				nums[index2] = _t;
				loop--;
			}
		}

		for (int i = 0; i < 6; i++) {
			System.out.print(nums[i] + "\t");
		}

		System.out.println();

		// 추출된 로또번호 오름차순 정렬
		int[] lottos = new int[6];
		for(int i = 0 ; i < lottos.length; i++) {
			lottos[i] = nums[i];
		}
		
		int _t;
		for(int i = 0 ; i < lottos.length; i++) {
			for(int j = i + 1 ; j <lottos.length; j++) {
				if(lottos[i] > lottos[j]) {
				_t = lottos[i];
				lottos[i] = lottos[j];
				lottos[j] = _t;
				}
			}
		}
			
		for(int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + "\t");
		}
	}
}
