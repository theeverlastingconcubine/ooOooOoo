import java.util.ArrayList;

public class Fibonacci {
	
	private static int[] help = new int[300]; 
	
	private static int fib(int n){
		
		if(n<=1) return n;
		else return fib(n-1) + fib(n-2);
		
	}
	
	private static int fib1(int n){
			
		if (n<=1) help[n]= n;
		
		else help[n] = fib(n-1) + fib(n-2);
		
		return help[n];
	
		
	}
	
	
	
	public static void main(String[] args){
		
		Long a1 = System.currentTimeMillis();
		System.out.println(fib(40));
		
		System.out.println(System.currentTimeMillis() - a1);
		
		Long a2 = System.currentTimeMillis();
		System.out.println(fib1(40));
		
		System.out.println(System.currentTimeMillis() - a2);
		
		
		
	}

}
