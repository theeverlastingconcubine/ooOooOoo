
public class Quick {
	
	
	
	
	
	
	
	
	
	public static boolean isSorted(Comparable[] a){
		boolean flag = true;
		for(int i = 1; i<a.length; i++){
			if(less(a, i,i-1)) flag = false;
		}
		return flag;
	}
	
	private static void swap(Comparable[] a, int i, int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	private static boolean less(Comparable[] a, int i, int j){
		return a[i].compareTo(a[j])<0;
	}

}
