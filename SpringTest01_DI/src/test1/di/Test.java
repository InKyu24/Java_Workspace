package test1.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import my.model.Person;
import my.model.PersonImpl;

public class Test {

	public static void main(String[] args) {
//		PersonImpl person1 = new PersonImpl();
//		person1.setName("최인규");
//		System.out.println(person1.getName());
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		Person p = (Person) factory.getBean("person1");
		System.out.println(p.getName());
		
	}//End main method

}//End class