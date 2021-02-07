package my.fly;

public class Airplane extends Vehicle implements Fly{
	public void flight() {							// 메소드 정의
		System.out.println("엔진으로 난다");
		}
    
	@Override
	public void fly() {			// fly 인터페이스 실체 메소드 정의
		flight();
	}
}