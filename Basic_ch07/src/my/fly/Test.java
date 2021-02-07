package my.fly;

public class Test {
	public static void main(String[] args) {
		Animal ah=new Human();
		ah.eat();	// 재정의 된 메소드 먹다
		ah.sleep();	// 부모 메소드 자다
		// ah.walk(); 부모 객체로 가져왔으므로 자식 메소드 사용 불가
		System.out.println("");
		
		
		Human h=new Human();
		System.out.println("사람");
		h.eat();	// 재정의 된 메소드 먹다
		h.sleep();	// 부모 메소드 자다
		h.walk();
		System.out.println("");
		
		Superman s=new Superman();
		System.out.println("슈퍼맨");
		s.eat();
		s.sleep();
		s.walk();
		s.fly();
		System.out.println("");
		
		Bird b=new Bird();
		System.out.println("새");
		b.eat();	// 재정의 된 메소드 먹다
		b.sleep();	// 부모 메소드 자다
		b.fly();
		System.out.println("");
		
		Airplane a=new Airplane();
		System.out.println("뱅기");
		a.transfer("인천", "상해");
		a.flight();
		a.fly();
		System.out.println("");
		
		Car c = new Car();
		System.out.println("차");
		c.transfer("서울", "부산");
		c.drive();
		System.out.println("");
		
		Show show=new Show();
		System.out.println("에어쇼");
		show.airShow(b);
		show.airShow(s);
		show.airShow(a);
		
	}

}
