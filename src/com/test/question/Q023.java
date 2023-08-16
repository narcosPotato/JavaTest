package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {

	public static void main(String[] args) {
		
		//Q023.java
		
		/*
		
			요구사항
			- 아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
		
		*/
		
		fatherDaughter();
		
	}

	private static void fatherDaughter() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아빠 생일(년): ");
		int fatherYear = scan.nextInt();
		
		System.out.print("아빠 생일(월): ");
		int fatherMonth = scan.nextInt();
		
		System.out.print("아빠 생일(일): ");
		int fatherDay = scan.nextInt();
		
		System.out.print("딸 생일(년): ");
		int daughterYear = scan.nextInt();
		
		System.out.print("딸 생일(월): ");
		int daughterMonth = scan.nextInt();
		
		System.out.print("딸 생일(일): ");
		int daughterDay = scan.nextInt();
		
		Calendar now = Calendar.getInstance();
		
		Calendar father = Calendar.getInstance();
		father.set(fatherYear, fatherMonth, fatherDay);
		
		Calendar daughter = Calendar.getInstance();
		daughter.set(daughterYear, daughterMonth, daughterDay);
		
		long nowMs = now.getTimeInMillis(); //현재시간 필요없음
		
		long fatherMs = father.getTimeInMillis();
		
		long daughterMs = daughter.getTimeInMillis();
		
		long nowMinusF = nowMs - fatherMs;// 없어도됨
		
		long nowMinusD = nowMs - daughterMs;// 없어도됨
		
		long result = nowMinusF - nowMinusD;
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.", result / 1000 / 60 / 60 / 24);
		
		
	}
	
	
	
}
