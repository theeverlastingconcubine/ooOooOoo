import java.util.Arrays;

public class Range {
	
	public enum search {END, ANY, START};
	
	private static int binSearch(int[] a, int k, search search){
		int number = -1;
		int lo = 0;
		int hi = a.length-1;
		
		while(lo<=hi){
			int mid = lo + (hi-lo)/2;
			if(a[mid]>k) hi = mid-1;
			else if (a[mid]<k) lo = mid+1;
			else {
				
				if(search==search.START) {number = mid; hi=mid-1;}
				else if (search==search.END) {number = mid; lo = mid+1;}
				else {number=mid;}
			
			}
		}
		
		return number;
	}
	
		
	public static void main(String[] args){
		
		
		int[] a = {0,1,4,6,9,9,9,9,9,9,9,9,9,9,9,12};
		System.out.println(Arrays.toString(a));
		
		int count = 0;
		for(int i = 0; i<a.length; i++){
			if (a[i]==9) count++;
		}
		
		System.out.println("linear count " + count);
		
		int start = binSearch(a,9,search.START);
		int end = binSearch(a,9,search.END);
		int result = end-start+1;
		System.out.println(start + "     " + end + "  result: " + result);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	public static int rangeLength(int[] a, int k){
	//	assert isSorted(a);
		
	int lo = 0;
	int hi = a.length-1;
	
	int start = -1;
	int end = -1;
	
	while(lo<=hi){
		int mid = lo + (hi-lo)/2;
		if(a[mid]>k) hi = mid-1;
		else if (a[mid]<k) lo = mid+1;
		else {start = mid; hi=mid-1;}
	}
	
	lo = 0;
	hi = a.length-1;
	
	while(lo<=hi){
		int mid = lo + (hi-lo)/2;
		if(a[mid]>k) hi = mid-1;
		else if (a[mid]<k) lo = mid+1;
		else {end = mid; lo=mid+1;}
	}
	
	System.out.println("start: "+ start);
	System.out.println("end: " + end);
	
	return end-start+1;
	
	
	
	}*/
}
