import java.util.Arrays;

public class Test {
	
	public static void main(String[] args){
		
		String[] array = {"Is","this","a","real","life","or","it's","just","fantasy","glass","head","door","blink","tooth"};
		
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		Insertion.sort(array, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(array));
		
	}

}
