package test.exception;

public class Test {
	public static void main(String[] args) {
		try {
			int x=100;
			args[0]=null;
			int y=Integer.parseInt(args[0].trim());		
					
			System.out.println(x/y);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환 불가");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인텍스 범위를 초과"); 	// 너무 많은 예외 상황에 대처하기가 곤란!  
		}catch(Exception e) {						// 중첩 catch!
			System.out.println(e.getMessage()); 
		}
		
		System.out.println("중요한 일 시작!");
	}
}
