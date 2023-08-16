package com.test.question;

import java.util.Arrays;

public class Q066 {

	public static void main(String[] args) {
		
		//Q066.java
		
		/*
		
			요구사항
			- 중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
			
			조건
			- 숫자의 범위: 1 ~ 45
			- 오름차순 정렬
			
			출력
			- [1, 5, 23, 36, 37, 41]
		
		*/
		
		
		
		int[] lotto = new int[6];
		
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = ((int)(Math.random() * 45) + 1);
			for (int j=0; j<i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
				
		} 
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
	}
	
}
