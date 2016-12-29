import java.util.Comparator;

public class MergeSortComparator {

	private static void merge(Object[] a, Object[] aux, Comparator comparator, int lo, int mid, int hi){
		
		assert isSorted(a, comparator, lo, mid);
		assert isSorted(a, comparator, mid+1, hi);
		
		for(int k = lo; k<=hi; k++){
			aux[k] = a[k];
		}
		
		int i = lo;
		int j = mid +1;
		
		for (int k = lo; k<=hi; k++){
			
		if(i>mid){a[k] = aux[j]; j++;}
		else if (j>hi) {a[k] = aux[i];i++;}
		else if (less(comparator, aux[i], aux[j])) {a[k] = aux[i]; i++;}
		else {a[k] = aux[j]; j++;}
		
		}
		
		assert isSorted(a, comparator, lo, hi);
	}

	public static void sort(Object[] a, Comparator comparator) {

		Object[] aux = new Object[a.length];
		sort(a, aux, comparator, 0, a.length - 1);

	}
	
	

	private static void sort(Object[] a, Object[] aux, Comparator comparator, int lo, int hi) {

		if (hi <= lo)
			return;

		int mid = lo + (hi - lo) / 2;

		sort(a, aux, comparator, lo, mid);
		sort(a, aux, comparator, mid + 1, hi);
		merge(a, aux, comparator, lo, mid, hi);

	}

	private static boolean less(Comparator c, Object a, Object b) {
		return c.compare(a,b) < 0;

	}

	private static boolean isSorted(Object[] a, Comparator comparator, int from, int to) {

		int k = 0;
		for (int i = from; i < to; i++) {
			if (less(comparator, a[i + 1], a[i])) {
				k++;
			}
		}

		if (k == 0)
			return true;
		else
			return false;

	}

}
