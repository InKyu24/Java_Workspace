package commin.entity;

import java.util.Date;

public class Member {
	private String memid;
	private String name;
	private Date mDate;
	private String phone;
	private int point;
	
	public Member(String memid, String name, Date mDate, String phone) {
		super();
		this.memid = memid;
		this.name = name;
		this.mDate = mDate;
		this.phone = phone;
	}
		
	public String getMemid() {
		return memid;
	}
	public void setMemid(String memid) {		// 유효성 검사
		if(memid!=null) {
			this.memid = memid;	
		}else {
			System.out.println("memId는 null이 될 수 없습니다.");
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
		return "Member [memid=" + memid + ", name=" + name + ", mDate=" + mDate + ", phone=" + phone + ", point="
				+ point + "]";
	}
	
	
}
