
public class Test {
	
	private static int minCost(int[][] a, int m, int n){
		
		if(n<0 || m<0) return Integer.MAX_VALUE;
		else if(m==0 && n==0) return a[m][n];
		else 
			return a[m][n] + Math.min(Math.min(minCost(a, m-1, n-1), minCost(a, m-1,n)),minCost(a,m,n-1));
		
		
	}

	public static void main(String[] args){
	
		int[][] cost = {{1,2,3},
						{4,8,2}, 
						{1,5,3}};
		
		System.out.println(minCost(cost,2,2));
		
	}
	
	
	
	
}
