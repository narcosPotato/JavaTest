package com.test.question;

public class Q073 {

	public static void main(String[] args) {
	
		//Q073.java
		
		/*
		
			요구사항
			- 아래와 같이 출력하시오.
			
			출력
			1	2	3	4	5
			6	7	8	9	0
			10	11	12	0	0
			13	14	0	0	0
			15	0	0	0	0
		
		*/
		
		int[][] nums = new int[5][5];
		
		int n = 1;
		
		for (int i=0; i<nums.length; i++) {		
				for (int j=0; j<nums.length-i; j++) {
					nums[i][j] = n;
					n++;
				}
			}	
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
	}	
}
