package eenumm;

public class EnumMethodExample {
	public static void main(String[] args) {	
		Week today = Week.일요일;	// today에 열거 객체 `일요일` 참조
		
		//name() 메소드
		String dayOfWeek = today.name(); // String dayOfWeek에 참조된 '일요일' 문자열 리턴
		System.out.println(dayOfWeek);	// [일요일 출력]
		
		//ordinal() 메소드
		int order = today.ordinal();	// int값 order에 열거 객체 '일요일'의 순번값 리턴
		System.out.println(order);		// [6 출력}

		//compareTo() 메소드
		Week day1 = Week.월요일;		// day1에 열거 객체 '월요일' 참조
		Week day2 = Week.수요일;		// day2에 열거 객체 '수요일' 참조
		int result1 = day1.compareTo(day2);	// int값 result1에 ('월요일' 순번값- '수요일' 순번값) 리턴 
		int result2 = day2.compareTo(day1); // int값 result2에 ('수요일' 순번값- '월요일' 순번값) 리턴 
		System.out.println(result1); // [0-2 값 출력]
		System.out.println(result2); // [2-0 값 출력]

		//valueOf() 메소드
		Week weekDay = Week.valueOf("일요일"); // weekDay에 "일요일"과 동일만 문자열을 가진 열거 객체 '일요일' 참조
		if(weekDay == Week.토요일 || weekDay == Week.일요일) {
			System.out.println("주말이군");		// [주말이군 출력]
		} else {
				System.out.println("평일이군");
		}
		
		
		//values() 메소드
		Week[] days = Week.values(); // 열거 타입의 열거 객체들을 배열 days로 만들어 리턴 
		for(Week day : days) {		 // 향상된 for문 = days배열에서 day를 차례대로 가져와 실행문 반복
			System.out.println(day);
		}
	}
}
