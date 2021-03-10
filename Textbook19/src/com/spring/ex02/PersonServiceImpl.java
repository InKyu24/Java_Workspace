package com.spring.ex02;

public class PersonServiceImpl implements PersonService {
	// 인터페이스 PersonService 구현
	private String name;
	private int age;

	// person.xml에서 인자가 한 개인 생성자 생성 설정 시 사용
	public PersonServiceImpl(String name) {
		super();
		this.name = name;
	}
	
	// person.xml에서 인자가 두 개인 생성자 생성 설정 시 사용
	public PersonServiceImpl(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// setter를 이용해 person.xml에서 설정한 값을 name 속성에 주입. age 속성은 setter가 없으므로 빈이 생성되더라도 값이 초기화되지 않음
	public void setName(String name) {
		this.name = name;
	}
	
	//sayHello 메서드 오버라이딩으로 정의
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}

}
