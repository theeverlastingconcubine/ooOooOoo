import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args){
		
		/*Integer[] a = {5,7,3,2,4,6,8,8,4,2,4,5,6,7,8,9};
		System.out.println(Arrays.toString(a));
		
		Merge.sort(a);
		
		System.out.println(Arrays.toString(a));*/
		
		Random rnd = new Random();
		
		Integer[] b = new Integer[rnd.nextInt(50)];
		for(int i = 0; i<b.length; i++){
			b[i] = rnd.nextInt(50);
		}
		
		System.out.println(Arrays.toString(b));
		Merge.sort(b);
		System.out.println(Arrays.toString(b));
		System.out.println("Sorted? " + Merge.isSorted(b));
		
		
	}
	
	
	
}
