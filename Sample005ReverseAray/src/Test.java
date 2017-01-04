import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		Integer[] a = {0,1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(a));
		reverseArray(a);
		System.out.println(Arrays.toString(a));

	}

	public static void reverseArray(Object[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			
			swap(a, i, a.length-1-i);
			
		}

	}

	public static void swap(Object[] a, int i, int j) {

		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

}
