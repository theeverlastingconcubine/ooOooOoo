
public class MergeSort {
	
	private static final int CUTOFF = 5;
	
	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
		//lo...mid
		//mid+1...hi  --  sorted
		
		
		int i = lo;
		int j = mid+1;
		
		
		for(int k = lo; k<=hi; k++){
			
			if(i>mid) {aux[k] = a[j]; j++;}
			else if(j>hi) {aux[k] = a[i]; i++;}
			else if(less(a,i,j)) {aux[k] = a[i]; i++;}
			else {aux[k] = a[j]; j++;}
		}
		
		for(int q = lo; q<=hi; q++){
			a[q] = aux[q];
		}
		
		
	}
	
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi){
		if(hi-lo<=CUTOFF-1){
			insertionSort(a, lo,hi);
			return;}
		
		
		int mid = lo + (hi-lo)/2;
		
		sort(a, aux, lo, mid);
		sort(a, aux, mid+1, hi);
		if(!less(a, mid+1, mid)) return;
		merge(a, aux, lo, mid, hi);
		
	}
	
	public static void sort(Comparable[] a){
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length-1);
	}
	
	
	private static void insertionSort(Comparable[] a, int lo, int hi){
		
		for(int i = lo; i<=hi; i++){
			for(int j = i; j>lo; j--){
				if(less(a, j, j-1)){swap(a,j,j-1);}
				else break;
			}
			
		}
		
		
		
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
