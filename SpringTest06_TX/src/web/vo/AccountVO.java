package web.vo;

public class AccountVO {
	private String name, no;
	private int balance;
	
	public AccountVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AccountVO(String name, String no, int balance) {
		super();
		this.name = name;
		this.no = no;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
