
public class Merge {
	
	public static boolean isSorted(int[] a){
		for(int i = 1; i<a.length; i++){
			if(a[i]<a[i-1]) return false;
		}
		return true;
	}
	
	private static void merge(int[] a, int[] aux, int lo, int mid, int hi){
		
		int index = lo;
		int i1 = lo;
		int i2 = mid+1;
		
		for(int i = lo; i<=hi; i++){
			aux[i] = a[i];
		}
				
		while(index<=hi){
			
			if(i1>mid) {a[index] = aux[i2]; i2++;}
			else if(i2>hi) {a[index] = aux[i1]; i1++;}
			else if(aux[i1]>aux[i2]) {a[index] = aux[i2]; i2++;}
			else {a[index] = aux[i1]; i1++;}
			
			index++;
		}
				
	}
	
	public static void mergeSort(int[] a, int[] aux, int lo, int hi){
		
		if(hi<=lo) return;
		
		int mid = lo+(hi-lo)/2;
		
		mergeSort(a,aux,lo,mid);
		mergeSort(a,aux,mid+1,hi);
		merge(a,aux,lo,mid,hi);
		
	}
	
	public static void sort(int[] a){
		int[] aux = new int[a.length];
		mergeSort(a,aux,0,a.length-1);
	}

}
