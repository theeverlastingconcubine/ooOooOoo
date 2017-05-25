import java.util.Arrays;
import java.util.Random;

public class RangeSearch {
	
	public static void main(String[] args){
		
		
		
		
		
		
		
		
	/*	int[] a = {0,1,2,3,4,5,6,6,6,6,6,6,6,6,6,6,6,6,7,7,7,7,8,9,10};
		
		System.out.println(Merge.isSorted(a));*/
		
		Random rnd = new Random();
		int[] b = new int[rnd.nextInt(20)];
		
		for(int i = 0; i<b.length; i++){
			b[i] = rnd.nextInt(20);
		}
		System.out.println(Arrays.toString(b));
		System.out.println(Merge.isSorted(b));
		Merge.sort(b);
		System.out.println(Arrays.toString(b));
		System.out.println(Merge.isSorted(b));
		
		/*System.out.println(Arrays.toString(a));
		System.out.println(searchBeginning(a,3));
		System.out.println(searchBeginning(a,6));
		System.out.println(searchBeginning(a,7));
		System.out.println(searchBeginning(a,10));
		System.out.println(a.length-1);*/
		
	}
	
	
	public static int searchBeginning(int[] a, int k){
		
	int result = -1;
	int lo = 0;
	int hi = a.length-1;
	
	while(lo<=hi){
		int mid = lo + (hi-lo)/2;
		if(a[mid]>k) hi = mid-1;
		else if(a[mid]<k) lo = mid+1;
		else{
			result = mid;
			hi = mid-1;
		}
	}
	return result;
	
	}

}
