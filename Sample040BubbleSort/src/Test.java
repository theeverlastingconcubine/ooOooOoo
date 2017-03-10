import java.util.Arrays;

public class Test {
	
	private static void swap (Comparable[] a, int i, int j){
		Comparable tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
		
	}
	
	private static boolean less(Comparable[] a, int i, int j){
		return a[i].compareTo(a[j])<0;
	}
	
	public static void main(String[] args){
		
		Integer[] a = {};
	/*	Integer[] a = {1,6,88,4,55,8,33,5,7,9,3,6,8,9,345,3};*/
		int N = a.length;
		int count = 0;
		
		System.out.println(Arrays.toString(a));
		
		for(int t = 1; t<=N-1; t++){
			boolean flag = false;
		for (int i = 0; i<N-t; i++){
			
			if(less(a, i+1,i)) {
				swap(a,i+1,i);
				count++;
				flag = true;}
			}
		if (flag==false) break;
			}
		
		System.out.println(count + Arrays.toString(a));
		}
	
	
	
		
		
	}


