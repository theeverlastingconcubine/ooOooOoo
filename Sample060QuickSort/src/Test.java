import java.util.Arrays;
import java.util.Random;

public class Test {
	
	public static void main(String[] args){
		
		
		
		Random rnd= new Random();
		
		
		for(int k =0; k<10000; k++){
			
		Integer[] a = new Integer[rnd.nextInt(10000)];
		for(int i=0; i<a.length; i++){
			a[i] = rnd.nextInt(51);
		}
	
		Quick.threeWaySort(a);
		if(!Quick.isSorted(a)) System.out.println(Arrays.toString(a));
		}
		
	/*	Integer[] b = {5,3,3};
		
		System.out.println(Arrays.toString(b));
		System.out.println();
		Quick.threeWaySort(b);
		
		System.out.println();
		System.out.println(Arrays.toString(b));	
		System.out.println(Quick.isSorted(b));*/
		
		
		
	
		
	}

}
