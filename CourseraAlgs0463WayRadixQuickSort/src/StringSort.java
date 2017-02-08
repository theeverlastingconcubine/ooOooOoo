
public class StringSort {
	
	public static void sort(String[] a) {
		
		sort(a, 0, a.length-1, 0);
		
	}

	private static void sort(String[] a, int lo, int hi, int d) {
		
		if(hi<=lo) return;
		
		int lt = lo; 
		int gt = hi;
		
		int v = charAt(a[lo], d);
		int i = lo + 1;
		
		while(i <= gt){
			
			int t = charAt(a[i], d);
			
			if (t < v)  {swap(a, lt, i); lt++; i++;}
			else if(t > v) {swap(a, i, gt); gt--;}
			else i++;
		}
		
		sort(a, lo, lt-1, d);
		if(v>=0) sort(a, lt, gt, d+1);
		sort(a, gt+1, hi, d);
		
		

	}

	private static int charAt(String s, int i) {
		
		
		if (i < 0) throw new IllegalArgumentException();
		
		
		if (i < s.length())	return s.charAt(i);
		else return -1;
	}
	
	private static void swap(String[] a, int i, int j){
		String tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

}
