import java.util.Arrays;
import java.util.Random;




public class QuickSort {
	
	private static int partition(Comparable[] a, int lo, int hi) {

		int i = lo + 1;
		int j = hi;

		while (true) {

			
			while (less(a[i], a[lo]) || a[i] == a[lo]) {
				if (i==hi) break;	
				i++;
					}

			while (less(a[lo], a[j])) {
				if (j == lo) break;
				j--;
				
				}
			
			if (i >= j) break;
			exchange(a, i, j);
						
		}

		exchange(a, lo, j);

		return j;

	}

	public static void sort(Comparable[] a) {

		shuffle(a);
		
		System.out.println("shuffled array");
		System.out.println(Arrays.toString(a));

		sort(a, 0, a.length - 1);

	}

	private static void sort(Comparable[] a, int lo, int hi) {

		if (hi <= lo)
			return;
		int j = partition(a, lo, hi);
		sort(a, lo, j - 1);
		sort(a, j + 1, hi);

	}

	private static boolean less(Comparable a, Comparable b) {

		return a.compareTo(b) < 0;
	}

	private static void exchange(Comparable[] a, int i, int j) {

		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;

	}

	private static void shuffle(Comparable[] a) {

		int N = a.length;
		Random rnd = new Random();
		for (int i = 0; i < N; i++) {
			exchange(a, i, rnd.nextInt(N));

		}

	}

}
