package com.test.question;

import java.util.Scanner;

public class Q013 {
	
	public static void main(String[] args) {
		
		//Q013.java
		
		/*
		
			요구사항
			- 국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
			
			조건
			- String test(int kor, int eng, int math)
			- 평균 점수 60점 이상은 '합격'이다.
			- 평균 점수 60점 미만은 '불합격'이다.
			- 과락: 한 과목 이상 40점 미만이면 불합격이다.
		
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어: ");
		int kor = scan.nextInt();
		
		System.out.print("영어: ");
		int eng = scan.nextInt();
		
		System.out.print("수학: ");
		int math = scan.nextInt();
		
		String result = test(kor, eng, math);
		
		System.out.println(result);
	}
	
	public static String test(int kor, int eng, int math) {
		
		
		String result = (kor + eng + math) / 3 >= 60 ? "합격입니다." : "불합격입니다.";
		
		result = (kor < 40 || eng < 40 || math < 40) ? "불합격입니다." : result;
		
		return result;
	}

}
