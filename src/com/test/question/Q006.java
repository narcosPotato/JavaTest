package com.test.question;

import java.util.Scanner;

public class Q006 {
	public static void main(String[] args) {
		
		//Q006.java
		
		/*
		
		  	요구사항
			- 사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.

			조건
			- 세금: 수입의 3.3%
		 
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("한달 수입 금액(원): ");
		int monthIncome = scan.nextInt();
		
		System.out.printf("세후 금액(원): %,.0f원\n세금(원): %,.0f원", monthIncome - monthIncome * 0.033 , monthIncome * 0.033);
		
	}
}
