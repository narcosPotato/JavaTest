package com.test.question.q117;

import java.io.File;

public class Q117 {

	public static void main(String[] args) {
		
		//Q117.java
		
		/*
		
			요구사항
			- 내용물이 있는 'delete' 폴더를 삭제하시오.
			
			조건
			- 재귀 메소드 사용
			- 삭제된 파일과 자식 폴더 개수를 출력하시오.
			
			리소스
			폴더 > 폴더 삭제
			파일 다운로드
			
			출력
			폴더를 삭제했습니다. 
			삭제된 폴더는 3개이고, 파일은 6개입니다.
		
		*/
		
		//내용있는 폴더 삭제하기
		File dir = new File("C:\\파일_디렉토리_문제\\폴더 삭제\\delete");
		
		//탐색
		delete(dir);
		
	
	}

	private static void delete(File dir) {
		
		File[] list = dir.listFiles();
		
		int fcount = 0;
		int dcount = 0;
		
		for (File f : list) {
			if (f.isFile()) {
				f.delete();//action
				fcount++;
			}
		} 
		
		for (File d : list) {
			if (d.isDirectory()) {
				delete(d);
				dcount++;
			}
		}
		
		dir.delete();
		
	}
	
}
