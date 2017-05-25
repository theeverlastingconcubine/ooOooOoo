import java.util.Arrays;

public class SOrtedMerge {
	
	
	public static void main(String[] args){
		
		/*int[] a = {1,2,3,4,5,7,2};
		System.out.println(isSorted(a));
		Arrays.sort(a);
		System.out.println(isSorted(a));*/
		
		int[] b = {-3,20,-4,60,-8,30,-20,5,8,3,2,6};
		int[] a = new int[b.length + 20];
		for(int i = 0; i<10; i++){
			a[i] = i;
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		
		merge(a,b);
		
		System.out.println(Arrays.toString(a));
		System.out.println(isSorted(a));
		
		
		
	}
	
	
public static void merge(int[] a, int[] b){
	
	
	
	
	int index = 10 + b.length-1;
	int ia = 10-1;
	int ib = b.length-1;
	
	while(ib>=0){
		
		if(ia>=0 && a[ia]>b[ib]) {a[index] = a[ia--];}
		else {a[index] = b[ib--];}
		
		index--;
		
				
		
	}
	
	
	
	
	
}
	
public static boolean isSorted(int[] a){
	
	for(int i = 0; i<a.length-1; i++){
		if(a[i+1]<a[i]) return false;
	}
	return true;
}

}
