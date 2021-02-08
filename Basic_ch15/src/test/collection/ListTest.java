package test.collection;

import java.util.ArrayList; // ArrayList 가져오기

public class ListTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.add("첫번째");
		list.add(new ListTest());
		System.out.println(list);
		System.out.println(list.size()); // list 내 원소 개수 확인
		System.out.println(list.get(0)); // 첫번째 원소 출력
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		// String 원소만 출력
		for(int i=0;i<list.size();i++) {
			Object o=list.get(i);
			if (o instanceof String) {
			String s=(String) o;
			System.out.println(s);
			}
		}
	}

}
