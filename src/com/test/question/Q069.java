package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q069 {

	public static void main(String[] args) {
		
		//Q069.java
		
		/*
		
			요구사항
			- 배열의 요소를 순차적으로 2개씩 더한 결과를 배열로 생성한 뒤 출력하시오.
			
			조건
			- 원본 배열 길이: 사용자 입력
			- 원본 배열 요소: 난수(1~9)
			- 결과 배열 길이: 사용자 입력 / 2
			
			입력
			- 배열 길이: 10 
			
			출력
			원본: [ 1, 5, 3, 6, 2, 7, 8, 2, 2, 9 ]
			결과: [ 6, 9, 9, 10, 11 ]

		
		*/
		
		int num = 0;
		
		String txt = "[ ";
		String txt2 = "[ ";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 길이: ");
		int length = scan.nextInt();
		
		int[] list = new int[length];
		
		for (int i=0; i<length; i++) {
			list[i] = (int)(Math.random() * 9) + 1;
			
			if (i == length-1) {
				txt += list[i] + " ]";
			} else {
				txt += list[i] + ", ";
			}
			
		}

		if (length % 2 == 0) {
			int[] list2 = new int[length/2];
			
			for (int j=0; j<list.length; j+=2) {
				list2[num] = list[j] + list[j+1];
				
				if (num == list2.length-1) {
					txt2 += list2[num] + " ]";
				} else {
					txt2 += list2[num] + ", ";
				}
				++num;
			}
			
		} else {
			int[] list2 = new int[length/2+1];
		
			for (int j=0; j<list.length+1; j++) {		
				
				if (num+1 == list2.length) {
					txt2 += list[num*2] + " ]";
				} else {
					list2[num] = list[j] + list[j+1];
					txt2 += list2[num] + ", ";
				}
				++j;
				++num;
			}
		}
		System.out.println(txt);
		System.out.println(txt2);
	}
	
}
