import java.util.Arrays;

public class Test {
	
	public static void main(String[] args){
		
		
		Integer[] a = {7,5,4,35,3,8,9,22,4,4,4,5,7,9,3,5,8,0,-500,4};
		Integer[] b = {7,5,4,35,3,8,9,22,4,4,4,5,7,9,3,5,8,0,-500,4};
			
		System.out.println(SortAndSearch.isSorted(a));
		SortAndSearch.insertionSort(a);
		System.out.println(Arrays.toString(a));
		for (int i=0; i<a.length; i++){
			System.out.print("[" + a[i] + " " + i +"]");	
		
		}
		
		
		System.out.println();
		System.out.println(SortAndSearch.isSorted(a));
		
		System.out.println(SortAndSearch.binarySearch(4, a));
		
		
		
		/*System.out.println(SortAndSearch.isSorted(b));
		//SortAndSearch.insertionSort(b);
		
		
		System.out.println(Arrays.toString(b));
		for (int i=0; i<b.length; i++){
			System.out.print("[" + b[i] + " " + i +"]");	
		
		}
			
		System.out.println();
		System.out.println(SortAndSearch.isSorted(b));
		
		System.out.println(SortAndSearch.binarySearch(4, b));*/
		
		
		
	}

}
