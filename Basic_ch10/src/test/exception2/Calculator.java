package test.exception2;

public class Calculator {
	public int divide (int x, int y) throws MyException {
		int z=0;
		if(y==0) {
			throw new MyException("y는 0으로 입력 안됨");  // 생성자 호출 [exception 사전 확인]
		}	
		z=x/y;
		return z;
	}
}
