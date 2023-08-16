package com.test.question.q115;

import java.io.File;

public class Q115 {

	public static void main(String[] args) {
		
		//Q115.java
		
		/*
		
			요구사항
			- 파일의 크기가 0byte인 파일만 삭제하시오.
			
			리소스
			폴더 > 파일 제거
			파일 다운로드
			
			출력
			총 34개의 파일을 삭제했습니다.
		
		*/
		
		String temp = "C:\\파일_디렉토리_문제\\파일 제거";
		
		File file = new File(temp);
		
		File[] dir = file.listFiles();
		
		int count = 0;
		
		for (File f : dir) {
			
			if (f.length() == 0) {
				f.delete();
				count++;
			}
		}
		
		System.out.printf("총 %d개의 파일을 삭제했습니다.", count);
		
	}
	
}
