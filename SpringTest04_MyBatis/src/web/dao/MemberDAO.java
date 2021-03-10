package web.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import web.vo.MemberVO;

public class MemberDAO {
	SqlSessionFactory sqlMapper;

	public MemberDAO() {
		try {
			// MemberDAO의 각 메서드 호출 시 "mybatis/SqlMapConfig.xml"에서 설정 정보를 읽은 후 데이터베이스와의 연동 준비를 한다.
			Reader reader = Resources.getResourceAsReader("mybatis/SqlMapConfig.xml");
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<MemberVO> selectAllMemberList() {
		// 실제 member.xml의 SQL문을 호출하는 데 사용되는 SqlSession 객체를 가져온다.
		SqlSession session = sqlMapper.openSession();
		// 여러 개의 레코드를 조회하므로 selectList() 메서드에 실행하고자 하는 SQL문의 id를 인자로 전달한다.
		List<MemberVO> list = session.selectList("mapper.member.selectAllMemberList");
		return list;
	}
	
	public String login (MemberVO m) {
		// 실제 member.xml의 SQL문을 호출하는 데 사용되는 SqlSession 객체를 가져온다.
		SqlSession session = sqlMapper.openSession();
		String name = (String) session.selectOne("mapper.member.login", m);
		return name;
	}

	public MemberVO selectMemberById(String id) {
		// 실제 member.xml의 SQL문을 호출하는 데 사용되는 SqlSession 객체를 가져온다.
		SqlSession session = sqlMapper.openSession();
		MemberVO memberVO = (MemberVO) session.selectOne("mapper.member.selectMemberById", id);
		return memberVO;
	}

	public List<MemberVO> byPwList(String pw) {
		SqlSession session = sqlMapper.openSession();
		List<MemberVO> memlist = session.selectList("mapper.member.selectMemberByPw", pw);
		return memlist;
	}

	public void memberInsert(MemberVO memberVO) {
		SqlSession session = sqlMapper.openSession();
		try {
			session.insert("mapper.member.memberInsert", memberVO);
			session.commit();
		} catch (Exception e) {
			session.rollback();
		}
	}

	public void memberUpdate(MemberVO memberVO) {
		SqlSession session = sqlMapper.openSession();
		session.update("mapper.member.memberUpdate", memberVO);
		session.commit();
	}
}
