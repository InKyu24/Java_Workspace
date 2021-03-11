package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import web.dao.AccountDAO;

@Service
// AccountServiceImpl 클래스의 모든 메서드에 트랜잭션을 적용
@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountDAO accountDAO;

	@Override
	public void sendMoney() {
		// sendMondy() 메서드 호출 시 accountDAO의 두 개의 SQL문을 호출
		accountDAO.updateBalance1(); // 출금
		accountDAO.updateBalance2(); // 입금
	}

}
