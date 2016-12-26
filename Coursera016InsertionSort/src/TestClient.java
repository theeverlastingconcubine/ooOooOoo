import java.util.Arrays;

public class TestClient {
	
	public static void main(String[] args){
		
		Integer[] array = {5,4,3,4,1,5,7,8,9,0,6,7,8,3,5};
		
		
		System.out.println(Arrays.toString(array));
		
		System.out.println();
		InsertionSort.sort(array);
		System.out.println(Arrays.toString(array));
		
		
		
		
		
	}

}
