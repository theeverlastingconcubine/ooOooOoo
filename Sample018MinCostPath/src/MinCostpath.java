
public class MinCostpath {
	
	private static int[][] help = new int[10][10];
	
	private static int minCost(int[][] a, int m, int n){
		 
		if (m==0 && n==0) help[m][n] = a[0][0];
		else if (m == 0) help[m][n] = a[m][n] * a[m][n-1];
		else if (n == 0) help[m][n] = a[m][n] * a[m-1][n];
		else help[m][n] = a[m][n] * Math.min(Math.min(minCost(a, m-1, n-1), minCost(a, m-1,n)), minCost(a,m,n-1));
		 
		return help[m][n];
		
	}
		
	public static void main(String[] args){
		
		int[][] cost = {{1,2,3},
						{4,8,2}, 
						{1,5,3}};
		
		System.out.println(minCost(cost,2,2));
		
		
		
	}

}
