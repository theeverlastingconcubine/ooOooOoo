import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		// we want to shift all zeroes to the left
		// we want to shift all ones to the right
		int[] a = { 0, 1, 2, 3, 1, 15, 4, 5, 6, 15, 1, 0, 6, 1, 0, 4, 18, 5, 1, 7, 0, 1, 0, 0, 1, 0 };
		
	

		int count = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] != 0) {
				swap(a, i, count);
				count++;
			}

		}

		System.out.println(count + "  " + a[count] + "  " + a[count-1] + "   " + Arrays.toString(a));

		for (int i = count; i > -1; i--) {

			if (a[i] != 1) {
				swap(a, i, count);
				count--;
			}

		}

		System.out.println(count + "  " + a[count] + "  " + a[count+1] + "   " + Arrays.toString(a));

	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
