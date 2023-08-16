package com.test.question.q101;

public class Coffee {
	private static int bean = 0;
	private static int water = 0;
	private static int ice = 0;
	private static int milk = 0;
	
	private static int beanUnitPrice = 1;
	private static double waterUnitPrice = 0.2;
	private static int iceUnitPrice = 3;
	private static int milkUnitPrice = 4;
	
	private static int beanTotalPrice = 0;
	private static int waterTotalPrice = 0;
	private static int iceTotalPrice = 0;
	private static int milkTotalPrice = 0;
	
	private static int americano = 0;
	private static int latte = 0;
	private static int espresso = 0;
	
	public static int getBean() {
		return bean;
	}
	public static void setBean(int bean) {
		Coffee.bean = bean;
	}
	public static int getWater() {
		return water;
	}
	public static void setWater(int water) {
		Coffee.water = water;
	}
	public static int getIce() {
		return ice;
	}
	public static void setIce(int ice) {
		Coffee.ice = ice;
	}
	public static int getMilk() {
		return milk;
	}
	public static void setMilk(int milk) {
		Coffee.milk = milk;
	}
	public static int getBeanUnitPrice() {
		return beanUnitPrice;
	}
	public static void setBeanUnitPrice(int beanUnitPrice) {
		Coffee.beanUnitPrice = beanUnitPrice;
	}
	public static double getWaterUnitPrice() {
		return waterUnitPrice;
	}
	public static void setWaterUnitPrice(double waterUnitPrice) {
		Coffee.waterUnitPrice = waterUnitPrice;
	}
	public static int getIceUnitPrice() {
		return iceUnitPrice;
	}
	public static void setIceUnitPrice(int iceUnitPrice) {
		Coffee.iceUnitPrice = iceUnitPrice;
	}
	public static int getMilkUnitPrice() {
		return milkUnitPrice;
	}
	public static void setMilkUnitPrice(int milkUnitPrice) {
		Coffee.milkUnitPrice = milkUnitPrice;
	}
	public static int getBeanTotalPrice() {
		return beanTotalPrice;
	}
	public static void setBeanTotalPrice(int beanTotalPrice) {
		Coffee.beanTotalPrice = beanTotalPrice;
	}
	public static int getWaterTotalPrice() {
		return waterTotalPrice;
	}
	public static void setWaterTotalPrice(int waterTotalPrice) {
		Coffee.waterTotalPrice = waterTotalPrice;
	}
	public static int getIceTotalPrice() {
		return iceTotalPrice;
	}
	public static void setIceTotalPrice(int iceTotalPrice) {
		Coffee.iceTotalPrice = iceTotalPrice;
	}
	public static int getMilkTotalPrice() {
		return milkTotalPrice;
	}
	public static void setMilkTotalPrice(int milkTotalPrice) {
		Coffee.milkTotalPrice = milkTotalPrice;
	}
	public static int getAmericano() {
		return americano;
	}
	public static void setAmericano(int americano) {
		Coffee.americano = americano;
	}
	public static int getLatte() {
		return latte;
	}
	public static void setLatte(int latte) {
		Coffee.latte = latte;
	}
	public static int getEspresso() {
		return espresso;
	}
	public static void setEspresso(int espresso) {
		Coffee.espresso = espresso;
	}
	public static void countCoffee(Espresso espresso) {
		Coffee.espresso++;
		Coffee.bean += espresso.getBean();
		Coffee.beanTotalPrice += Coffee.beanUnitPrice * espresso.getBean();
	}
	public static void countCoffee(Latte latte) {
		Coffee.latte++;
		Coffee.bean += latte.getBean();
		Coffee.milk += latte.getMilk();
		Coffee.beanTotalPrice += Coffee.beanUnitPrice * latte.getBean();
		Coffee.milkTotalPrice += Coffee.milkUnitPrice * latte.getMilk();
	}
	public static void countCoffee(Americano americano) {
		Coffee.americano++;
		Coffee.bean += americano.getBean();
		Coffee.water += americano.getWater();
		Coffee.ice += americano.getIce();
		Coffee.beanTotalPrice += Coffee.beanUnitPrice * americano.getBean();
		Coffee.waterTotalPrice += Coffee.waterUnitPrice * americano.getWater();
		Coffee.iceTotalPrice += Coffee.iceUnitPrice * americano.getIce();
	}
}
