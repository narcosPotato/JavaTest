package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q123 {

	public static void main(String[] args) {
		
		//Q123.java
		
		/*
		
			요구사항
			- 이름을 입력받아 회원 정보를 검색 후 출력하시오.
			
			리소스
			파일 > 단일검색.dat
			파일 다운로드
			
			입력
			이름: 홍길동 
			
			출력
			[홍길동] 
			번호: 33 
			주소: 서울시 강남구 역삼동 
			전화: 010-2345-6789 
		
		*/
		
		try {

			BufferedReader reader = new BufferedReader(new FileReader("C:\\파일_입출력_문제\\단일검색.dat"));
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름: ");
			String name = scan.nextLine();
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				if (temp[1].equals(name)) {
					System.out.printf("[%s]\n번호: %s\n주소: %s\n전화:%s\n", name, temp[0], temp[2], temp[3]);
					break; // 코드리뷰 break 추가하기
				}
			}
			reader.close(); // 코드리뷰 - close 안닫음
			
		} catch (Exception e) {
			System.out.println("at Q121.main");
			e.printStackTrace();
		}
		
	}
	
}
