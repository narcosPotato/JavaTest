package com.test.question;

public class Q059 {

	public static void main(String[] args) {
		
		//Q059.java
		
		/*
		
			요구사항
			- 아래와 같이 출력하시오.
			
			조건
			- 마지막 숫자가 100이 넘기 전까지 출력하시오.
			
			- 출력
			1 + 2 + 4 + 7 + 11 + 16 + 22 + 29 + 37 + 46 + 56 + 67 + 79 + 92 +  = 469

		
		*/
		int sum = 1;
		int num = 1;
		int plus = 1;
		String txt = "1 + ";
		
		
		
		for (int i=1; ; i++) {
			
			num += plus;
			
			if (num > 100) {
				break;
			}
			
			sum += num;
			txt += num + " + ";
			plus++;
			
		}
		
		System.out.printf("%s = %d", txt, sum);
		
	}
	
}
