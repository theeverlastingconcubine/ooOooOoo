import java.util.Arrays;
import java.util.Random;

public class Test {
	
	public static void main(String[] args){
		
		
		Random rnd = new Random();
		Integer[] a = new Integer[rnd.nextInt(20)];
		
		for(int i = 0; i<a.length; i++){
			a[i] = rnd.nextInt(20);
		}
		
		System.out.println(Arrays.toString(a));
		HeapSort.sort(a);
		System.out.println(Arrays.toString(a));
		
	}

}
