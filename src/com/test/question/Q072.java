package com.test.question;

public class Q072 {

	public static void main(String[] args) {
		
		//Q072.java
		
		/*
		
			요구사항
			- 아래와 같이 출력하시오.
			
			출력
			1	6	11	16	21
			2	7	12	17	22
			3	8	13	18	23
			4	9	14	19	24
			5	10	15	20	25
			
		*/
		
		int[][] nums = new int[5][5];
		
		int n = 1;
		
		for (int i=0; i<5; i++) {		
				for (int j=0; j<5; j++) {
					nums[i][j] = n;
					n+=5;	//1행에 진행되는 열이 +5씩			
				}
				n = i+2;	//다음 행으로 넘어갈때 n이 누적되므로 i에 +2로 초기화
			}	
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
