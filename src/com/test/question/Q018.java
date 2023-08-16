package com.test.question;

public class Q018 {
	
	public static void main(String[] args) {
		
		//Q018.java
		
		/*
		
			요구사항
			- 인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하시오.
			
			조건
			- int positive(int)
			- int positive(int, int)
			- int positive(int, int, int)
			- int positive(int, int, int, int)
			- int positive(int, int, int, int, int)
		
		*/
		
		
		int count = 0;
		
		count = positive(10);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20, -30);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20, -30, 40);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수: %d개\n", count);
		
		
	}
	
	public static int positive(int num1) {
		
		int count = 0;
		
		count = (num1 > 0) ? ++count : count;
		
		return count;
	}
	
	public static int positive(int num1 ,int num2) {
		
		int count = 0;
		
		count = (num1 > 0) ? ++count : count;
		count = (num2 > 0) ? ++count : count;
		
		return count;
	}
	
	public static int positive(int num1 ,int num2, int num3) {
		
		int count = 0;
		
		count = (num1 > 0) ? ++count : count;
		count = (num2 > 0) ? ++count : count;
		count = (num3 > 0) ? ++count : count;
		
		return count;
	}
	
	public static int positive(int num1 ,int num2, int num3, int num4) {
		
		int count = 0;
		
		count = (num1 > 0) ? ++count : count;
		count = (num2 > 0) ? ++count : count;
		count = (num3 > 0) ? ++count : count;
		count = (num4 > 0) ? ++count : count;
		
		return count;
	}
	
	public static int positive(int num1 ,int num2, int num3, int num4, int num5) {
		
		int count = 0;
		
		count = (num1 > 0) ? ++count : count;
		count = (num2 > 0) ? ++count : count;
		count = (num3 > 0) ? ++count : count;
		count = (num4 > 0) ? ++count : count;
		count = (num5 > 0) ? ++count : count;
		 
		return count;
	}
}
