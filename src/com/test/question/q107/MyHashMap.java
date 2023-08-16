package com.test.question.q107;

public class MyHashMap {

	private String[] keys;
	private String[] values;
	private int index = 0;
	
	public void put(String key, String value) {
	
		if (this.index == 0) { 		//처음 값을 넣을시 배열 생성
			keys = new String[4];
			values = new String[4];
		}
		
		if (this.index == this.keys.length) {	// 누적 변수가 keys 배열의 길이와 같아지면 배열의 길이를 2배로
			String[] temp1 = new String[this.keys.length * 2];
			String[] temp2 = new String[this.values.length * 2];
			
			for (int i=0; i<this.keys.length; i++) {
				temp1[i] = this.keys[i];
				temp2[i] = this.values[i];
			}
			
			this.keys = temp1;
			this.values = temp2;
		}
		
		for (int i=0; i<this.keys.length; i++) {	// key값 중복 검사
			if (this.keys[i] == key) {				// 존재하는 key값을 다시 받으면 value값만 수정
				this.values[i] = value;
				break;
			}
			
			if (i == this.keys.length - 1) {		// 중복된 key값이 없을경우
				this.keys[this.index] = key;		// 
				this.values[this.index] = value;
				this.index++;
				break;
			}
		}
	}
	
	String get(String key) {
		
		String temp = null;
		
		for (int i=0; i<this.keys.length; i++) {
			if (this.keys[i] == key) {
				temp = this.values[i];
				break;
			}
			
		}
		
		return temp;
		
	}
	
	int size() {
		
		return this.index;
	}
	
	String remove(String key) {
		
		String temp = "";
		
		for (int i=0; i<this.keys.length; i++) {
			if (this.keys[i] == key) {
				for (int j=i; j<this.keys.length-1; j++) {
					this.keys[j] = this.keys[j+1];
					this.values[j] = this.values[j+1];
				}
				break;
			}
		}
		
		return temp;
	}
	
	boolean containsKey(String key) {
		
		for (int i=0; i<this.keys.length; i++) {
			if (this.keys[i] == key) {
				return true;
			}
		}
		
		return false;
		
	}
	
	boolean containsValue(String value) {
		
		for (int i=0; i<this.keys.length; i++) {
			if (this.values[i] == value) {
				return true;
			}
		}
		
		return false;
	}
	
	void clear() {
		
		this.index = 0;
	}
}
