package test.method;

public class Calculator {

	void powerOn() { // 메소드 정의
		System.out.println("전원을 켭니다");
	}
	int puls(int x, int y) { // 매개변수 int x,y를 받는 메소드 정의 [int 값 도출하는 메소드]
		int result = x+y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double)x / (double)y; // 명시적 변환
		return result;
	}
	
	void poweroff() {
		System.out.println("전원을 끕니다");
	}
}
