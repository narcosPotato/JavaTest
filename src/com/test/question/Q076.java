package com.test.question;

import java.util.Scanner;

public class Q076 {

	public static void main(String[] args) {
		
		//Q076.java
		
		/*
		
			요구사항
			- 성적을 입력받아 아래와 같이 출력하시오.
			
			조건
			- String[][] score = new String[10][3];
			
			입력
			- 국어 점수: 80 
			- 영어 점수: 50 
			- 수학 점수: 70 
			
			출력 	 
			 	 	 
			■		
			■		■
			■		■
			■	■	■
			■	■	■
			■	■	■
			■	■	■
			■	■	■
			국어	영어	수학

		*/
		
		String[][] score = new String[10][3];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		int kor = scan.nextInt();
		
		System.out.print("영어 점수: ");
		int eng = scan.nextInt();
		
		System.out.print("수학 점수: ");
		int math = scan.nextInt();
		
		int korGraph = kor / 10;
		int engGraph = eng / 10;
		int mathGraph = math / 10;
		int korCount = 0;
		int engCount = 0;
		int mathCount = 0;
		
		
		for (int i=9; i>9-korGraph; i--) {
			score[i][0] = "■";
			korCount++;
		}
		
		for (int i=0; i<10-korCount; i++) {
			score[i][0] = "";
		}
		
		for (int i=9; i>9-engGraph; i--) {
			score[i][1] = "■";
			engCount++;
		}
		
		for (int i=0; i<10-engCount; i++) {
			score[i][1] = "";
		}
		
		for (int i=9; i>9-mathGraph; i--) {
			score[i][2] = "■";
			mathCount++;
		}
		
		for (int i=0; i<10-mathCount; i++) {
			score[i][2] = "";
		}
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(" "+ score[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.print("국어\t영어\t수학");
		
		
	}
	
}
