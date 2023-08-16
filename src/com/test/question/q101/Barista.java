package com.test.question.q101;

class Barista {

	public Espresso makeEspresso(int bean) {
		
		Espresso espresso = new Espresso(bean);
		Coffee.countCoffee(espresso);
		
		return espresso;
	}
	
	public Latte makeLatte(int bean, int milk) {
		
		Latte latte = new Latte(bean, milk);
		Coffee.countCoffee(latte);
		
		return latte;
	}
	
	public Americano makeAmericano(int bean, int water, int ice) {
		
		Americano americano = new Americano(bean, water, ice);
		Coffee.countCoffee(americano);
		
		return americano;
	}
	
	public Espresso[] makeEspressoes(int bean, int count) {
		
		Espresso[] espressoes = new Espresso[count];
		
		for (int i=0; i<espressoes.length; i++) {
			Espresso espresso = new Espresso(bean);
			Coffee.countCoffee(espresso);
			espressoes[i] = espresso;
		}
		
		return espressoes;
		
	}
	
	
	public Latte[] makeLattes(int bean, int milk, int count) {
		
		Latte[] lattes = new Latte[count];
		
		for (int i=0; i<lattes.length; i++) {
			Latte latte = new Latte(bean, milk);
			Coffee.countCoffee(latte);
			lattes[i] = latte;
		}
		
		return lattes;
	}
	
	
	public Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		
		Americano[] americanos = new Americano[count];
		
		for (int i=0; i<americanos.length; i++) {
			Americano americano = new Americano(bean, water, ice);
			Coffee.countCoffee(americano);
			americanos[i] = americano;
		}
		
		return americanos;
	}
	
	public void result() {
		System.out.println();
		System.out.println("=======================");
		System.out.println("판매 결과");
		System.out.println("=======================");
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("음료 판매량");
		System.out.println("-----------------------");
		System.out.printf("에스프레소: %d잔\n", Coffee.getEspresso());
		System.out.printf("아메리카노: %d잔\n", Coffee.getAmericano());
		System.out.printf("라떼: %d잔\n", Coffee.getLatte());
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("원자재 소비량");
		System.out.println("-----------------------");
		System.out.printf("원두: %,dg\n", Coffee.getBean());
		System.out.printf("물: %,dml\n", Coffee.getWater());
		System.out.printf("얼음: %,d개\n", Coffee.getIce());
		System.out.printf("우유: %,dml\n", Coffee.getMilk());
		System.out.println("-----------------------");
		System.out.println("매출액");
		System.out.println("-----------------------");
		System.out.printf("원두: %,d원\n", Coffee.getBeanTotalPrice());
		System.out.printf("물: %,d원\n", Coffee.getWaterTotalPrice());
		System.out.printf("얼음: %,d원\n", Coffee.getIceTotalPrice());
		System.out.printf("우유: %,d원\n", Coffee.getMilkTotalPrice());
	}
}
