package test.shape.inheritance.override;

public class Triangle extends Shape{
	int w,h;
	public void area() { // 재정의
		System.out.println("삼각형의 넓이="+(w*h/2));
	}
}
