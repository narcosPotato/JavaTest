package com.test.question;

import java.util.Scanner;

public class Q051 {
	public static void main(String[] args) {
		
		//Q052.java
		
		/*
		
			요구사항
			- 아래와 같이 출력하시오.
			
			조건
			- 행의 갯수를 입력받으시오.
			
			입력
			- 행: 5 
			
			출력
			    *
			   ***
			  *****
			 *******
			*********
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행: ");
		int hang = scan.nextInt();
		
		for (int i=1; i<=hang; i++) {
			for (int j=0; j<hang-i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
