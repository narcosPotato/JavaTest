package com.test.question;

import java.util.Scanner;

public class Q089 {

	public static void main(String[] args) {
		
		//Q089.java
		
		/*
		
			요구사항
			- 입력받은 금액을 한글로 출력하시오.
			
			조건
			- 입력 범위(원): 0 ~ 99,999,999
			
			입력
			- 금액(원): 120 
			
			출력
			- 일금 일백이십원
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액(원): ");
		String money = scan.nextLine();
		String c = "";
		String result = "";
		
		for (int i=0; i<money.length(); i++) {
			if (money.charAt(i) == '1') {
				c = "일";
			} else if (money.charAt(i) == '2') {
				c = "이";
			} else if (money.charAt(i) == '3') {
				c = "삼";
			} else if (money.charAt(i) == '4') {
				c = "사";
			} else if (money.charAt(i) == '5') {
				c = "오";
			} else if (money.charAt(i) == '6') {
				c = "육";
			} else if (money.charAt(i) == '7') {
				c = "칠";
			} else if (money.charAt(i) == '8') {
				c = "팔";
			} else if (money.charAt(i) == '9') {
				c = "구";
			} else {
				c = "";
			}
			
			result += c;
			result += moneyUnit(i, money.length(), c);
			
		}
		System.out.println(result);
	}

	private static String moneyUnit(int i, int length, String c) {
	
		String[] list = {"원", "만"};
		String[] list2 = {"천", "", "십", "백"};
		String unit = "";
		
		if (!c.equals("")) {
			unit += list2[(length - i) % 4];
			
		}
		
		if ((length - i) % 4 == 1) {
			unit += list[(length - i) / 5];
		}
		
		return unit;
	}

	
}
