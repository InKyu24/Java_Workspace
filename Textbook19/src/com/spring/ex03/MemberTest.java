package com.spring.ex03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MemberTest {

	public static void main(String[] args) {
		// member.xml을 읽어 들인 후 빈을 생성
		// 그리고 setter 주입 방식으로 주입 한 후 id가 memberService로 접근하여 listMembers() 메서드를 호출
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("member.xml"));
		MemberService service = (MemberService) factory.getBean("memberService");
		service.listMembers();
	}

}
