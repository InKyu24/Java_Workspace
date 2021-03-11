package web.service;

import java.util.List;

import web.vo.MemberVO;

public interface MemberService {

	List<MemberVO> listMembers();

	void addMember(MemberVO memberVO);

	void removeMember(String id);

}
