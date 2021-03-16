package my.camping.shop.member.service;

import my.camping.shop.member.util.MemberException;
import my.camping.shop.member.vo.MemberVO;

public interface MemberService {

	void memInsert(MemberVO memberVO) throws MemberException;

	String login(MemberVO memVO) throws MemberException;

	String memFindId(MemberVO memVO) throws MemberException;

	String memFindPw(MemberVO memVO) throws MemberException;
	

}
