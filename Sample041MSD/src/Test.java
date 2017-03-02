import java.util.Arrays;

public class Test {

	public static void main(String[] args){
		
		String[] words = {"hello","darkness","my","old","friend","i","want","yo","talk","to","you","again"};
		
		System.out.println(Arrays.toString(words));
		MSD.sort(words);
		System.out.println(Arrays.toString(words));
		
	}
	
}
