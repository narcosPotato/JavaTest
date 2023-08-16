package com.test.question;

import java.util.Scanner;

public class Q043 {

	public static void main(String[] args) {
		
		//Q043.java
		
		/*
		
			요구사항
			- 컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현하시오.
			
			조건
			- 시도 횟수가 10회가 넘어가면 프로그램을 종료하시오.
		
		*/
		
		numGame();
	}

	private static void numGame() {
		
		
		int random = (int)(Math.random() * 10) + 1;
		int answer = 0;
		
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=1; i<=9; i++) {
			System.out.print("숫자:");
			answer = scan.nextInt();
			
			if (answer == random) {
				System.out.printf("맞았습니다.\n\n"
						+ "컴퓨터가 생각한 숫자는 %d입니다.\n"
						+ "정답을 맞추는데 시도한 횟수는 %d회입니다.\n\n"
						+ "프로그램을 종료합니다.", answer, i);
				break;
			} else if (i == 9) {
				System.out.println("틀렸습니다.\n");
				System.out.printf("컴퓨터가 생각한 숫자는 5입니다.\n"
						+ "모든 기회를 실패했습니다.\n\n"
						+ "프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("틀렸습니다.\n");
			
			}
		}
	
	}
}