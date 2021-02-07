package test.stmt;

public class IfTest {

	public static void main(String[] args) {
		int month=10;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {		// 조건문1
			System.out.println(month+"월은 31일까지 있지.");										// 조건문1 해당 결과 수행
		}else if(month==2) {																	// 조건문2
			System.out.println(month+"월은 보통 28일까지 있지.");									// 조건문2 해당 결과 수행
		}else if(month==4||month==6||month==9||month==11) {									// 조건문3
			System.out.println(month+"월은 30일까지 있지.");										// 조건문3 해당 결과 수행
		}else {																				// 나머지 조건
			System.out.println("잘못된 입력입니다.");											// 나머지 조건 해당 결과 수행
		}
	}

}


