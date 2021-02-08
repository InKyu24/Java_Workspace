package test.string;

public class Test {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = "java";
		String s4 = "java";
		
		// 이어붙이기 메소드 concat
		s1.concat("1"); 
		s2.concat("1"); 
		s3.concat("1"); 
		s4.concat("1");  
		// 하지만 String은 문자열의 배열이고, 배열은 resize가 불가하다. [원본 변경 불가 (immutable)]
		// concat 메소드로 저장된 "java1"은 새로운 주소값으로 저장되고 있다.
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		// 따라서 새로운 주소값을 지정해주어야 한다.
		s1 = s1.concat("1"); 
		s2 = s2.concat("1"); 
		s3 = s3.concat("1"); 
		s4 = s4.concat("1"); 
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
