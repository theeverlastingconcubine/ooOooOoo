
public class HeapSort {
	
	//sorts from 1...N
	//0 element is untouched
	
	public static void sort(Comparable[] a){
		int N = a.length-1;
		
		for(int i = N/2; i>=1; i--){
			sink(a,N,i);
		}
		
		while(N>1){
			swap(a,1,N);
			N--;
			sink(a,N,1);
			
		}
		
		
	}
	
	private static void swap(Comparable[] a, int i, int j){
		Comparable tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
		
	}
	
	private static boolean less(Comparable[] a, int i, int j){
		return a[i].compareTo(a[j])<0;
	}
	
	private static void swim(Comparable[] a, int N, int k){
		
		while(k>1 && less(a, k/2, k)){
			swap(a, k, k/2);
			k = k/2;
		}
		
	}
	
	private static void sink(Comparable[] a, int N, int k){
		
		while(2*k<=N){
			int j = 2*k;
			if(j<N && less(a,j,j+1)) j++;
			if(!less(a,k,j)) break;
			swap(a, k,j);
			k=j;
		}
		
	}
	
	

}
