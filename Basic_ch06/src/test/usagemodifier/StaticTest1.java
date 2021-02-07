package test.usagemodifier;
public class StaticTest1 {
	public static void main(String[] args) {
		B.j++; 			// B 클래스 생성 없이 j값 사용 가능 (j값 21)
		B.printJ();		// B 클래스 생성 없이 printJ 메소드 사용 가능
		
		B o1=new B();
		o1.i++;			// i값 11
		o1.printI();
		o1.j++;			// B.j++;과 같은 내용 (j값 22)
		o1.printJ();	// B.printJ;와 같은 내용
		
		B o2=new B();	
		o2.i++;			// i값 11
		o2.printI();
		o2.j++;			// B.j++;과 같은 내용 (j값 23)
		o2.printJ();	// B.printJ;와 같은 내용
	}
}

class B{	
	int i=10;
	static int j=20;	//객체 생성없이 사용가능한 j
	static public void printJ() {	//객체 생성없이 사용가능한 printJ 메소드
		System.out.println(j);
	}
	public void printI() {
		System.out.println(i);
	}
	
}
