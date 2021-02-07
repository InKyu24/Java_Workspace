package test.stmt;

public class ContinueTest {

	public static void main(String[] args) {
		int i=0;
		for( ;i<10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("i="+i);
	}

}

