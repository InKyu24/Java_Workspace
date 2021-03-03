package web.util;

public class MemberVO {
	private String id, name, pw;
	public String[] all_subject;

	public MemberVO(String id, String pw, String name) {
		super();
		setId(id);
		setName(name);
		setPw(pw);
		
	}

	public MemberVO(String id2, String name2, String pw2, String[] all_subject) {
		this(id2, name2, pw2);
		this.all_subject = all_subject;
		
	}

	public String[] getAll_subject() {
		return all_subject;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id != null) {
			this.id = id;
		} else {
			System.out.println("ID == null");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("name == null");
		}
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		if (pw != null) {
			this.pw = pw;
		} else {
			System.out.println("PW == null");
		}
	}

	
}