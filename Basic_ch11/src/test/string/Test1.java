package test.string;

public class Test1 {
	public static void main(String[] args) {
		/*StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = sb1.append("1"); // 추가하다.
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1==sb2);*/
		
		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = sb1.append("1"); // 추가하다.
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1==sb2);
	}
}