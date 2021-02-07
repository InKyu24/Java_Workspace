package Prj1.shop;

public class Shop {

	public static void main(String[] args) {
		Customer c1=new Customer();
		
		System.out.println(c1);				//주소값
		System.out.println(c1.name);		//null
		System.out.println(c1.gender);		//빈 칸
		System.out.println(c1.age);			//0
		System.out.println(c1.tall);		//0.0
		System.out.println(c1.isPretty);	//false
		
		
	}

}
