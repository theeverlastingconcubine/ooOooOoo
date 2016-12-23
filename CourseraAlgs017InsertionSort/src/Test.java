import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		Date[] dates = new Date[5];

		dates[0] = new Date(5, 12, 1812);
		dates[1] = new Date(31, 9, 1812);
		dates[2] = new Date(5, 3, 2016);
		dates[3] = new Date(26, 6, 1999);
		dates[4] = new Date(11, 7, 1700);

		System.out.println(Arrays.toString(dates));

		InsertionSort.sort(dates);

		System.out.println();
		System.out.println(Arrays.toString(dates));
		
		System.out.println();
		
		
		Integer[] arr = {1,5,3,8,5,9,0,2,4,6,8};
		
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println();

		InsertionSort.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		

	}

}
