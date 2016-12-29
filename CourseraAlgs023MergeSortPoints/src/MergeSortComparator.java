
public class MergeSortComparator {

	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
		
		assert isSorted(a, lo, mid);
		assert isSorted(a, mid+1, hi);
		
		for(int k = lo; k<=hi; k++){
			aux[k] = a[k];
		}
		
		int i = lo;
		int j = mid +1;
		
		for (int k = lo; k<=hi; k++){
			
		if(i>mid){a[k] = aux[j]; j++;}
		else if (j>hi) {a[k] = aux[i];i++;}
		else if (less(aux[i], aux[j])) {a[k] = aux[i]; i++;}
		else {a[k] = aux[j]; j++;}
		
		}
		
		assert isSorted(a, lo, hi);
	}

	public static void sort(Comparable[] a) {

		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);

	}

	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {

		if (hi <= lo)
			return;

		int mid = lo + (hi - lo) / 2;

		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
		merge(a, aux, lo, mid, hi);

	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;

	}

	private static boolean isSorted(Comparable[] a, int from, int to) {

		int k = 0;
		for (int i = from; i < to; i++) {
			if (less(a[i + 1], a[i])) {
				k++;
			}
		}

		if (k == 0)
			return true;
		else
			return false;

	}

}
