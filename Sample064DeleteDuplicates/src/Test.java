import java.util.Arrays;
import java.util.HashSet;

public class Test {
	
	
	public static void main(String[] args){
		
		int[] a = {2,3,5,5,7,11,11,11,13};
		int[] b = {2,3,5,5,7,11,11,11,13};
		
		System.out.println(Arrays.toString(a));
		deleteDuplicates1(a);
		System.out.println(Arrays.toString(a));
		
		
		System.out.println(Arrays.toString(b));
		deleteDuplicates2(b);
		System.out.println(Arrays.toString(b));
				
	}
	
	
	
	
	
	public static void deleteDuplicates1(int[] a){
		
		//O(n) space + one pass to set zeros + one pass to move zeros
	
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<a.length; i++){
			
			if (set.contains(a[i])) a[i]=0;
			else set.add(a[i]);
			}
		
		//then we move all zeros to the right
		//1 2 4 0 4 0 4 6 0
	/*	int lo=0;
		
		while(true){
		
			while(lo<a.length && a[lo]!=0) lo++;
			int next=lo+1;
			while(next<a.length && a[next]==0) next++;
			
			if(next>a.length-1 ||lo>a.length-1) break;
			swap(a,lo,next);
					
			
		}*/
		int count = a.length-1;
		for(int i = a.length-1; i>=0; i--){
			if(a[i]!=0){
				swap(a,i,count);
				count--;
				
			}
		}
		
		
	}
	
	public static void deleteDuplicates2(int[] a){
		Arrays.sort(a);
		
		int index = 1;
		for(int i = 1; i<a.length; i++){
			
			if(a[i]!=a[index-1]) {a[index]=a[i]; index++;}
		}
		
	}
	
	
	private static void swap(int[] a, int i, int j){
		int tmp = a[i];
		a[i]=a[j];
		a[j] = tmp;
	}
	
	
	

}
