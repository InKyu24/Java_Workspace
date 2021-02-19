package com.scsa.java.sixth;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc;
	
	String getIsbn() {
		return isbn;
	}
	void setIsbn(String isbn) {
		if (isbn=="") {
			System.out.println("Isbn을 입력하세요");
		}else {
			this.isbn = isbn;
		}
	}


	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		if (title=="") {
			System.out.println("Title을 입력하세요");
		}else {
			this.title = title;
		}
	}

	
	String getAuthor() {
		return author;
	}
	void setAuthor(String author) {
		if (author=="") {
			System.out.println("author를 입력하세요");
		}else {
			this.author = author;
		}	
	}

	
	String getPublisher() {
		return publisher;
	}
	void setPublisher(String publisher) {
		if (publisher=="Jaen.kr") {
			this.publisher = publisher;
		}else {
			System.out.println("오픈 도서관에서는 Jaen.kr 도서만 취급합니다");
		}	
	}

	
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		if (price%1000!=0) {
			System.out.println("천원 미만의 단위는 생략하여 입력해주세요");
		}else 
			this.price = price;
	}

	
	String getDesc() {
		return desc;
	}
	void setDesc(String desc) {
			this.desc = desc;
	}
	
	
	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
		super();
		this.setIsbn(isbn);
		this.setTitle(title);
		this.setAuthor(author);
		this.setPublisher(publisher);
		this.setPrice(price);
		this.setDesc(desc);
	}
	@Override
	public String toString() {
		return getIsbn()+"	| "+getTitle()+"	| "+getAuthor()+"	| "+getPublisher()+"	| "+getPrice()+"	| "+getDesc();
	}
	
}