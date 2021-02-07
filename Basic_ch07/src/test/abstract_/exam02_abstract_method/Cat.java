package test.abstract_.exam02_abstract_method;

public class Cat extends Animal { // Cat은 Animal을 상속받는다.
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
