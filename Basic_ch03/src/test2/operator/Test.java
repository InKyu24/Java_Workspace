package test2.operator;
public class Test {
	public static void main(String[] args) {
		int a=10;
		int b=2;
		System.out.println(a+b);
		System.out.println(a%b);
		
		Calculator c=new Calculator();
		c.add(10,2);
		c.mod(10,2);
		c.sum(50);
		c.sum(50);
		
		int i=100;
		System.out.println(++i);	// 1만큼 증가하고 출력
		System.out.println(i++);	// 출력하고 1만큼 증가
			// System.out.println(--i); 	--1 1만큼 감소하고 출력
			// System.out.println(i--); 	1-- 출력하고 1만큼 감소
			
//				== 같다
//				!= 같지 않다
//		
//				연산자 & == AND (둘 다 true 일 때만 true)
//				연산자 | == OR (둘 다 false 일 때만 false)
//				연산자 ^ == XOR (둘이  같으면 false, 다르면 true)
		
//			short circuit operator [보다 빠른 &와 | 처리]
//				연산자 && (먼저 확인한 조건이 false이면 다음 조건 확인 없이 false)
//				연산자 || (먼저 확인한 조건이 true이면 다음 조건 확인 없이 true)
				
		
//			삼항 연산자_조건식
//				(조건식) ? A:B	조건이 true 이면 A를 수행, false이면 B를 수행
////		
		int d=-1;
		
		System.out.println(Integer.toBinaryString(d));
		System.out.println(~d);			// b의 보수 출력
		System.out.println(d);
		d=d>>1;							// b를 오른쪽으로 한 비트 밀기
		System.out.println(d);
		System.out.println(Integer.toBinaryString(d));

		
//		int score=90;
//		
//		if(score>=90) {System.out.println("A");}
//		else System.out.println("B");
//		
//		
//		char grade=(score>=90)? 'A':'B';
//		System.out.println(grade);
		
		
		
		
		
	}
}
