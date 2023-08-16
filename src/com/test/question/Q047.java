package com.test.question;

import java.util.Scanner;

public class Q047 {
	public static void main(String[] args) {
		
		//Q047.java
		
		/*
		
			요구사항
			- 자판기 프로그램을 구현하시오..
		
		*/
		
		for (int i=1; i<=20; i++) {
			System.out.print("=");
		}
		
		System.out.println();
		System.out.printf("%11s", "자판기");
		System.out.println();
		
		for (int i=1; i<=20; i++) {
			System.out.print("=");
		}
		
		System.out.println();
		
		int coke = 700;
		int cider = 600;
		int vita = 500;
		
		System.out.printf("1. 콜라:\t\t%d원\n", coke);
		System.out.printf("2. 사이다:\t%d원\n", cider);
		System.out.printf("3. 비타500:\t%d원\n", vita);
		
		for (int i=1; i<=20; i++) {
			System.out.print("-");
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("금액 투입(원) : ");
		int pay = scan.nextInt();
		
		if (pay > 0) {
			
			for (int i=1; i<=20; i++) {
				System.out.print("-");
			}
			
			System.out.println();
			
			System.out.print("음료 선택(번호): ");
			int num = scan.nextInt();
			scan.nextLine();
			
			System.out.println();
			
			if (num == 1 && pay >= 700) {
				
				System.out.println("+콜라를 제공합니다.");
				System.out.printf("+잔돈 %d원을 제공합니다.\n\n", pay - coke);
				
				System.out.print("계속하려면 엔터를 입력하세요.\n");
				scan.nextLine();
				main(args);
				
			} else if (num == 1 && pay < 700) {
				
				System.out.println("금액이 부족하여 콜라를 구매하실 수 없습니다.");
				
			} else if (num == 2 && pay >= 600) {
				
				System.out.println("+사이다를 제공합니다.");
				System.out.printf("+잔돈 %d원을 제공합니다.\n\n", pay - cider);
				
				System.out.print("계속하려면 엔터를 입력하세요.\n");
				scan.nextLine();
				main(args);
				
			} else if (num == 2 && pay < 600) {
				
				System.out.println("금액이 부족하여 사이다를 구매하실 수 없습니다.");
				
			} else if (num == 3 && pay >= 500) {
				
				System.out.println("+비타500을 제공합니다.");
				System.out.printf("+잔돈 %d원을 제공합니다.\n\n", pay - vita);
				
				System.out.print("계속하려면 엔터를 입력하세요.\n");
				scan.nextLine();
				main(args);
				
			} else if (num == 3 && pay < 500) {
				
				System.out.println("금액이 부족하여 비타500을 구매하실 수 없습니다.");
				
			}
			
		}
	}
}
