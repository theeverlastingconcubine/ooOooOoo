
public class MSD {
	
	private static final int R = 256;
	private static final int CUTOFF = 2;
	
	
	public static void sort(String[] a){
		String[] aux = new String[a.length];
		sort(a, aux, 0, a.length - 1, 0);
	}
	
	
	
	private static void sort(String[] a, String[] aux, int lo, int hi, int d){
		
		if(hi<=lo + CUTOFF) {
			insertionSort(a, lo, hi, d);
			
			
			return;
		}
		
		int[] count = new int[R+2];
		
		for (int i = lo; i<=hi; i++){
			count[charAt(a[i], d)+2]++;
			}
		
		for (int r = 0; r<count.length - 1; r++){
			count[r+1] = count[r+1] + count[r];
		}
		
		for(int i = 0; i<a.length; i++){
			aux[count[charAt(a[i], d)+1]++] = a[i];
		}
		
		for(int i = 0; i<a.length; i++){
			a[i] = aux[i];
		}
		
		for(int r = 0; r<R; r++){
			sort(a, aux, lo + count[r], lo + count[r+1]-1, d+1);
		}
		
		
	}
	
	private static void insertionSort(String[] a, int lo, int hi, int d){
		
		for(int i = lo+1; i<=hi; i++){
			for(int j = i-1; j>=lo; j--){
				if(charAt(a[i],d)<charAt(a[j],d)) swap(a, i, j);
				else break;
				
			}
		}
		
	}
	
	private static void swap(String[] a, int i, int j){
		String tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	
	
	
	
	private static int charAt(String s, int i){
		
		if(i>s.length()-1) return -1;
		else return s.charAt(i);
		
	}

}
