package test.shape.inheritance.overload;

public class Circle extends Shape{
	int radius;
	public void areaCircle() {
		System.out.println("원의 넓이="+(3.14*radius*radius));
	}
}
