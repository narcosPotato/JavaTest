package com.test.question.q110;

import java.io.File;
import java.util.Scanner;

public class Q110 {

	public static void main(String[] args) {
		
		/*
			요구사항
			- 파일의 경로를 입력받아 파일 정보를 출력하시오.
	
			조건
			- 파일 크기 단위 변환 출력(소수이하 1자리까지) : B, KB, MB, GB, TB
			
			입력
			파일 경로 	: D:\class\java\file\test.txt 
				    : C:\class\code\java\file\test.txt
					: C:\movie\SpiderMan.mp4
			출력
			파일명 : test.txt 
			종류 : txt 파일 
			파일 크기 : 45B 
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일 경로 : ");
		String input = scan.nextLine();
		
		File file = new File(input);
		
		int index = input.lastIndexOf(".");
		
		String extension = input.substring(index + 1);
		
		
		if (file.exists()) {
			
			System.out.printf("파일명 : %s\n", file.getName());
			System.out.printf("종류 : %s 파일\n", extension);
			System.out.printf("파일 크기 : %s\n", size(file.length()));	
			
		}
		
	}

	private static String size(long length) {

		if (length < 1024) {
			return length + "B";
		} else if (length < 1024 * 1024) {
			return String.format("%.1fKB", length / 1024.0);
		} else if (length < 1024 * 1024 * 1024) {
			return String.format("%.1fMB", length / 1024.0 / 1024.0);
		} else if (length < 1024 * 1024 * 1024 * 1024) {
			return String.format("%.1fGB", length / 1024.0 / 1024.0 / 1024.0);
		} else {
			return String.format("%.1fTB", length / 1024.0 / 1024.0 / 1024.0 / 1024.0);
		}
	}
	
}
