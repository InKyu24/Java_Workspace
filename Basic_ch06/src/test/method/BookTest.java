package test.method;

public class BookTest {
	public static void main(String[] args) {
		Book book=new Book();
		// book.want(args); // []일 때와 ...일 때 모두 가능함
		//book.want("a", "b", "c"); // ...일 때는 자동 배열로 넘어가서 가능해짐
		
		Book book1=new Book();
		System.out.println(book1);
		book1.test();
		
		Book book2=new Book();
		System.out.println(book2);
		book2.test();
	}
}
