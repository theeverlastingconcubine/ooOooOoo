import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(a));
		rotate(a, 3);
		System.out.println(Arrays.toString(a));

	}

	public static void rotate(int[] a, int k) {

		if (k > a.length)
			k = k % a.length;

		int[] b = new int[a.length];

		for (int i = 0; i < k; i++) {
			b[i] = a[a.length - k + i];
		}

		int j = 0;
		for (int i = k; i < a.length; i++) {
			b[i] = a[j];
			j++;
		}
		System.arraycopy(b, 0, a, 0, a.length);

	}

}
