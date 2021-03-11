package web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import web.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO{

	SqlSession sqlSession;
	
	// 속성 sqlSession에 sqlSession 빈을 주입하기 위한 setter 구현
	public void setSqlSession(SqlSession sqlsession) {
		this.sqlSession = sqlsession;
	}

	@Override
	public List<MemberVO> listMembers() {
		// 주입된 sqlSession 빈으로 selectList() 메서드를 호출하면서 SQL문의 id를 전달
		return sqlSession.selectList("mapper.member.selectAllMemberList");
	}

	@Override
	public void addMember(MemberVO memberVO) {
		
		sqlSession.insert("mapper.member.memberInsert", memberVO);
	}

	@Override
	public void removeMember(String id) {
		sqlSession.delete("mapper.member.memberDelete", id);
	}

}
