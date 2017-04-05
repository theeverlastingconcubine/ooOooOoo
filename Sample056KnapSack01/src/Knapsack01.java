import java.util.Arrays;

public class Knapsack01 {
	
	public static void main(String[] args){
		
		
		int[] wt = {25,35,45,5,25,3,2,2};
		int[] vl = {350,400,450,20,70,8,5,5};
		
		int cap = 104;
		int[] result = new int[vl.length];
		
		System.out.println(best(result, wt,vl,cap));
		System.out.println(Arrays.toString(result));
		
				
	}
	
	private static int total(int [][] memo, int[] result, int[] wt, int[] val, int cap, int n){
		
		if (memo[n][cap] != -100) return memo[n][cap];
		int total;
		
		if (n==0 || cap==0) total = 0;
		else if (wt[n]>cap) {total = total(memo, result, wt,val,cap,n-1);result[n] = 0;}
		else {
			
			int total1 = total(memo, result, wt,val,cap,n-1);
			int total2 = total(memo, result, wt,val,cap-wt[n],n-1) + val[n]; 
			total = Math.max(total1, total2);
			if(total2>total1) result[n]=1;
			
		}
		memo[n][cap] = total;
		return total;
		
		
		
	}
	
	public static int best(int[] result, int[] wt, int[] val, int cap){
		int[][] memo = new int[val.length+1][cap+1];
		for(int i = 0; i<memo.length-1; i++){
			for(int j = 0; j<memo[0].length; j++){
				memo[i][j] = -100;
			}
		}
		return total(memo, result, wt,val,cap,wt.length-1);
	}
	
	

}
