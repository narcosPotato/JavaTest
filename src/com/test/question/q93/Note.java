package com.test.question.q93;

class Note {
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;

	// setter, getter 구현

	public String info() {
		
		String temp = "■■■■■■■■ 노트 정보 ■■■■■■■■\n";
		if (this.owner == null) {
			temp += "주인없는 노트\n";
		} else {
			temp += "소유자: " + owner + "\n";
			if (page >= 10 && page <= 50) {
				temp += "특성: " + color + " 얇은 " + size + "노트\n";				
			} else if (page >= 51 && page <= 100) {
				temp += "특성: " + color + " 보통 " + size + "노트\n";								
			} else {
				temp += "특성: " + color + " 두꺼운 " + size + "노트\n";				
			} // 두께정하는 변수를 따로 만들어서 해야 깔끔함.
			
			if (size.equals("A5") && color.equals("흰색") && page == 10) {
				price = 500;
			} else {
				price = 500;
				if (size.equals("A3")) {
					price += 400;
				} else if (size.equals("A4")) {
					price += 200;
				} else if (size.equals("B3")) {
					price += 500;
				} else if (size.equals("B4")) {
					price += 300;
				} else {
					price += 100;
				}
				
				if (color.equals("검정색")) {
					price += 100;
				} else if (color.equals("노란색")) {
					price += 200;
				} else if (color.equals("파란색")) {
					price += 200;
				} else {
					price += 0;
				}
				
				price += (page - 10) * 10;
			}
			temp += String.format("가격: %,d원\n", price);
			
		}
		temp += "■■■■■■■■■■■■■■■■■■■■■■■■■\n\n";
		
		
		return temp;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPage(int page) {
		
		if (page >= 10 && page <= 200) {
			this.page = page;			
		} else {
			System.out.println("페이지 수는 10 ~ 200페이지 이내어야 합니다.");
		}
	}

	public void setOwner(String owner) {
		if (owner.length() > 1 && owner.length() < 6) {
			for (int i=0; i<owner.length(); i++) {
				if (owner.charAt(i) >= '가' && owner.charAt(i) <= '힣') {
					this.owner = owner;
				} else {
					System.out.println("한글만 입력해주세요.");
					break;
				}			
			}				
		} else {
			System.out.println("2 ~ 5자이내로 입력해주세요.");
		}
	}
}
