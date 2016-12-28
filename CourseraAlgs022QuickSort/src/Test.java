import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args){
		
		Integer[] array = {234,435,1,3556,8753,8,234,45,6,76,3,656, 8,8,34,1,8,8,-55,-555};
					
		System.out.println(Arrays.toString(array));
		System.out.println(array.length + " iss tthe length of an array");
		
		System.out.println();
		
		QuickSort.sort(array);
		
		System.out.println();
		
		System.out.println(Arrays.toString(array));
		
		System.out.println();
		
/*		Random rando = new Random();
		ArrayList<Integer> test = new ArrayList<Integer>();
		
		for (int i = 0; i<rando.nextInt(40); i++){
			test.add(rando.nextInt(40));
		}
		
		Integer[] tesst = new Integer[test.size()];
		tesst = test.toArray(tesst);
		
		System.out.println(Arrays.toString(tesst));
		System.out.println(tesst.length);
		
		QuickSort.sort(tesst);
		System.out.println();
		System.out.println(Arrays.toString(tesst));
*/		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
