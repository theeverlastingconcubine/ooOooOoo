import java.util.Comparator;
import java.util.Random;

public class Quick3Sort {
	
	
	private static int partition(Object[] a, Comparator comparator, int lo, int hi){
		
		int i = lo+1;
		int j = hi;
		
		while(true){
			
			while(less(comparator, a[i], a[lo])){
				if(i>=hi) break;
				i++;
			}
			
			while (less(comparator, a[lo],a[j])){
				if(j<=lo) break;
				j--;
			}
			
			if(j<=i) break;
			exchange(a,i,j);
			
		}
		
		exchange(a,lo,j);
		return j;
			
	}
	
	public static void sort(Object[] a, Comparator comparator){
		
		shuffle(a);
		sort(a, comparator, 0, a.length-1);
		
	}
	
	private static void sort(Object[] a, Comparator comparator, int lo, int hi){
		
		if (hi<=lo) return;
		int j = partition(a, comparator, lo, hi);
		sort(a, comparator, 0, j-1);
		sort(a, comparator, j+1, hi);
		
		
	}
	
		
	
	private static boolean less(Comparator c, Object v, Object w) {

		return c.compare(v, w) < 0;
	}

	private static void exchange(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;

	}
	
	private static void shuffle(Object[] a){
		
		Random rnd = new Random();
		for(int i=0; i<a.length; i++)
			exchange(a, i, rnd.nextInt(a.length));
	}
}
