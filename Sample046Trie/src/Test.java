import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {

		Trie trie = new Trie();
		Scanner sc = new Scanner(new File("text.txt"));

		while (sc.hasNext()) {
			trie.put(sc.next());
		}

		sc.close();

		LinkedList<String> list = trie.allTrie();
		System.out.println("list: " + trie.allTrie());
		String[] a = new String[list.size()];
		a = list.toArray(a);
		System.out.println("array: " + Arrays.toString(a));
		System.out.println(isSorted(a));
		
		
		

	}

	private static boolean isSorted(Comparable[] a) {
		boolean flag = true;
		for (int i = 1; i < a.length; i++) {
			if (a[i].compareTo(a[i - 1]) < 0) {
				flag = false;
				System.out.println(a[i] + "  " + a[i - 1]);
				break;
			}

		}
		return flag;
	}

}
