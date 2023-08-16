package com.test.question;

import java.util.Scanner;

public class Q039 {

	public static void main(String[] args) {
		
		//Q039.java
		
		/*
		
		 요구사항
		 - 아래와 같이 출력하시오.

		 입력
		 - 시작 숫자: 1 
		
		 - 종료 숫자: 10 
		
		 출력
		 - 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		 
		*/
		
		startEnd();
		
	}

	private static void startEnd() {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		int start = scan.nextInt();
		
		System.out.print("종료 숫자: ");
		int end = scan.nextInt();
		
		int sum = 0;
		int plus = 0;
		
		for (int i=start; i<=end; i++) {
			sum += i;
			
			System.out.printf("%d", i);
			if (i == end) {
				System.out.printf(" = %d", sum);
			} else {
				System.out.print(" + ");
			}
			
		}
		
		
		
	}
	
}
