package web.util;

public class MemberVO {
	private String id, name;

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
	
	
}
