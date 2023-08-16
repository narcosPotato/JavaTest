package com.test.question;

public class Q060 {

	public static void main(String[] args) {
		
		//Q060.java
		
		/*
		
			요구사항
			- 아래와 같이 출력하시오.
			
			조건
			- 마지막 숫자가 100이 넘기 전까지 출력하시오.
			
			출력
			1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 +  = 232
		
		*/
		
		int sum = 1;
		int num0 = 0;
		int num1 = 1;
		int temp = 0;
		String txt = "1 + ";
		
		for (int i=1; ; i++) {
			
			temp = num0 + num1;
			
			if (temp > 100) {
				break;
			}
			
			sum += temp;
			txt += temp + " + ";
			
			num0 = num1;
			num1 = temp;
	
		}
		System.out.printf("%s = %d", txt, sum);
		
	}
	
}
