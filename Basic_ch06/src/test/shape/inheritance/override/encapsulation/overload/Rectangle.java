package test.shape.inheritance.override.encapsulation.overload;

public class Rectangle extends Shape{
	private int w,h;	// 데이터의 직접 접근을 숨기기 위해, private 접근지정자 사용
	
	public int getW() { 	// get 메소드 정의
		return w;
	}
	public void setW(int w) { // set 메소드 정의
		if (w>0) {				// 조건문을 통한 유효성 검사
			this.w = w;
		}else {
			System.out.println("밑변은 0보다 클 것");
		}
		
	}

	public int getH() {			// get 메소드 정의
		return h;
	}

	public void setH(int h) {	// set 메소드 정의
		if (h>0) {				// 조건문을 통한 유효성 검사
			this.h = h;
		}else {
			System.out.println("높이는 0보다 클 것");
		}
		
	}

	public void area() {
		System.out.println("사각형의 넓이="+(w*h));
	}

}