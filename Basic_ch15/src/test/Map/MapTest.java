package test.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class MapTest {
	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "1");
		map.put("d", new MapTest());
		map.put("a", "2");	// Key의 중복으로 value값이 2로 대체
	
		System.out.println(map);
		System.out.println(map.size());
		Object o1=map.get("a");
		Object o2=map.get("b");
		System.out.println(o1==o2);
		
		Enumeration enu = map.keys(); // 열거형 인터페이스 enu=["a", "b", "c", "d"]
		
		while(enu.hasMoreElements()) {
			Object o = enu.nextElement();
			System.out.println(o+": "+map.get(o)); 
		}
	}

}
