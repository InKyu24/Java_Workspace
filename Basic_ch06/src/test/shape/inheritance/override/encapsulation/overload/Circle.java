package test.shape.inheritance.override.encapsulation.overload;

public class Circle extends Shape{
	private int radius;		// 데이터의 직접 접근을 숨기기 위해, private 접근지정자 사용 
    
	public int getRadius() { // get 메소드 정의
		return radius;
	}
    
	public void setRadius(int radius) { // set 메소드 정의
		if (radius>0) {					// 조건문을 통한 유효성 검사
			this.radius = radius;
		}else {
			System.out.println("반지름은 0보다 클 것");
		}
	}

	public void area() {
		System.out.println("원의 넓이="+(3.14*radius*radius));
	}
}