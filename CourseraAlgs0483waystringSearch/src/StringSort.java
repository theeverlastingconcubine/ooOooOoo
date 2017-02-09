
public class StringSort {
	
	public static void sort(String[] a){
		
		sort(a, 0, a.length-1, 0);
	}
	
	
	
	
	
	private static void sort(String[]a, int lo, int hi, int d){
		
		if (hi<=lo) return;
		
		int loi = lo; 
		int hii = hi;
		int v = charAt(a[lo], d);
		int i = lo+1;
		
		while(i<=hii){
		
		int t = charAt(a[i],d);
		if (t<v) {swap(a, loi, i); loi++;i++;}		
		else if (t<v) {swap(a, hii, i); hii--;}
		else i++;
		}
		
		sort(a,lo, loi-1, d);
		if(v>=0)sort(a, loi, hii, d+1);
		sort(a,hii+1, hi, d);
		
		
	}
	
	private static int charAt(String s, int d){
		
		if(d<0) throw new IllegalArgumentException();
		
		if(d<s.length()-1) return s.charAt(d);
		else return -1;
		
	}
	
	private static void swap(String[] a, int i, int j){
		String tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	

}
