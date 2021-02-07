package my.shop;

public class Customer {
	private String name;
	private int custNo;
	private String address;
	
	public void calcPoint() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; // 유효성 검사 했다고 가정
	}
	public int getCustNo() {
		return custNo; 
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo; // 유효성 검사 했다고 가정
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address; // 유효성 검사 했다고 가정
	}
	
	
}
