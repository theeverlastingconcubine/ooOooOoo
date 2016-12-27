
//this version of MergeSort sorts subarray from lo to hi
//for the whole array specify lo = 0; hi = array.length-1

public class MergeSort {

	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

		// precondition: both parts are sorted

		assert isSorted(a, lo, mid);
		assert isSorted(a, mid + 1, hi);

		// copy to aux array

		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}

		int i = lo; // left part index
		int j = mid + 1; // right part index
		for (int k = lo; k <= hi; k++) {

			// if we are done with first part - just copy the second part
			if (i > mid) {
				a[k] = aux[j];
				j++;
				// if there are no elements left in the second part - just copy
				// the first part
			} else if (j > hi) {
				a[k] = aux[i];
				i++;
				// if element in the left part is less, take it (and increment
				// index)
			} else if (less(aux[j], aux[i])) {
				a[k] = aux[j];
				j++;
				// otherwise take the element from the right
			} else {
				a[k] = aux[i];
				i++;
			}

		}

		assert isSorted(a, lo, hi);

	}

	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {

		if (hi <= lo) {
			return;
		}
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
		merge(a, aux, lo, mid, hi);

	}

	public static void sort(Comparable[] a) {

		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);

	}

	private static boolean isSorted(Comparable[] a, int i1, int i2) {

		for (int i = i1 + 1; i <= i2; i++) {
			if (less(a[i], a[i - 1])) {
				return false;
			}
		}
		return true;
	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	private static void swap(Comparable[] a, int i, int j) {
		Comparable q = a[i];
		a[i] = a[j];
		a[j] = q;

	}

}
