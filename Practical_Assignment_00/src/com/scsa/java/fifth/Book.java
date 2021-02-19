package com.scsa.java.fifth;

public class Book {
	String isbn="21424";
	String title="Java Pro";
	String author="김하나";
	String publisher="Jaen.kr";
	int price=15000;
	String desc="기본문법";
	
	@Override
	public String toString() {
		return isbn+"	| "+title+"	| "+author+"	| "+publisher+"	| "+price+"		| "+desc;	
	}	
}
