import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException{
	
		
		Scanner sc = new Scanner(new File("test.txt"));
		String[] words = new String[sc.nextInt()];
		
		int i = 0;
		while(sc.hasNext()) {
			words[i] = sc.next();
			i++;
		}
		
		System.out.println(Arrays.toString(words));
		
			
		MSD.sort(words);
		
		System.out.println(Arrays.toString(words));
		
		
		
	}

}
