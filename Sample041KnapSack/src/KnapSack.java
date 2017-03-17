
public class KnapSack {
	
	//0-1 knapsack
	
	public static int knapSack(int W, int[] wt, int val[], int n){
		
		
		assert(val.length==wt.length);
		
		if(n==0) return 0;
		
		if(wt[n-1]>W) return knapSack(W,wt,val,n-1);
		else return Math.max(val[n-1] + knapSack(W-wt[n-1], wt,val,n-1), knapSack(W,wt,val,n-1));
		
		
		
		
		
	}
	
	

}
