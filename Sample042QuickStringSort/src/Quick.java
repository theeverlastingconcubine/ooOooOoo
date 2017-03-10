
public class Quick {
	
	private static void swap(String[] a, int i, int j){
		String tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	private static int charAt(String s, int i){
		if(i<s.length()) return s.charAt(i);
		return -1;
	}
	
	public static void sort(String[] a){
		sort(a,0,a.length-1,0);
	}
	
	private static void sort(String[] a, int lo, int hi, int d){
		
		if(hi<=lo) return;
		
		int loi = lo;
		int hii = hi;
		
		int pivot = charAt(a[lo],d);
		
		int i = lo+1;
		
		while(i<=hii){
			int t = charAt(a[i], d);
			if(t<pivot) {swap(a, loi,i); i++;loi++;}
			else if(t>pivot){swap(a,i,hii);hii--;}
			else i++;
					
		}
		
		sort(a,lo, loi-1,d);
		if (pivot>=0) sort(a,loi, hii, d+1);
		sort(a, hii+1, hi,d);
		
	}

}
