package test.constructor;

public class Korean {
	String nation="대한민국";
	String name;
	String ssn;

	public Korean(String n, String s) { // 생성자 1 선언
		name=n;
		ssn=s;
	}		
	public Korean() {			// 생성자 2 선언
		this("최인규","910204-1000000"); // 생성자 1 호출
	}
	
}
