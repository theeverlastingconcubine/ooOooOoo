import java.util.LinkedList;

public class Ones {
	
	// k=x%2 - last number.append
	// x=(x-k)/2 - next number.append
	
	public static String toBinary(int n){
		StringBuilder s = new StringBuilder();
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while(n!=0){
			int k = n%2;
			stack.push(k);
			n = (n-k)/2;
		}
		
		while(!stack.isEmpty()){
			s.append(stack.pop());
		}
		
		return s.toString();
		
	}
	
	
	
	public static int ones(int n){
		int count = 0;
		
		while(n!=0){
			count = count + Math.abs(n&1);
			int t = n&1;
			n=n>>1;
			System.out.println("count: " + count + " n: " + toBinary(n) + " n&1: " + t);
			
		}
		
		return count;
		
		
	}

	public static void main(String[] args){
		
		int n = 64;
		System.out.println(n);
		System.out.println(toBinary(n));
		System.out.println(ones(n));
		
		System.out.println(toBinary(n&1));
		
		
	}
}
