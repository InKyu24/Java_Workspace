package my.camping.shop.member.service;

import my.camping.shop.member.util.MemberException;
import my.camping.shop.member.vo.MemberVO;

public interface MemberService {

	void memInsert(MemberVO memberVO) throws MemberException;
	

}
