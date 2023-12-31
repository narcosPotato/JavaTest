package com.test.question;

import java.util.Scanner;

public class Q065 {

	public static void main(String[] args) {
		
		//Q065.java
		
		/*
		
			요구사항
			- 난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.
			
			조건
			- 난수를 20개 발생 후 배열에 넣는다.
			- 난수는 1 ~ 20 사이
			- 배열을 탐색하여 범위에 만족하는 숫자만 출력한다.
			
			입력
			- 최대 범위: 15 
			- 최소 범위: 5 
			
			출력
			원본: 10, 2, 3, 20, 15, 9, 5, 1, 3, 11, 15, 18, 9, 14, 18, 5, 8, 2, 1, 17
			결과: 10, 15, 9, 5, 11, 15, 9, 14, 5, 8

		
		*/
		
		int num;
		String length = "";
		String txt = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("최대 범위: ");
		int maxLength = scan.nextInt();
		
		System.out.print("최소 범위: ");
		int minLength = scan.nextInt();
		
		int[] random = new int[20];
		
		for (int i=0; i<20; i++) {
			num = (int)(Math.random() * 20) + 1;
			random[i] = num;
			txt += random[i] + ", ";
			
			if (num <= maxLength && num > minLength) {
				length += num + ", ";
			} 
			
		}
		System.out.printf("원본: %s\n", txt);
		System.out.printf("결과: %s", length);
	}
	
}
