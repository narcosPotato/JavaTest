package com.test.question.q105;

public class MyQueue {

	private String[] list;
	private int index = 0;
	
	public void add(String value) {
		
		if (this.index == 0) {
			this.list = new String[5];
		}
		
		if (this.index == list.length - 1) {
			String temp[] = new String[this.index * 2];
			
			for (int i=0; i<list.length; i++) {
				temp[i] = this.list[i];
			}
			
			this.list = temp;
		}
		
		this.list[this.index] = value;
		this.index++;
		
	}
	
	String poll() {
		
		String temp = this.list[0];
		
		for (int i=0; i<list.length-1; i++) {	
			
			this.list[i] = this.list[i + 1];
		}
		
		this.index--;
		
		return temp;
	}
	
	int size() {
		
		return this.index;
		
	}

	String peek() {
		return this.list[0];
	}

	public void trimToSize() {
		String[] temp = new String[this.index];
		for (int i=0; i<this.index; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
	}

	public void clear() {
		this.index = 0;
	}

}
