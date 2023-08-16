package com.test.question;

public class Q016 {

	public static void main(String[] args) {
		
		//Q016.java
		
		/*
		
			요구사항
			- 인자로 받은 숫자들의 합을 구하는 메소드를 선언하시오.
			
			조건
			- void sum(int)
			- void sum(int, int)
			- void sum(int, int, int)
			- void sum(int, int, int, int)
			- void sum(int, int, int, int, int)
		
		*/
		
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);
		
	}
	
	public static void sum(int n0) {	// 10 = 10													
		System.out.printf("%d = %d\n"
							, n0
							, n0);		
	}
	
	public static void sum(int n0, int n1) {	// 10 + 20 = 30
		System.out.printf("%d + %d = %d\n"
							, n0
							, n1
							, n0 + n1);
	}
	
	public static void sum(int n0, int n1, int n2) {	// 10 + 20 + 30 = 60
		System.out.printf("%d + %d + %d = %d\n"
							, n0
							, n1
							, n2
							, n0 + n1 + n2);
	}
	
	public static void sum(int n0, int n1, int n2, int n3) {	// 10 + 20 + 30 + 40 = 100 
		System.out.printf("%d + %d + %d + %d = %d\n"
							, n0
							, n1
							, n2
							, n3
							, n0 + n1 + n2 + n3);
	}
	
	public static void sum(int n0, int n1, int n2, int n3, int n4) {	// 10 + 20 + 30 + 40 + 50 = 150 
		System.out.printf("%d + %d + %d + %d + %d = %d\n"
							, n0
							, n1
							, n2
							, n3
							, n4
							, n0 + n1 + n2 + n3 + n4);
	}
	
}
