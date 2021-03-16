package my.camping.shop.member.vo;

import java.util.Date;

public class MemberVO {
	String name, id, pw, phone, birth;
	
	public MemberVO(String id, String pw) {
		setId(id);
		setPw(pw);
	}
	
	public MemberVO(String id, String name, String pw) {
		this(id,pw);
		setName(name);
	}
	
	public MemberVO(String id, String name, String pw, String phone, String birth) {
		this(name,id,pw);
		setPhone(phone);
		setBirth(birth);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", id=" + id + ", pw=" + pw + ", phone=" + phone + ", birth=" + birth + "]";
	}

	
}
