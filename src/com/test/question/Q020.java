package com.test.question;

import java.util.Calendar;

public class Q020 {

	public static void main(String[] args) {
		
		//Q020.java
		
		/*
		
			요구사항
			- 오늘 태어난 아이의 백일과 첫돌을 출력하시오.
		
		*/
		
		hundredDay();
		
	}

	private static void hundredDay() {
		
		Calendar nowBorn = Calendar.getInstance();
		
		nowBorn.add(Calendar.DATE, 100);
		System.out.printf("백일: %tF\n", nowBorn);
		
		nowBorn.add(Calendar.DATE, -100);
		nowBorn.add(Calendar.YEAR, 1);
		System.out.printf("첫돌: %tF\n", nowBorn);
	}
	// 코드리뷰 - 메소드 2개, 캘린더 2개
}
