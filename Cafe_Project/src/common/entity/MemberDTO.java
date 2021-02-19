package common.entity;

import java.util.Date;

public class MemberDTO {
	private String memID;
	private String name;
	private Date mDate;
	private String phone;
	private int point;
	
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String memID, String name, String phone) {
		super();
		setmemID(memID);
		setName(name);
		setPhone(phone);		
	}
	
	public MemberDTO(String memID, String name, Date mDate, String phone) {
		super();
		setmemID(memID);
		setName(name);
		setmDate(mDate);
		setPhone(phone);		
	}
	
	public MemberDTO(String memID, String name, Date mDate, String phone,int point) {
		this(memID, name, mDate, phone);
	// 	setmemID(memID);
	//	setName(name);
	//	setmDate(mDate);
	//	setPhone(phone);	
		setPoint(point);
	}
		
	public String getMemID() {
		return memID;
	}
	public void setmemID(String memID) {		// 유효성 검사
		if(memID!=null) {
			this.memID = memID;	
		}else {
			System.out.println("memID는 null이 될 수 없습니다.");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {			// 유효성 검사
		this.name = name;
	}
	public Date getmDate() {
		return mDate;
	}
	public void setmDate(Date mDate) {			// 유효성 검사
		this.mDate = mDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {		// 유효성 검사
		this.phone = phone;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {			// 유효성 검사
		this.point = point;
	}

	@Override
	public String toString() {
		return "Member [memID=" + memID + ", name=" + name + ", mDate=" + mDate + ", phone=" + phone + ", point="
				+ point + "]";
	}
	
	
}
