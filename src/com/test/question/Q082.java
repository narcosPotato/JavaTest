package com.test.question;

import java.util.Scanner;

public class Q082 {

	public static void main(String[] args) {
		
		//Q082.java
		
		/*
		
			요구사항
			- 숫자를 입력받아 각 자릿수의 수의 합을 구하시오.
			
			입력
			- 숫자: 314 
			
			출력
			- 결과: 3 + 1 + 4 = 8
			
		*/
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		String num = scan.nextLine();
		
		for (int i=0; i<num.length(); i++) {
			
			sum += Integer.parseInt(num.substring(i, i+1));
			if (i == num.length()-1) {
				System.out.printf("%s = %d", num.charAt(i), sum);
			} else {
			System.out.printf("%s + ", num.charAt(i));
		
			}
		}
	}
}
