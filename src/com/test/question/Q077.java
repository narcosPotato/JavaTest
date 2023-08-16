package com.test.question;

public class Q077 {

	public static void main(String[] args) {
		
		//Q077.java
		
		/*
		
			요구사항
			- 아래와 같이 출력하시오.
			
			출력
			1	2	4	7	11
			3	5	8	12	16
			6	9	13	17	20
			10	14	18	21	23
			15	19	22	24	25
		
		*/
		
		int[][] list = new int[5][5];
		int count = 0;
		int sum = 0;
		
		for (int i=0; i<9; i++) {
			for (int j=0; j<list.length; j++) {
				
				sum = i-j;
				if (sum >= 0 && sum < 5) {
					count++;
					list[j][sum] = count;
				}
				
			}
			
		}
		
		for (int i=0; i<list.length; i++) {
			for (int j=0; j<list.length; j++) {
				System.out.printf("%5d", list[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
