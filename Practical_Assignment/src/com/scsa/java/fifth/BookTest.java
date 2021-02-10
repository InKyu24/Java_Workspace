package com.scsa.java.fifth;

public class BookTest {
	public static void main(String[] args) {
		Book b = new Book();
		Magazine m = new Magazine();
		
		b.isbn= "21424";
		b.title = "Java Pro";
		System.out.println("*********************** 도서목록  **************************");
		System.out.println(b.isbn+"	| "+b.title+"	|");
		
		
		
	}
}
