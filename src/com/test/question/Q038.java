package com.test.question;

import java.util.Scanner;

public class Q038 {

	public static void main(String[] args) {
		
		//Q038.java
		
		/*
		
			요구사항
			- 입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.
		
		*/
		
		evenOddPlus();
		
	}

	private static void evenOddPlus() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 횟수: ");
		int inputNum = scan.nextInt();
		int even = 0;
		int odd = 0;
		int evenCount = 0;
		int oddCount = 0;
		
		for (int i=1; i<=inputNum; i++) {
			System.out.print("숫자: ");
			int num = scan.nextInt();
			
			if (num % 2 == 0) {
				even = even += num;
				++evenCount;
				
			} else {
				odd = odd += num;
				++oddCount;
			}
		}
		
		System.out.printf("짝수 %d개의 합: %d\n", evenCount, even);
		System.out.printf("홀수 %d개의 합: %d\n", oddCount, odd);
	}
	
}
