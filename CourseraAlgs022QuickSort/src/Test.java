import java.util.Arrays;

public class Test {

	public static void main(String[] args){
		
		Integer[] array = {234,435,1,3556,8753,8,234,45,6,76,3,656, 8,8,34,1,8,8,-55,-555};
		
		System.out.println(Arrays.toString(array));
		System.out.println(array.length + " is the length of an array");
		
		System.out.println();
		
		QuickSort.sort(array);
		
		System.out.println();
		
		System.out.println(Arrays.toString(array));
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
