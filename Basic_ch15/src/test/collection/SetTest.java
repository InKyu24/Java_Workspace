package test.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("a");
		set.add("b");
		set.add("c");
		set.add(new SetTest());
		set.remove("c");
	//	set.add(new SetTest());
		
		System.out.println(set);
		System.out.println(set.size());
		
		Iterator ite=set.iterator(); // <String> 왜 써? "전체 객체 대상을 한번식 반복해서 가져오는 반복자 메소드
		System.out.println(ite);
		while(ite.hasNext()) { // hasNext() 가져올 객체가 있으면 true, 없으면 false
			Object o=ite.next();
			System.out.println(o);
		}  
	}
}
