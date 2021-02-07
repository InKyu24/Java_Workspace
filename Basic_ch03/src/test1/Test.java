package test1;

public class Test {

	public static void main(String[] args) {
		MyProfile m1=new MyProfile();
		m1.setProfile("최인규", 31, 177.5, '남', true);	// Data Setting Method 호출
		System.out.println(m1);
		m1.printProFile();								// Data print Method 호출
		
		MyProfile m2=new MyProfile();
		m2.setProfile("홍길동", 28, 185.5, '남', false);	// Data Setting Method 호출
		System.out.println(m2);
		m2.printProFile();								// Data print Method 호출
		
	}

}
