package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		
		//Q002.java
		
		/*
		
			요구사항
			- 숫자 2개를 입력받아 아래의 연산식을 출력하시오.

			조건
			- 출력 숫자에 천단위 표기 하시오.
			- 결과값은 소수 이하 1자리까지 표기 하시오.
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num2 = scan.nextInt();
		
		System.out.printf("%,d + %,d = %,d\n", num1, num2, num1 + num2);
		System.out.printf("%,d - %,d = %,d\n", num1, num2, num1 - num2);
		System.out.printf("%,d * %,d = %,d\n", num1, num2, num1 * num2);
		System.out.printf("%,d / %,d = %.1f\n", num1, num2, num1 / (double)num2);
		System.out.printf("%,d %% %,d = %,d\n", num1, num2, num1 % num2);
		
	}
	
}
