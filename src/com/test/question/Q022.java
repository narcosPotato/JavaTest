package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {

	public static void main(String[] args) {
		
		//Q022.java
		
		/*
		
			요구사항
			- 남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.
		
		*/
		
		couple();
	}

	private static void couple() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("남자 이름: ");
		String manName = scan.nextLine();
		
		System.out.print("여자 이름: ");
		String womanName = scan.nextLine();

		System.out.print("만난날(년): ");
		int year = scan.nextInt();

		System.out.print("만난날(월): ");
		int month = scan.nextInt();
	
		System.out.print("만난날(일): ");
		int day = scan.nextInt();
		
		Calendar couple = Calendar.getInstance();
		
		couple.set(year, month-1, day);
		
		System.out.printf("'%s'과(와) '%s'의 기념일\n", manName, womanName);
		
		couple.add(Calendar.DATE, 100);
		
		System.out.printf("100일: %tF\n", couple);
	
		couple.add(Calendar.DATE, 100);
	
		System.out.printf("200일: %tF\n", couple);
		
		couple.add(Calendar.DATE, 100);
		
		System.out.printf("300일: %tF\n", couple);
		
		couple.add(Calendar.DATE, 200);
		
		System.out.printf("500일: %tF\n", couple);
		
		couple.add(Calendar.DATE, 500);
		
		System.out.printf("1000일: %tF\n", couple);
	
	} //코드리뷰 - 다 비슷함
}
