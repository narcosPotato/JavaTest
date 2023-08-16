package com.test.question;

import java.util.Scanner;

public class Q087 {

	public static void main(String[] args) {
		
		//Q087.java
		
		/*
		
			요구사항
			- 영단어를 입력받아 분리하시오.
			
			조건
			- 합성어를 입력한다.
			- 합성어는 파스칼 표기법으로 입력한다.
			- 출력은 각 단어를 공백으로 구분한다.
			
			입력
			- 단어: StudentName 
			
			출력
			- 결과: Student Name
		
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단어: ");
		String word = scan.nextLine();
		
		System.out.print("결과: ");
		
		for (int i=0; i<word.length(); i++) {
			
			char upper = word.charAt(i);
			
			if (upper >= 'A' && upper <= 'Z' && i != 0) {
				System.out.print(" ");
			}
			
			if (i == 0 && upper >= 'a' && upper <= 'z') {
				System.out.println("첫자는 대문자로 입력해주세요.");
				break;
			}
			
			System.out.print(upper);
			
		}
		
	}
	
}
