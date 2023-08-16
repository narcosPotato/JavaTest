package com.test.question.q116;

import java.io.File;

public class Q116 {

	public static void main(String[] args) {
		
		//Q116.java
		
		/*
		
			요구사항
			- MusicA 폴더와 MusicB 폴더를 서로 비교해서 양쪽 폴더에 모두 존재하는 파일만을 출력하시오.
			
			조건
			- 중복 파일을 찾아내시오.
			
			리소스
			폴더 > 동일 파일
			파일 다운로드
			
			출력
			BAAM - 모모랜드 (MOMOLAND).mp3 
			Dejavu - 볼빨간사춘기.mp3 
			SoulMate (Feat. 아이유) - 지코 (ZICO).mp3 
			..
		
		*/
		
		String temp1 = "C:\\파일_디렉토리_문제\\동일 파일\\MusicA";
		String temp2 = "C:\\파일_디렉토리_문제\\동일 파일\\MusicB";
		
		File A = new File(temp1);
		File B = new File(temp2);
		
		File[] file1 = A.listFiles();
		File[] file2 = B.listFiles();

		for (File f1 : file1) {
			for (File f2 : file2) {
				if (f1.getName().equals(f2.getName())) {
					System.out.println(f1.getName());
				}
			}	
		}
		
		
	}
	
}
