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
	public void memInsert (MemberVO memVO) throws MemberException{
		memDAO.memInsert(memVO);
	}

	@Override
	public String login(MemberVO memVO) throws MemberException{
		return memDAO.login(memVO);		
	}

	@Override
	public String memFindId(MemberVO memVO) throws MemberException{
		return memDAO.memFindId(memVO);
	}

	@Override
	public String memFindPw(MemberVO memVO) throws MemberException{
		return memDAO.memFindPw(memVO);
	}
}
