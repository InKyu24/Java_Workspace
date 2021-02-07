package test.array;

public class MemberTest {

	public static void main(String[] args) {
		System.out.println(args);		// 배열 args의 주소값
		System.out.println(args.length); // 배열 args의 크기
		
		MemberDB db=new MemberDB();
		
		
		
		db.setMemberName("최인규");
		db.setMemberName("홍길동");
		db.setMemberName("유재석");

		db.printNames();

	}

}

