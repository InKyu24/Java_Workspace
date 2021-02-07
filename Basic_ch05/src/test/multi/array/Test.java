package test.multi.array;

public class Test {

	public static void main(String[] args) {
		int all[][]=new int[3][2];
		System.out.println(all);	// 전체 배열의 주소값
		System.out.println(all[0]);	//
		System.out.println(all[1]);	//
		System.out.println(all[2]);	// 두 칸의 배열인 N번째 배열 주소값
		
		all[0][0]=100;
		all[0][1]=200;
		all[1][0]=300;
		all[1][1]=400;
		all[2][0]=500;
		all[2][1]=600;			// 다차원배열 칸마다 데이터 입력
		
		System.out.println(all.length);	// 전체 다차원 배열의 크기 3
		System.out.println(all[0].length); // 0번째 배열의 크기 2
		
		int a[][]=new int[3][]; // 일차원 배열의 크기만 정하는 이차원 배열
		System.out.println(a[0]); // 크기가 정해지지 않은 배열이기에 주소값 null
		a[0]=new int[4];	// a[0]에 4칸의 배열 설정
		System.out.println(a[0]); // 크기가 정해진 후 주소값
		a[1]=new int[1];	// a[1]에 1칸의 배열 설정
		
		//a처럼 가변적인 배열 설정도 가능하다.
		
		char [][]all2= {{'a','b'},{'c','d','e'}};	// char[2][] 배열 생성 및 데이터 입력
		System.out.println(all2.length);
		System.out.println(all2[0][0]);
		System.out.println(all2[0][1]);
		System.out.println(all2[1][0]);
		System.out.println(all2[1][1]);
		System.out.println(all2[1][2]);
	}

}


