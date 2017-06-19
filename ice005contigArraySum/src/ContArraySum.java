import java.util.Arrays;
import java.util.Random;

public class ContArraySum {

	public static void main(String[] args) {

		// probably it's Kadane's alg

//		Random rnd = new Random();
//		int n = rnd.nextInt(11);
	//	int[] a = new int[n];
		int[] a = {-2,-3,4,-1,-2,1,5,-3};

	/*	for (int i = 0; i < n; i++) {

			a[i] = rnd.nextInt(11) - 2 * rnd.nextInt(11);

		}
*/
		System.out.println(Arrays.toString(a));

		int maxEndedHere = 0;
		int maxSoFar = 0;
		int firstIndex = 0;
		int lastIndex = 0;
		int[] otvet = new int[2];

		for (int i = 0; i < a.length; i++) {

			maxEndedHere = maxEndedHere + a[i];
			lastIndex = i;

			if (maxEndedHere < 0) {
				maxEndedHere = 0;
				firstIndex = i+1;
				lastIndex = i+1;
			}

			if (maxSoFar < maxEndedHere) {
				maxSoFar = maxEndedHere;
				otvet[0] = firstIndex;
				otvet[1] = lastIndex;
				
			}
			
			for(int j = firstIndex; j<=lastIndex; j++){
				System.out.print(a[j] + " ");
				}
			System.out.print("  ||  " + maxEndedHere + "     " + maxSoFar);
			
			System.out.println();

		}

		/*System.out.println(maxSoFar);
		for (int i = otvet[0]; i <= otvet[1]; i++) {
			System.out.print(a[i] + " ");
		}*/

	}

}
