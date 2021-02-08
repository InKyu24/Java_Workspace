package test.collection;

import java.util.ArrayList; // ArrayList 가져오기

public class ListTest_Generic {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); // List에 String만 들어오도록
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");

	
		System.out.println(list);
		System.out.println(list.size()); // list 내 원소 개수 확인
		System.out.println(list.get(0)); // 첫번째 원소 출력
		
		for(String s:list) {			// 향상된 for문을 사용할 수 있어짐
			System.out.println(s);
			
		}
	}

}
