package com.test.question;

public class Q017 {
	
	public static void main(String[] args) {
		
		//Q017.java
		
		/*
		
			요구사항
			- 인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하시오.
			
			조건
			- 사원 → 대리 → 과장 → 부장
			- void position(String)
			- void position(String, String)
			- void position(String, String, String)
			- void position(String, String, String, String)
		
		*/
		
		
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");
		
	}
	public static void position(String staff) {
		
		System.out.printf(" 사원 : %s\n\n"
							, staff);
	}
	
	public static void position(String staff, String assistantManager) {
		
		System.out.printf(" 사원 : %s\n 대리 : %s\n\n"
							, staff
							, assistantManager);
	}
	
	public static void position(String staff, String assistantManager, String manager) {
		
		System.out.printf(" 사원 : %s\n 대리 : %s\n 과장 : %s\n\n"
							, staff
							, assistantManager
							, manager);
	}
	
	public static void position(String staff, String assistantManager, String manager, String director) {
		
		System.out.printf(" 사원 : %s\n 대리 : %s\n 과장 : %s\n 부장 : %s\n"
							, staff
							, assistantManager
							, manager
							, director);
	}
}
