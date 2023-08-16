package com.test.question.q94;

import java.util.Calendar;

class Bugles {
	private int price;
	private int weight;
	private Calendar creationTime;
	private int expiration;

	// getter, setter 구현

	public void eat() {
		
		if (getExpiration() >= 0) {
			System.out.println("과자를 맛있게 먹습니다.");
		} else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
		}

	}

	public int getPrice() {
		price = this.price;
		return price;
	}

	public void setCreationTime(String date) {
		Calendar cTime = Calendar.getInstance();
		date = date.replace("-", "");
		
		cTime.set(Integer.parseInt(date.substring(0, 4))
				 ,Integer.parseInt(date.substring(4, 6)) - 1
				 ,Integer.parseInt(date.substring(6, 8)));
		
		this.creationTime = cTime;
	}
	
	public int getExpiration() {
		Calendar now = Calendar.getInstance();
		
		return this.expiration - (int)((now.getTimeInMillis() - this.creationTime.getTimeInMillis()) / 1000 / 60 / 60 / 24);
	}

	public void setSize(int i) {
		this.weight = i;
		
		if (this.weight == 300) {
			this.price = 850;
			this.expiration = 7;
		} else if (this.weight == 500) {
			this.price = 1200;
			this.expiration = 10;			
		} else {
			this.price = 1950;
			this.expiration = 15;						
		}
	}

}