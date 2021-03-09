package my.model;

public class PersonImpl implements Person {
	private String name;
	private int age;
	
	public PersonImpl(String name, int age) {		
		super();
		this.name = name;
		this.age = age;
		System.out.println("생성자(String name, int age) 호출됨");
	}
	
	public PersonImpl(String name) {
		super();
		this.name = name;
		System.out.println("생성자(String name) 호출됨");
	}

	public PersonImpl() {
		super();
		System.out.println("생성자() 호출됨");
	}

	@Override
	public String getName() {
		System.out.println("getName() 호출됨");
		return name;
	}

	public void setName(String name) {
		System.out.println("setName() 호출됨");
		this.name = name;
	}
	
	public int getAge() {
		System.out.println("getAge() 호출됨");
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge() 호출됨");
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "PersonImpl [name=" + name + ", age=" + age + "]";
	}
	
}
