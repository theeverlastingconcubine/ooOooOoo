public class Quick {

	private static int partition(Comparable[] a, int lo, int hi) {

		int loi = lo + 1;
		int hii = hi;

		while (true) {

			while(less(a, loi, lo)) {loi++; if(loi==hi) break;}
			while(less(a, lo, hii)) {hii--;if(hii==lo) break;}
			if (hii<=loi) break;
			swap(a, loi, hii);
			
		}
		swap(a, lo, hii);
		return hii;

	}

	private static void sort(Comparable[] a, int lo, int hi){
		
		if(hi<=lo) return;
		int k = partition(a, lo, hi);
		sort(a, lo, k-1);
		sort(a,k+1,hi);
		
	}

	public static void sort(Comparable[] a) {
		sort(a, 0, a.length-1);
	}

	private static void swap(Comparable[] a, int i, int j) {
		Comparable tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;

	}

	private static boolean less(Comparable[] a, int i, int j) {
		return a[i].compareTo(a[j]) < 0;
	}

}
