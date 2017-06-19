package ice009qsort;

public class Merge {
	
	
	private static void merge(int[] a, int[] aux, int lo, int mid, int hi){
		
		int loi = lo;
		int hii = mid+1;
		int index = lo;
		
		for(int i = lo; i<=hi; i++){
			aux[i] = a[i];
		}
		
		
		while(index<=hi){
			
			if (loi>mid) {a[index] = aux[hii++];}
			else if (hii>hi) {a[index] = aux[loi++];}
			else if (aux[loi]<=aux[hii]) {a[index] = aux[loi++];}
			else {a[index] = aux[hii++];}
			index++;
			
		}
		
	}
	
	private static void sort(int[] a, int[] aux, int lo, int hi){
		
		if(hi<=lo) return;
		
		int mid = lo+(hi-lo)/2;
		
		sort(a,aux,lo,mid);
		
		sort(a,aux,mid+1,hi);
	
		merge(a,aux,lo,mid,hi);
		
	}
	
	
	public static void sort(int[] a){
		int[] aux = new int[a.length];
		sort(a,aux,0,a.length-1);
	}
	
	/*private static void print(int[] a, int lo, int hi){
		for (int i = lo; i<=hi; i++){
			System.out.print(a[i] + " ");
		}
	}*/
	
	
	
	
	
	
	public static boolean isSorted(int[] a){
		for(int i = 1; i<a.length; i++){
			if(a[i]<a[i-1]) return false;
			}
		return true;
	}
	

	

}
