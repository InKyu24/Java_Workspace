package web.model;

public class MemberVO {
	String id,pw,name;

	
	public MemberVO(String id, String pw, String name) {
		super();
		setId(id);
		setPw(pw);
		setName(name);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
