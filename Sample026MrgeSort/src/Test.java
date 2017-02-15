import java.util.Arrays;
import java.util.Random;

public class Test {
	
	
	public static void main(String[] args){
		
		Random rnd = new Random();
		Integer[] a = new Integer[rnd.nextInt(25)];
		
		for(int i = 0; i<a.length; i++){
			a[i] = rnd.nextInt(100);
		}
		
		Integer[] b = new Integer[rnd.nextInt(14)];
		
		for(int i = 0; i<b.length; i++){
			b[i] = rnd.nextInt(100);
		}
		
		
		
		System.out.println(Arrays.toString(a));
		System.out.println(isSorted(a));
		MergeSort.sort(a);
		System.out.println(isSorted(a));
		System.out.println(Arrays.toString(a));
		
		
		
		
		System.out.println(Arrays.toString(b));
		System.out.println(isSorted(b));
		selSort(b);
		System.out.println(isSorted(b));
		System.out.println(Arrays.toString(b));
		
		
		
		
	}
	
	
	private static void selSort(Comparable[] a){
		
		for(int i = 0; i<a.length-1; i++){
			int k = i;
			for (int j=i+1; j<a.length; j++){
				if(less(a, j, k)) {k = j;}
			}
			swap(a,k,i);
		}
		
		
		
		
	}
	
	private static void inSort(Comparable[] a){
		
		for(int i = 1; i<a.length; i++){
			int j = i;
			while(j>0 && less(a,j,j-1)){
				swap(a,j,j-1);
				j--;
			}
		}
		
		
		
	}
	
	private static void swap(Comparable[] a, int i, int j){
		Comparable tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	private static boolean less(Comparable[] a, int i, int j){
		return a[i].compareTo(a[j]) <0;
	}
	
	public static boolean isSorted(Comparable[] a){
		
		for(int i=1; i<a.length; i++){
			if(less(a,i,i-1)) return false;
		}
		return true;
	}

}
