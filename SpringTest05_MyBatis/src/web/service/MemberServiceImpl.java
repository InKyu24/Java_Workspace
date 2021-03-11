package web.service;

import java.util.List;

import web.dao.MemberDAO;
import web.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	
	MemberDAO memberDAO;
	
	// 속성 memberDAO에 memberDAO 빈을 주입하기 위한 setter 구현
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public List<MemberVO> listMembers() {
		return memberDAO.listMembers();
	}

	@Override
	public void addMember(MemberVO memberVO) {
		memberDAO.addMember(memberVO);
	}

	@Override
	public void removeMember(String id) {
		memberDAO.removeMember(id);
		
	}

}
