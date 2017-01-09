import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
			// Given a file of Strings. 
			// First we sort by length (bags) then sort alphabetically.
			//what if it should be case insensitive	
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("input.txt"));
		ArrayList<String> preArray = new ArrayList<String>();
		
		while(sc.hasNext())preArray.add(sc.next());
		
		String[] words = new String[preArray.size()];
		
		for(int i=0;i<words.length; i++) words[i] = preArray.get(i);
		
		System.out.println(words.length);
		System.out.println(Arrays.toString(words));
		
		System.out.println();
		SortStringsGeneric.quickSort(words);
		System.out.println(Arrays.toString(words));
			
		System.out.println();
		
		Integer[] a = {6,5,34,3,-100,12,12,12,12,12,12,12,12,7,8,3,0,0,0};
		
		System.out.println(Arrays.toString(a));
		SortStringsGeneric.quickSort(a);
		System.out.println(Arrays.toString(a));
	}


}
