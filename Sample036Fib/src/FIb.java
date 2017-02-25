import java.util.HashMap;

public class FIb {
	
	private static HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
	
	public static int fib(int n){
		
		if(n==1 || n==2) return 1;
		else return fib(n-1) + fib(n-2);
		
		
	}
	
	
	public static int fib1(int n){
		
		if(n==1 || n==2) return 1;
		
		else if (!memo.containsKey(n)) memo.put(n, fib(n-1) + fib(n-2));
		return memo.get(n);
		
		
	}
	
	public static int fib2(int n){
		if(n==1 || n==2) return 1;
		
		int f1 = 1; 
		int f2 = 2;
		for(int i=3; i<=n; i++){
			int f = f1 + f2;
			f1 = f2;
			f2 = f;			
		}
		return f1;
		
	}

}
