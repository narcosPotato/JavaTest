package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {

	public static void main(String[] args) {
		
		//Q034.java
		
		
		/*
		
			요구사항
			- 날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
			
			조건
			- 입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
			- 입력받은 날짜가 토/일요일이면 아무것도 안한다.
		
		*/
		
		Date();
		
	}

	private static void Date() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("년: ");
		int year = scan.nextInt();
		
		System.out.print("월: ");
		int month = scan.nextInt();
		
		System.out.print("일: ");
		int day = scan.nextInt();
		
		Calendar date = Calendar.getInstance();
		date.set(year, month - 1, day);
		
		if (date.get(Calendar.DAY_OF_WEEK) == 7 || date.get(Calendar.DAY_OF_WEEK) == 1) {
			System.out.printf("입력하신 날짜는 '휴일(토/일)'입니다.\n결과가 없습니다.");		
		} else if (date.get(Calendar.DAY_OF_WEEK) == 2) {
			date.add(Calendar.DATE, + 5);
			System.out.printf("입력하신 날짜는 '평일'입니다.\n해당 주의 토요일로 이동합니다.\n이동한 날짜는 '%tF' 입니다.", date);
		} else if (date.get(Calendar.DAY_OF_WEEK) == 3) {
			date.add(Calendar.DATE, + 4);
			System.out.printf("입력하신 날짜는 '평일'입니다.\n해당 주의 토요일로 이동합니다.\n이동한 날짜는 '%tF' 입니다.", date);
		} else if (date.get(Calendar.DAY_OF_WEEK) == 4) {
			date.add(Calendar.DATE, + 3);
			System.out.printf("입력하신 날짜는 '평일'입니다.\n해당 주의 토요일로 이동합니다.\n이동한 날짜는 '%tF' 입니다.", date);
		} else if (date.get(Calendar.DAY_OF_WEEK) == 5) {
			date.add(Calendar.DATE, + 2);
			System.out.printf("입력하신 날짜는 '평일'입니다.\n해당 주의 토요일로 이동합니다.\n이동한 날짜는 '%tF' 입니다.", date);
		} else {
			date.add(Calendar.DATE, + 1);
			System.out.printf("입력하신 날짜는 '평일'입니다.\n해당 주의 토요일로 이동합니다.\n이동한 날짜는 '%tF' 입니다.", date);
		}
		
		
		
		
		
		
		
		
	}
	
}
