package com.test.question;

import java.util.Scanner;

public class Q052 {
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
			    aa
			   abba
			  abccba
			 abcddbca
			abcdeedcba
		
		*/
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행: ");
		int hang = scan.nextInt();
		
		for (int i=1; i<=hang; i++) {
			for (int j=0; j<hang-i; j++) {
				System.out.print(" ");
			}
			
			char abc = 'a';
			
			for (int k=0; k<i*2/2; k++) {
				System.out.printf("%c", abc);
				abc += 1;
			}
			
			for (int l=0; l<i*2/2; l++) {
				abc -= 1;
				System.out.printf("%c", abc);
			}
			System.out.println();
		}
		
	}
}
