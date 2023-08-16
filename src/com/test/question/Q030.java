package com.test.question;

import java.util.Scanner;

public class Q030 {

	public static void main(String[] args) {
		
		//Q030.java
		
		/*
		
			요구사항
			- 영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
			
			조건
			- 유효성 검사를 하시오.(영문자만 입력 가능)
		
		*/
		
		alphabet();
		
	}

	private static void alphabet() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자: ");
		String input = scan.nextLine();
		int code = input.charAt(0);
		
		if (code >= 65 && code <= 90) {
			System.out.printf("'%c'의 소문자는 '%c'입니다.", code, code + 32);
		} else if (code >= 97 && code <= 122) {
			System.out.printf("'%c'의 대문자는 '%c'입니다.", code, code - 32);
		} else {
			System.out.println("영문자만 입력하시오.");
		}
	}
	
}
