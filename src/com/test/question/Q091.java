package com.test.question;

import java.util.Scanner;

public class Q091 {

	public static void main(String[] args) {
		
		//Q091.java
		
		/*
		
			요구사항
			- 연산식을 입력받아 실제 연산을 하시오.
			
			조건
			- 산술 연산자만 구현하시오.(+, -, *, /, %)
			- 연산식의 공백은 자유롭게 입력 가능합니다.
			- 산술 연산자가 반드시 존재하는지 체크하시오.
			- 피연산자의 갯수가 2개인지 체크하시오.
			
			입력
			- 입력: 10 + 2 
			
			출력
			10 + 2 = 12
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		String input = scan.nextLine();
		int first = 0;
		int second = 0;
		int sum = 0;
		String operator = "";
		
		input = input.replace(" ", "");
		
		
		if (input.indexOf("+") > -1) {
			
			String[] temp = input.split("\\+");
			operator = "+";
			
			if (temp[0].equals("") || temp.length == 1) {
				System.out.println("피연산자가 부족합니다.");
			} else {
				first = Integer.parseInt(temp[0]);
				second = Integer.parseInt(temp[1]);
				sum = first + second;
				System.out.printf("%d %s %d = %d", first, operator, second, sum);
			}
			
		} else if (input.indexOf("-") > -1) {
			
			String[] temp = input.split("-");
			operator = "-";
			
			if (temp[0].equals("") || temp.length == 1) {
				System.out.println("피연산자가 부족합니다.");
			} else {
				first = Integer.parseInt(temp[0]);
				second = Integer.parseInt(temp[1]);
				sum = first - second;
				System.out.printf("%d %s %d = %d", first, operator, second, sum);
			}
			
		} else if (input.indexOf("*") > -1) {
			
			String[] temp = input.split("\\*");
			operator = "*";
			
			if (temp[0].equals("") || temp.length == 1) {
				System.out.println("피연산자가 부족합니다.");
			} else {
				first = Integer.parseInt(temp[0]);
				second = Integer.parseInt(temp[1]);
				sum = first * second;
				System.out.printf("%d %s %d = %d", first, operator, second, sum);
			}
			
		} else if (input.indexOf("/") > -1) {
			
			String[] temp = input.split("/");
			operator = "/";
			
			if (temp[0].equals("") || temp.length == 1) {
				System.out.println("피연산자가 부족합니다.");
			} else {
				first = Integer.parseInt(temp[0]);
				second = Integer.parseInt(temp[1]);
				sum = first / second;
				System.out.printf("%d %s %d = %d", first, operator, second, sum);
			}
			
		} else if (input.indexOf("%") > -1) {
			
			String[] temp = input.split("%");
			operator = "%";
			
			if (temp[0].equals("") || temp.length == 1) {
				System.out.println("피연산자가 부족합니다.");
			} else {
				first = Integer.parseInt(temp[0]);
				second = Integer.parseInt(temp[1]);
				sum = first % second;
				System.out.printf("%d %s %d = %d", first, operator, second, sum);
			}
			
		} else {
			System.out.println("연산자가 올바르지 않습니다.");
		}

		
		
	}
	
}
