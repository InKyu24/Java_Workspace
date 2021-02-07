package test.encapsulation;

public class MyProfile {
	MyDate birthday=new MyDate();
	
	public void setBirthday() {
		birthday.setYear(1991);
		birthday.setMonth(2);
		birthday.setDay(4);

		System.out.println(birthday.getYear()+"년 "+birthday.getMonth()+"월 "+birthday.getDay()+"일");
		
		
	}

}
