
public class MergeSortBottomUp {

	private static Comparable[] aux;

	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

		assert isSorted(a, lo, mid);
		assert isSorted(a, mid + 1, hi);

		// copy into aux array
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}

		int i = lo;
		int j = mid + 1;

		for (int k = lo; k <= hi; k++) {

			if (i > mid) {
				a[k] = aux[j];
				j++;
			} else if (j > hi) {
				a[k] = aux[i];
				i++;
			} else if (less(aux[i], aux[j])) {
				a[k] = aux[i];
				i++;
			} else {
				a[k] = aux[j];
				j++;
			}

		}

		assert isSorted(a, lo, hi);

	}

	public static void sort(Comparable[] a) {

		int N = a.length;
		aux = new Comparable[N];

		for (int sz = 1; sz < N; sz = sz + sz) {
			for (int lo = 0; lo < N - sz; lo = sz + sz + lo) {
				merge(a, aux, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));

			}

		}

	}

	private static boolean less(Comparable a, Comparable b) {

		return a.compareTo(b) < 0;
	}

	private static boolean isSorted(Comparable[] a, int i, int j) {

		// if (j<i) throw new Error("input i<=j");

		for (int k = i + 1; k <= j; k++) {
			if (less(a[i], a[i - 1]))
				return false;
		}
		return true;

	}

}
