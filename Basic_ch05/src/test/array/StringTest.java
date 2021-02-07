package test.array;

public class StringTest {

	public static void main(String[] args) {
		String []all=new String[5];	// 크기 5인 String 배열 all 생성
		System.out.println(all);	// 배열 주소값 출력
		System.out.println(all[0]);	// 0번째 배열값 출력 (기본값 null)
		
		String s1=new String("Java");//s1에 "java" 입력
		all[0]=s1;				// 0번째 배열에 s1값 입력
		
		all[1]=new String("Java"); // 1번째 배열에 "java" 직접 입력
		
		all[2]="Java"; // 2번째 배열에 더 짧게 "java" 직접 입력
		
		all[3]="Java"; // 3번째 배열에 더 짧게 "java" 직접 입력
		
		for(int i=0;i<all.length;i++) {	// 배열 all 차례로 모두 출력
			System.out.println(all[i]);
		}
			
		System.out.println(all[2]==all[3]);
	
		
	}

}


