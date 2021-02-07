package test.shape.inheritance.override;

public class Circle extends Shape{
	public int radius;
	public void area() { // 재정의
		System.out.println("원의 넓이="+(3.14*radius*radius));
	}
}
