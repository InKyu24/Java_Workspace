package my.fly;

public class Human extends Animal {
	@Override
	public void eat() {		// 부모 클래스인 Animal 메소드 재정의
		System.out.println("밥을 먹는다");
	}
	
	public void walk() {	// Human 메소드 정의
		System.out.println("걷는다");
	}
}