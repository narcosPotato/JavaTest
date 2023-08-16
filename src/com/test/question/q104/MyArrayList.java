package com.test.question.q104;

public class MyArrayList {

	//ArrayList<String>
	
	private String[] list;
	private int index; //***************************************************
	
	public MyArrayList() {
		this.index = 0;
	}
	
	public boolean add(String value) {
		
		try {
			//if (this.index == 0) {
			if (this.list == null) {
				this.list = new String[4];
			}
			
			if (this.index == list.length - 1) {
				String temp[] = new String[this.index * 2];
				
				for (int i=0; i<list.length; i++) {
					temp[i] = this.list[i];
				}
				
				this.list = temp;
			}
			
			//배열의 방이 남아 있는지? > 있으면 진행
			//					  > 없으면 > 두배로 늘리기
			
			this.list[this.index] = value;
			this.index++;
			
			return true;
		} catch (Exception e) {
			
			return false;
		}
		
	}
	
	public String get(int index) {
		
		return this.list[index];
	}
	
	public int size() {
		
		//return this.list.length;
		return this.index;
	}

	public void set(int i, String name) {
		this.list[i] = name;
	}

	public void remove(int i) {
		for (int j=i; j<index; j++) {
			this.list[j] = this.list[j+1];
			if (j == index-1) {
				this.list[j] = "";
			}
		}
	}

	public void add(int i, String string) {
		for (int j=i; j<index; j++) {
			this.list[j+1] = this.list[j];
			if (j == i) {
				this.list[j] = string;
			}
		}
	}

	public int indexOf(String string) {
		for (int i=0; i<index; i++) {
			if (this.list[i] == string) {
				return 1;
			}
		}
		return -1;
	}

	public void clear() {
		this.index = 0;
	}
	
}
