package com.test.question;

import java.util.Arrays;

public class Q064 {

	public static void main(String[] args) {
		
		//Q064.java
		
		/*
		
			요구사항
			- 1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.
			
			조건
			- 난수를 20개 발생 후 배열에 넣는다.
			- 난수는 1 ~ 20 사이
			
			출력
			- 원본: 10, 9, 3, 18, 15, 9, 5, 4, 3, 11, 15, 18, 9, 14, 18, 5, 8, 7, 9, 17,
			- 최댓값: 18
			- 최솟값: 3
		
		*/
		int num;
		int max = 1;
		int min = 20;
		String txt = "원본: ";
		
		int[] random = new int[20];
		
		for (int i=0; i<random.length; i++) {
			num = (int)(Math.random() * 20) + 1;
			random[i] = num;
			txt += num + ", ";
			
			if (random[i] > max) {
				max = random[i];
			}
			
			if (random[i] < min) {
				min = random[i];
			}
			
		}
		
		System.out.println(txt);
		System.out.printf("최댓값: %d\n", max);
		System.out.printf("최솟값: %d", min);
	}
	
}
