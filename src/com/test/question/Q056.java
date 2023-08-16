package com.test.question;

import java.util.Scanner;

public class Q056 {

	public static void main(String[] args) {
		
		//Q056.java
		
		/*
		
			요구사항
			- 숫자를 2개 입력받아 각각의 약수와 두 숫자의 공약수를 구하시오.
			
			조건
			- 공약수: 둘 이상의 정수에 공통된 약수
			
			입력
			- 첫번째 숫자: 12 
			
			- 두번째 숫자: 8 
			
			출력
			- 12의 약수: 1, 2, 3, 4, 6, 12,
			- 8의 약수: 1, 2, 4, 8,
			- 12와 8의 공약수: 1, 2, 4,
		
		*/
		
		String txt1 = "";
		String txt2 = "";
		String txt3 = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num2 = scan.nextInt();
		
		for (int i=1; i<=num1; i++) {
			if (num1 % i == 0) {
				txt1 += i + ", ";
			}
		}
		
		for (int j=1; j<=num2; j++) {
			if (num2 % j == 0) {
				txt2 += j + ", ";
			}
		}
		
		for (int k=1; k<=((num1 < num2) ? num1 : num2); k++) {
			if (num1 % k == 0 && num2 % k == 0) {
				txt3 += k + ", ";
			}	
		}
		System.out.printf("%d의 약수: %s\n", num1, txt1);
		System.out.printf("%d의 약수: %s\n", num2, txt2);
		System.out.printf("%d와 %d의 공약수: %s\n", num1, num2, txt3);
	}
	
}
