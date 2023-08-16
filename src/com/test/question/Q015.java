package com.test.question;

import java.util.Scanner;

public class Q015 {

	public static void main(String[] args) {
		
		//Q015.java
		
		/*
		
			요구사항
			- 사과 나무가 있다. 사과 나무 씨앗을 심을 날로부터 특정 시간이 흘렀을 때 사과 총 몇개가 열리는지 구하는 메소드를 선언하시오.
			
			조건
			- int getApple(int sunny, int foggy)
			- 사과 나무를 처음 심었을 때 나무의 길이: 0m
			- 맑은 날 사과 나무의 성장률: 5㎝
			- 흐린 날 사과 나무의 성장률: 2㎝
			- 사과 나무는 길이가 1m 넘는 시점부터 사과가 열린다.
			- 1m 넘는 시점부터 10㎝ 자랄 때마다 사과가 1개씩 열린다.
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("맑은 날: ");
		int sunny = scan.nextInt();
		
		System.out.print("흐린 날: ");
		int foggy = scan.nextInt();
		
		int totalTree = getApple(sunny, foggy);
		System.out.printf("사과가 총 %d개 열렸습니다.", totalTree);
		
	}
	
	public static int getApple(int sunny, int foggy) {
		
		int sunnyDay = sunny * 5;
		
		int foggyDay = foggy * 2;
		
		int appleTree = sunnyDay + foggyDay;
		
		int totalTree = (appleTree >= 100 ? ( appleTree - 100 ) / 10 : 0);
		
		return totalTree;
		
	}
	
}
