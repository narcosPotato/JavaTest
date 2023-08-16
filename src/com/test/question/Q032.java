package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q032 {

	public static void main(String[] args) {
		
		//Q032.java
		
		/*
		
			요구사항
			- 주차 요금을 계산하시오.
			
			조건
			- 무료 주차: 30분
			- 초과 10분당: 2,000원
		
		*/
		
		parking();
		
	}

	private static void parking() {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[들어온 시간]");
		System.out.print("시: ");
		int inHour = scan.nextInt();
		
		System.out.print("분: ");
		int inMinute = scan.nextInt();
		
		System.out.println("[나간 시간]");
		System.out.print("시: ");
		int outHour = scan.nextInt();
		
		System.out.print("분: ");
		int outMinute = scan.nextInt();
		
		/*
		
		Calendar inTime = Calendar.getInstance();
		
		Calendar outTime = Calendar.getInstance();
		
		inTime.set(Calendar.HOUR_OF_DAY, inHour);
		inTime.set(Calendar.MINUTE, inMinute);		
		
		outTime.set(Calendar.HOUR_OF_DAY, outHour);		
		outTime.set(Calendar.MINUTE, outMinute);		
		
		long totalTime = outTime.getTimeInMillis() - inTime.getTimeInMillis();
		
		long total = (((totalTime / 1000 / 60) - 30 ) / 10) * 2000;
		
		System.out.printf("주차요금은 %,d원입니다.", total);
		
		*/ //Calendar 클래스 이용
		
		
		 
		int totalTime = (outHour * 60 + outMinute) - (inHour * 60 + inMinute);
		
		int total = (totalTime - 30) / 10; 
		
		if (total >= 1) {
			System.out.printf("주차요금은 %,d원입니다.", total * 2000);
		} else if (total <= 0 ) {
			System.out.println("주차요금은 0원입니다.");
		}
		
		
	}
	
}
