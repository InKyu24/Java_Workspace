package com.scsa.java.fifth;

public class BookTest {
	public static void main(String[] args) {
		Book b = new Book();
		Magazine m = new Magazine();
		
		System.out.println("*********************** 도서목록  **************************");

		System.out.println(b.isbn.toString()+"	| "+b.title.toString()+"	| "+b.author.toString()+"	| "+b.publisher.toString()+"	| "+b.price+"	| "+b.desc.toString());
		
		m.isbn="35355";
		m.title="OOAD 분석, 설계";
		m.author="소나무";
		m.publisher="Jaen.kr";
		m.price=30000;
		System.out.println(m.isbn.toString()+"	| "+m.title.toString()+"	| "+m.author.toString()+"	| "+m.publisher.toString()+"	| "+m.price);
		
		m.isbn="35535";
		m.title="Java World";
		m.author="편집부";
		m.publisher="androidjava.com";
		m.price=7000;
		m.year=2013;
		m.month=2;
		System.out.println(m.isbn.toString()+"	| "+m.title.toString()+"	| "+m.author.toString()+"	| "+m.publisher.toString()+"	| "+m.price+"	| "+m.year+"."+m.month);

	}
}
