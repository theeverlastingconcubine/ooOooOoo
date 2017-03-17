import java.util.Comparator;

public class Qwick {
	
	private static int partition(Object[] a, Comparator c, int lo, int hi){
		
		int loi = lo+1;
		int hii = hi;
		
		int i = lo+1; 
		Object pivot = a[lo];
		
		while(true){
			
			while(less(c,a[loi],pivot)) loi++;
			while(less(c,pivot,a[hii])) hii--;
			swap(a,i,)
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	private static boolean less(Comparator c, Object i, Object j){
		return c.compare(i,j)<0;
	}
	
	private void swap (Object[] a, int i, int j){
		Object t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

}
