import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		
		
		//this does not work!!!!!

		// we want to shift all zeroes to the left
		// we want to shift all ones to the right
	//	Integer[] a = { 0, 1, 2, 3, 1, 15, 4, 5, 6, 15, 1, 0, 6, 1, 0, 4, 18, 5, 1, 7, 0, 1, 0, 0, 1, 0 };
		Integer[] a = { 0,1,2,1,0};
		
		int lo = 0;
		int hi = a.length-1;
		
		System.out.println(Arrays.toString(a));
				
		
		for (int i = 1; i<a.length; i++){
			
			if(a[i]==0){
				
				while(a[lo]==0 && lo<=i) lo++;
				swap(a,i,lo);
							
			}
			
			else if(a[i]==1){
				while(a[hi]==1 && hi>=i) hi--;
				swap(a,i--,hi);
											
			}
			
			System.out.println(Arrays.toString(a));
			
						
		}
		
		
		
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
	}
	
	
	private static void swap(Object[] a, int i, int j){
		Object t = a[i];
		a[i] = a[j];
		a[j]= t;
	}
}
