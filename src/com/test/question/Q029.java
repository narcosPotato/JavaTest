package com.test.question;

import java.util.Scanner;

public class Q029 {

	public static void main(String[] args) {
		
		//Q029.java
		
		/*
		
			요구사항
			- 숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
			
			조건
			- 정수만 입력하시오.(유효성 검사 필요없음)
			- 나머지 연산 결과는 소수이하 첫째자리까지 출력 하시오.
			- 연산자는 산술 연산자(+, -, *, /, %)만 입력하시오.
		
		*/
		
		arithmetic();
		
	}

	private static void arithmetic() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num2 = scan.nextInt();
		scan.nextLine();
		
		System.out.print("연산자: ");
		String operator = scan.nextLine();
		
		if (operator.equals("+")) {
			System.out.printf("%d %s %d = %d", num1, operator, num2, num1 + num2);
		} else if (operator.equals("-")) {
			System.out.printf("%d %s %d = %d", num1, operator, num2, num1 - num2);
		} else if (operator.equals("*")) {
			System.out.printf("%d %s %d = %d", num1, operator, num2, num1 * num2);
		} else if (operator.equals("/")) {
			System.out.printf("%d %s %d = %.1f", num1, operator, num2, num1 / (double)num2);
		} else if (operator.equals("%")) {
			System.out.printf("%d %s %d = %.1f", num1, operator, num2, num1 % (double)num2);
		} else {
			System.out.println("연산이 불가능합니다.");
		}
		
		
	}
	
}
