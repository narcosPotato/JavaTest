package com.test.question.q96;

class Box {
	private Macaron[] list = new Macaron[10];

	public void cook() {
		for (int i=0; i<list.length; i++) {
			
			String[] color = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};
			Macaron m = new Macaron();
			
			m.setSize(((int)(Math.random() * 11) +5));
			m.setThickness(((int)(Math.random() * 20) +1));
			m.setColor(color[(int)(Math.random() * color.length)]);
			
			this.list[i] = m;
		}
		System.out.println("마카롱을 10개 만들었습니다.");
		System.out.println();
	}

	public void check() {
		int pass = 0;
		int fail = 0;
		
		for (int i=0; i<list.length; i++) {
			
			Macaron m = this.list[i];
			
			if (m.getSize() < 8 || m.getSize() > 14 || m.getColor().equals("black") || m.getThickness() < 3 || m.getThickness() > 18) {
				fail++;
			} else {
				pass++;
			}
		}
		
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수 : %d\n", pass);
		System.out.printf("QC 불합격 개수 : %d\n", fail);
		System.out.println();
	}

	public void list() {
		
		String check = "";
		
		System.out.println("[마카롱 목록]");
		for (int i=0; i<list.length; i++) {
			
			Macaron m = this.list[i];
			if (m.getSize() < 8 || m.getSize() > 14 || m.getColor().equals("black") || m.getThickness() < 3 || m.getThickness() > 18) {
				check = "불합격";
			} else {
				check = "합격";
			}
			
			System.out.printf("%d번 마카롱 : %dcm(%s, %dmm): %s\n", i+1, m.getSize(), m.getColor(), m.getThickness(), check);
		}
		
	}
}
