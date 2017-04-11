import java.util.Arrays;
import java.util.Random;

public class Test {
	
	public static void main(String[] args){
		
		
		for(int s = 0; s<=1000000; s++){
			
		
		Random rnd = new Random();
			Integer[] a = new Integer[rnd.nextInt(1000)];
		for(int i=0; i<a.length; i++){
			a[i]= rnd.nextInt(4);
		}
		zerosAndOnes(a);
		if(!checkZerosAndOnes(a)) System.out.println("WRONG");
		}
		
	/*	System.out.println(Arrays.toString(a));
		System.out.println(checkZerosAndOnes(a));
		zerosAndOnes(a);
		System.out.println(checkZerosAndOnes(a));
		System.out.println(Arrays.toString(a));*/
		
		
	}
	
	public static boolean checkZerosAndOnes(Integer[] a){
		
		int lo = 0;
		int hi = a.length-1;
		
		while(lo<a.length && a[lo]==0) lo++;
		while(hi>=0 && a[hi]==1) hi--;
		for(int i = lo; i<=hi; i++){
			if(a[i]==0 || a[i]==1) return false;
		}
		
		return true;
		
	}
	
	
	public static void zerosAndOnes(Integer[] a){
		
		int lo=0;
		int hi=a.length-1;
		int i=0;
		
		while(i<=hi){
			
			if(a[i]==0) swap(a,i++,lo++);
			else if(a[i]==1) swap(a,i,hi--);
			else i++;
		}
		
		
		
	}
	
	private static void swap(Integer[] a, int i, int j){
		Integer tmp= a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	

}
