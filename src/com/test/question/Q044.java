package com.test.question;

import java.util.Scanner;

public class Q044 {

	public static void main(String[] args) {
		
		//Q044.java
		
		/*
		
			요구사항
			- 숫자를 N개 입력받아 아래와 같이 출력하시오.
			
			조건
			- 누적값이 100을 넘어가는 순간 루프를 종료하시오.
			- 짝수는 더하고 홀수는 빼시오.
		
		*/
		
		loop();
		
	}

	private static void loop() {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		String txt = "";
		
		for (;;) {
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			if (num % 2 == 0) {
				sum += num;
				txt += " + " + num;
			} else {
				sum -= num;
				txt += " - " + num;
			}
			
			if (sum > 100) {
				System.out.printf("%s = %d", txt, sum);
				break;
			} 
			
			
		}
		
	}
	
}
