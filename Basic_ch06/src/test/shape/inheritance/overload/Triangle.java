package test.shape.inheritance.overload;

public class Triangle extends Shape{
	int w,h;
	public void areaTri() {
		System.out.println("삼각형의 넓이="+(w*h/2));
	}
}
