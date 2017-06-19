package ice006OneTwoThreeStepsDP;

public class Test {
	
	public static void main(String[] args){
		
		System.out.println(countWays(37));
		System.out.println(Integer.MIN_VALUE);
		
	}
	
//	public static int countWays(int n){
//		
//		if (n<0) return 0;	
//		else if (n==0) return 1;
//		else return countWays(n-1)+countWays(n-2)+countWays(n-3);
//		
//	}
	
	public static int countWays(int n){
		int[] memo = new int[n+1];
		for(int i = 0; i<memo.length; i++) memo[i] = -1;
		return countWays(n,memo);
	}
	
	private static int countWays(int n, int[] memo){
		
		if(n<0) return 0;
		else if(n==0) return 1;
		else {
			if(memo[n]>-1) return memo[n];
			else memo[n] = countWays(n-1,memo) + countWays(n-2, memo) + countWays(n-3, memo);
			}
		return memo[n];
	}

}
