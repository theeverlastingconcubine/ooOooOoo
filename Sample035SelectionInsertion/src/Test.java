import java.util.Arrays;
import java.util.Random;

public class Test {
	
	public static void main(String[] args){
		Random rnd = new Random();
		
		Integer[] a = new Integer[20];
		Integer[] b = new Integer[20];
		Integer[] c = new Integer[20];
		
		for(int i = 0; i<20; i++){
			a[i] = rnd.nextInt(20);
			b[i] = rnd.nextInt(20);
			c[i] = rnd.nextInt(20);
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Sort.isSorted(a));
		Sort.shell(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Sort.isSorted(a));
		
	}

}
