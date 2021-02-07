package p2;

import p1.A;	//참조된 Package.Class 주소가 자동으로 보여짐

public class C extends A{

	public static void main(String[] args) {
		A obj1=new A();
		System.out.println(obj1.i);
	}
	
}
