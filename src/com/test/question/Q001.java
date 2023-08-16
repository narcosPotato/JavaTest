package com.test.question;

import java.util.Scanner;

public class Q001 {
	
	public static void main(String[] args) {
		
		//Q001.java
		
		/*
		
		요구사항
		- 태어난 년도를 입력받아 나이를 출력하시오.

		조건
		- 우리나라 나이로 출력하시오.
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("태어난 년도: ");
		
		int year = scan.nextInt(); 
		
		System.out.printf("나이: %d\n", 2023 - year + 1);
		
	}
	
}
