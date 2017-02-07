import java.util.Arrays;
import java.util.Random;

public class Test {
	
	public static void main(String[] args){
		
		Random rnd = new Random();
		int[] a = new int[15];
		
		for(int i = 0; i<a.length; i++){
			a[i] = rnd.nextInt(a.length/4);
		}
		
		System.out.println(Arrays.toString(a));
		
		//we know that all keys are from 0 to a.length/4-1
		//so we use this range to an array for counting appearances
		
		//compute cumulates then
		
		//
		
		int[] count = new int[a.length/4+1];
		
		for(int i=0; i<a.length; i++){
			
			count[a[i]+1]++; 
		}
		
		System.out.println(Arrays.toString(count));
		
		for(int i=1; i<count.length; i++){
			count[i] = count[i] + count[i-1];
		}
		
		System.out.println(Arrays.toString(count));
		
		int[] aux = new int[a.length];
		
		for(int i=0; i<aux.length; i++){
			
			aux[count[a[i]]] = a[i];
			count[a[i]]++;
							
		}
		System.out.println(Arrays.toString(count));
		
		for(int i=0; i<a.length; i++){
			a[i] = aux[i];
		}
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
	}
	
	
	
	


}
