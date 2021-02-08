package test.generic;

import java.util.*; // java.util 하위에 필요한 사항들 모두 사용 가능 [모두 로드하는 것은 아니다]

public class test {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>(); 	// ArrayList를 가져와, List 형태로 쓰겠다.
									// 즉, ArrayList가 가진 것들은 Shadow effect 하겠다.
		list.add("Hi");
		
		String []array=new String[10];
		array[0] ="Hi";
				
		int [] all = new int[10];
		all[0] = 1;
		
		System.out.println(list);
		
		
		
		
		List<Integer> list2=new ArrayList<Integer>();
		Integer o1 = new Integer(1);
		Integer o2 = new Integer(2);
		list2.add(o1);
		list2.add(o2);
		list2.add(1); // java1.5 이후부터 auto-boxing 을 통해 가능해짐
		int i = list2.get(1); // java1.5 이후부터 unboxing 을 통해 가능해짐
		// boxing, unboxing은 성능저하의 우려가 있으니 사용 지양
		
		System.out.println(i);
	
		
	}
}
