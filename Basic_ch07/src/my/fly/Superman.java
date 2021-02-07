package my.fly;

public class Superman extends Human implements Fly{
	public void fly() {		// fly 인터페이스 실체 메소드 정의
		System.out.println("망토로 난다");
	}
}