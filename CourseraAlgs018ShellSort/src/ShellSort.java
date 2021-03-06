
public class ShellSort {

	public static void sort(Comparable[] a) {

		int N = a.length;

		int h = 1;

		// increment sequence for h-sorting

		while (h < N / 3) {
			h = 3 * h + 1;
		}

		while (h >= 1) {
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && less(a[j], a[j - h]); j=j-h) 
				{
					swap(a, j, j - h);

				}

			}
			
			h=h/3;

		}

	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;

	}

	private static void swap(Comparable[] a, int i, int j) {

		Comparable sw = a[i];
		a[i] = a[j];
		a[j] = sw;

	}

}
