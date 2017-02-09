
public class StringSort {
	
	
	public static void sort(String[] s){
		sort(s,0, s.length -1, 0);
	}
	
	
	private static void sort(String[] a, int lo, int hi, int d){
		
		if(lo<=hi) return;
		
		int loi = lo;
		int hii = hi;
		int v = charAt(a[lo],d);
		int i = lo+1;
		
		while(i<=hi){
			
			int t = charAt(a[i],d);
			
			if (t < v) swap(a, loi++, i++);
			else if(t>v) swap(a, i, hii--);
			else i++;
						
		}
		
		sort(a, lo, loi-1, d);
		if(v>=0) sort(a, loi, hii, d+1);
		sort(a, hii+1, hi, d);
		
		
		
		
	}
	
	
	
	private static int charAt(String s, int d){
		if(d<s.length()) return s.charAt(d);
		else return -1;
	}
	
	private static void swap(String[] a, int i, int j){
		String tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	
	

}
