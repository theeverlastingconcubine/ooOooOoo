import java.util.Arrays;
import java.util.Random;

public class Test {
	
	public static void main(String[] args){
		
		
String[] words = {"hello","darkness","my","old","friend","i","want","yo","talk","to","you","again"};
		
		System.out.println(Arrays.toString(words));
		Quick.sort(words);
		System.out.println(Arrays.toString(words));
		
		Random rnd = new Random();
		
		String[] wordz = new String[rnd.nextInt(22)];
		
		for(int i = 0; i<wordz.length; i++){
			StringBuilder sb = new StringBuilder();
			
			for(Integer j = 0; j<rnd.nextInt(20); j++){
				sb.append(Character.toChars(97+rnd.nextInt(26)));
					}
			wordz[i] = sb.toString();
			}
		
		System.out.println();
		
		System.out.println(Arrays.toString(wordz));
		Quick.sort(wordz);
		System.out.println(Arrays.toString(wordz));
		
	
		
		
		
		
		
	}

}
