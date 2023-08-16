package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q122 {

	public static void main(String[] args) {
		
		//Q122.java
		
		/*
		
			요구사항
			- 성적을 확인 후 합격자/불합격자 명단을 출력하시오.
			
			조건
			- 합격 조건: 3과목 평균 60점 이상
			- 과락 조건: 1과목 40점 미만
			
			리소스
			파일 > 성적.dat
			파일 다운로드
			
			데이터
			//이름,국어,영어,수학
			홍길동,50,60,70
			아무개,100,80,50
			하하하,98,48,56
			
			출력
			[합격자] 
			홍길동 
			하하하 
			아무개 
			
			[불합격자] 
			호호호 
			후후후 
		
		*/
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\파일_입출력_문제\\성적.dat"));
			
			String line = null;
			
			System.out.println("[합격자]");
			
			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);
				
				if (kor > 40 && eng > 40 && math > 40 && (kor + eng + math) / 3 >= 60) {
					System.out.println(temp[0]);
				}
				
			}
			
		} catch (Exception e) {
			System.out.println("at Q121.main");
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\파일_입출력_문제\\성적.dat"));
			
			String line = null;
			
			System.out.println("[불합격자]");
			
			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);
				
				if (kor < 40 || eng < 40 || math < 40 || (kor + eng + math) / 3 < 60) {
					System.out.println(temp[0]);
				}
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Q121.main");
			e.printStackTrace();
		}
		
	}
	
}
