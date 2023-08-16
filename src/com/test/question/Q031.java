package com.test.question;

import java.util.Scanner;

public class Q031 {
	
	public static void main(String[] args) {
		
		//Q031.java
		
		/*
		
			요구사항
			- 숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.
		
		*/
		
		evenOdd();
		
	}

	private static void evenOdd() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int num1 = scan.nextInt();
		
		System.out.print("숫자 입력: ");
		int num2 = scan.nextInt();
		
		System.out.print("숫자 입력: ");
		int num3 = scan.nextInt();
		
		System.out.print("숫자 입력: ");
		int num4 = scan.nextInt();
		
		System.out.print("숫자 입력: ");
		int num5 = scan.nextInt();
		
		int even = 0;
		int odd = 0;
		
		if (num1 % 2 == 0) {
			++even; 
		} else {
			++odd;
		}
		
		if (num2 % 2 == 0) {
			++even; 
		} else {
			++odd;
		}
		
		if (num3 % 2 == 0) {
			++even; 
		} else {
			++odd;
		}
		
		if (num4 % 2 == 0) {
			++even; 
		} else {
			++odd;
		}
		
		if (num5 % 2 == 0) {
			++even; 
		} else {
			++odd;
		}
		
		if (even > odd) {
			System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n짝수가 홀수보다 %d개 더 많습니다.", even, odd, even - odd);
		} else if (odd > even ) {
			System.out.printf("홀수는 %d개 짝수는 %d개 입력했습니다.\n홀수가 짝수보다 %d개 더 많습니다.", odd, even, odd - even);
		}
		
	}
	
}
