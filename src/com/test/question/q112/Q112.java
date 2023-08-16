package com.test.question.q112;

import java.io.File;
import java.util.Scanner;

public class Q112 {

	public static void main(String[] args) {
		
		//Q112.java
		
		/*
		
			요구사항
			- 지정한 파일을 다른 폴더로 이동하고, 이동한 파일과 동일한 파일명의 파일이 존재하는 경우 중복 처리하시오.
			
			조건
			- C:\class\code\java\file\AAA\test.txt → C:\class\code\java\file\BBB\test.txt 로 이동하는 것이 목적
			- BBB 폴더에 이미 test.txt가 있을 경우 덮어쓰거나(y) 작업을 취소(n) 하시오.
			
			입력
			파일 이동을 실행합니다.
			
			같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) y 
			
			출력..
			y. 파일을 덮어썼습니다.

		*/
		
		File file = new File("C:\\class\\code\\java\\file\\AAA\\test.txt");
		File file2 = new File("C:\\class\\code\\java\\file\\BBB\\test.txt");
		
		System.out.println("파일 이동을 실행합니다.");
		
		if (!file2.exists()) {
			
			file.renameTo(file2);
			System.out.println("파일 이동을 완료했습니다.");
			
		} else {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) ");
			String yesOrNo = scan.nextLine();
			
			if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
			
				file2.delete();
				file.renameTo(file2);
				System.out.printf("%s. 파일을 덮어썼습니다.\n", yesOrNo);
			
			} else if (yesOrNo.equals("N") || yesOrNo.equals("n")) {
			
				System.out.printf("%s. 작업을 취소합니다.\n", yesOrNo);
			
			} else {
				
				System.out.println("y,n 둘중 하나만 입력해주세요.");
			
			}
		}
		
	}
	
}
