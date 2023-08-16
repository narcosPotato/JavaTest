package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q062 {

	public static void main(String[] args) {
		
		//Q062.java
		
		/*
		
			요구사항
			- 학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
			
			조건
			이름을 오름차순 정렬하시오.
			
			입력
			- 학생 수: 6 
			
			학생명: 홍길동 
			학생명: 아무개 
			학생명: 하하하 
			학생명: 호호호 
			학생명: 후후후 
			학생명: 헤헤헤 
			
			출력
			- 입력한 학생은 총 6명입니다.
			1. 아무개
			2. 하하하
			3. 헤헤헤
			4. 호호호
			5. 홍길동
			6. 후후후
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수: ");
		int student = scan.nextInt();
		scan.nextLine();
		
		String[] name = new String[student];
		
		for (int i=0; i<student; i++) {
			System.out.print("학생명: ");
			name[i] = scan.nextLine();
		}
		
		System.out.printf("입력한 학생은 총 %d명입니다.\n", student);
		
		for (int i=0; i<student; i++) {
			Arrays.sort(name);
			System.out.printf("%d. %s\n", i+1, name[i]);
		}
		
	}
	
}
