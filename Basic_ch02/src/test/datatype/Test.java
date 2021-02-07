package test.datatype;

import java.util.Date;

public class Test {
		
	public static void main(String[] args) {
		int age=31;
		double tall=177.5D;
		char gender='남';
		boolean isNice=true;
//		MemberName name=new MemberName();
		String name=new String("최인규");
//		MyDate birthday=new MyDate();
		Date birthday=new Date(1991,2,4);
		
		
		System.out.println(age);
		System.out.println(tall);
		System.out.println(gender);
		System.out.println(isNice);
//		System.out.println(name.name1+""+name.name2+""+name.name3);
		System.out.println(name);
//		System.out.println(birthday.year+"년"+birthday.month+"월"+birthday.day+"일");
		System.out.println(birthday.getYear()+"년"+birthday.getMonth()+"월"+birthday.getDate()+"일");
		
		
	}
	
}