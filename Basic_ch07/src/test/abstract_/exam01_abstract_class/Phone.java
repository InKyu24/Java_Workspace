package test.abstract_.exam01_abstract_class;

public abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("power on.");
	}	
	public void turnOff() {
		System.out.println("power off");
	}
}
