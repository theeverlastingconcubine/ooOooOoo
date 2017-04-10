import java.util.Arrays;

public class Test {
	
	
	public static void main(String[] args){
		
		int[] a = {5,22,5,79,4,2,66,9,33,6,99,3,45,8};
		System.out.println(Arrays.toString(a));
		delete(a,a.length-4);
		System.out.println(Arrays.toString(a));
		
		System.out.println(check(a));
		
		evenOdd(a);
		System.out.println(Arrays.toString(a));
		System.out.println(check(a));
		
		
		
		
		
	}
	
	public static boolean check(int[] a){
		
		int i=0;
		while(a[i]%2==0) i++;
		for(int j = i; j<a.length-1; j++){
			if(a[j]%2==0) return false;
		}
		return true;
		
	
	}

	
	public static void delete(int[] a, int k){
		for(int i = k; i<a.length-1; i++){
			a[i] = a[i+1]; 
		}
		a[a.length-1]=0;
		
	}
	
	public static void evenOdd(int[] a){
		
		int lo= 0, hi=a.length-1;
		
		while(true){
			while(a[lo]%2==0) lo++;
			while(a[hi]%2==1) hi--;
			if(hi>lo){
				int t=a[lo];
				a[lo] = a[hi];
				a[hi] = t;
				lo++;
				hi--;
				}
			else break;
		}
		
	}
}
