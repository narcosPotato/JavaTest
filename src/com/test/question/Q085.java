package com.test.question;

import java.util.Scanner;

public class Q085 {

	public static void main(String[] args) {
		
		//Q085.java
		
		/*
		
			요구사항
			- 주민 등록 번호 유효성 검사를 하시오.
			
			조건
			'-'의 입력 유무 상관없이 검사하시오.
			
			입력
			- 주민등록번호: 951220-1021547 
			
			출력
			- 올바른 주민등록번호입니다.
			
			1, 2 - 1900년대생
			3, 4 - 2000년대생
			9, 0 - 1800년대생
			5, 6 - 귀화
			7, 8
			
			9 9 0 3 1 8 - 1 4 7 9 0 1 8
			7 0 0 1 0 1 - 1 0 1 0 1 0 4
			x
			2 3 4 5 6 7   8 9 2 3 4 5
			----------------------------
			14    5   7   9   2   4    = 40
			
			40 % 11 = 7
			
			11 - 7 = 4
			11 - 0 = 11 > 1
			11 - 1 = 10 > 0		
					
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민등록번호: ");
		String jumin = scan.nextLine();
		int juminTotal = 0;
		int firstJumin = 0;
		int secondJumin = 0;
		int juminCheck = 0; 
		
		
			jumin = jumin.replace("-", "");
			
			for (int i=0; i<8; i++) {
				firstJumin = Integer.parseInt(jumin.substring(i, i+1));
				juminTotal += firstJumin * (i+2);
			}
			
			for (int i=2; i<6; i++) {
				secondJumin = Integer.parseInt(jumin.substring(i+6, i+7));
				juminTotal += secondJumin * i;
			}
			
			juminCheck = juminTotal % 11;
			juminCheck = 11 - juminCheck;
			
			if (juminCheck == 11) {
				juminCheck = 1;
			}
			
			if (juminCheck == 10) {
				juminCheck = 0;
			}
			
			/*
				코드리뷰
				- 두자릿수 나올 때 처리하는 코드 추가
				- 월, 일 범위 안에 없을때, 있을때 처리하는 코드 추가
			*/
			
			if(juminCheck == Integer.parseInt(jumin.substring(12, 13))) {
				System.out.println("올바른 주민등록번호 입니다.");
			} else {
				System.out.println("올바르지 않은 주민등록번호 입니다.");
			}
			
	}
		
}
	
