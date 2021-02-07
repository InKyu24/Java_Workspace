package test.inheritance;
public class People {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}

	public People() {
		super();
	}
	
}


class Student extends People {
	
	Student() {
		super();
	}
}