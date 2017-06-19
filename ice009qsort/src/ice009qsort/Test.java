package ice009qsort;

import java.util.Arrays;
import java.util.Random;

public class Test {
	
	public static void main(String[] args){
		
		/*Random rnd = new Random();
		int n = rnd.nextInt(21);		
		int[] a = new int[n];
		for(int i = 0; i<n; i++){
			a[i] = 2*rnd.nextInt(21)-20;
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Qsort.isSorted(a));
		System.out.println();
		
		Qsort.sort(a);
		
		
		System.out.println(Arrays.toString(a));
		System.out.println(Qsort.isSorted(a));*/
		
		int k=0;
		while(k<=10000){
		Random rnd = new Random();
		int n = rnd.nextInt(21);		
		int[] a = new int[n];
		for(int i = 0; i<n; i++){
			a[i] = 2*rnd.nextInt(21)-20;
		}
		
		Merge.sort(a);
		if (!Merge.isSorted(a)) System.out.println(Arrays.toString(a));
		k++;
		
		
		}
		
		/*System.out.println(Arrays.toString(a));
		System.out.println(Merge.isSorted(a));
		System.out.println();
		
		Merge.sort(a);
		
		
		System.out.println(Arrays.toString(a));
		System.out.println(Merge.isSorted(a));*/
		
		
	
		
		
	}

}
