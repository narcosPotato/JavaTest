package com.test.question.q113;

import java.io.File;

public class Q113 {

	public static void main(String[] args) {
		
		//Q113.java
		
		/*
		
			요구사항
			- 음악 파일이 100개 있다. 파일명 앞에 일련 번호를 붙이시오.
			
			조건
			- '001'부터 3자리 형식으로 붙이시오.
			
			리소스
			- 폴더 > 음악 파일
			- 파일 다운로드
			
			출력
			[001]1도 없어 - Apink (에이핑크).mp3 
			[002]11 (Prod. 다이나믹듀오) - Wanna One (워너원) - 남바완.mp3 
			[003]134340 - 방탄소년단.mp3
			..
			[100]花요일 (Blooming Day) - EXO-CBX (첸백시).mp3
		
		*/
		
		String music = "C:\\class\\code\\java\\file\\Music";
		
		File file = new File(music);
		
		File[] list = file.listFiles(); //***
		
		int index = 1;
		
		for (File f : list) {
			
			System.out.printf("[%03d]%s\n", index, f.getName());
			index++;
		}
	}
	
}
