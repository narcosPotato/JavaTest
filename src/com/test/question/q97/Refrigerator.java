package com.test.question.q97;

class Refrigerator {
	private Item[] items = new Item[100];
	private int index = 0;

	public void add(Item item) {
		
		this.items[this.index] = item;
		this.index++;
		
		System.out.printf("'%s'를 냉장고에 넣었습니다.\n", item.getName());
	}

	public Item get(String name) {
	
		Item item = null;
		
		for (int i=0; i<this.index; i++) {
			if (this.items[i].getName().equals(name)) {
				item = this.items[i];
				this.index--;
				for (int j=i; j<this.index; j++) {
					this.items[j] = this.items[j+1];
				}
				break;
			}
		}
		
		return item;
	}


	public void listItem() {

		System.out.println();
		for (int i=0; i<this.index; i++) {
			System.out.printf("%s(%s)\n",this.items[i].getName(), this.items[i].getExpiration());
		}
		
	}

	public int count() {
		
		return this.index;
	}
}
