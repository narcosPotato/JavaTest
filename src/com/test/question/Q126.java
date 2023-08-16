package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;

public class Q126 {

	public static void main(String[] args) {
		
		//Q126.java
		
		/*
		
			요구사항
			- 직원들의 지각과 조퇴를 카운트하시오.
			
			조건
			출근 : 오전 9시
			퇴근 : 오후 6시
			
			리소스
			파일 > 출결.dat
			파일 다운로드
			
			출력
			[이름]    [지각]    [조퇴] 
			홍길동      4회       0회 
			아무개      0회       0회 
			하하하      2회       3회 

		*/
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\파일_입출력_문제\\출결.dat"));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
				String[] temp1 = line.split(",");

				
			}
			
			
		} catch (Exception e) {
			System.out.println("at Q126.main");
			e.printStackTrace();
		}
		
	}

}