package test.shape.inheritance.overload;

public class Printer {
	
	public void print(Circle c) {
		c.radius=3;
		c.areaCircle();
	}
	public void print(Rectangle r) {
		r.h=4;
		r.w=5;
		r.areaRec();		
	}
	public void print(Triangle t) {
		t.h=6;
		t.w=7;
		t.areaTri();
	}

}
