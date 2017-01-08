import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("input.txt"));

		BSTree<String, Integer> bst = new BSTree<String, Integer>();

		int i = 0;
		while (sc.hasNext()) {
			bst.put(sc.next(), i);
			i++;
		}
		
		

		for (String s: bst.keys()){
			System.out.println(s + "  " + bst.get(s));
		}

		}

}
