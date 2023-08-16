package com.test.question;

import java.util.Scanner;

public class Q046 {

	public static void main(String[] args) {
		
		//Q046.java
		
		/*
	
			요구사항
			- 숫자를 10개 입력받아 한글로 변환 후 출력하시오.
			
			조건
			- 1~9까지만 입력하시오.
	
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String han = "";
		
		for(int i=1; i<=10; i++) {
			System.out.print("숫자: ");
			int num = scan.nextInt();
			
			if (num < 1 || num > 9) {
				System.out.println("1~9까지만 입력하세요.");
				break;
				
			} else {
				
				if (num == 1) {
					han += "일";
				} else if (num == 2) {
					han += "이";
				} else if (num == 3) {
					han += "삼";
				} else if (num == 4) {
					han += "사";
				} else if (num == 5) {
					han += "오";
				} else if (num == 6) {
					han += "육";
				} else if (num == 7) {
					han += "칠";
				} else if (num == 8) {
					han += "팔";
				} else if (num == 9){
					han += "구";
				}
			}
			
			
		}
		System.out.printf("%s", han);
	}
}
