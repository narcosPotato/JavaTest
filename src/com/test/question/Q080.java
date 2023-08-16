package com.test.question;

import java.util.Scanner;

public class Q080 {

	public static void main(String[] args) {
		
		//Q080.java
		
		/*
		 
		  요구사항
		  -	문장을 입력받아 역순으로 출력하시오.
			
		  입력
		  -	문장 입력 : 가나다 
			
		  출력
		  -	역순 결과 : "다나가"
		 
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문장 입력 : ");
		String txt = scan.nextLine();
		
		for (int i=txt.length()-1; i>-1; i--) {
			System.out.print(txt.charAt(i));
		}
		
		
	}
	
}
