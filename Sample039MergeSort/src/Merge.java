
public class Merge {
	
	private static final int CUTOFF=5;
	
	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
		
	/*	assert isSorted(a, lo, mid);
		assert isSorted(a, mid+1, hi);*/
		
		for(int i=lo; i<=hi; i++ ){
			aux[i] = a[i];
		}
		
		int left = lo;
		int right = mid + 1;
		int k = lo;
		
		while(k<=hi){
		if(left>mid) for(int i = right; i<=hi; i++) {a[k] = aux[i]; k++;}
		else if(right>hi) for(int i = left; i<=mid; i++) {a[k] = aux[i]; k++;}
		else if(less(aux, left, right)){a[k] = aux[left]; left++; k++;}
		else {a[k] = aux[right]; right++; k++;}
		}
		/*assert isSorted(a, lo, hi);*/
		
			
	}
	
	private static void insertionSort(Comparable[] a, int lo, int hi){
		System.out.println("insertion");
		
		for(int i = lo; i<=hi; i++){
			for(int j = i; j>lo; j--){
				if(!less(a,j,j-1)) break;
				swap(a,j,j-1);
			}
		}
		
		
	}
	
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi){
		if(hi<=lo+CUTOFF) {insertionSort(a, lo, hi); return;}
		int mid = lo + (hi-lo)/2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid+1, hi);
		merge(a, aux, lo, mid, hi);
		
		
			
	}
	
	public static boolean isSorted(Comparable[] a){
		return isSorted(a, 0, a.length-1);
	}
	
	public static void sort(Comparable[] a){
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length-1);
	}
	
	
	
	private static boolean isSorted(Comparable[] a, int lo, int hi){
		
		for(int i = lo; i<hi; i++){
			if(a[i+1].compareTo(a[i])<0) return false;
		}
		
		return true;
	}
	
	
	private static boolean less(Comparable[] a, int i, int j){
		return a[i].compareTo(a[j])<0;
	}
	
	private static void swap(Comparable[] a, int i, int j){
		Comparable tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

}
