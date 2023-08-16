package com.test.question;

import java.util.Scanner;

public class Q024 {

	public static void main(String[] args) {
		
		//Q024.java
		
		/*
		
			요구사항
			- 여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다. 고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.
			
			조건
			- 전화를 걸면 짜장면은 10분 뒤에 도착합니다.
			- 전화를 걸면 치킨은 18분 뒤 도착합니다.
			- 전화를 걸면 피자는 25분 뒤 도착합니다.
			- 음식을 받기 원하는 시간은 오후 11시 이전에만 가능합니다.(날짜 변경 금지)
		
		*/
		
		Delivery();
		
	}

	private static void Delivery() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("음식을 받기 원하는 시각");
		
		System.out.print("시: ");
		int hour = scan.nextInt();
		
		System.out.print("분: ");
		int min = scan.nextInt();
		
		int jjajangMin = min - 10;
		int chickenMin = min - 18;
		int pizzaMin = min - 25;
		
		int jjajangHour = hour;
		int chickenHour = hour;
		int pizzaHour = hour;
		
		jjajangHour = (jjajangMin < 0) ? --jjajangHour : hour;
		jjajangMin = (jjajangMin > 0) ? jjajangMin % 60 : 60 + jjajangMin;

		chickenHour = (chickenMin < 0) ? --chickenHour : hour;
		chickenMin = (chickenMin > 0) ? chickenMin % 60 : 60 + chickenMin;
		
		pizzaHour = (pizzaMin < 0) ? --pizzaHour : hour;
		pizzaMin = (pizzaMin > 0) ? pizzaMin % 60 : 60 + pizzaMin;
		
		System.out.printf("짜장면: %d시 %d분\n치킨: %d시 %d분\n피자: %d시 %d분"
							, jjajangHour
							, jjajangMin
							, chickenHour
							, chickenMin
							, pizzaHour
							, pizzaMin);
	}
	
}
