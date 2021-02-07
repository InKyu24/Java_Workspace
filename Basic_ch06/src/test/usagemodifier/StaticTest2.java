package test.usagemodifier;

public class StaticTest2 {

	public static void main(String[] args) {		
		A o1=new A("최인규");
		A.count++;
		
		A o2=new A("홍길동");
		A.count++;
		
		o1.printCount();

	}

}

class A{
	String name;
	static int count=0;			// 객체 생성없이 사용 가능한 방문자수 데이터
	public void printCount() {
		System.out.println(count);
	}
	A(String name){				// name 값을 입력받는 기본 생성자
		this.name=name;
	}
}
