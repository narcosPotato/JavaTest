package com.test.question;

public class Q078 {

	public static void main(String[] args) {
		
		//Q078.java
		
		/*
		
			요구사항
			- 아래와 같이 출력하시오.
			
			출력
			1	2	3	4	5
			16	17	18	19	6
			15	24	25	20	7
			14	23	22	21	8
			13	12	11	10	9
		
		*/
		
		int[][] list = new int[5][5];
		int n = 1;
		
		for (int i=0; i<list.length; i++) {
			list[0][i] = n;
			n++;
		}
		
		for (int i=1; i<list.length; i++) {
			list[i][4] = n;
			n++;
		}
		
		for (int i=3; i>-1; i--) {
			list[4][i] = n;
			n++;
		}
		
		for (int i=3; i>0; i--) {
			list[i][0] = n;
			n++;
		}
		
		for (int i=1; i<4; i++) {
			list[1][i] = n;
			n++;
		}
		
		for (int i=2; i<4; i++) {
			list[i][3] = n;
			n++;
		}
		
		for (int i=2; i>0; i--) {
			list[3][i] = n;
			n++;
		}
		
		for (int i=1; i<3; i++) {
			list[2][i] = n;
			n++;
		}
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.printf("%5d", list[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
