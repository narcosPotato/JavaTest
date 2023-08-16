package com.test.question.q114;

import java.io.File;

public class Q114 {

	public static void main(String[] args) {
		
		//Q114.java
		
		/*
		
			요구사항
			- 이미지 파일이 있다. 확장자별로 파일이 몇개 있는지 세시오.
			
			조건
			- 새로운 확장자 파일이 추가되도 동작이 가능하게 구현하시오.
			- 'mouse.bmp' 추가를 하면.. 소스 수정 없이도 *.bmp : 1개 출력이 되게 하시오.
			
			리소스
			폴더 > 확장자별 카운트
			파일 다운로드
			
			출력
			*.gif: 10개 
			*.jpg: 5개 
			*.png: 3개 
		
		*/
		
		String folder = "C:\\class\\code\\java\\file\\확장자별 카운트";
	
		File file = new File(folder);
		
		File[] list = file.listFiles();
	
	}
	
}
