import java.util.Arrays;
import java.util.Random;

public class Test {
	
	public static void main(String[] args){
		Random rnd = new Random();
		
		for(int j = 0; j<1000000; j++){
			boolean flag = true;
		
			Integer[] a = new Integer[rnd.nextInt(21)];
		for(int i = 0; i<a.length; i++){
			a[i] = rnd.nextInt(21);
		}
		
//		Merge.sort(a);
		Merge.bottomUp(a);
//		System.out.println(Arrays.toString(a));
		if(!Merge.isSorted(a)) {
			System.out.println("Error " + Arrays.toString(a));
			break;
		}
		
		
		}
	}
	
	

}
