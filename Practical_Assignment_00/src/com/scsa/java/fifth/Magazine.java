package com.scsa.java.fifth;

public class Magazine {
	String isbn; 
	String title;
	String author;
	String publisher;
	int year;
	int month;
	int price;
	String desc;
	
	public Magazine(String isbn, String title, String author, String publisher, int price, int year, int month) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.month = month;
		this.price = price;
	}
	
	public String toString() {
			if (year==0 || month==0) {
				return isbn+"	| "+title+"  	| "+author+"	| "+publisher+"	| "+price;				
			}else {
				return isbn+"	| "+title+"  	| "+author+"	| "+publisher+"	| "+price+"		| "+year+"."+month;
			}	
	}	
}