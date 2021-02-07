package test.abstract_.exam02_abstract_method;

public class Dog extends Animal { // Dog는 Animal을 상속받는다.
	public Dog() {		// Dog 생성자는 Animal 클래스 내 String "포유류"를 저장
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}