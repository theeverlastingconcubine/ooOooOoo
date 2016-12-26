import java.util.Random;

public class Shuffle {

	public static void shuffle(Object[] a){

		Random random = new Random();
		
		int N = a.length;
		for (int i=0; i<N; i++){
			int r = random.nextInt(i+1);
			swap(a, i, r);
		}
		
		
		
	}
	
	private static void swap(Object[] a, int i, int j){
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	
	
}
