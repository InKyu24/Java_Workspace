package test.inheritance;

public class Test {

	public static void main(String[] args) {
		Father dad=new Father();
		dad.i++;
		dad.printI();
		
		Sun kid=new Sun();
		kid.x++;
		kid.printX();
		kid.i++;
		kid.printI();
		
		System.out.println(dad);
		System.out.println(dad.toString());
		
		System.out.println(kid);
		System.out.println(kid.toString());
		
		
		
		
		
		
	}
}
