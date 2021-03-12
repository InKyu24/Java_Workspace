package web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import web.vo.AccountVO;

public class AccountDAOImpl implements AccountDAO {

	SqlSession sqlSession;

	// sqlSession에 빈을 주입하기 위해 setter 구현
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	// 첫 번째 update문을 실행해 홍길동 계좌에서 출금
	@Override
	public void updateBalance1() {
		sqlSession.update("mapper.account.updateBalance1");
		
	}

	// 두 번째 update문을 실행해 김유신 계좌에 입금
	@Override
	public void updateBalance2() {
		sqlSession.update("mapper.account.updateBalance2");
		
	}

	@Override
	public List<AccountVO> accountslists() {
		return sqlSession.selectList("mapper.account.accountsList");
	}

}
