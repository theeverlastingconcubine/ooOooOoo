import java.util.Comparator;
import java.util.Random;

public class SortStringsGeneric {

	static final Comparator<Comparable> comapratorForComparable = new Comparator<Comparable>() {
		@Override
		public int compare (final Comparable a, final Comparable b) {
			return a.compareTo(b);
		}
	};

	public static void quickSort (final Comparable[] a) {
		quickSort(a, comapratorForComparable);
	}

	// mess with comparators
	/////////////////
	// lo is the pivot here

	private static int partition (final Comparator comparator, final Object[] a, final int lo, final int hi) {

		int i = lo + 1;
		int j = hi;

		while (true) {

			while (less(comparator, a[i], a[lo]) || a[lo] == a[i]) {

				if (i == hi) {
					break;
				}
				i++;
			}

			while (less(comparator, a[lo], a[j])) {
				if (j == lo) {
					break;
				}
				j--;
			}

			if (j <= i) {
				break;
			}
			swap(a, i, j);
		}

		swap(a, lo, j);
		return j;

	}

	public static void quickSort (final Object[] a, final Comparator comparator) {

		shuffle(a);

		quickSort(comparator, a, 0, a.length - 1);

	}

	private static void quickSort (final Comparator comparator, final Object[] a, final int lo, final int hi) {

		if (hi <= lo) {
			return;
		}
		final int j = partition(comparator, a, lo, hi);
		quickSort(comparator, a, lo, j - 1);
		quickSort(comparator, a, j + 1, hi);

	}

	private static void swap (final Object[] a, final int i, final int j) {

		final Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private static boolean less (final Comparator comparator, final Object a, final Object b) {
		return comparator.compare(a, b) < 0;
	}

	private static void shuffle (final Object[] a) {

		final int N = a.length;
		final Random rnd = new Random();
		for (int i = 0; i < N; i++) {
			swap(a, i, rnd.nextInt(N));
		}

	}

}
