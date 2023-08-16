package com.test.question;

import java.util.Scanner;

public class Q086 {

	public static void main(String[] args) {
		
		//Q086.java
		
		/*
		
			요구사항
			- 숫자를 입력받아 3자리마다 , 를 붙이시오.
			
			조건
			%,d 사용 금지
			
			입력
			- 숫자: 1234 
			
			출력
			- 결과: 1,234
		
			111,111,111

		
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		String num = scan.nextLine();
		String txt = "";
		
		while (num.length() >= 3) {
			
			txt = "," + num.substring(num.length()-3 , num.length()) + txt;
			num = num.substring(0, num.length()-3);

		}
		
		System.out.println("결과: " + num + txt);
		
	}
	
}
