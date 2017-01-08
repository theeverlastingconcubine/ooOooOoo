
public class SortAndSearch {

	public static void insertionSort(Comparable[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (less(a[j], a[j - 1]))
					swap(a, j, j - 1);
			}
		}

	}

	public static int binarySearch(Comparable whee, Comparable[] a) {

		return binarySearch(whee, a, 0, a.length - 1);

	}

	private static int binarySearch(Comparable whee, Comparable[] a, int i1, int i2) {
		
		assert isSorted(a);
		int middle = (i2 + i1) / 2;
		
		if (whee.compareTo(a[middle]) == 0)
			return middle;
		else if (whee.compareTo(a[middle]) < 0)
			return binarySearch(whee, a, 0, middle-1);
		else
			return binarySearch(whee, a, middle+1, a.length - 1);
	}

	public static boolean isSorted(Comparable[] a) {
		for (int i = 0; i < a.length - 1; i++)
			if (less(a[i + 1], a[i]))
				return false;
		return true;
	}

	private static void swap(Comparable[] a, int i, int j) {

		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

}
