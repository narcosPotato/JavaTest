package com.test.question;

public class Q070 {

	public static void main(String[] args) {
		
		//Q070.java
		
		/*
		
			요구사항
			- 아래와 같이 출력하시오.
			
			출력
			1	2	3	4	5
			10	9	8	7	6
			11	12	13	14	15
			20	19	18	17	16
			21	22	23	24	25

		*/
		
		int[][] nums = new int[5][5];
		
		int n = 1;
		
		for (int i=0; i<5; i++) {
			if (i % 2 == 0) {
				for (int j=0; j<5; j++) {
					nums[i][j] = n;
					n++;
				}
			} else {
				for (int k=4; k>-1; k--) {
					nums[i][k] = n;
					n++;
				}
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
