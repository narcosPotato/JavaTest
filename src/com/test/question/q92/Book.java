package com.test.question.q92;

//Ctrl + Shift + F

class Book {
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;

	// getter, setter

	public String info() {
		
		String temp = "";
		
		temp += "제목: " + this.title + "\n";
		temp += String.format("가격: %,d원\n", this.price);
		temp += "저자: " + this.author + "\n"; 
		temp += "출판사: " + this.publisher + "\n";
		temp += "발행년도: " + this.pubYear + "년\n";
		temp += "ISBN: " + this.isbn + "\n";
		temp += "페이지: " + this.page + "장\n";
		
		return temp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		
		if (title.length() < 51 && title.length() > 0) {
			for (int i=0; i<title.length(); i++) {
				if (title.charAt(i) >= '!' && title.charAt(i) <= '/' ||
					title.charAt(i) >= ':' && title.charAt(i) <= '@' ||
					title.charAt(i) >= '[' && title.charAt(i) <= '`' ||
					title.charAt(i) >= '{' && title.charAt(i) <= '~') {
					System.out.println("책 제목은 한글, 영어, 숫자, 공백만 가능합니다.");
					break;
				} else {
					this.title = title;
				}
				
			}
		} else {
			System.out.println("책 제목은 50자 이내여야 합니다.");
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		
		if (price > 0 && price <= 1000000) {
			this.price = price;
		} else {
			System.out.println("가격은 0원부터 1,000,000원까지만 가능합니다.");
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPubYear() {
		return pubYear;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		
		if (page < 0 || page == 0) {
			System.out.println("페이지 수는 1장이상 이어야 합니다.");
		} else {
			this.page = page;			
		}
		
	}
}
