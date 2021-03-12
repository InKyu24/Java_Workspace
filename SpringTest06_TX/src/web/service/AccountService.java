package web.service;

import java.util.List;

import web.vo.AccountVO;

public interface AccountService {

	void sendMoney();

	List<AccountVO> accountsList();

}
