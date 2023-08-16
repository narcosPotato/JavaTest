package com.test.question.q111;

import java.io.File;
import java.util.Scanner;

public class Q111 {

	public static void main(String[] args) {
		
		//Q111.java
		
		/*
		
			요구사항
			- 지정한 폴더의 특정 파일(확장자)만을 출력하시오.
			
			조건
			- 확장자 대소문자 구분없이 검색 가능
			
			입력
			폴더: C:\class\dev\eclipse
			확장자: exe 
			
			출력
			eclipse.exe 
			eclipsec.exe
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("폴더: ");
		String folder = scan.nextLine();
		
		System.out.print("확장자: ");
		String extension = scan.nextLine();
		
		File dir = new File(folder);
		
		File[] list = dir.listFiles();
		
		for (File f : list) {
			
			String temp = f.getName();
			
			if (f.isFile() && temp.lastIndexOf(extension) > 0) {
				System.out.println(temp);
			}
			
		}
		
	}
	
}
