import java.util.Arrays;


//abandoned, not used at all

public class InContext {
	
	private String[] suffix;
	
	public InContext(String text){
				
		int N = text.length();
		suffix = new String[N];
		
		for(int i = 0; i<N; i++){
			suffix[i] = text.substring(i);
		}
		Arrays.sort(suffix);
					
	}
	
	public String[] suffixArray(){
		return suffix;
	}
	
	private boolean isSorted(Comparable[] a){
		for(int i = 1; i<a.length; i++){
			if(a[i].compareTo(a[i-1])<0) {
				return false;
				}
		}
		return true;
	}
	
	public int binSearch(Comparable[] a, Comparable x){
		assert isSorted(a);
		
		int lo = 0; 
		int hi = a.length-1;
		 
		while(lo<=hi){	
			
			int mid = (hi+lo)/2;
		
			if(x.compareTo(a[mid])<0) hi = mid-1;
			else if (x.compareTo(a[mid])>0) lo = mid+1;
			else return mid;
					
		}
		
		return -1;
	}	
	
	

}
