package test1;
public class MyProfile {
	String name;
	int age;
	double tall;
	char gender;
	boolean isNice;
	public void setProfile(String name, int age, double tall, char gender, boolean isNice) { //Data Setting Method 정의.
		this.name=name;
		this.age=age;
		this.tall=tall;
		this.gender=gender;
		this.isNice=isNice;
	}
	public void printProFile() {				// Data print Method 정의.
		System.out.println(name);
		System.out.println(age);
		System.out.println(tall);
		System.out.println(gender);
		System.out.println(isNice);
	}

}
