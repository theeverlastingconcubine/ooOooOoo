
public class Search {
	
	public static String[] suffixArray(String s){
		String[] suffix = new String[s.length()];
		
		for (int i=0; i<s.length(); i++) suffix[i] = s.substring(i, s.length()-1);
			
		return suffix;
	}
	
	public static void sort(String[] a){
		sort(a, 0, a.length-1, 0);
	}
	
	
	
	
	private static void sort(String[] a, int lo, int hi, int d){
		if(hi<=lo) return;
		
		int hii = hi;
		int loi = lo;
		int v = charAt(a[lo],d);

		int i = lo+1;
		
		while(i<=hii){
			
			int t = charAt(a[i], d);
			if(t<v) {swap(a, loi, i); i++; loi++;}
			else if(t>v) {swap(a, hii, i); hii--;}
			else i++;		
			
		}
		
		sort(a,lo,loi-1,d);
		if(v>=0) sort(a, loi,hii, d+1);
		sort(a,hii+1,hi,d);
						
	}
	
	
	
	public static int lcp(String s1, String s2)
	
		
	
	
	
	
	
	public static int search(String[] a, String s){
		
		int sl = s.length();
		
		int lo = 0;
		int hi = a.length-1;
		
		while(lo<=hi){
			int k = lo + (hi-lo)/2;
			
			if(comp(a[k],s)>0) lo = k+1;
			else if(comp(a[k],s)<0) hi = k-1; 
			else return k;
			
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	private static int charAt(String s, int i){
		if(i<s.length()-1) return s.charAt(i);
		else return -1;
	}
	
	private static void swap(String[] a, int i, int j){
		String tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
		
	}
	
	
	
	

}
