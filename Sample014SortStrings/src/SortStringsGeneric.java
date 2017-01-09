import java.util.Comparator;
import java.util.Random;

public class SortStringsGeneric {

	// lo is the pivot here

	private static int partition(Comparable[] a, int lo, int hi) {

		int i = lo + 1;
		int j = hi;

		while (true) {

			while (less(a[i], a[lo]) || a[lo] == a[i]) {

				if (i == hi)
					break;
				i++;
			}

			while (less(a[lo], a[j])) {
				if (j == lo)
					break;
				j--;
			}

			if (j <= i)
				break;
			swap(a, i, j);
		}

		swap(a, lo, j);
		return j;

	}
	
	public static void quickSort(Comparable[] a){
		
				
		shuffle(a);
		
		quickSort(a,0,a.length-1);
		
		
	}
	
	
	
	
	
	private static void quickSort(Comparable[] a, int lo, int hi){
		
		if(hi<=lo) return;
		int j = partition(a,lo,hi);
		quickSort(a, lo, j-1);
		quickSort(a, j+1, hi);
	
	}
	

	private static void swap(Comparable[] a, int i, int j) {

		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	private static void shuffle(Comparable[] a) {
		
		int N = a.length;
		Random rnd = new Random();

		for (int i = 0; i < N; i++) {
			swap(a, i, rnd.nextInt(N));

		}

	}
	
	//mess with comparators
	/////////////////
	// lo is the pivot here

	private static int partition(Comparator comparator, Object[] a, int lo, int hi) {

		int i = lo + 1;
		int j = hi;

		while (true) {

			while (less(comparator, a[i], a[lo]) || a[lo] == a[i]) {

				if (i == hi)
					break;
				i++;
			}

			while (less(comparator, a[lo], a[j])) {
				if (j == lo)
					break;
				j--;
			}

			if (j <= i)
				break;
			swap(a, i, j);
		}

		swap(a, lo, j);
		return j;

	}
	
	public static void quickSort(Object[] a, Comparator comparator){
		
				
		shuffle(a);
		
		quickSort(comparator, a,0,a.length-1);
		
		
	}
	
	
	
	private static void quickSort(Comparator comparator, Object[] a, int lo, int hi){
		
		if(hi<=lo) return;
		int j = partition(comparator, a,lo,hi);
		quickSort(comparator, a, lo, j-1);
		quickSort(comparator, a, j+1, hi);
	
	}
	

	private static void swap(Object[] a, int i, int j) {

		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private static boolean less(Comparator comparator, Object a, Object b) {
		return comparator.compare(a,b) < 0;
	}

	private static void shuffle(Object[] a) {
		
		int N = a.length;
		Random rnd = new Random();
		for (int i = 0; i < N; i++) {
			swap(a, i, rnd.nextInt(N));
		}

	}

}
