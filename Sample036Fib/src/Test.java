
public class Test {
	
	public static void main(String[] args){
		
		
		long s1 = System.currentTimeMillis();
		System.out.println(FIb.fib(30));
		long s2 = System.currentTimeMillis();
		
		long a1 = System.currentTimeMillis();
		System.out.println(FIb.fib1(30));
		long a2 = System.currentTimeMillis();
		
//		System.out.println((s2-s1)/(a2-a1));
		
		System.out.println(FIb.fib2(3));
	}

}
