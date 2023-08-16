package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q124 {

	public static void main(String[] args) {
		
		//Q124.java
		
		/*
		
			요구사항
			- 이름을 입력받아 회원 주문 정보를 검색 후 출력하시오.
			
			리소스
			파일 > 검색_회원.dat
			파일 > 검색_주문.dat
			파일 다운로드
			
			입력
			이름: 홍길동 
			
			출력
			==== 구매내역 ==== 
			[번호]    [이름]    [상품명]    [개수]    [배송지]
			  3      홍길동     마우스       3   서울시 강동구 천호동
		
		*/
		
		try {
			
			BufferedReader reader1 = new BufferedReader(new FileReader("C:\\파일_입출력_문제\\검색_회원.dat"));
			BufferedReader reader2 = new BufferedReader(new FileReader("C:\\파일_입출력_문제\\검색_주문.dat"));
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름: ");
			String name = scan.nextLine();
			
			String line = null;
			
			System.out.println("=== 구매내역 ===");
			System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");
			
			while ((line = reader1.readLine()) != null) {
				
				String[] temp1 = line.split(",");
				
				if (temp1[1].equals(name)) {
					System.out.printf("%3s\t%s\t", temp1[0], name);
					while ((line = reader2.readLine()) != null) {
						
						String[] temp2 = line.split(",");
						
						if (temp2[3].equals(temp1[0])) {
							System.out.printf(" %s\t %s", temp2[1], temp2[2]);
							System.out.printf("   %s",temp1[2]);
							break;
						}
						
					}
				}
				
				
			}
			
			reader1.close();
			reader2.close();
			
		} catch (Exception e) {
			System.out.println("at Q121.main");
			e.printStackTrace();
		}
		
	}
	
}
