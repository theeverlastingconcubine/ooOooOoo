
public class Sort {
	
	public static void shell(Comparable[] a){
		
		int N = a.length;
		int h = 1;
		while(h<N/3) h = 3*h + 1;
		
		while(h>=1){
			
			for(int i = h; i<N; i++){
				for(int j = i; j>=h;j=j-h){
					if(less(a, j, j-h)) swap(a,j,j-h);
				}
			}
			h = h/3;
			
		}
		
		
		
	}
	
	
	public static void bubble(Comparable[] a){
		int k;
		
		do{	k = 0;
			for(int i=0; i<a.length-1; i++){
				
			
			if(less(a,i+1,i)) {swap(a, i,i+1); k=1;}
			}
		}
			while (k!=0);
		
		
	}
	
	
	public static void selection(Comparable[] a){
		
		for(int i = 0; i<a.length-1; i++){
			int min = i;
			for(int j = i+1; j<a.length; j++){
				if(less(a, j, min)) min = j;
				}
			swap(a, min, i);
		}
			
	}
	
	public static void insertion(Comparable[] a){
		
		for(int i = 1; i<a.length-1; i++){
			for (int j=i+1; j>0; j--){
				if(less(a, j, j-1)) swap(a,j,j-1);
			}
			
		}
	}
	
	
	
	
	
	private static void swap(Comparable[] a, int i, int j){
		
		Comparable tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	private static boolean less(Comparable[] a, int i, int j){
		return a[i].compareTo(a[j])<0;
	}
	
	public static boolean isSorted(Comparable[] a){
		for(int i=0; i<a.length-1; i++){
			if (less(a, i+1, i)) return false; 
		}
		return true;
	}

}
