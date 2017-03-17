import java.util.Arrays;

public class Test {
	
	public static void main(String[] args){
		int[] wt = {5,7,9,12};
		int[] val = {6,5,7,3};
		int W = 20;
		int n = 4;
		
		System.out.println(Arrays.toString(wt));
		System.out.println(Arrays.toString(val));
		System.out.println(W);
		System.out.println(KnapSack.knapSack(W, wt, val, n));
		
	}

}
