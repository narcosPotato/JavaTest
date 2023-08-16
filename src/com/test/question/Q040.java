package com.test.question;

import java.util.Scanner;

public class Q040 {

	public static void main(String[] args) {
		
		//Q040.java
		
		/*
		
			요구사항
			- 아래와 같이 출력하시오.
			
			입력
			- 시작 숫자: 1 
			
			- 종료 숫자: 10 
			
			출력
			- 1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5
		
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
		
		String print = "";
		String plusMinus = " + ";
		
		for(int i=start; i<=end; i++) {
			
			if (plusMinus.equals(" + ")) {
				sum += i;
				print += i;
				plusMinus = " - ";
				if (i == end) {
					break;
				}
				if (start < end) {
					print += plusMinus;
				}
			} else {
				sum -= i;
				print += i;
				plusMinus = " + ";
				if (i == end) {
					break;
				}
				if (start < end) {
					print += plusMinus;					
				}
			}
			
		}
		
		System.out.println(print + " = " + sum);
		
	}
	
}
