package test.shape.inheritance.override;

public class Rectangle extends Shape{
	int w,h;
	public void area() { // 재정의
		System.out.println("사각형의 넓이="+(w*h));
	}

}