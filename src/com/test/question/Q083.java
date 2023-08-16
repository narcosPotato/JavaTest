package com.test.question;

import java.util.Scanner;

public class Q083 {

	public static void main(String[] args) {
		
		//Q083.java
		
		/*
		
			요구사항
			- 파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오.
			
			조건
			- 확장자는 다음으로 제한한다.
			mp3
			jpg
			java
			hwp
			doc
			
			입력
			파일명: 인기가요.mp3 
			파일명: cat.jpg 
			파일명: Ex01.java 
			파일명: icon.jpg 
			파일명: 수업_정리.doc 
			파일명: Scanner.java 
			파일명: food.jpg 
			파일명: 공지사항.hwp 
			파일명: 이력서.hwp 
			파일명: 출금내역.doc 
			
			출력
			mp3 : 1개
			jpg : 3개
			java : 2개
			hwp : 2개
			doc : 2개
		
		*/
		
		Scanner scan = new Scanner(System.in);
		String fileName = "";
		int mp3 = 0;
		int jpg = 0;
		int java = 0;
		int hwp = 0;
		int doc = 0;
		
		for (int i=0; i<10; i++) {
			System.out.print("파일명: ");
			fileName = scan.nextLine();
			if (fileName.endsWith(".mp3")) {
				++mp3;
			} else if (fileName.endsWith(".jpg")) {
				++jpg;
			} else if (fileName.endsWith(".java")) {
				++java;
			} else if (fileName.endsWith(".hwp")) {
				++hwp;
			} else {
				++doc;
			}
		}
		
		System.out.println("출력");
		System.out.printf("mp3 : %d개\n", mp3);
		System.out.printf("jpg : %d개\n", jpg);
		System.out.printf("java : %d개\n", java);
		System.out.printf("hwp : %d개\n", hwp);
		System.out.printf("doc : %d개\n", doc);
	}
	
}
