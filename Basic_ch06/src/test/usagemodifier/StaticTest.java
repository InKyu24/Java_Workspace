package test.usagemodifier;

public class StaticTest {
	static int i=10;		// i값 static
	int j=20;
	public static void main(String[] args) {
		System.out.println(i);			// 객체 생성 없이 사용 가능
//		System.out.println(j);			// 객체 생성 없이 사용 불가
		
		StaticTest st=new StaticTest();	// st로 클래스 객체 생성
		System.out.println(st.j);		// 객체 생성하였으므로 j값 출력 가능
	}
}
