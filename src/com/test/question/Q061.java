package com.test.question;

import java.util.Scanner;

public class Q061 {

	public static void main(String[] args) {
		
		//Q061.java
		
		/*
		
			요구사항
			- 숫자를 5개 입력받아 배열에 담은 뒤 역순으로 출력하시오.
			
			조건
			- int[] nums = new int[5];
			
			입력
			- 숫자: 5 
			- 숫자: 1 
			- 숫자: 7 
			- 숫자: 2 
			- 숫자: 3 
			
			출력
			- nums[4] = 3
			- nums[3] = 2
			- nums[2] = 7
			- nums[1] = 1
			- nums[0] = 5
			
		*/
		
		int[] nums = new int[5];
		
		String array = "";
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<5; i++) { // nums.length로 하기
			System.out.print("숫자: ");
			nums[i] = scan.nextInt();
		}
		
		for (int j=4; j>-1; j--) {
			array = "nums[" + j +"]"; // 한줄로 해도 됨
			System.out.printf("%s = %d\n", array, nums[j]);
		}
		
	}
	
}
