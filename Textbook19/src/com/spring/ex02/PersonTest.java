package com.spring.ex02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest {
	public static void main(String[] args) {
		// 실행 시 person.xml을 읽어 드여 빈을 생성
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person02.xml"));
		// id가 personService1인 빈을 가져옴
		PersonService person1 = (PersonService) factory.getBean("personService1");
		// 생성된 빈을 이용해 name값을 출력
		person1.sayHello();
		
		// id가 personService2인 빈을 가져옴
		PersonService person2 = (PersonService) factory.getBean("personService2");
		// 생성된 빈을 이용해 name값을 출력
		person2.sayHello();
	}
}
