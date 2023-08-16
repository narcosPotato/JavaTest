package com.test.question;

import java.util.Scanner;

public class Q048 {
	
	public static void main(String[] args) {
		
		//Q048.java
		
		/*
		
			요구사항
			- 최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
			
			조건
			- int 양수만 입력하시오.
		
		*/
		
		int even = 0;
		int odd = 0;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력(최대 9자리): ");
		int num = scan.nextInt();
		

		
		for (int i=1; ; i++) {
			
			if (num % 10 % 2 == 0) {
				even += num % 10;
			} else {
				odd += num % 10;
			}
			
			num /= 10;
			
			if (num == 0) {
				break;
			}
		}
		
		System.out.printf("짝수의 합: %d\n홀수의 합: %d", even, odd);
	}
	
}
