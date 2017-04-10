import java.util.Arrays;
import java.util.Random;

public class Test {
	
	public static void main(String[] args){
		
		
		
		int[] counter = new int[21]; 
		for(int i = 0; i<1000000; i++){
			counter[rnd(11,20)]++;
		}
		
		System.out.println(Arrays.toString(counter));
	}

	
	public static int rnd(int lo, int hi){
		Random rnd = new Random();
		int num = hi-lo+1, result;
		
		do{
			result = 0;
			for(int i = 0; (1<<i)<num; i++){
				result = (result<<1) | rnd.nextInt(2);
			}
			
			
		} while(result >= num);
			
					
		
		
		return result + lo;
		
	}
}
