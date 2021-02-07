package test.array;

public class IntTest {

	public static void main(String[] args) {
		int []all=new int[100]; 	// 100칸의 all이라는 정수 배열 생성.
		System.out.println(all);	// 배열 all의 주소값 출력
		
//		all[0]=1;					// 0번째 배열에 정수 1 입력
//		all[2]='a';					// 2번째 배열에 문자 'a' 입력
//		System.out.println(all[0]);	// 0번째 배열값 출력
//		System.out.println(all[1]); // 1번째 배열값 출력 (기본값 0)
//		System.out.println(all[2]); // 2번째 배열값 출력 ('a'의 숫자값 97)
//		System.out.println(all.length); // 배열 all의 크기(100) 출력
//	}
//	
//}
		for(int i=0;i<all.length;i++) {	// 배열 all에 0부터 99까지 차례로 입력
			all[i]=i;
			System.out.println(all[i]);
		}
		
		
	}
}
		

