package web.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import web.dao.AccountDAO;

// AccountServiceImpl 클래스의 모든 메서드에 트랜잭션을 적용
@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

	AccountDAO accountDAO;
	
	// 속성 accountDAO에 빈을 주입하기 위해 setter 구현
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	@Override
	public void sendMoney() {
		// sendMondy() 메서드 호출 시 accountDAO의 두 개의 SQL문을 호출
		accountDAO.updateBalance1(); // 출금
		accountDAO.updateBalance2(); // 입금
	}

}
