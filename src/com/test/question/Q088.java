package com.test.question;

import java.util.Scanner;

public class Q088 {

	public static void main(String[] args) {
		
		//Q088.java
		
		/*
		
			요구사항
			- 금지어를 마스킹 처리 하시오.
			
			조건
			- 금지어
			  - 바보
			  - 멍청이
			
			입력
			- 입력: 너랑 안놀아 바보야!! 
			
			출력
			너랑 안놀아 **야!!
			금지어를 1회 마스킹했습니다.
		
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		String input = scan.nextLine();
		
		String fool = "바보";
		String idiot = "멍청이";
		int count = 0;
		
		
		if (input.indexOf(fool) > -1){
			input = input.replace(fool, "**");
			++count;
		}
		
		if (input.indexOf(idiot) > -1) {
			input = input.replace(idiot, "***");
			++count;
		} 
		
		System.out.printf("%s\n금지어를 %d회 마스킹했습니다.", input, count);
		
	}
	
}
