package ice009qsort;

import java.util.Random;

public class Qsort {
	
	private static int partition(int[] a, int lo, int hi){
		
		int key = a[lo];
		int loi = lo+1;
		int hii = hi;
		
		while(true){
		
		while(loi<hi && a[loi]<=key) {loi++;}
		while(hii>lo && a[hii]>key) {hii--;}
		
		if(hii<=loi) break;
		swap(a, loi, hii);
		
		}
		swap(a,lo,hii);
		return hii;
		
	}
	
	
	private static void sort(int[] a, int lo, int hi){
		
		if(hi<=lo) return;
		
		int part = partition(a,lo,hi);
		
		sort(a,lo,part-1);
		sort(a,part+1,hi);
		
		
	}
	
	public static void sort(int[] a){
		shuffle(a);
		sort(a, 0, a.length-1);
	}
	
	public static void shuffle(int[] a){
		Random rnd = new Random();
		for(int i = 0; i<a.length; i++){
			swap(a,i,rnd.nextInt(i+1));
		}
	}
	
	private static void swap(int[] a, int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static boolean isSorted(int[] a){
		for(int i = 1; i<a.length; i++){
			if(a[i]<a[i-1]) return false;
			}
		return true;
	}

}
