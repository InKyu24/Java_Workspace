package web.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public String login (String id, String pw) {
//		MemberVO m = new MemberVO(id,pw);
		sqlSession.selectOne("SQL", m);
	}
	
}
