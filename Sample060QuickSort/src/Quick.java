import java.util.Arrays;
import java.util.Random;

public class Quick {
	
	
	
	public static void threeWaySort(Comparable[] a){
	//	shuffle(a);
		threeWaySort(a,0,a.length-1);
	}
	
	
	
	private static void threeWaySort(Comparable[] a, int lo, int hi){
		
		if(hi<=lo) return;
		
		int lt = lo;
		int gt = hi;
		int i = lo;
		
		//!!attention!! a[lo] will change, so we must fix it from the beginning!!
		Comparable pivot = a[lo];
		int cmp;
			
		while(i<=gt){
			
			
			cmp = a[i].compareTo(pivot);
			
			if(cmp<0) swap(a,i++,lt++);
			else if(cmp>0) swap(a,i,gt--);
			else i++;
			
			
		}
		
		threeWaySort(a,lo,lt-1);
		threeWaySort(a,gt+1,hi);
		
	}
	
	
	private static int partition(Comparable[] a, int lo, int hi){
		
		int hii = hi;
		int loi = lo;
		
		while(true){
			
			while(!less(a,lo,loi)) {loi++; if(loi==hi) break;}
			while(less(a,lo,hii)) {hii--; if(hii==lo) break;}
			
			if(hii<=loi) break;
			
			swap(a,loi,hii);
						
		}
		swap(a, lo, hii);
		return hii;
		
		
		
		
	}
	
	public static void sort(Comparable[] a){
		shuffle(a);
		sort(a,0,a.length-1);
	}
	
	
	private static void sort(Comparable[] a, int lo, int hi){
		
		if(hi<=lo) return;
		int mid = partition(a,lo,hi);
		sort(a,lo,mid-1);
		sort(a,mid+1,hi);
	}
	
	private static void shuffle(Comparable[] a){
		Random rnd = new Random();
		for(int i = 0; i<a.length; i++){
			swap(a,i,rnd.nextInt(i+1));
		}
	}
	
	
	private static boolean less(Comparable[] a, int i, int j){
		return a[i].compareTo(a[j])<0;
	}
	
	private static void swap(Comparable[] a, int i, int j){
		Comparable tmp =a[i];
		a[i]=a[j];
		a[j] =tmp;
	}
	
	public static boolean isSorted(Comparable[] a){
		for(int i=0; i<a.length-1; i++){
			if(less(a, i+1,i)) return false;
		}
		return true;
	}
	

}
