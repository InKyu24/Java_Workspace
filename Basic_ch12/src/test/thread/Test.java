package test.thread;

public class Test {
	public static void main(String[] args) {
		A obj1 = new A();
		A obj2 = new A();
		
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj2);
		
	//	obj1.run();
	//	obj2.run();
		
		obj1.start();
		obj2.start();
	}
}

class A extends Thread {  // Thread 상속
	public void run () {
		for(int i=0;i<200;i++) {
			System.out.println(i+"+1="+(i+1));
		}
	}
}
