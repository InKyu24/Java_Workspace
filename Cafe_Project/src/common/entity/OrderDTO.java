package common.entity;

import java.util.Date;

public class OrderDTO {
	
	private int orderNo;
	private int orderQuan;
	private String memberID;
	private String prodCode;
	private String orderMethod;
	private Date orderDate;
		
	public OrderDTO() {
		super();
	}

	public OrderDTO(int orderQuan, String memberID, String prodCode, String orderMethod) {
		super();
		setOrderQuan(orderQuan);
		setMemberID(memberID);
		setProdCode(prodCode);
		setOrderMethod(orderMethod);
	}
	
	public OrderDTO(int orderNo, int orderQuan, String memberID, String prodCode, String orderMethod, Date orderDate) {
		this(orderQuan,memberID,prodCode,orderMethod);
		setOrderNo(orderNo);
		setOrderDate(orderDate);
	}
	
	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		if (orderNo > 0) {
			this.orderNo = orderNo;
		}else  {
			System.out.println("주문번호가 바르지 않음");
		}
	}

	public int getOrderQuan() {
		return orderQuan;
	}

	public void setOrderQuan(int orderQuan) {
		if (orderQuan>0) {
			this.orderQuan = orderQuan;
		}else {
			System.out.println("옮지 않은 주문 수량");
		}
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getOrderMethod() {
		return orderMethod;
	}

	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	

}
