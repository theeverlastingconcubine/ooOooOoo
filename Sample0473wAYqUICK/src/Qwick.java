import java.util.Comparator;
import java.util.Random;

public class Qwick {
	
	private static int partition(Object[] a, Comparator c, int lo, int hi){
		
		int loi = lo+1;
		int hii = hi;
		
		Object pivot = a[lo];
		
		while(true){
			
			while(less(c,a[loi],pivot) && loi<hi) loi++;
			while(less(c,pivot,a[hii]) && hii>lo) hii--;
			if(hii<=loi) break;
			swap(a,loi,hii);
			
		}
		swap(a,lo,hii);
		return hii;
				
	}
	
	private static void sort(Object[] a, Comparator c, int lo, int hi){
		if(hi<=lo) return;
		int mid = partition(a,c,lo,hi);
		sort(a,c,lo,mid-1);
		sort(a,c,mid+1,hi);
		
	}
	
	public static void sort(Object[] a, Comparator c){
		shuffle(a);
		sort(a,c,0,a.length-1);
	}
	
	private static void shuffle(Object[] a){
		Random rnd = new Random();
		for(int i = 0; i<a.length; i++){
			int k = rnd.nextInt(i+1);
			swap(a, i, k);
		}
	}
	
	
	
	
	public static boolean isSorted(Object[] a, Comparator c){
		boolean is = true;
		for(int i = 1; i<a.length; i++){
			if(less(c,a[i],a[i-1])) {is = false; break;}
		}
		return is;
	}
	
	
	
	private static boolean less(Comparator c, Object i, Object j){
		return c.compare(i,j)<0;
	}
	
	private static void swap (Object[] a, int i, int j){
		Object t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

}
