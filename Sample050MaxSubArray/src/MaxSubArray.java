import java.util.Arrays;
import java.util.Random;

public class MaxSubArray {
	
		
	public static void main(String[] args){
		
		Random rnd = new Random();
		int[] a = new int[rnd.nextInt(10)];
		for(int i=0; i<a.length; i++){
			a[i] = rnd.nextInt(20) - 10;
		}
		
		System.out.println(Arrays.toString(a));
		
		
		int lo=0;
		int hi=0;
		int max = Integer.MIN_VALUE;
		int currentMax = 0;
		
		for (int i = 0; i<a.length; i++){
			currentMax = currentMax + a[i];
			if (max < currentMax) {max = currentMax;}
			if (currentMax<0) {currentMax = 0;}
						
		}
		System.out.println(max + "    " + lo + "   " + hi);
			
	}
	
	

}
