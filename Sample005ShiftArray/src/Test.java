import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		Integer[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(a));
		shift(a, 2);
		System.out.println(Arrays.toString(a));
	}

	private static void shift(Integer[] a, int k) {

		int N = a.length;
		Integer[] temp = Arrays.copyOf(a, N);

		for (int i = 0; i < a.length; i++) {

			a[i] = temp[k % a.length];
			k++;
		}

	}

}
