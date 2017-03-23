
public class Quick3Sort {
	
	public static void sort(StringLike[] a){
		sort(a,0,a.length-1,0);
	}
	
	private static void sort(StringLike[] a, int lo, int hi, int d){
		
		if(hi<=lo) return;
		int lt=lo;
		int gt=hi;
		int v=charAt(a[lo],d);
		
		int i=lo+1;
		
		while(i<=gt){
			
			int t=charAt(a[i],d);
			
			if (t<v) swap(a,lt++,i++);
			else if(t>v)swap(a,i,gt--);
			else i++;
					
		}
		
		sort(a,lo,lt-1,d);
		if(v>=0) sort(a,lt,gt,d+1); //we don't sort if there is no chars in the end
		sort(a,gt+1,hi,d);
			
		
	}
	
	private static int charAt(StringLike stringlike, int i){
		int n=stringlike.length();
		if(i>=n) return -1;
		return stringlike.charAt(i);
	}
	
	private static void swap(StringLike[] a, int i, int j){
		StringLike t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
		
	
	
	
	

}
