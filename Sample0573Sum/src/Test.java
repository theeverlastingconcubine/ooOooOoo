import java.util.HashSet;

public class Test {
	
	public static void main(String[] args){
		
		int[] a = {-1, 1,-1,2,3};
		
		System.out.println(hasZeroSum(a));
		
		
	}
	
	
	private static boolean hasZeroSum(int[] a){
		
		for(int i = 0; i<a.length; i++){
			if(helper2Sum(a,-a[i], i)) return true;
		
	}
		return false;
	}
	
	
	private static boolean helper2Sum(int[] a, int target, int except){
		assert(except<a.length);
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<except; i++){
			if(set.contains(target-a[i])) return true;
			else set.add(a[i]);
		}
		
		for(int i=except+1; i<a.length; i++){
			if(set.contains(target-a[i])) return true;
			else set.add(a[i]);
		}
		
		return false;
				
	}

}
