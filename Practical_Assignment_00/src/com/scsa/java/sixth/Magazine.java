package com.scsa.java.sixth;

public class Magazine {
	private String isbn; 
	private String title;
	private String author;
	private String publisher;
	private int year;
	private int month;
	private int price;
	private String desc;
	
	String getIsbn() {
		return isbn;
	}
	String getTitle() {
		return title;
	}
	String getAuthor() {
		return author;
	}
	String getPublisher() {
		return publisher;
	}
	int getYear() {
		return year;
	}
	int getMonth() {
		return month;
	}
	int getPrice() {
		return price;
	}
	String getDesc() {
		return desc;
	}
	
	
	void setIsbn(String isbn) {
		if (isbn=="") {
			System.out.println("Isbn을 입력하세요");
		}else {
			this.isbn = isbn;
		}
	}
	void setTitle(String title) {
		if (title=="") {
			System.out.println("Title을 입력하세요");
		}else {
			this.title = title;
		}
	}
	void setAuthor(String author) {
		if (author=="") {
			System.out.println("author를 입력하세요");
		}else {
			this.author = author;
		}	
	}
	void setPublisher(String publisher) {
		if (publisher=="Jaen.kr") {
			this.publisher = publisher;
		}else {
			System.out.println("오픈 도서관에서는 Jaen.kr 도서만 취급합니다");
		}	
	}
	public void setYear(int year) {
		if (year<2000) {
			System.out.println("2000년 이전 출간 잡지는 열람 불가합니다");
		}else if (year>2021) {
			System.out.println("접근 가능한 연도가 아닙니다");
		}else {
			this.year = year;
		}
	}
	public void setMonth(int month) {
		if (month>0 && month<13) {
			this.month = month;
		}else {
			System.out.println("접근 가능한 월이 아닙니다");
		}
	}
	void setPrice(int price) {
		if (price%1000!=0) {
			System.out.println("천원 미만의 단위는 생략하여 입력해주세요");
		}else 
			this.price = price;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	public Magazine(String isbn, String title, String author, String publisher, int price, String desc, int year, int month) {
		super();
		this.setIsbn(isbn);
		this.setTitle(title);
		this.setAuthor(author);
		this.setPublisher(publisher);
		this.setPrice(price);
		this.setDesc(desc);
		this.setYear(year);
		this.setMonth(month);
	}
	
	@Override
	public String toString() {
		return getIsbn()+"	| "+getTitle()+"	| "+getAuthor()+"	| "+getPublisher()+"	| "+getPrice()+"	| "+getDesc()+"	| "+getYear()+"."+getMonth();
	}
}