
public class Peak {
	
	private static boolean less(Comparable[] a, int i, int j){
		if(i<0 || j<0 || j>=a.length || i>=a.length) return false;
		else return a[i].compareTo(a[j])<0;
	}
	
	private static Comparable peak(Comparable[] a, int lo, int hi){
						
		int mid = (lo+hi)/2;
		
		if (less(a,mid,mid-1)) return peak(a,lo,mid-1);
		else if (less(a,mid, mid+1)) return peak(a,mid+1,hi);
		else return a[mid];
	}
	
	public static Comparable peak(Comparable[] a){
		return peak(a,0,a.length-1);
	}
	
	
	
	
	public static void main(String[] args){
		
		Integer[] a = {100,4,3,2,1,2,3,4,5};
		Integer[] b = {1,2,3,4,5,6,5,4,3,2,1};
		
		System.out.println(peak(a));
		System.out.println(peak(b));
		
		
		
		
		
		
		
	}

}
