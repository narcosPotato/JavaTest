package com.test.question;

import java.util.Scanner;

public class Q007 {

	public static void main(String[] args) {
		
		//Q007.java
		
		/*
		
			요구사항
			- 영문 소문자를 1글자 입력받은 후 대문자로 변환해서 출력하시오.

			조건
			- 대문자와 소문자의 문자 코드값의 관계
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자 입력: ");
		String alphabet = scan.nextLine();
		int code = (int)alphabet.charAt(0);
		
		
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.", code, code - 32);
		
		
		
		
		
		
		
		
		
		
	}
	
}
