package a.b;

public class Hello {
    public static void main(String[] args) { 
    	String data="삼";	
		try {
	        int value = Integer.parseInt(data); // NumberFormatException 발생
			System.out.println(value);	        
        }catch (NumberFormatException e) {
            System.out.println("숫자로 변환 불가");	        
        }finally {
            System.out.println("다시 시도하세요");
        }
	}					
}