package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q120 {

	public static void main(String[] args) {
		
		//Q120.java
		
		/*
		
			요구사항
			- 특정 이름을 찾아 다른 이름으로 변환 후 파일을 다른 이름으로 저장하시오.
			
			조건
			'유재석' → '메뚜기'
			저장할 파일명: 이름수정_변환.dat
			
			리소스
			파일 > 이름수정.dat
			파일 다운로드
			
			출력
			변환 후 다른 이름으로 저장하였습니다.
		
		*/
		
		try {
			
			BufferedReader reader = new BufferedReader
			(new FileReader("C:\\파일_입출력_문제\\이름수정.dat"));
			
			BufferedWriter writer = new BufferedWriter
			(new FileWriter("C:\\파일_입출력_문제\\이름수정_변환.dat"));
					
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				line = line.replace("유재석", "메뚜기");
				writer.write(line);
			}
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
			
			reader.close();
			writer.close();
		} catch (Exception e) {
			System.out.println("at Q120.main");
			e.printStackTrace();
		}
		
	}
	
}
