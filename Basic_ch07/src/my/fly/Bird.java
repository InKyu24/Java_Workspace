package my.fly;

public class Bird extends Animal implements Fly{
	@Override				
	public void eat() {		// 부모 클래스인 Animal 메소드 재정의
		System.out.println("벌레를 먹는다");
	}
	
	public void fly() {		// fly 인터페이스 실체 메소드 정의
		System.out.println("날개로 난다");
	}
}