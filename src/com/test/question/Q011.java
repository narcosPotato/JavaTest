package com.test.question;

import java.util.Scanner;

public class Q011 {
	
	public static void main(String[] args) {
		
		//Q011.java
		
		/*
		
			요구사항
			- 숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
			
			조건
			- String add(int, int)
			- String subtract(int, int)
			- String multiply(int, int)
			- String divide(int, int)
			- String mod(int, int)
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int n1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		int n2 = scan.nextInt();
		
		String result = add(n1, n2); 
		System.out.println(result);
		
		result = subtract(n1, n2);
		System.out.println(result);

		result = multiply(n1, n2);
		System.out.println(result);

		result = divide(n1, n2);
		System.out.println(result);

		result = mod(n1, n2);
		System.out.println(result);
		
	}
	public static String add(int n1, int n2) {
			
			int result = n1 + n2;
			
			String resultText;
			
			resultText = "";
			
			resultText = n1 + " + " + n2 + " = " + result;
		
			return resultText;
	}

	public static String subtract(int n1, int n2) {
		
		int result = n1 - n2;
		
		String resultText;
		
		resultText = "";
		
		resultText = n1 + " - " + n2 + " = " + result;
	
		return resultText;
	}
	
	public static String multiply(int n1, int n2) {
		
		int result = n1 * n2;
		
		String resultText;
		
		resultText = "";
		
		resultText = n1 + " * " + n2 + " = " + result;
	
		return resultText;
	}
	
	public static String divide(int n1, int n2) {
		
		double result = n1 / (double)n2;
		
		String resultText;
		
		resultText = "";

		//System.out.printf("%s", "aa");//print
		
		resultText = n1 + " / " + n2 + " = " + String.format("%.1f", result);
	
		return resultText;
	}
	
	public static String mod(int n1, int n2) {
		
		int result = n1 % n2;
		
		String resultText;
		
		resultText = "";
		
		resultText = n1 + " % " + n2 + " = " + result;
	
		return resultText;
	}
	
}