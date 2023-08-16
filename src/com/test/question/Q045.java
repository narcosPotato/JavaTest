package com.test.question;

import java.util.Scanner;

public class Q045 {
	
	public static void main(String[] args) {
	
		//Q045.java
		
		/*
		
			요구사항
			- 사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력하시오.
			
			조건
			- 최대 3자리까지만 입력하시오.
			
			입력
			- 최대 숫자: 50 
			
			출력
			- 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 14 15 짝 17 18 짝 20 
			- 21 22 짝 24 25 짝 27 28 짝 짝 짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40 
			- 41 42 짝 44 45 짝 47 48 짝 50

		*/
		
		threeSixNine();
			
		
}

	private static void threeSixNine() {
		
		Scanner scan = new Scanner(System.in);
		
		String clap = "";
		int count = 0;
		
		System.out.print("최대 숫자: ");
		int maxNum = scan.nextInt();
		
		if (maxNum > 1000) {
			System.out.println("최대 3자리까지만 입력하세요.");
		} else if (maxNum < 0) {
			System.out.println("양수만 입력해 주세요.");
		} else {
		
			for (int i=1; i<=maxNum; i++) {
				
				 count = 0;
				
				 int hundred = i / 100;       
		         int ten = (i / 10) % 10; 
		         int one = i % 10;      
		    
		         if (hundred == 3 || hundred == 6 || hundred == 9) {
		                count++;
		            }
		         if (ten == 3 || ten == 6 || ten == 9) {
		                count++;
		            }
		         if (one == 3 || one == 6 || one == 9) {
		                count++;
		            }
		         
		         clap = "";
		         
		         if (count > 0) {
		             for (int j=0; j<count; j++) {
		                 clap += "짝";
		             }
		         } else {
		             clap = Integer.toString(i);
		         }
				
				System.out.printf(" %s ", clap);
			}
		
		}
	}	
}
