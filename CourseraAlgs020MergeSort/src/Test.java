import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		Integer[] array = { 6, 3, 22, 54, 6, 9976, 547, 2342, 7890, 0, 43, 56, -100000, 3 };

		System.out.println(Arrays.toString(array));
		System.out.println();
		MergeSort.sort(array);
		System.out.println(Arrays.toString(array));

	}

}
