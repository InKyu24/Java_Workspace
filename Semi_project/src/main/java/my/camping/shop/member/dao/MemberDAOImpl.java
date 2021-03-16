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
	public void memInsert(MemberVO memberVO) {
		sqlSession.insert("mapper.member.memInsert",memberVO);	
	}
}
