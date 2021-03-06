package common.dto;

public class StudentDTO {
	// Student 테이블과 매핑되는 필드와 메소드를 가짐.
	
	private int no;
	private String name;
	private String det;
	private String addr;
	private String tel;
	
	public StudentDTO() {
		super();		
	}

	public StudentDTO(int no, String name, String det, String addr, String tel) {
		super();
		setNo(no);
		setName(name);
		setDet(det);
		setAddr(addr);
		setTel(tel);
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		if (no>0) {
			this.no = no;
		} else {
			System.out.println("정상적인 학번이 아닙니다");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name!=null) {
			this.name = name;
		} else {
			System.out.println("성명은 널이 될 수 없습니다");
		}
	}

	public String getDet() {
		return det;
	}

	public void setDet(String det) {
		if (det!=null) {
			this.det = det;
		} else {
			System.out.println("전공은 널이 될 수 없습니다");
		}
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		if (addr!=null) {
			this.addr = addr;
		} else {
			System.out.println("주소는 널이 될 수 없습니다");
		}
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if (tel!=null) {
			this.tel = tel;
		} else {
			System.out.println("전화번호는 널이 될 수 없습니다");
		}
	}
}
