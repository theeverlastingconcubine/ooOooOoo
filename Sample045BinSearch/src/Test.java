import java.util.Arrays;
import java.util.Random;

public class Test {
	
	public static int binSearch(Comparable[] a, Comparable q){
		return binSearch(q,a,0,a.length-1);
	}
	
	private static int binSearch(Comparable q, Comparable[] a, int lo, int hi){
		
		if(lo<hi){
			int mid = (lo+hi)/2;
					
		if(a[mid].compareTo(q)<0) return binSearch(q,a, mid+1, hi);
		else if (a[mid].compareTo(q)>0) return binSearch(q,a,lo,mid-1);
		if (a[mid].equals(q)) return mid;
		else return -1;
		}
		
		else return -1;
		
	}
	
	public static void main(String[] args){
		Random rnd = new Random();
		
		Integer[] a = new Integer[rnd.nextInt(21)];
		for(int i = 0; i<a.length; i++){
			a[i] = rnd.nextInt(21);
		}
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		int a1 = rnd.nextInt(21);
		int a2 = rnd.nextInt(21);
		System.out.println(binSearch(a,a1) + " " + a1);
		System.out.println(binSearch(a,a2) + " " + a2);
		
		
		
		
	}

}
