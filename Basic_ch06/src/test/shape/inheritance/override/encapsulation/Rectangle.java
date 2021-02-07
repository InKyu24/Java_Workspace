package test.shape.inheritance.override.encapsulation;

public class Rectangle extends Shape{
	private int w,h;
	
	public int getW() {
		return w;
	}

	public void setW(int w) {
		if (w>0) {
			this.w = w;
		}else {
			System.out.println("밑변은 0보다 클 것");
		}
		
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		if (h>0) {
			this.h = h;
		}else {
			System.out.println("높이는 0보다 클 것");
		}
		
	}

	public void area() { // 재정의
		System.out.println("사각형의 넓이="+(w*h));
	}

}