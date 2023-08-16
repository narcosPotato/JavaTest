package com.test.question.q108;

public class MySet {

	private String[] list = new String[4];
	private int index = 0;
	private int sindex = 0;
	
	boolean add(String value) {

		if (this.index == this.list.length) {
			String[] temp = new String[this.list.length * 2];
			
			for (int i=0; i<this.list.length; i++) {
				temp[i] = this.list[i];
			}
			
			this.list = temp;
		}
		
		this.list[this.index] = value;
		
		
		this.index++;
		return true;
	}
	
	int size() {
		
		return this.index;
	}
	
	boolean remove(String value) {
		
		for (int i=0; i<this.list.length; i++) {
			if (this.list[i] == value) {
				for (int j=i; j<this.list.length; j++) {
					if (j == this.list.length - 1) {
						this.list[j] = null;
						this.index--;
						return true;
					}
					this.list[j] = this.list[j+1];
				}				
			}
		}
		
		
		return false;
	}
	
	boolean hasNext() {

		if (this.sindex < this.index) {
			return true;
		}
		
		return false;
	}
	
	String next() {
		
		String temp = this.list[this.sindex];
		
		sindex++;
		
		return temp;
	}
	
	int clear() {
		
		return this.index = 0;
	}
	
}
