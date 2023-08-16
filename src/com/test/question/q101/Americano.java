package com.test.question.q101;

public class Americano {

	private int bean;
	private int water;
	private int ice;
	
	public Americano(int bean, int water, int ice) {
		this.bean = bean;
		this.water = water;
		this.ice = ice;
	}
	public int getBean() {
		return bean;
	}
	public int getWater() {
		return water;
	}
	public int getIce() {
		return ice;
	}
	
	void drink() {
		System.out.printf("원두 %dg, 물 %dml, 얼음 %d개로 만들어진 아메리카노를 마십니다.\n", this.bean, this.water, this.ice);
	}
	
}
