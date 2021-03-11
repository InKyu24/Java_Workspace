package web.dao;

import java.util.List;

import web.vo.MemberVO;

public interface MemberDAO {

	List<MemberVO> listMembers();

	void addMember(MemberVO memberVO);

	void removeMember(String id);


}
