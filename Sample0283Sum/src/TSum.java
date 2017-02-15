import java.util.Arrays;

public class TSum {
	
	public static void main(String[] args){
		
		int[] a = {1,2};
		System.out.println(Arrays.toString(a) + " " + a.length);
		System.out.println(bSearch(a, 10));
		
		int[] b = {1,6,33,25,78,-27,543,22,577,90,5,10,50,335,-400,79,49,9,1457,75,-43,50};
		//2-sum 100
		//3-sum 100
		
	
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		int N = b.length;
		
		
		for(int i = 0; i<N; i++){
			int k = bSearch(b,100-b[i]);
			if(k!=-1) System.out.println("["+b[i]+" "+" "+b[k] + "]");
		}
		
		for(int i = 0; i<N; i++){
			for(int j = i+1; j<N; j++){
			int k = bSearch(b,100-b[i]-b[j]);
			if(k!=-1) System.out.println("["+b[i]+" "+b[j]+" "+b[k] + "]");}
		}
		
	}
	
	
	
	public static int bSearch(int[] a, int k){
		return bSearch(a,k,0,a.length-1);
	}
	
	private static int bSearch(int[] a, int k, int lo, int hi){
		
		if(lo>hi) return -1;
		
		int mid = lo + (hi-lo)/2;
		
		if(k<a[mid]) return bSearch(a,k,lo,mid-1);
		else if(k>a[mid]) return bSearch(a,k,mid+1,hi);
		else return mid;
		
		
	}
	
	

}
