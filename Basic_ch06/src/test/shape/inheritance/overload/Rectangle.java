package test.shape.inheritance.overload;

public class Rectangle extends Shape{
	int w,h;
	public void areaRec() {
		System.out.println("사각형의 넓이="+(w*h));
	}

}