package com.test.question;

public class Q075 {

	public static void main(String[] args) {
		
		//Q075.java
		
		/*
		
			요구사항
			- 아래와 같이 출력하시오.
			
			출력
			1	2	3	4	10
			5	6	7	8	26
			9	10	11	12	42
			13	14	15	16	58
			28	32	26	40	136

		*/
		
		int[][] nums = new int[5][5];
		
		int n = 1;
		int sum = 0;
		
		for (int i=0; i<nums.length-1; i++) {
				sum = 0;
				
				for (int j=0; j<nums.length-1; j++) {
					nums[i][j] = n;
					sum += n;
					n++;
				}
				nums[i][4] = sum;
			}
	
		n = 0;
		
		for (int i=0; i<nums.length-1; i++) {
			sum = 0;
			
			for (int j=0; j<nums.length-1; j++) {
				n = nums[j][i];
				sum += n;
				n++;
			}
			nums[4][i] = sum;
		}	
		
		n = 0;
		
		for (int i=4; i<nums.length; i++) {
			sum = 0;
			
			for (int j=0; j<nums.length-1; j++) {
				n = nums[i][j];
				sum += n;
				n++;
			}
			nums[4][4] = sum;
		}
		
		printArray(nums);
	}

	private static void printArray(int[][] nums) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}	
	
}
