package test2.operator;

public class Calculator {
	
	int sum;

	public void add(int a, int b) {		// add method 정의.
		System.out.println(a+b);
	}
	
	public void mod(int a, int b) {		// mod method 정의.
		System.out.println(a%b);
	}
	
	public void sum(int a) {			// sum method 정의.
		sum+=a;							// sum=sum+a; 와 같은 의미
		//		sum=sum-a		==		sum-=a
		//		sum=sum*a		==		sum*=a
		//		sum=sum/a		==		sum/=a
		//		sum=sum%a		==		sum%=a
		System.out.println(sum);
		

		
		
	}
}
