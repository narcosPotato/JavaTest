package com.test.question;

public class Q009 {

	public static void main(String[] args) {
		
		//Q009.java
		
		/*
		
		 	조건
			- String getName(String name)
			- name: OOO(이름)
			- return: OOO(이름)님
		 
		*/
		
		String result = getName("홍길동");
		System.out.printf("고객: %s\n", result);

		result = getName("아무개");
		System.out.printf("고객: %s\n", result);
		
	}
	
	public static String getName(String name) {
		
		return name + "님";
		
	}
}
