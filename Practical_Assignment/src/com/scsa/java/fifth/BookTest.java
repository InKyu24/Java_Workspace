package com.scsa.java.fifth;

public class BookTest {
	public static void main(String[] args) {
		System.out.println("*********************** 도서목록  **************************");
		
		Book b = new Book();		
		System.out.println(b.toString());
		
		Magazine m1 = new Magazine("35355", "OOAD 분석, 설계", "소나무", "Jaen.kr", 30000,0,0);
		System.out.println(m1);
	
		Magazine m2 = new Magazine("35535", "Java World", "편집부", "androidjava.com", 7000, 2013, 2);
		System.out.println(m2);
	
	}
}

