package my.camping.shop.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.camping.shop.member.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSession sqlSession;	
	
	
	@Override
	public void memInsert(MemberVO memVO) {
		sqlSession.insert("mapper.member.memInsert",memVO);	
	}


	@Override
	public String login(MemberVO memVO) {
		return sqlSession.selectOne("mapper.member.login", memVO);
	}


	@Override
	public String memFindId(MemberVO memVO) {
		return sqlSession.selectOne("mapper.member.memFindId", memVO);
	}


	@Override
	public String memFindPw(MemberVO memVO) {
		return sqlSession.selectOne("mapper.member.memFindPw", memVO);
	}
}
