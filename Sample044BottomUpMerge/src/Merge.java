
public class Merge {
	
	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
		
	//	assert isSorted(a,lo,mid);
	//	assert isSorted(a, mid+1, hi);
		
		int loi = lo;
		int hii = mid+1;
				
		for(int k = lo; k<=hi; k++){
			aux[k] = a[k];
		}
		
		for(int i = lo; i<=hi; i++){
			
		if (loi>mid) 			      a[i] = aux[hii++];
		else if (hii>hi) 			  a[i] = aux[loi++];
		else if (less(aux, loi, hii)) a[i] = aux[loi++];
		else 						  a[i] = aux[hii++];
		
		}
		
	//	assert isSorted(a,lo,hi);
				
	}
	
	public static void bottomUp(Comparable[] a){
		int N = a.length;
		Comparable[] aux = new Comparable[N];
		
		for(int size = 1; size<N; size = size+size){
			for(int lo = 0; lo<N-size; lo = lo + size + size){
				merge(a, aux, lo, lo+size-1, Math.min(lo+size+size-1, N-1));
			}
		}
			
		
		
		
		
		
	}
	
	
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi){
		
		if(hi<=lo) return;
		
		int mid = (lo+hi)/2;
		
		sort(a, aux,lo,mid);
		sort(a,aux,mid+1,hi);
		merge(a,aux,lo,mid,hi);
		
	}
	
	public static void sort(Comparable[] a){
		Comparable[] aux = new Comparable[a.length];
		sort(a,aux,0,a.length-1);
		
	}
	
	public static boolean isSorted(Comparable[] a){
		return isSorted(a,0,a.length-1);
	}	
	
	private static boolean isSorted(Comparable[] a, int lo, int hi){
		boolean flag = true;
		for(int i = lo+1; i<=hi; i++){
			if(less(a,i,i-1)) {
				flag = false;
				break;
			}
		}
	return flag;
	}

	private static boolean less(Comparable[] a, int i, int j){
		return a[i].compareTo(a[j])<0;
	}
		
}
