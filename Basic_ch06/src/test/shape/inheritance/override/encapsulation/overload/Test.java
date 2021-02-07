package test.shape.inheritance.override.encapsulation.overload;

public class Test {

	public static void main(String[] args) {
		Circle c=new Circle();
		Rectangle r=new Rectangle();	
		Triangle t=new Triangle();	
		Printer out=new Printer();
		
		c.setRadius(3);
		r.setW(4);
		r.setH(5);
		t.setW(6);
		t.setH(7);
		
		out.print(c);
		out.print(r);
		out.print(t);
	}
}