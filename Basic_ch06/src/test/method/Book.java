package test.method;

public class Book {

	public void want(String ...all) { // ...은 var args로 배열을 표현하는 기호
		for(String s:all) {			// ...과 []은 유사하나 차이가 있다.
			System.out.println(s);
		}
	}
	
	public void test() {
		System.out.println(this);
	}
	
	public int test(int i) {
		return 0;
	}
}
