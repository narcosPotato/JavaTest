package com.test.question.q114;

import java.io.File;
import java.util.HashMap;

public class Q114_ {

	public static void main(String[] args) {
		
		//이미지 파일이 있다. 확장자별로 파일이 몇개 있는지 세시오.
		
		//목록
		File dir = new File("C:\\파일_디렉토리_문제\\확장자별 카운트");
		
		File[] list = dir.listFiles();
		
//		int count = 0; //jpg
//		int count2 = 0; //png
//		int count3 = 0; //gif
		
		//키 > 확장자
		//값 > 카운트
		HashMap<String,Integer> count = new HashMap<String,Integer>();
		
		for (File f : list) {
			
			//System.out.println(f.getName());
			String ext = getExtension(f.getName());
			
			if (!count.containsKey(ext)) {
				count.put(ext, 1); //"gif", 1 새로운 확장자 등록
			} else {
				count.put(ext, count.get(ext) + 1); //count = count + 1 누적
			}
		}
		
		System.out.println(count);
		
	}

	private static String getExtension(String name) {

		//test.png
		//test.test.png
		//System.out.println(name); //마우스01.jpg
		String[] temp = name.split("\\.");
		//System.out.println(temp.length);
		String ext = temp[temp.length - 1].toLowerCase();
		
		//System.out.println(Arrays.toString(temp));
		//System.out.println(ext);
		
		//return ext;
		
		return name.split("\\.")[temp.length-1].toLowerCase();
	}
	
}
