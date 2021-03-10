package com.spring.ex03;

public class MemberServiceImpl implements MemberService {
	// 주입되는 빈을 저장한 MemberDAO 타입의 속성 선언
	private MemberDAO memberDAO;
	
	// 설정 파일에서 memberDAO 빈을 생성한 후 setter로 속성 memberDAO에 주입
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public void listMembers() {
		memberDAO.listMembers();	
	}
}
