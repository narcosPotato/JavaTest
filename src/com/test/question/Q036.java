package com.test.question;

import java.util.Scanner;

public class Q036 {

	public static void main(String[] args) {
		
		//Q036.java
		
		/*
		
			요구사항
			- 시작 숫자, 종료 숫자, 증감치를 입력받아 숫자를 순차적으로 출력하시오.
		
		*/
		
		startEnd();
		
	}

	private static void startEnd() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		int start = scan.nextInt();
		
		System.out.print("종료 숫자: ");
		int end = scan.nextInt();
		
		System.out.print("증감치: ");
		int plus = scan.nextInt();
		
		for (int i=start; i<=end; i+=plus) {
			
			System.out.println(i);
			
		}
		
	}
	
}
