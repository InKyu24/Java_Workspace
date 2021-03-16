package my.camping.shop.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.camping.shop.member.dao.MemberDAO;
import my.camping.shop.member.util.MemberException;
import my.camping.shop.member.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memDAO;
	
	@Override
	public void memInsert (MemberVO memberVO) throws MemberException{
		memDAO.memInsert(memberVO);
	}
}
