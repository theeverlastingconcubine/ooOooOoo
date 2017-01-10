import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class StringLengthComparator implements Comparator<String> {

	public int compare(String s1, String s2) {

		int l1 = s1.length();
		int l2 = s2.length();

		if (l1 == l2)
			return String.CASE_INSENSITIVE_ORDER.compare(s1, s2);
		else if (l1 < l2)
			return -1;
		else
			return 1;

	}

}

class CharComparatorIgnorCase implements Comparator<Character> {

	public int compare(Character c1, Character c2) {
		int i1 = Character.toLowerCase(c1);
		int i2 = Character.toLowerCase(c2);

		if (i1 == i2)
			return 0;
		else if (i1 < i2)
			return -1;
		else
			return 1;

	}
}

public class Test {
	// Given a file of Strings.
	// First we sort by length (bags) then sort alphabetically.
	// what if it should be case insensitive

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("input.txt"));
		ArrayList<String> preArray = new ArrayList<String>();

		while (sc.hasNext())
			preArray.add(sc.next());

		String[] words = new String[preArray.size()];

		sc.close();

		for (int i = 0; i < words.length; i++) {

			words[i] = preArray.get(i);
			char[] temp = words[i].toCharArray();
			Character[] tempchar = new Character[temp.length];
			
			for (int k = 0; k < tempchar.length; k++) {
				tempchar[k] = temp[k];
			}
			SortStringsGeneric.quickSort(tempchar, new CharComparatorIgnorCase());
			
			for (int k = 0; k < temp.length; k++) {
				temp[k] = tempchar[k];
			}
			words[i] = new String(temp);

		}
		
		System.out.println(words.length);
		System.out.println(Arrays.toString(words));
		System.out.println();
		System.out.println();

		
		
		SortStringsGeneric.quickSort(words, new StringLengthComparator());
		System.out.println(Arrays.toString(words));
		
	
		
		
		
		
		
		
		
		
		System.out.println();

		Integer[] a = { 6, 5, 34, 3, -100, 12, 12, 12, 12, 12, 12, 12, 12, 7, 8, 3, 0, 0, 0 };

		System.out.println(Arrays.toString(a));
		SortStringsGeneric.quickSort(a);
		System.out.println(Arrays.toString(a));
	}

}
