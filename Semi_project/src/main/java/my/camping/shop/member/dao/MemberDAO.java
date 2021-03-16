package my.camping.shop.member.dao;

import my.camping.shop.member.vo.MemberVO;

public interface MemberDAO {

	void memInsert(MemberVO memberVO);

	String login(MemberVO memVO);

	String memFindId(MemberVO memVO);

	String memFindPw(MemberVO memVO);

}
